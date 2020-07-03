function say(phrase){
	console.log(phrase);
	return "done";
}

var greet = say("こんにちは");
console.log(greet);

var curry_info = {
		food:"カレー",
		color:"赤",
		spice:"激辛",
		感想:"辛い"
};

console.log(curry_info["food"]);
console.log(curry_info["感想"]);
