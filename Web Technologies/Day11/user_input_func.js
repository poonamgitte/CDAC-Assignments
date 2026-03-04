const readline = require("readline")

var input = readline.createInterface({
    input: process.stdin,
    output : process.stdout
})

var users = []

function userInput(ques,){
    input.question("Do you want to stop?[y/n]", function(choice){
        if(choice == "y"){
            input.close()
        }else{
            input.question(ques, function(data){
                users.push(data)
                userInput("Enter name")
            })
        }
    }) 
}


userInput()


// input.question("Enter name : ",function(name){
//     console.log(name)
// })
// console.log("hi")