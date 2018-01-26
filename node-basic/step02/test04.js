"use strict"
//함수 - 익명 함수의 호이스팅

//함수 주소를 저장한 변수는 그냥 함수처럼 사용한다

//변수 선언의 호이스팅과 원리가 같다
//plus 변수의 선언부만 호이스팅 되고, 
//나머지 익명 함수를 정의하여 plus 변수에 저장되는 부분은 그대로 그 위치에 있는다.
console.log(plus(30, 20)) // 에러 함수정의만 저장되어있어서

var plus = function(a, b){
    return a + b
}

console.log(plus(30, 20))