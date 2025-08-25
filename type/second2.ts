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
let num = 5;
let i = 0;
for(i=0;i<num;i++)
{
    console.log();    
}


let anum:number | string;
anum=10;
anum='shree';
//anum=true;

let bnum: any;
bnum=10;
bnum='shree';
bnum=true;

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
enum tsi{
    red=10,
    green=20,
    yellow=30
}
console.log(tsi.red, tsi.green, tsi.yellow);


//enum supports reverse mapping
console.log(tsi['red']);
console.log(tsi['10']);

//array

let ar1: number[] = [10, 20, 30, 50, 80, 22];
console.log(ar1);
for (let v of ar1) {
    console.log(v);
}
for(let i in ar1){
    console.log(i, ar1[i]);
}

console.log(ar1.length);
ar1.length=5;
console.log(ar1);
console.log(typeof ar1);


let ar3: number[][]=[
    [1,2,3],
    [2,2,2]
]
console.log(ar3);


console.log('gjgdsuguydvsgdv');
let ar4: number[][]=[
    [1,2,3],
    [2,2,2,3],
    [2,2,2,2,2]
]
for(let i=0;i<ar4.length;i++){
    for(let j=0;j<ar4.length;j++){
        console.log(ar4[i], ar4[j]);
    }

}

console.log('gjgdsuguydvsgdv');
let ar5: number[]=[];
ar5.push(10);
ar5.push(20);
ar5.push(30);

console.log(ar5, ar5.length);

ar5.pop();
console.log(ar5, ar5.length);


let arr1:number[]=[1,2,3];
let arr2:number[]=[1,33,33,33];
let arr3 = arr1.concat(arr2);
console.log(arr3);


console.log('index of 3 in arr1 ${arr1.index0f(3)}');

//shift removing element at start

let arr5:number[]=[1,2,3,4,5];
let r = arr5.shift();
console.log(r);
console.log(arr5);

//unshift for adding element at start

//slice
let arr6=arr5.slice(2,4);
console.log(arr6);


//sort
let arr8:number[]=[11, 33 ,22];
arr8.sort();
console.log(arr8);

//splice to replce the ayyar item
arr8.splice(2, 1, 88);
console.log(arr8);

//reverse
arr8.reverse();
console.log(arr8);