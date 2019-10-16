package co.grandcircus.foodsorm.entity;

import javax.persistence.Entity;

@Entity
public class Grass extends Plant {

	private Integer height;

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Grass [height=" + height + ", getId()=" + getId() + ", getName()=" + getName() + "]";
	}

}
