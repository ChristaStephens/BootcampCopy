package co.grandcircus.teamplayers;

public class TeamPlayer extends Player {
	
	private Team team;

	public TeamPlayer(String name, int jersey, Team team) {
		super(name, jersey);
		this.team = team;
	}

	public TeamPlayer() {
		super();
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "TeamPlayer [team=" + team + ", name=" + getName() + ", jersey=" + getJersey() + "]";
	}

}
