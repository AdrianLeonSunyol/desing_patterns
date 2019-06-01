var task = {
    //i can defined the filed here to
    support: 'informatic'
};
//work with the other two ways of defined an object

task.title = 'My task';
task.description = 'My Description';

//define property
Object.defineProperty(task, 'toString', {
    value: task.toString = function() {
        return this.title + ' ' + this.description;
    },
    writable: false,
    enumerable: false, //hide toString
    configurable: false
});

//task.toString = 'hi';
//task.toString is not a function, we can avoid this 
//with boolean writable defined before

//but we can redefined again 
/*Object.defineProperty(task, 'toString', {
    enumerable: true
});
//We avoid this with de boolean configurable
//this throw an error: Cannot redefined property: toString
*/

console.log(Object.keys(task));

