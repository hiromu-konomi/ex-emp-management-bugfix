/**
 * 
 */
var func_in_variable = function (phrase){
	console.log(phrase);
}

var a = 10+20;
var b = "10" + 20;

var num_array = [10, 20, 30];
var num_str_mixed_array= [1, 2, "aho", 4, 5, "aho"];
var an_num = num_array[0];
num_array[2] = 888;

var curry_info = {
		food:"カレー",
		color:"赤",
		spice:"激辛",
		"感想":"辛い"
}

var lst_color = ["青", "赤", "黄", "緑"];
for(var i=0;i<lst_color.length;i++){
	console.log(lst_color[i]);
}
for(var color of lst_color){
	console.log(color);
}

function say(phrase){
	console.log(phrase)
	return "done"
};

var greet = say("こんにちは");
console.log(greet);

var func_in_variable = function (phrase){
	console.log(phrase);
}
func_in_variable("hello-world");
var takuya = {
		name:"たくや",
		phrase:function(){console.log("はじめまして")}
};
console.log(takuya.name);
takuya.phrase();

function global_use(){
	food = "カレー";
}
global_use();
console.log(food);
var food = "ごはん";
function local_food1(){var food = "カレー";console.log(food);}
function local_food2(){var food = "うどん";console.log(food);};

local_food1();
local_food2();
console.log(food);