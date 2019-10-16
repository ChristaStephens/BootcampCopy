package co.grandcircus.foodsorm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.foodsorm.dao.FoodRepository;
import co.grandcircus.foodsorm.entity.Food;

//@Controller
public class FoodsControllerUsingJpaRepo {
	
	@Autowired
	FoodRepository foodRepo;
	
	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index");
	}

	@RequestMapping("/food")
	public ModelAndView listFood(
			@RequestParam(value="keyword", required=false) String keyword,
			@RequestParam(value="category", required=false) String category) {
		ModelAndView mav = new ModelAndView("list-food");
		if (keyword != null && !keyword.isEmpty()) {
			mav.addObject("foods", foodRepo.findByNameContainingIgnoreCase(keyword));
		} else if (category != null && !category.isEmpty()) {
			mav.addObject("foods", foodRepo.findByCategory(category));
		} else {
			mav.addObject("foods", foodRepo.findAll());
		}
		// list of categories needed for <select>
		mav.addObject("categories", foodRepo.findAllCategories());
		return mav;
	}
	
	@RequestMapping("/food/create")
	public ModelAndView showCreateForm() {
		// If there is only one model value to add, use this one-line shortcut. Equivalent to
		// ModelAndView mav = new ModelAndView("food-form");
		// mav.addObject("title", "Add a Food");
		return new ModelAndView("food-form", "title", "Add a Food");
	}
	
	@RequestMapping(value="/food/create", method=RequestMethod.POST)
	public ModelAndView submitCreateForm(Food food) {
		foodRepo.save(food);
		return new ModelAndView("redirect:/food");
	}
	
	// path variable required to identify which food we're editing
	@RequestMapping("/food/update")
	public ModelAndView showEditForm(@RequestParam("id") Long id) {
		ModelAndView mav = new ModelAndView("food-form");
		mav.addObject("food", foodRepo.findById(id).orElse(null));
		mav.addObject("title", "Edit Food");
		return mav;
	}
	
	// same URL but different method
	@RequestMapping(value="/food/update", method=RequestMethod.POST)
	public ModelAndView submitEditForm(Food food, @RequestParam("id") Long id) {
		food.setId(id);
		foodRepo.save(food);
		return new ModelAndView("redirect:/food");
	}
	
	@RequestMapping("/food/delete")
	public ModelAndView delete(@RequestParam("id") Long id) {
		foodRepo.deleteById(id);
		return new ModelAndView("redirect:/food");
	}
}
