"use strict"
//함수 - 내장 변수 arguments

function f1(a ,b){
    console.log(a)
    console.log(b)
    console.log("--------")
    for (var i = 0; i < arguments.length; i++){
        console.log(arguments[i])
    }
    console.log("==========================================")
}

f1(10, 20)

f1(10)
f1("zz", 20, 30)
f1(10, 20, 30, 40)
