const express = require("express")
const router = express.Router()
const userController = require("../controllers/users.js")

//[func1,func2,func3,func4]
router.post("/new",userController.validateReq,userController.createUser );

router.get("/xyz", userController.getUsers);

router.delete("/del", userController.deleteUser );

module.exports = router