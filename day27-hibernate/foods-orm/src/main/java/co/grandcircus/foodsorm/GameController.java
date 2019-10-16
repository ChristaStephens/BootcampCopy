package co.grandcircus.foodsorm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.foodsorm.dao.PlayerDao;
import co.grandcircus.foodsorm.dao.PlayerDaoNonTransactional;

@Controller
public class GameController {
	
	@Autowired
	private PlayerDao playerDao;
	@Autowired
	private PlayerDaoNonTransactional playerDaoNonTransactional;

	@RequestMapping("/game")
	public ModelAndView showGame() {
		ModelAndView mav = new ModelAndView("game");
		mav.addObject("players", playerDao.getLivingPlayers());
		return mav;
	}
	
	@RequestMapping("/reset-health")
	public ModelAndView resetHealth() {
		playerDao.resetHealth();
		return new ModelAndView("redirect:/game");
	}
	
	@RequestMapping("/fight")
	public ModelAndView fight(@RequestParam("p1") Long playerId1, @RequestParam("p2") Long playerId2) {
		try {
			playerDao.fight(playerId1, playerId2);
		} catch (Exception ex) {
			System.err.println("Error during fight.");
			ex.printStackTrace(System.err);
		}
		return new ModelAndView("redirect:/game");
	}
}
