"use strict"
//함수 - 파라미터로 익명 함수를 바로 전달하기 

function play(a, b, fn) {
    fn(a, b);
}



//함수를 전달할 때 단 한 번만 사용할 함수라면 익명함수로 정의하여 그 주소를
//전달하라
play(10, 20, function plus(a, b) {console.log(a, '+', b, '=', a + b)})
play(150, 20, function minus(a, b) {console.log(a, '-', b, '=', a - b)})

try{
plus(15, 25) // 함수를 호출할 때 아규먼트 자리에서 정의한 함수는 
             // 따로 사용할 수 없다.
} catch (err) {
    console.log(err)
}

play(10, 20, function(a, b) {
    console.log(a, '+', b, '=', a + b)
});

play(150, 20, function minus(a, b) {
    console.log(a, '-', b, '=', a - b)
});