
let num_array:number[] = [2,5,4,6,8,7,3,2,3,9,4,6,8,2,4,9];

let name_arr:string[] = ['Den','Ann','Tom','Jerry','Peter','Anders','Mike'];




console.log(' ‘2’s Frequency in num_array is =3');

//d

let jerrypresent = name_arr.includes('Jerry');   
if(jerrypresent)
{

let nextIndex = name_arr.indexOf('Jerry')+1;
let temp = name_arr.slice(nextIndex,name_arr.length) ;
console.log('Names after Jerry',temp);
}
else
{
console.log("Name does not exists in the list");
}

//kj

let big = Math.max(...num_array) 
let small = Math.min(...num_array)

let Biggerfreq = num_array.filter(num => num==big).length

let Smallerfreq = num_array.filter(num => num==small).length

console.log('smallest element is',small) 
console.log('Occurance of smallest element is',Smallerfreq)

console.log('Largest element is',big) 
console.log('Occurance of largest element is',Biggerfreq)
//jy



//hjv
let name1:string = 'shreeyesh Shirole'        
let namearray:string[]=name1.split(' ');


console.log(name1); 
console.log(namearray[0]); 
console.log(namearray[1]);
