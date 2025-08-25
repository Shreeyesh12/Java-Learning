/*
class Circle {
    static readonly pi: number = 3.14;
    radius: number;

    constructor(radius: number) {
        this.radius = radius;
    }

    area(): number {
        return Circle.pi * this.radius * this.radius;
    }

    circumference(): number {
        return 2 * Circle.pi * this.radius;
    }
}


const myCircle = new Circle(5);
console.log("Area:", myCircle.area());
console.log("Circumference:", myCircle.circumference());
*/
// Create an array of users
var users = [
    { name: "Alice", age: 25, email: "alice@example.com" },
    { name: "Bob", age: 30, email: "bob@example.com" },
    { name: "Charlie", age: 22, email: "charlie@example.com" }
    // Add more users as needed
];
// Loop through the array and print user details
for (var _i = 0, users_1 = users; _i < users_1.length; _i++) {
    var user = users_1[_i];
    console.log("Name: ".concat(user.name, ", Age: ").concat(user.age, ", Email: ").concat(user.email));
}
