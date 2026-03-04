const express = require("express");
const app = express();

var fruits = [];

app.use(express.static("public"));
app.use(express.json());
app.use(express.urlencoded());

app.post("/fruit/new", function (req, res) {
  let data = req.body;
  console.log(data)
  fruits.push(data.fruitName);
  res.send({ type: "success", msg: "Successfully saved" });
});

app.get("/fruits",function(req,res){
    res.send(fruits)
})

app.get("/test", function (req, res) {
  res.send("Testing api");
});

app.listen("5000", function (err) {
  if (err) console.log(err);
  else console.log("Server is running at 5000");
});
