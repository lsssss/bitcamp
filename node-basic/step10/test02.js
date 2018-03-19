//JSON(JavaScript Object Notation)
// => 자바스크립트의 객체 정보를 문자열로 표현하는 방법

// 1) 자바스크립트 단축 문법을 사용하여 객체를 만들기


var jsonStr = '{"name":"홍길동","age":20,"tel":"1111-1111"}'
	
var obj = JSON.parse(jsonStr);

console.log(obj.name);
console.log(obj.age);
console.log(obj.tel);














