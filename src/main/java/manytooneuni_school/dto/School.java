package manytooneuni_school.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class School {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int school_id;
	private String school_name;
	private String school_address;
	
	public int getSchool_id() {
		return school_id;
	}

	public void setSchool_id(int school_id) {
		this.school_id = school_id;
	}

	public String getSchool_name() {
		return school_name;
	}

	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}

	public String getSchool_address() {
		return school_address;
	}

	public void setSchool_address(String school_address) {
		this.school_address = school_address;
	}

	@Override
	public String toString() {
		return "School [school_id=" + school_id + ", school_name=" + school_name + ", school_address=" + school_address
				+ "]";
	}
}
