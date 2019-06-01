#include <iostream>
#include <string>
#include <vector>
#include <any>
using namespace std;

struct Person;

struct IPersonListener {
    virtual ~IPersonListener() = default;
    virtual void PersonChanged(Person& p, 
        const string& property_name,
        const any new_value) = 0;
};

struct Person {
    private: 
        int age;
        vector<IPersonListener*> listeners;
    public:
        explicit Person(int age) : age(age) {}

        virtual int GetAge() const {
            return age;
        }

        virtual void SetAge(const int age) {
            if (this->age == age) 
                return;
            auto old_c_v = GetCanVote();
            this->age = age;
            notify("age", this->age);
            auto new_c_v = GetCanVote();
            if (old_c_v == new_c_v) {
                notify("can_vote", this->age);
            }
        }

        bool GetCanVote() const {
            return age >= 18;
        }

        void subscribe(IPersonListener* pl) {
            listeners.push_back(pl);
        }

        void notify(const string& property_name, const any new_value) {
                for (const auto listener: listeners) {
                    listener->PersonChanged(*this, 
                    property_name, new_value);
                }
            }


};

struct ConsoleListener : IPersonListener {
    void PersonChanged(Person& p, 
        const string&  property_name,
        const any new_value) override {
            cout << "person's " << property_name <<
            " has been changed to ";
            if (property_name == "age") {
                cout << any_cast<int>(new_value);
            } else if (property_name == "can_vote") {
                cout << any_cast<bool>(new_value);
            }   
            cout << "\n";
        }
};

int main(int argc, char const *argv[]) {
    Person p1(14);
    Person p2(22);
    ConsoleListener cl;
    p1.subscribe(&cl);
    p2.subscribe(&cl);

    p1.SetAge(15);
    p1.SetAge(16);

    p2.SetAge(23);
    p2.SetAge(24);
    return 0;
}
