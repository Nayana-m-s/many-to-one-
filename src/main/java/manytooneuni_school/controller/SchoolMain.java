package manytooneuni_school.controller;

import java.util.ArrayList;
import java.util.List;

import manytooneuni_school.dao.StudentDao;
import manytooneuni_school.dto.School;
import manytooneuni_school.dto.Student;
import manytooneuni_school.dto.Teacher;

public class SchoolMain {

	

		public static void main(String[] args) {
			School school = new School();
			school.setSchool_name("Vasavi ");
			school.setSchool_address("Chikamaglur");
			
			Student student1=new Student();
			student1.setStudnet_name("Anup");
			student1.setAddress("Chikmaglur");
			student1.setMarks(90);
			student1.setSchool(school);
			
			Student student2=new Student();
			student2.setStudnet_name("Arauna");
			student2.setAddress("Bangalore");
			student2.setMarks(95);
			student2.setSchool(school);
			
			Student student3=new Student();
			student3.setStudnet_name("Sharath");
			student3.setAddress("Hebbal");
			student3.setMarks(90);
			student3.setSchool(school);
			
			Teacher teacher1 = new Teacher();
			teacher1.setTeacher_name("Shantala");
			teacher1.setTeacher_subject("Maths");
			teacher1.setSchool(school);
			
			Teacher teacher2 = new Teacher();
			teacher2.setTeacher_name("Vinod");
			teacher2.setTeacher_subject("Cumputer Science");
			teacher2.setSchool(school);
			
			Teacher teacher3 = new Teacher();
			teacher3.setTeacher_name("manjunath");
			teacher3.setTeacher_subject("English");
			teacher3.setSchool(school);
			
			List <Student> studentslist = new ArrayList<Student>();
			studentslist.add(student1);
			studentslist.add(student2);
			studentslist.add(student3);
			
			List <Teacher> teacherslist = new ArrayList<Teacher>();
			teacherslist.add(teacher1);
			teacherslist.add(teacher2);
			teacherslist.add(teacher3);
			
			StudentDao dao = new StudentDao();
			dao.saveStudnet(studentslist, teacherslist);
			
			
			
			
			
			
		}

	}


