package com.ebit.project.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Course{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String course_name;
	
	@ManyToMany(mappedBy = "course", fetch = FetchType.LAZY)
	private Set<User> user;

//	@OneToOne(mappedBy = "course")
//	private User user;
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "fk_user_id", referencedColumnName = "user_id")
//	private User user;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}


	public Set<User> getUser() {
		return user;
	}

	public void setUser(Set<User> user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Course [id=" + id +  ", course_name=" + course_name + "]";
	}
	
	
	
}





//
//
//import java.util.List;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToMany;
//
//@Entity
//public class Role {
//
//	@Id
//	@Column(name ="role_id")
//	private int id;
//	private String role;
//	
//	
////	@OneToMany(mappedBy = "role")
////	private List<User> user;
//
//	
//
//	public Role() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//
//	public int getId() {
//		return id;
//	}
//
//
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//
//
//	public String getRole() {
//		return role;
//	}
//
//
//
//	public void setRole(String role) {
//		this.role = role;
//	}
//
//
//
//
//	public List<User> getUser() {
//		return user;
//	}
//
//
//	public void setUser(List<User> user) {
//		this.user = user;
//	}
//
//
//	@Override
//	public String toString() {
//		return "Role [id=" + id + ", role=" + role + "]";
//	}
//
//
//	
//	
//	
//	
//}
