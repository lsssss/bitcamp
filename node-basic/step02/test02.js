"use strict"
//함수 호이스팅

//밑에 함수 정의코드가 먼저 실행된 후 다음 문장이 실행된다.
var result = f1(10, 20)
console.log(result)


function f1(a, b) {
    return a + b
}