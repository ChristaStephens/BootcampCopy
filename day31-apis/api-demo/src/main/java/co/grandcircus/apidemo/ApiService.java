package co.grandcircus.apidemo;

import java.util.List;
import java.util.Map;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import co.grandcircus.apidemo.model.Article;
import co.grandcircus.apidemo.model.Card;
import co.grandcircus.apidemo.model.DrawCardsResponse;
import co.grandcircus.apidemo.model.Film;
import co.grandcircus.apidemo.model.FilmsResponse;
import co.grandcircus.apidemo.model.NewsResponse;
import co.grandcircus.apidemo.model.Quote;
import co.grandcircus.apidemo.model.QuoteResponse;

@Component
public class ApiService {
	// If you don't need the User-Agent hack, all you need is this.
	private RestTemplate restTemplate = new RestTemplate();

	private RestTemplate restTemplateWithUserAgent;

	// This is an instance initialization block. It runs when a new instance of the
	// class is created--right before the constructor.
	{
		// This configures the restTemplateWithUserAgent to include a User-Agent header
		// with every HTTP request. Some of the APIs in this demo have a bug where
		// User-Agent is required.
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
			return execution.execute(request, body);
		};
		restTemplateWithUserAgent = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}

	public List<Card> drawCards(int count) {
		String url = "https://deckofcardsapi.com/api/deck/3l0483xpl21f/draw/?count=" + count;

		DrawCardsResponse response = restTemplateWithUserAgent.getForObject(url, DrawCardsResponse.class);

		return response.getCards();
	}

	public List<Film> findAllFilms() {
		String url = "https://swapi.co/api/films/";

		FilmsResponse response = restTemplateWithUserAgent.getForObject(url, FilmsResponse.class);

		return response.getResults();
	}

	public Quote getRandomQuote() {
		String url = "http://gturnquist-quoters.cfapps.io/api/random";

		QuoteResponse response = restTemplateWithUserAgent.getForObject(url, QuoteResponse.class);
		return response.getValue();
	}

	public List<Article> getNews(String query) {
		// Params Option 1: String concatenation.
		// String url = "https://newsapi.org/v2/everything?q=" + query +
		// "&from=2018-10-19&sortBy=publishedAt&apiKey=YOUR_KEY_HERE";

		// Params Option 2: UriComponentsBuilder
		String url = UriComponentsBuilder.fromHttpUrl("https://newsapi.org/v2/everything")
				.queryParam("q", query)
				.queryParam("from", "2018-10-19")
				.queryParam("sortBy", "publishedAt")
				.queryParam("apiKey", "YOUR_KEY_HERE")
				.toUriString();

		NewsResponse response = restTemplate.getForObject(url, NewsResponse.class);

		return response.getArticles();
	}

	// Example with Headers
	// Sadly this service seems to be offline :(
	public void geocodeAddress(String address) {
		// Build the URL with query params
		String url = UriComponentsBuilder.fromHttpUrl("https://montanaflynn-geocoder.p.mashape.com/address")
				.queryParam("address", address).toUriString();

		// Set up headers.
		HttpHeaders headers = new HttpHeaders();
		headers.add("X-Mashape-Key", "YOUR_KEY_HERE");
		headers.add("Accept", "application/json");

		// Make the Request.
		Map result = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>(headers), Map.class).getBody();
		System.out.println(result);
	}

	// Example with Headers and Body
	// Sadly this service seems to be offline :(
	public void getSentiment(String text) {

		// Set up headers.
		HttpHeaders headers = new HttpHeaders();
		headers.add("X-Mashape-Key", "YOUR_KEY_HERE");
		headers.add("Content-Type", "application/x-www-form-urlencoded");
		headers.add("Accept", "application/json");

		// Set up body. (Useful for posts)
		MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
		body.add("txt", text);

		// Set url
		String url = "https://community-sentiment.p.mashape.com/text/";

		// Make the Request.
		ResponseEntity<Map> response = restTemplate.exchange(url, HttpMethod.POST, new HttpEntity<>(body, headers),
				Map.class);

		// Extract body from response.
		Map result = response.getBody();

		System.out.println(result);
	}

}
