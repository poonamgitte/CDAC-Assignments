function func1(){
    var a = 10
    return function(){
        a = a + 1
        return a 
    }
}

var x = func1()
//console.log(x())

//iife
(function(){
    var a = 100
    //console.log("Hi")
    return a + 1
})()








