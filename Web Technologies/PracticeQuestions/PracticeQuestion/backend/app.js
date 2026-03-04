const express = require("express")
const app = express()
const cors = require("cors")

app.use(express.json())
app.use(express.urlencoded())
app.use(cors())

let movieData = []

app.post("/save", (req, res) => {
    const data = req.body

    movieData.push(data)
    console.log(movieData)

    res.send({message:"Data saved successfully.."})

})

app.get("/get" , (req,res) =>{
    res.send(movieData)
})

app.listen("5000", () => {
    console.log("Server listening on port 5000")
})


// calculator
app.post("/calculate" , (req,res)=>{

    let {num1, num2,operation} = req.body

    num1 = parseFloat(num1)
    num2 = parseFloat(num2)

    result = 0

    switch(operation){
        case "add":{
            result = num1 + num2
            break;
        }
        case "sub":{
           result = num1 - num2
            break;
        }
         case "mul":{
            result = num1 * num2
            break;
        }
         case "div":{
            result = num1 / num2
            break;
        }
         case "mod":{
            result = num1 % num2
            break;
        }

    }
    
    res.send({result});
})



// Student Registration web App

let studentData = []
app.post("/register", (req,res)=>{
    let data = req.body;

    studentData.push(data)

    res.send({message:"Data saved"})

    console.log(studentData)
})

app.get("/students",(req,res) => {
    res.send(studentData);
})