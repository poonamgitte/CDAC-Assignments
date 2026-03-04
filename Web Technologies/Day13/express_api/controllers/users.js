var users = [];

exports.validateReq = function (req,res,next){ 
    if(req.body.email){
        next()
    }else{
        res.send({type:"error", msg:"Empty fields"})
    }
}

exports.createUser = function (req, res) {
  var data = req.body;
  if (data.name) {
    users.push(data);
    res.send({ msg: "User saved", type: "success" });
  } else {
    res.send({ msg: "Failed to save", type: "error" });
  }
}

exports.getUsers = function (req, res) {
  res.send(users); // send function automatically converts to json
}

exports.deleteUser = function (req, res) {
  var data = req.query;
  console.log(data)
  users = users.filter((item) => item?.email != data?.email);
  res.send({ type: "success", msg: "Successfully deleted" });
}