package co.grandcircus.sessiondemo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Here's another way of working with the session in Spring MVC.
 */
@Controller
public class PongController {

	@RequestMapping("/pong")
	public ModelAndView pingPong() {
		return new ModelAndView("pong");
	}
	
	@RequestMapping("/change-theme")
	public ModelAndView changeTheme(@RequestParam("theme-choice") String themeChoice, HttpSession session) {
		session.setAttribute("theme", themeChoice);
		return new ModelAndView("redirect:/pong");
	}
}
