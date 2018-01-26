"use strict"
//함수 - 함수의 주소

function f1() {
    console.log('f1()........')
}

var f2 = f1
var f3 = f2

f1()
f2()
f3()
console.log('--------------')

var f4 = function() {
    console.log('f4().....')
}

f1 = f4

f1()
f2()
f3()
f4()

f1 = "문자열"
console.log(f1)
console.log(f2)
console.log(f3)
console.log(f4)
