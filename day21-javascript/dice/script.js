var rollButton = document.getElementById("rollButton");
rollButton.onclick = function() {
	var roll = generateRandomNumber();
	var die1 = document.getElementById("die1");
	die1.textContent = roll;
	
	roll = generateRandomNumber();
	var die2 = document.getElementById("die2");
	die2.textContent = roll;
}

var sidesInput = document.getElementById("sidesInput");
var sideCount = sidesInput.value;

function generateRandomNumber() {
	
	return Math.floor(Math.random() * sideCount) + 1;
}