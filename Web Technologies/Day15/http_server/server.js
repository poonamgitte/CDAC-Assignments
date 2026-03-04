const http = require("http");

// handler passed to createServer will execute on every request
var server = http.createServer(function (req, res) {
    console.log("url = ",req.url)
    console.log("method = ",req.method)
  res.write("This is server");
  res.write("This is second line");
  res.end(); // close the response and this will send the response
});

server.listen("8000", function (err) {
  if (err) console.log(err);
  else console.log("Server is running at 8000");
});
