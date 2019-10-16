package co.grandcircus.foodsorm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String name;
	// The SQL column name is automatically mapped to attack_strength.
	Integer attackStrength;
	Integer health;

	public Player() {
	}

	public Player(Long id, String name, Integer attackStrength, Integer health) {
		super();
		this.id = id;
		this.name = name;
		this.attackStrength = attackStrength;
		this.health = health;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAttackStrength() {
		return attackStrength;
	}

	public void setAttackStrength(Integer attackStrength) {
		this.attackStrength = attackStrength;
	}

	public Integer getHealth() {
		return health;
	}

	public void setHealth(Integer health) {
		this.health = health;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", attackStrength=" + attackStrength + ", health=" + health
				+ "]";
	}

}
