package co.grandcircus.apidemo.model;

import java.util.List;

public class DonutsResponse {

	private Integer count;
	private List<Donut> results;

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<Donut> getResults() {
		return results;
	}

	public void setResults(List<Donut> results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "DonutsResponse [count=" + count + ", results=" + results + "]";
	}

}