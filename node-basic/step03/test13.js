//객체 - prototype
// 생성자로 초기화된 객체들이 공유하는 저장소.
//

//=>prototype 사용후

function Calculator() {
	this.result =0;
	//인스턴스 들이 공유할 프로퍼티 저장소
}

//=> Calculator.prototype 저장소에 인스턴스가 사용할 함수 보관한다

Calculator.prototype.plus = function(value){
	this.result += value;
};

Calculator.prototype.minus = function(value){
	this.result -= value;
}

// 객체 생성과정 
// 1) 빈객체 생성
// 2) Object() 함수가 호출되어 기본 프로퍼티가 추가된다.
// 3) Calculator() 함수가 호출되어 기타 프로퍼티가 추가된다.

var c1 = new Calculator();




c1.plus(10);
c1.plus(20);
c1.plus(7);
console.log(c1.result);
