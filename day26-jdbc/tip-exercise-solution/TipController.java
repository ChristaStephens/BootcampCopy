package co.grandcircus.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TipController {

	@RequestMapping("/tip")
	public ModelAndView showTipForm() {
		return new ModelAndView("tip");
	}
	
	@RequestMapping("/submit-tip")
	public ModelAndView tipResult(
			@RequestParam("total") double total,
			@RequestParam("tip") int tip,
			@RequestParam(name="custom-tip", defaultValue="15") double customTip) {
		
		ModelAndView mv = new ModelAndView("tip-results");
		double tipPercent = tip;
		if (tip == -1) {
			tipPercent = customTip;
		}
		mv.addObject("tip", total * tipPercent / 100);
		return mv;
	}
}
