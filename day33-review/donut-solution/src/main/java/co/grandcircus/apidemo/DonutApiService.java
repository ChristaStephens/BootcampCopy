package co.grandcircus.apidemo;

import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.apidemo.model.Donut;
import co.grandcircus.apidemo.model.DonutsResponse;

@Component
public class DonutApiService {
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

	public List<Donut> findAll() {
		String url = "https://grandcircusco.github.io/demo-apis/donuts.json";

		DonutsResponse response = restTemplateWithUserAgent.getForObject(url, DonutsResponse.class);

		return response.getResults();
	}

	public Donut findById(Integer id) {
		String url = "https://grandcircusco.github.io/demo-apis/donuts/" + id + ".json";

		Donut response = restTemplateWithUserAgent.getForObject(url, Donut.class);

		return response;
	}

}
