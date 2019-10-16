package co.grandcircus.apidemo.model;

import java.util.List;

public class NewsResponse {

	private Integer totalResults;
	private List<Article> articles;

	public Integer getTotalResults() {
		return totalResults;
	}

	public void setTotalResults(Integer totalResults) {
		this.totalResults = totalResults;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

}
