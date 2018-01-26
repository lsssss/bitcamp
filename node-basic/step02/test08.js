"use strict"
//함수 - 로컬 변수의 클로저(closure)

//각각의 클로저 별로 별도의 메모리를 갖고 있다
function generator(interest) { //파라미터도 로컬 변수이다
    return function(money, year) {return money + ((money * interest) * year)};
}

//원금 및 이자를 계산하는 함수를 가져오기
//년 2.0%(0.02) 이자 계산

var f1 = generator(0.02)
var f2 = generator(0.08)

console.log(f1(8000000000, 1))
console.log(f2(8000000000, 1))
