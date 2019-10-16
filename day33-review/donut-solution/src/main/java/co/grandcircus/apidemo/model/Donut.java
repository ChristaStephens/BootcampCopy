package co.grandcircus.apidemo.model;

import java.util.List;

public class Donut {

	private Integer id;
	private String ref;
	private String name;
	private Integer calories;
	private List<String> extras;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	public List<String> getExtras() {
		return extras;
	}

	public void setExtras(List<String> extras) {
		this.extras = extras;
	}

	@Override
	public String toString() {
		return "Donut [id=" + id + ", ref=" + ref + ", name=" + name + ", calories=" + calories + ", extras=" + extras
				+ "]";
	}

}
