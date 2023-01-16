package manytooneuni_school.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import manytooneuni_school.dto.School;
import manytooneuni_school.dto.Student;
import manytooneuni_school.dto.Teacher;

public class StudentDao {
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		return entityManagerFactory.createEntityManager();
	}
	
	public void saveStudnet(Student student,int school_id) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		  entityManager.find(School.class,school_id );
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
	}
	
	public void updateStudent(int student_id , Student students ) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Student getStudent = entityManager.find(Student.class,student_id);
		if(getStudent!=null) {
		entityTransaction.begin();
		
	    entityManager.merge(getStudent);
		
		entityTransaction.commit();
		
		}else {
			System.out.println("Student not found");
		}
	}
	
	public void deleteStudent(int student_id) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		Student getStudent = entityManager.find(Student.class, student_id);
		if(getStudent!=null) {
		entityTransaction.begin();

	
		entityManager.remove(getStudent);
		
		
		entityTransaction.commit();
		
		}else {
			System.out.println("Student not found");
		}
	}
	
	public void getStudentById(int student_id) {
		EntityManager entityManager = getEntityManager();
		
		Student student = entityManager.find(Student.class, student_id);
		System.out.println(student);
	}
	
	public void getAllStudents() {
		EntityManager entityManager = getEntityManager();
		
		Query query = entityManager.createQuery("select s from Students s");
		List<Student>student_list = query.getResultList();
		System.out.println(student_list);
	}

}
