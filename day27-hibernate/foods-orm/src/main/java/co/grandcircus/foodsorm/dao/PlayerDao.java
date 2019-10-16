package co.grandcircus.foodsorm.dao;

import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.foodsorm.entity.Player;

@Repository
@Transactional
public class PlayerDao {
	
	@PersistenceContext
	EntityManager em;
	
	Random random = new Random();

	public List<Player> getLivingPlayers() {
		return em.createQuery("FROM Player WHERE health > 0 ORDER BY name", Player.class)
				.getResultList();
	}

	public void resetHealth() {
		// Do a bulk update via executeUpdate()
		em.createQuery("UPDATE Player SET health = 10").executeUpdate();
	}

	public void fight(Long playerId1, Long playerId2) {
		Player p1 = em.find(Player.class, playerId1);
		Player p2 = em.find(Player.class, playerId2);
		dealAttackDamage(p1, p2.getAttackStrength());
		dealAttackDamage(p2, p1.getAttackStrength());
		// Here's a very interesting thing about Hibernate. After you find an
		// entity, any changes you make to it automatically persist to the
		// database.
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
