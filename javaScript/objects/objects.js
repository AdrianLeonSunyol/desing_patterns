var obj = {};
var nextObj = Object.create(Object.prototype);
//inheritance
var lastObj = new Object();

obj.param = 'new value1';
console.log(obj.param);

obj['param2'] = 'new value2';
console.log(obj['param2']);

var new_value = 'new value3';
obj['param2'] = new_value;
console.log(obj['param2']);