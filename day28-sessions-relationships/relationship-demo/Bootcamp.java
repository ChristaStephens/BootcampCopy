package co.grandcircus.relationshipdemo.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bootcamp {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String instructor;
	// one-to-many relationship indicates the name of the Java property on Student
	// that owns the relationship
	@OneToMany(mappedBy = "bootcamp")
	private Set<Student> students;

	public Bootcamp() {
	}

	public Bootcamp(Long id, String name, String instructor) {
		super();
		this.id = id;
		this.name = name;
		this.instructor = instructor;
	}

	public Bootcamp(Long id, String name, String instructor, Set<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.instructor = instructor;
		this.students = students;
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

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Bootcamp [id=" + id + ", name=" + name + ", instructor=" + instructor + "]";
	}

}
