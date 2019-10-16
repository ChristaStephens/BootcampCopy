package co.grandcircus.apidemo.model;

import java.util.List;

public class FilmsResponse {

	private Integer count;
	private List<Film> results;

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<Film> getResults() {
		return results;
	}

	public void setResults(List<Film> results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "FilmsResult [count=" + count + ", results=" + results + "]";
	}

}
