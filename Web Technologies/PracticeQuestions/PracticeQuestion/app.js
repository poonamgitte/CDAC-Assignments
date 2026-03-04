
let fs = require("fs")

let data = fs.readFileSync("input.txt", "utf-8");

console.log(data);

let nums = data.split("\n")
            .map(line => line.trim())
            .filter(line => line !== "")
            .map(Number);

console.log(nums)



function calculateCube(nums){

    let total =0;
    nums.forEach(element => {

        let cube = Math.pow(element , 3)
        console.log(cube)

        total += cube;
    });

    return total;
}

let totalCube = calculateCube(nums);
console.log("Sum of cube : ",totalCube)

function average(nums){

    let total =0;
    nums.forEach(element => {
        total += element
    });

    let avg = total / nums.length;

    return avg;
}

let avg = average(nums);

console.log("Average of numbers:",avg);

