console.log("許斐大夢");

var firstName = "Hiromu";
var lastName = "Konomi";

console.log(firstName + " " + lastName);

var lowPrice = 200;
var highPrice = 250;
function culc(price) {
	var shouhi = price * 8 / 100;
	return shouhi;
}

var price = lowPrice * 3 + highPrice * 4;

console.log("小計");
console.log(price);
console.log("消費税");
console.log(culc(price));
console.log("合計金額");
console.log(price + culc(price));

var testScore = 120;
if (testScore >= 0 && testScore < 80) {
	console.log("追試です");
} else if (testScore >= 80 && testScore <= 120) {
	console.log("合格です");
} else {
	console.log("存在しない点数です");
}

var answer = 0;
for (let i = 1; i <= 100; i++) {
	answer += i;
}
console.log(answer);

for (let i = 1; i <= 100; i++) {
	if (i % 3 == 0 && i % 5 == 0) {
		console.log("FizzBuzz");
	} else if (i % 3 == 0) {
		console.log("Fizz");
	} else if (i % 5 == 0) {
		console.log("Buzz");
	} else {
		console.log(i);
	}
}