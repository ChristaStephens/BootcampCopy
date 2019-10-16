package co.grandcircus.apidemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.apidemo.model.Article;
import co.grandcircus.apidemo.model.Card;
import co.grandcircus.apidemo.model.Film;
import co.grandcircus.apidemo.model.Quote;

@Controller
public class ApiController {
	
	@Autowired
	private ApiService apiService;
	
	@RequestMapping("/quote")
	public ModelAndView quote() {
		Quote quote = apiService.getRandomQuote();
		return new ModelAndView("quote", "quote", quote);
	}
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/draw-cards")
	public ModelAndView drawCards() {
		List<Card> cards = apiService.drawCards(2);
		return new ModelAndView("cards", "cards", cards);
	}
	
	@RequestMapping("/films")
	public ModelAndView films() {
		List<Film> films = apiService.findAllFilms();
		return new ModelAndView("films", "films", films);
	}
	
	@RequestMapping("/news")
	public ModelAndView news(
			@RequestParam(name="query", defaultValue="bitcoin") String query) {
		List<Article> articles = apiService.getNews(query);
		return new ModelAndView("news", "articles", articles);
	}


}
