package co.grandcircus.authdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import co.grandcircus.authdemo.dao.WordDao;
import co.grandcircus.authdemo.entity.User;
import co.grandcircus.authdemo.entity.Word;

@Controller
public class MembersOnlyController {
	
	@Autowired
	private WordDao wordDao;
	
	@RequestMapping("/secrets")
	public ModelAndView secrets(@SessionAttribute(name="user", required=false) User user, RedirectAttributes redir) {
		// For this URL, make sure there is a user on the session.
		if (user == null) {
			// if not, send them back to the login page with a message.
			redir.addFlashAttribute("message", "Wait! Please log in.");
			return new ModelAndView("redirect:/login");
		}
		
		// if the user is logged in, proceed as normal.
		List<Word> words = wordDao.findForUserId(user.getId());
		return new ModelAndView("secrets", "words", words);
	}
	
	@RequestMapping("/add-word")
	public ModelAndView addWord(
			@RequestParam("word") String wordText,
			@SessionAttribute("user") User user) {
		Word w = new Word();
		w.setText(wordText);
		w.setUser(user);
		wordDao.create(w);
		return new ModelAndView("redirect:/secrets");
	}
	
	@RequestMapping("/remove-word")
	public ModelAndView addWord(
			@RequestParam("word") Long wordId) {
		wordDao.delete(wordId);
		return new ModelAndView("redirect:/secrets");
	}

}
