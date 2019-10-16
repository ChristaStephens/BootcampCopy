package co.grandcircus.sessiondemo;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CookieController {

	@RequestMapping("/")
	public ModelAndView index(HttpSession session, @CookieValue(name="count", required=false) String cookie) {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("countFromCookie", cookie);
		return mav;
	}
	
	@RequestMapping("/count")
	public ModelAndView add(HttpServletResponse response,
			@CookieValue(name="count", defaultValue="0") Integer oldCount) {
		Integer newCount = oldCount + 1;
		
		// Set cookie
		Cookie cookie = new Cookie("count", newCount.toString());
		cookie.setMaxAge(2 * 60); // 2 minutes
		response.addCookie(cookie);
		
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping("/clear")
	public String clear(HttpServletResponse response) {
		// Clear cookie
		Cookie cookie = new Cookie("count", "");
		cookie.setMaxAge(0); // the only way to remove a cookie: set it's lifespan to 0
		response.addCookie(cookie);
		
		return "redirect:/";
	}
}
