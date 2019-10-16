# Hibernate Relationships
## Mapping
### Student.java (Owning side)

```java
// annotate many-to-one relationships
@ManyToOne
private Bootcamp bootcamp;
```

```java
// annotate many-to-many relationships
// the controlling end get the @JoinTable annotation.
@ManyToMany
@JoinTable(
		name = "student_application", 
		joinColumns = { @JoinColumn(name = "student_id") }, 
		inverseJoinColumns = { @JoinColumn(name = "employer_id") }
	)
private List<Employer> applications;
```

### Bootcamp.java (Optional)
```java
// one-to-many relationship indicates the name of the Java property on Student
// that owns the relationship
@OneToMany(mappedBy = "bootcamp")
private Set<Student> students;
```

### Employer.java (Optional)
```java
// many-to-many relationship indicates the name of the Java property on Student
// that owns the relationship
@ManyToMany(mappedBy="applications")
private Set<Student> applicants;
```

## Use
#### Add a student to a bootcamp (one-to-many)
```java
// The student - bootcamp relationship is owned by the student, so
// we need to update and save the student.
student.setBootcamp(bootcamp);
studentDao.update(student);
```

#### Remove a student from a bootcamp (one-to-many)
```java
// The student - bootcamp relationship is owned by the student, so
// we need to update and save the student.
student.setBootcamp(null);
studentDao.update(student);
```

#### Add an employer application to a student
```java
// The student - employee relationship is owned from the student end, so
// we need to update and save the student.
student.getApplications().add(employer);
studentDao.update(student);

// Note that the reverse does not work. From Hibernate's perspective, this relationship
// is owned by the student, not the employer.
employer.getApplicants().add(student);
employerDao.save(employer);
```

#### Remove an employer application from a student (many-to-many)
```java
// The student - employee relationship is owned from the student end, so
// we need to update and save the student.
student.getApplications().remove(employer);
studentDao.update(student);
```