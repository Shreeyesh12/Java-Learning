var __spreadArray = (this && this.__spreadArray) || function (to, from, pack) {
    if (pack || arguments.length === 2) for (var i = 0, l = from.length, ar; i < l; i++) {
        if (ar || !(i in from)) {
            if (!ar) ar = Array.prototype.slice.call(from, 0, i);
            ar[i] = from[i];
        }
    }
    return to.concat(ar || Array.prototype.slice.call(from));
};
var ar1 = [1, 2, 3, 4];
var ar2 = [10, 20, 30];
var ar3 = ar1;
console.log(ar1, ar3);
ar1.push(5);
console.log(ar1, ar3);
var ar4 = __spreadArray(__spreadArray([], ar1, true), ar2, true);
console.log(ar1, ar2);
var student = ['shreeyesh', 1];
student.push('shree', 20);
console.log(student);
var className = 'DSATM Typescript';
console.log(className.toUpperCase());
console.log(className.charAt(7));
console.log(className.length);
var sh = 'jyftd';
console.log(sh);
//functions
//finction nameOfTheFunction(parameter...):returnType{}
function welcome() {
    console.log('Welcome students');
}
welcome();
function add1(n, n1, n2) {
    //return n+n1+(n2 ?? 0);
    if (n2 == undefined)
        return n + n1;
    else
        return n + n1 + n2;
}
console.log('addintio  id', add1(2, 3));
console.log('addintio  id', add1(2, 3, 5));
function printval(valu) {
    return valu;
}
console.log(printval(10));
console.log(printval('wdhfd'));
console.log(printval(true));
