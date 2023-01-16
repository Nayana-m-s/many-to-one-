package manytooneuni_school.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int student_id;
	private String studnet_name;
	private String address;
	private int marks;
	@ManyToOne
	private School school;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudnet_name() {
		return studnet_name;
	}
	public void setStudnet_name(String studnet_name) {
		this.studnet_name = studnet_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	@Override
	public String toString() {
		return "Students [student_id=" + student_id + ", studnet_name=" + studnet_name + ", address=" + address
				+ ", marks=" + marks + ", school=" + school + "]";
	}
	
	
	


}
