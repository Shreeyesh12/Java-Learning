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

// Example usage:
const myCircle = new Circle(5);
console.log("Area:", myCircle.area()); // Output the area
console.log("Circumference:", myCircle.circumference()); // Output the circumference
*/

// Define a User interface
interface User {
    name: string;
    age: number;
    email: string;
}

// Create an array of users
const users: User[] = [
    { name: "Alice", age: 25, email: "alice@example.com" },
    { name: "Bob", age: 30, email: "bob@example.com" },
    { name: "Charlie", age: 22, email: "charlie@example.com" }
    // Add more users as needed
];

// Loop through the array and print user details
for (const user of users) {
    console.log(`Name: ${user.name}, Age: ${user.age}, Email: ${user.email}`);
}
