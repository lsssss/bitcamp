"use strict"
//객체 - 정의하는 방법 II

//빈 객체를 초기화 시키는 정보를 넘겨준다.
var obj = Object.create(Object.prototype);

console.log(obj)
console.log("-------------------------")
console.log(obj.toString())
console.log("-------------------------")
console.log(obj.valueOf())
console.log("-------------------------")
