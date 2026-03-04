
const readline = require("readline")

var input = readline.createInterface({
    input: process.stdin,
    output : process.stdout
})


input.question("Enter name : ",function(name){
    console.log(name)
    input.question("Enter age :", function(age){
        console.log(name + " age is" +age)
        input.close()
    })
})
console.log("hi")