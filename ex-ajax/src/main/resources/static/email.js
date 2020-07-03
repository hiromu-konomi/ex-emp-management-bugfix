$(function() {
	$("#btn").on("click", function() {
		var empEmail = $('#empEmail').val();
		ajaxpostEmail(empEmail)
	});
});

// function ajaxpost(){
// $.ajax({
// type: "POST",
// url: "/ajaxc/email",
// data: "code",
// dataType: "text"
// }).done( function(msg){
// console.log(msg);
// })
// }

function ajaxpostEmail(empEmail) {
	$.ajax({
		type : "POST",
		url : "/ajaxc/email",
		data : {
			"mailAddress" : empEmail
		},
		dataType : "json"
	}).done(function(result) {
		console.log(result);

		var value = result.code;

		if (value === "200") {
			$("#ajaxResult").text('登録可能です');
		} else if (value === "400") {
			$("#ajaxResult").text('すでに登録されているメールアドレスです');
		}
	});
}