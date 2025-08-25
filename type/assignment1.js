var num_array = [2, 5, 4, 6, 8, 7, 3, 2, 3, 9, 4, 6, 8, 2, 4, 9];
var name_arr = ['Den', 'Ann', 'Tom', 'Jerry', 'Peter', 'Anders', 'Mike'];
console.log(' ‘2’s Frequency in num_array is =3');
//d
var jerrypresent = name_arr.includes('Jerry');
if (jerrypresent) {
    var nextIndex = name_arr.indexOf('Jerry') + 1;
    var temp = name_arr.slice(nextIndex, name_arr.length);
    console.log('Names after Jerry', temp);
}
else {
    console.log("Name does not exists in the list");
}
//kj
var big = Math.max.apply(Math, num_array);
var small = Math.min.apply(Math, num_array);
var Biggerfreq = num_array.filter(function (num) { return num == big; }).length;
var Smallerfreq = num_array.filter(function (num) { return num == small; }).length;
console.log('smallest element is', small);
console.log('Occurance of smallest element is', Smallerfreq);
console.log('Largest element is', big);
console.log('Occurance of largest element is', Biggerfreq);
//jy
//hjv
var name1 = 'shreeyesh Shirole';
var namearray = name1.split(' ');
console.log(name1);
console.log(namearray[0]);
console.log(namearray[1]);
