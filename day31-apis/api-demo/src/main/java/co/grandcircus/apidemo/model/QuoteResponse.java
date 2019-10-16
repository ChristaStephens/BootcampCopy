package co.grandcircus.apidemo.model;

public class QuoteResponse {

	private String type;
	private Quote value;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Quote getValue() {
		return value;
	}

	public void setValue(Quote value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "QuoteResponse [type=" + type + ", value=" + value + "]";
	}

}
