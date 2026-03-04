const express = require("express");
const morgan = require("morgan")
const app = express();

var names =[]

app.use(morgan('dev'))//logger
app.use(express.static("public"));
app.use(express.urlencoded());
app.use(express.json()) // parses the JSON data

app.get("/", (req, res) => {
  res.send("Server is working ");
});

app.post("/sum", (req, res) => {
  let data = req.body;
  let result = Number(data.num1) + Number(data.num2);
  res.send({ result: result });//no need to call JSON.stringify because send automatically does it
});

app.post("/save",(req,res)=>{
    let data = req.body
    names.push(data.name)
    res.send({msg: "Data saved", type: "success"})
})


app.listen("8080", () => {
  console.log("Server is running at 8080");
});
