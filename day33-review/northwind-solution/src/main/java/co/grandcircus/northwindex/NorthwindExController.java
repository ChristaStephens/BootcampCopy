package co.grandcircus.northwindex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.northwindex.dao.SupplierDao;

@Controller
public class NorthwindExController {
	
	@Autowired
	SupplierDao supplierDao;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("suppliers", supplierDao.findAll());
		return mav;
	}
}
