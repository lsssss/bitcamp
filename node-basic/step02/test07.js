
function generator(op) {
	if (op == "+") {
		return function(a, b) {return a + b};
	} else if (op == "-") {
		return function(a, b) {return a - b};
	}

}

var plus = generator("+")
console.log(plus(10,20))


var minus = generator("-")
console.log(minus(30,29))
