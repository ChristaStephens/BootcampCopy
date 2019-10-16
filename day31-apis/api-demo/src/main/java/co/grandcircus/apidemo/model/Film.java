package co.grandcircus.apidemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Film {

	private String title;

	@JsonProperty("release_date")
	private String releaseDate;

	@JsonProperty("episode_id")
	private Integer episodeId;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Integer getEpisodeId() {
		return episodeId;
	}

	public void setEpisodeId(Integer episodeId) {
		this.episodeId = episodeId;
	}

	@Override
	public String toString() {
		return "Film [title=" + title + ", releaseDate=" + releaseDate + ", episodeId=" + episodeId + "]";
	}

}
