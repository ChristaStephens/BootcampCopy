package co.grandcircus.jdbcintro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.jdbcintro.dao.RoomsDao;
import co.grandcircus.jdbcintro.dao.RoomsDaoOld;
import co.grandcircus.jdbcintro.entity.Room;

@Controller
public class RoomsController {
	
	@Autowired
	private RoomsDao roomsDao;
	@Autowired
	private RoomsDaoOld roomsDaoOld;
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("redirect:/rooms");
	}

	@RequestMapping("/rooms")
	public ModelAndView list() {
		List<Room> leListOfRooms = roomsDaoOld.findAll();
		return new ModelAndView("list", "rooms", leListOfRooms);
	}
	
	@RequestMapping("/rooms/{id}")
	public ModelAndView detail(@PathVariable("id") Long id) {
		Room room = roomsDao.findById(id);
		
		return new ModelAndView("detail", "room", room);
	}
	
	@RequestMapping("/rooms/{id}/edit")
	public ModelAndView edit(@PathVariable("id") Long id) {
		Room room = roomsDao.findById(id);
		
		return new ModelAndView("edit", "room", room);
	}
	
	@PostMapping("/rooms/{id}/edit")
	public ModelAndView save(@PathVariable("id") Long id, Room room) {
		room.setId(id);
		
		roomsDao.update(room);
		
		return new ModelAndView("redirect:/rooms/" + id);
	}
	
	@RequestMapping("/rooms/add")
	public ModelAndView add() {		
		return new ModelAndView("add");
	}
	
	@PostMapping("/rooms/add")
	public ModelAndView addSubmit(Room room) {		
		roomsDao.create(room);
		
		return new ModelAndView("redirect:/rooms");
	}
	
	@RequestMapping("/rooms/{id}/delete")
	public ModelAndView remove(@PathVariable("id") Long id) {
		roomsDao.delete(id);
		
		return new ModelAndView("redirect:/rooms");
	}
}
