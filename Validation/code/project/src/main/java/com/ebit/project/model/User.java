package com.ebit.project.model;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name= "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int id;
	
	@NotBlank(message="Name cannot be blank")
	private String name;
	
//	@Email(message = "invalid email")
//	private String email;
//	
//	@Pattern(regexp ="^\\d{10}$", message="invalid mobile number")
//	private String mobileno;
//	
//	@Min(10)
//	@Max(60)
//	private int age;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name ="fk_l_id")
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "fk_role_id", referencedColumnName = "role_id")
//	private Role role;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "Student_course_table",
	joinColumns = {
			@JoinColumn(name ="student_id", referencedColumnName = "user_id")
	},
	inverseJoinColumns = {
			@JoinColumn(name = "course_id", referencedColumnName = "id")
	})
	private Set<Course> course;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "fk_course_id")
//	private Course course;
	
//	@OneToMany(mappedBy = "user")
//	private List<Course> course;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


//	public String getEmail() {
//		return email;
//	}
//
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//
//
//	public String getMobileno() {
//		return mobileno;
//	}
//
//	public void setMobileno(String mobileno) {
//		this.mobileno = mobileno;
//	}
//
//
//
//	public int getAge() {
//		return age;
//	}

//
//	public void setAge(int age) {
//		this.age = age;
//	}




	public Set<Course> getCourse() {
		return course;
	}




	public void setCourse(Set<Course> course) {
		this.course = course;
	}




	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", course=" + course + "]";
	}



//
//	@Override
//	public String toString() {
//		return "User [id=" + id + ", name=" + name + ", email=" + email + ", mobileno=" + mobileno + ", age=" + age
//				+ ", course=" + course + "]";
//	}
//	
	
	
	


//
//	public Role getRole() {
//		return role;
//	}
//
//
//
//
//	public void setRole(Role role) {
//		this.role = role;
//	}
//
//
//
//
//	@Override
//	public String toString() {
//		return "User [id=" + id + ", name=" + name + ", email=" + email + ", mobileno=" + mobileno + ", age=" + age
//				+ ", role=" + role + "]";
//	}




	
	

}
