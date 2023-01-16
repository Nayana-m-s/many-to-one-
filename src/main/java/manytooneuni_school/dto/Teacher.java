package manytooneuni_school.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int teacher_id;
	private String teacher_name;
	private String teacher_subject;
	@ManyToOne
	private School school;
	public int getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	public String getTeacher_subject() {
		return teacher_subject;
	}
	public void setTeacher_subject(String teacher_subject) {
		this.teacher_subject = teacher_subject;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	@Override
	public String toString() {
		return "Teachers [teacher_id=" + teacher_id + ", teacher_name=" + teacher_name + ", teacher_subject="
				+ teacher_subject + ", school=" + school + "]";
	}
	

}
