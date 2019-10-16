
/**
 * This player always picks rock.
 */
public class Dwayne extends Player {
	
	public Dwayne() {
		super("Dwayne");
	}
	
	public Dwayne(String name) {
		super(name);
	}
	
	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}

}
