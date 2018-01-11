
function generator(interest) {
	
	return function(money, year){return money + ((money * interest)*year)};
	
}

var f1 = generator(0.02)
var f2 = generator(0.08)


console.log(f1(8000000, 1))
console.log(f2(8000000, 1))