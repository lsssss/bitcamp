

"use strict"



var name = "김길동";

function test() {
	var name2;
	
	name = "임꺽정"; // 모듈 변수에 저장한다.
	name2 = "유관순"; // 로컬 변수에 저장한다
}

test()

console.log(name)
console.log(name2)