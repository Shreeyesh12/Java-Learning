let ar1: number[] = [1, 2, 3, 4];
let ar2: number[] = [10, 20, 30];

let ar3 = ar1;
console.log(ar1, ar3);

ar1.push(5);
console.log(ar1, ar3);

let ar4 = [...ar1, ...ar2];
console.log(ar1, ar2);



let student= ['shreeyesh', 1];
student.push('shree', 20);
console.log(student);

let className = 'DSATM Typescript';
console.log(className.toUpperCase());
console.log(className.charAt(7));
console.log(className.length);

type word = string;
let sh: word = 'jyftd';
console.log(sh);


//functions
//finction nameOfTheFunction(parameter...):returnType{}
function welcome (){
    console.log('Welcome students');
}

welcome();

function add1(n: number, n1: number, n2?: number): number{
    //return n+n1+(n2 ?? 0);

    if (n2==undefined)
    return n+n1;
else
return n+n1+n2;
}
console.log('addintio  id', add1(2, 3));
console.log('addintio  id', add1(2, 3, 5));


function printval <T>(valu: T): T{
    return valu;
}
console.log(printval<number>(10));
console.log(printval<string>('wdhfd'));
console.log(printval<boolean>(true));