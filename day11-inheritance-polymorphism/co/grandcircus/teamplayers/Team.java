package co.grandcircus.teamplayers;

public class Team {
	
	private String name;
	private String coach;
	
	public Team(String name, String coach) {
		super();
		this.name = name;
		this.coach = coach;
	}
	
	public Team() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	@Override
	public String toString() {
		return "Team [name=" + name + ", coach=" + coach + "]";
	}

}
