const http = require("http");

const dataHandler = function(req,res){
      res.write("This is data path")
      res.end()
}

const profileHandler = function(req,res){
      res.write("this is profile path")
      res.end()
}

const errorHandler = function(req,res){
      res.write("Path not found")
      res.end()
}

// handler passed to createServer will execute on every request
var server = http.createServer(function (req, res) {
    console.log("url = ",req.url)
    console.log("method = ",req.method)
    if(req.url.startsWith("/data")){
      dataHandler(req,res)
    }else if(req.url == "/profile"){
      profileHandler(req,res)
    }else{
      errorHandler(req,res)
    }
  
});

server.listen("8000", function (err) {
  if (err) console.log(err);
  else console.log("Server is running at 8000");
});
