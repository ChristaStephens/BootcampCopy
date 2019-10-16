package co.grandcircus.madlibdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MadlibController {
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("home");
	}
	
	@RequestMapping("/form")
	public ModelAndView showForm() {
		return new ModelAndView("form");
	}
	
	@RequestMapping("/story")
	public ModelAndView showStory(
			@RequestParam("noun") String noun, @RequestParam("adj") String adj) {
		ModelAndView mv = new ModelAndView("story");
		System.out.println("noun:" + noun);
		System.out.println("adj:" + adj);
		mv.addObject("noun", noun);
		mv.addObject("adj", adj);
		return mv;
	}
	
	@RequestMapping("/mileage-form")
	public ModelAndView showMileageForm() {
		return new ModelAndView("mileage-form");
	}

	@RequestMapping("/mileage-result")
	public ModelAndView showMileageResult(
			@RequestParam("gallons") double gallons,
			@RequestParam("mpg") double mpg
	) {
		ModelAndView mv = new ModelAndView("mileage-result");
		
		System.out.println(gallons);
		System.out.println(mpg);
		double distance = gallons * mpg;
		System.out.println(distance);
		
		mv.addObject("distance", distance);
		return mv;
	}
	
}
