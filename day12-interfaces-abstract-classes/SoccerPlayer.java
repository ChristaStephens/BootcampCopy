
public class SoccerPlayer extends Player {

	public SoccerPlayer() {
	}

	public SoccerPlayer(String name, int jerseyNumber) {
		super(name, jerseyNumber);
	}

	@Override
	public void score() {
		System.out.println("Make a goal!");
	}

	
}
