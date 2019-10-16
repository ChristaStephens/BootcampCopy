package co.grandcircus.apidemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.apidemo.model.Donut;

@Controller
public class DonutController {
	
	@Autowired
	private DonutApiService donutService;
	
	@RequestMapping("/")
	public ModelAndView list() {
		List<Donut> donuts = donutService.findAll();
		return new ModelAndView("donut-list", "donuts", donuts);
	}
	
	@RequestMapping("/donut/{id}")
	public ModelAndView detail(@PathVariable("id") Integer id) {
		Donut donut = donutService.findById(id);
		return new ModelAndView("donut-detail", "donut", donut);
	}


}
