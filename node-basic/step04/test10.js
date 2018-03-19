// 객체 2 -배열과 for문



var arr = [10,20, 30, 40];
for(var i in arr){
	console.log(arr[i])
}



for(var value of arr){
	console.log(value);
}

//forEach(콜백함수)
// => 내부적으로 반복문을 돌면서 콜백함수를 호출해준다.
arr.forEach(function(index, value) {
	console.log(index, value)
});