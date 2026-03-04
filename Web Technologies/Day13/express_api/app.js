const express = require("express");
const morgan = require("morgan");
const app = express();

const userRouter = require("./routes/users.js")



app.use(morgan("dev"));
app.use(express.static("public"));
app.use(express.urlencoded());
app.use(express.json());

app.use(function(req,res,next){ // nest is function
    console.log("Got this request")
    next() // must call to pass the req,res to next middleware/handler
})

app.use("/api/user",userRouter) // binding a router 
/**
 * /api/user/new
 * /api/user/xyz
 * /api/user/del
 */


app.get("/test", function (req, res) {
  console.log("Got request");
  res.send("Test path working");
});

app.listen("8080", function (err) {
  if (err) {
    console.log(err);
  } else {
    console.log("Server is running at 8080");
  }
});
