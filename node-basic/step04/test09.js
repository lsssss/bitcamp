// 객체 2 - 함수 멤버와 prototype 멤버

//=> 기보 객체에 프로퍼티 추가


function Calculator() {
	this.result = 0;
}


Calculator.prototype.plus = function(value){
	this.result += value;
};

Calculator.prototype.minus = function(value){
	this.result -= value;
};

//인스턴스 함수를 호출하려면 반드시 인스턴스 주소가 있어야 한다.
//Calculator.plus(10); 오류

var c1 = new Calculator();

c1.plus(10);


Calculator.abs = function(value){
	
	return (value<0) ? value*-1 : value;
};

console.log(Calculator.abs(-100))
console.log(Calculator.abs(100))
