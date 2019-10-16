
public enum Roshambo {

	ROCK, PAPER, SCISSORS;
	
	public boolean beats(Roshambo other) {
		return this == ROCK && other == SCISSORS
				|| this == PAPER && other == ROCK
				|| this == SCISSORS && other == PAPER;
	}
	
	public boolean ties(Roshambo other) {
		return this == other;
	}
	
	@Override
	public String toString() {
		if (this == ROCK) {
			return "Rock";
		} else if (this == PAPER) {
			return "Paper";
		} else {
			return "Scissors";
		}
	}
}
