var box = document.getElementById("box");

var greenButton = document.getElementById("greenButton");
greenButton.onclick = function() {
	setBoxColor("green");
}

function setBoxColor(color) {
	box.style.backgroundColor = color;
	var results = document.getElementById("results");
	results.innerHTML += "<p>" + color + "</p>";
}