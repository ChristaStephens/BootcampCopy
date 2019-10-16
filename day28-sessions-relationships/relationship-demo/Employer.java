package co.grandcircus.relationshipdemo.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	// many-to-many relationship indicates the name of the Java property on Student
	// that owns the relationship
	@ManyToMany(mappedBy="applications")
	private Set<Student> applicants;

	public Employer() {
	}

	public Employer(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	public Set<Student> getApplicants() {
		return applicants;
	}

	public void setApplicants(Set<Student> applicants) {
		this.applicants = applicants;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
