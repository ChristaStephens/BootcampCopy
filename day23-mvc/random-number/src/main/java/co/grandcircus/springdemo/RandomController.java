package co.grandcircus.springdemo;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RandomController {
	
	@RequestMapping("/")
	public ModelAndView showHome() {
		ModelAndView mav = new ModelAndView("home");
		return mav;
	}
	
	@RequestMapping("/random")
	public ModelAndView showRandom() {
		int randomNumber = new Random().nextInt(10) + 1;
		
		ModelAndView mav = new ModelAndView("random");
		mav.addObject("randomNumber", randomNumber);
		return mav;
	}

}
