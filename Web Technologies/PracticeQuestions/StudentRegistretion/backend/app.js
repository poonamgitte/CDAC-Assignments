
const express = require("express")
const app = express()
const cors = require("cors")

// middleware to read JSON body
app.use(express.json())
app.use(cors());


var registrationDetails = []

// post to save student data
app.post("/register", function (req,res) {
    const data = req.body;
    
    console.log("Received:",data);

    registrationDetails.push(data);

    res.send({message: "Student record saved"})
})

// get request to get student data
app.get("/students", function (req,res) {
    res.send(registrationDetails);
})


 app.listen("5000", () =>{
        console.log("Server listening on port 5000")
    })