var correctness;
var timeToSubmit;
var sec = 0;
var counter = setInterval(countTime, 10);

$("button").on("click", function() {

	//Presumably the "A" would be changed to a variable that is updated with the correct answer per question
	
	$("#next").removeClass("d-none");
	
	if (this == A) {
		correctness = "Correct";
		start = sec;

	} else if (this == next) {
		//location.href = "Second_File.html";
		timeToSubmit = (sec - start) / 100;
		timeToSubmit = Math.round(timeToSubmit * 100) / 100;
		var data = {
			"correctness": correctness,
			"time": timeToSubmit
		};

		var json = JSON.stringify(data, null, 2);
		console.log(correctness, timeToSubmit);
		console.log(json);

	} else {
		correctness = "Incorrect";
		start = sec;
	}			
});

function countTime() {
	sec++;
}


function showCorrectness() {
	$('#question').hide();
	document.getElementById('output').innerHTML = correctness;
}
/*
	if (correctness == "Correct") {
		open("correct.html");
	} else {
		open("incorrect.html");
	}
}

	var ajax = new XMLHttpRequest();

	ajax.onreadystatechange = function() {
		if (ajax.readyState == 4 && ajax.status == 200) {
			$('#correctness').html(ajax.responseText);
		}
	};
*/