package co.grandcircus.foodsorm.entity;

import javax.persistence.Entity;

@Entity
public class Tree extends Plant {

	private Integer branches;

	public Integer getBranches() {
		return branches;
	}

	public void setBranches(Integer branches) {
		this.branches = branches;
	}

	@Override
	public String toString() {
		return "Tree [branches=" + branches + ", getId()=" + getId() + ", getName()=" + getName() + "]";
	}

}
