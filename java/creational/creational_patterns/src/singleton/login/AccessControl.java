package singleton.login;

public class AccessControl {
    private static AccessControl instance = new AccessControl();

    private AccessControl () {}
    public static AccessControl getInstance () {
        return instance;
    }

    public void Login (String login, String password) {
        //do stuff
    }
}