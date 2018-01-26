"use strict"
//함수 - 클로저(closure)

function generator(op) {
    if (op == "+") {
        //함수에 의해 정의된 내장 함수를 closure라 부른다.
        return function(a ,b) {return a + b};
    } else if (op == "-") {
        return function(a, b) {return a - b}; // 함수를 만들고 주소를 리턴한다
    }
}

var plus = generator("+")
console.log(plus(20, 10))

var plus = generator("-")
console.log(plus(20, 10))