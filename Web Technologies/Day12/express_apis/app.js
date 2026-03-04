const express = require("express")
const app = express()

//path the directory containing static(html/css/js/images/media) files
app.use(express.static("public")) // attaches middlewares
//middlewares: functions processing request and response object 
//before/after the api handler
app.use(express.urlencoded()) //convert to urlencoded data to object
//?var=data1&var=data2

//For GET or if data is in url use .query property
//For POST or if data is in request body user .body property


app.get("/sum", function(req,res){
    var data = req.query
    console.log(data)
    var result= Number(data.num1) + Number(data.num2)
    res.send("The result is" + result) // always send string,maybe object/array which can be converted to json
})

app.post("/calc",function(req,res){
    var data = req.body
    console.log(data)
    var result = Number(data.num1) + Number(data.num2)
    res.send("The result by post method is "+ result)
})



app.get("/",function(req,res){
    res.send("Hi this is root path")
})

app.get("/data",function(req,res){
    res.send("this is data")
})

/**
 * .get(path,handler)
 * .post(path,handler)
 * .put(path,handler)
 * .patch(path,handler)
 * .delete(path,handler)
 * 
 * 
 */

app.listen("8000",function(){
    console.log("Server is running at 8000")
})