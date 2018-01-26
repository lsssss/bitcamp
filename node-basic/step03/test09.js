"use strict"
//객체 - 생성자의 필요성 II

//자바 크립트는 빈객체를 생성한후 바로 함수를 호출할 수 있다.
//이때 호출되는 함수는 빈객체의 주소를 this라는 이름으로 받는다.

function createScore(name, kor, eng, math) {
    //new 를 실행한 다음에 이 함수를 호출하면 
    //내부에 this라는 변수가 생성되고 그 변수에 빈 객체의 주소가 저장된다.
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    this.sum = this.kor + this.eng + this.math
    this.aver = this.sum / 3;
}

var s1 = new createScore("홍길동", 100, 100, 100)
var s2 = new createScore("임꺽정", 90, 80, 70)
var s3 = new createScore("유관순", 100, 80, 100)

function displayScore(score) {
    console.log(score.name, score.kor, score.eng, score.math, score.sum, score.aver)
}

displayScore(s1);
displayScore(s2);
displayScore(s3);