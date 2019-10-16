
public class FootballPlayer extends Player {

	private int yardsPerGame;
	
	public FootballPlayer() {}

	public FootballPlayer(String name,
						  int jerseyNumber,
						  int yardsPerGame) {
		super(name, jerseyNumber);
		this.yardsPerGame = yardsPerGame;
	}

	public int getYardsPerGame() {
		return yardsPerGame;
	}

	public void setYardsPerGame(int yardsPerGame) {
		this.yardsPerGame = yardsPerGame;
	}
	
}
