
const fs = require("fs")

// Synchronous (Blocking) 
const data = fs.readFileSync("input.txt", "utf-8");

console.log(data)

let nums = data.split("\n")
.map(line => line.trim())
.filter(line => line !== "")
.map(Number);
console.log(nums)

let sqrOutput =""



function calculateSquare(nums){
    
    let totalSqrSum = 0;
    
    
    nums.forEach(element => {
        let sqr = element*element;
        sqrOutput = sqrOutput + sqr + " "
        console.log(sqr)
        
        totalSqrSum += sqr;
    });
    
    return totalSqrSum;
}

let totalSqrSum = calculateSquare(nums)

console.log("Sum of Squares: ",totalSqrSum)


function calculateAvg(nums){
    
    let total = 0
    
    nums.forEach(element => {
        
        total += element;
    });
    
    let average = total / nums.length
    
    return average;
}

let average = calculateAvg(nums)
console.log("average of original numbers: ",average)

// Writing data to file
try{
    fs.writeFileSync("output.txt",nums.join(","), "utf-8")

    console.log("data saved ...")

}catch(err){
    console.log(err.message)
}

// Appending data 
try{
    fs.appendFileSync("output.txt", `\nSquare array: ${sqrOutput} \nSum of Square of array: ${totalSqrSum } \nAverage of array: ${average} `)
    console.log("Result stored...")
}
catch(err){
    console.log(err.message)
}
// Asynchronous (Non-blocking)

// fs.readFile("input.txt", "utf-8", (err,data)=>{
//     if(err){
//         console.log(err.message)
//         return
//     }


//     console.log(data)

// let nums = data.split("\n",)
// .map(line => line.trim())
// .filter(line => line !== "")
// .map(Number);
// console.log(nums)



// function calculateSquare(nums){
    
//     let totalSqrSum = 0;
    
    
//     nums.forEach(element => {
//         let sqr = element*element;
        
//         console.log(sqr)
        
//         totalSqrSum += sqr;
//     });
    
//     return totalSqrSum;
// }

// let totalSqrSum = calculateSquare(nums)

// console.log("Sum of Squares: ",totalSqrSum)


// function calculateAvg(nums){
    
//     let total = 0
    
//     nums.forEach(element => {
        
//         total += element;
//     });
    
//     let average = total / nums.length
    
//     return average;
// }

// let average = calculateAvg(nums)
// console.log("average of original numbers: ",average)



// })

// // Data write using writeData

// let content = "Data to save or write in file"

// fs.writeFile("output.txt", content, "utf-8", (err)=>{

//     if(err){
//         console.log(err.message)
//         return
//     }

//     console.log("Data saved successfully")
// })

// // To append data in file
// let content2 = "\nNew Data to save or write in file"

// fs.appendFile("output.txt",content2,(err)=>{

//     if(err){
//         console.log(err.message)
//         return
//     }

//     console.log("Data appended...")
// })

