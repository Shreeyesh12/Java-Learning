/*loop
let num = 5;
let fact = 1;
while(num>0)
{
    fact=fact*num;
    num--;
}
console.log(fact);
*/
var num = 5;
var i = 0;
for (i = 0; i < num; i++) {
    console.log();
}
var anum;
anum = 10;
anum = 'shree';
//anum=true;
var bnum;
bnum = 10;
bnum = 'shree';
bnum = true;
//default enum
/*
enum tsi{
    red,
    green,
    yellow
}
console.log(tsi.red, tsi.green, tsi.yellow);
*/
//numeric enum
var tsi;
(function (tsi) {
    tsi[tsi["red"] = 10] = "red";
    tsi[tsi["green"] = 20] = "green";
    tsi[tsi["yellow"] = 30] = "yellow";
})(tsi || (tsi = {}));
console.log(tsi.red, tsi.green, tsi.yellow);
//enum supports reverse mapping
console.log(tsi['red']);
console.log(tsi['10']);
//array
var ar1 = [10, 20, 30, 50, 80, 22];
console.log(ar1);
for (var _i = 0, ar1_1 = ar1; _i < ar1_1.length; _i++) {
    var v = ar1_1[_i];
    console.log(v);
}
for (var i_1 in ar1) {
    console.log(i_1, ar1[i_1]);
}
console.log(ar1.length);
ar1.length = 5;
console.log(ar1);
console.log(typeof ar1);
var ar3 = [
    [1, 2, 3],
    [2, 2, 2]
];
console.log(ar3);
console.log('gjgdsuguydvsgdv');
var ar4 = [
    [1, 2, 3],
    [2, 2, 2, 3],
    [2, 2, 2, 2, 2]
];
for (var i_2 = 0; i_2 < ar4.length; i_2++) {
    for (var j = 0; j < ar4.length; j++) {
        console.log(ar4[i_2], ar4[j]);
    }
}
console.log('gjgdsuguydvsgdv');
var ar5 = [];
ar5.push(10);
ar5.push(20);
ar5.push(30);
console.log(ar5, ar5.length);
ar5.pop();
console.log(ar5, ar5.length);
var arr1 = [1, 2, 3];
var arr2 = [1, 33, 33, 33];
var arr3 = arr1.concat(arr2);
console.log(arr3);
console.log('index of 3 in arr1 ${arr1.index0f(3)}');
//shift removing element at start
var arr5 = [1, 2, 3, 4, 5];
var r = arr5.shift();
console.log(r);
console.log(arr5);
//unshift for adding element at start
//slice
var arr6 = arr5.slice(2, 4);
console.log(arr6);
//sort
var arr8 = [11, 33, 22];
arr8.sort();
console.log(arr8);
//splice to replce the ayyar item
arr8.splice(2, 1, 88);
console.log(arr8);
//reverse
arr8.reverse();
console.log(arr8);
