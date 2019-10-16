package co.grandcircus.relationshipdemo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bootcamp_student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	// annotate many-to-one relationships
	@ManyToOne
	private Bootcamp bootcamp;
	
	// annotate many-to-many relationships
	// the controlling end get the @JoinTable annotation.
	@ManyToMany
	@JoinTable(
	        name = "student_application", 
	        joinColumns = { @JoinColumn(name = "student_id") }, 
	        inverseJoinColumns = { @JoinColumn(name = "employer_id") }
	    )
	private List<Employer> applications;

	public Student() {
	}

	public Student(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Student(Long id, String name, Bootcamp bootcamp) {
		super();
		this.id = id;
		this.name = name;
		this.bootcamp = bootcamp;
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

	public Bootcamp getBootcamp() {
		return bootcamp;
	}

	public void setBootcamp(Bootcamp bootcamp) {
		this.bootcamp = bootcamp;
	}

	public List<Employer> getApplications() {
		return applications;
	}

	public void setApplications(List<Employer> applications) {
		this.applications = applications;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", bootcamp=" + bootcamp + "]";
	}

}
