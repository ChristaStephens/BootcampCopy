
public abstract class MathOperation {

	private String name;
	
	protected MathOperation(String name) {
		this.name = name;
	}
	
	public final String getName() {
		return name;
	}
	
	public abstract int exec(int input);
	
	@Override
	public String toString() {
		return "Operation " + name;
	}
}
