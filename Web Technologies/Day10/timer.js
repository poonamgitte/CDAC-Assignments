// var intervalObject=setInterval(function,time) //time in ms
// var timeoutObject = setTimeout(function,time)
// var variable = setImmediate(function)
// clearInterval(intervalObject)
// clearTimeout(timeoutObject)
// clearImmediate(variable)

var x = setInterval(function(){
    console.log("Hi")
},4000)

setTimeout(function(){
    console.log("Done")
    clearInterval(x)
},10000)
