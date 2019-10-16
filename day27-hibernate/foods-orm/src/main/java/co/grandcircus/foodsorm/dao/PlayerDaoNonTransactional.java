package co.grandcircus.foodsorm.dao;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.grandcircus.foodsorm.entity.Player;

@Repository
public class PlayerDaoNonTransactional {
	
	@Autowired
	private JdbcTemplate jdbc;
	
	Random random = new Random();

	public void fight(Long playerId1, Long playerId2) {
		Player p1 = jdbc.queryForObject("SELECT * FROM Player WHERE id = ?", new BeanPropertyRowMapper<>(Player.class), playerId1);
		Player p2 = jdbc.queryForObject("SELECT * FROM Player WHERE id = ?", new BeanPropertyRowMapper<>(Player.class), playerId2);
		dealAttackDamage(p1, p2.getAttackStrength());
		jdbc.update("UPDATE PLAYER SET health = ? WHERE id = ?", p1.getHealth(), p1.getId());
		
		// "something bad".charAt(100);
		
		dealAttackDamage(p2, p1.getAttackStrength());
		jdbc.update("UPDATE PLAYER SET health = ? WHERE id = ?", p2.getHealth(), p2.getId());
	}
	
	private void dealAttackDamage(Player toPlayer, int attackStrength) {
		toPlayer.setHealth(toPlayer.getHealth() - getAttackDamage(attackStrength));
		if (toPlayer.getHealth() < 0) {
			toPlayer.setHealth(0);
		}
	}
	
	private int getAttackDamage(int strength) {
		return random.nextInt(strength) + 1;
	}

}
