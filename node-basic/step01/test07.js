

"use strict"



var v1 = 100;


{
	var v2 = 200;
}


console.log(v1)
console.log(v2)


function test() {
	var a = 100;
	{
		var b = 200;
	}
	console.log(v1)
	console.log(v2)
	
	console.log(a)
	console.log(b)
}


console.log("------------------------------------")

test()