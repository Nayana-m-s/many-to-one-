package manytooneuni_school.dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import manytooneuni_school.dto.Teacher;

public class TeacherDao {
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		return entityManagerFactory.createEntityManager();
	}
	
	public void saveTeacher(Teacher teacher , int school_id) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		
		entityManager.persist(teacher);
		
		System.out.println("teacher saved to School");
			
		entityTransaction.commit();
	}
	
	public void updateTeacher(int teacher_id , Teacher teachers ) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Teacher getTeacher = entityManager.find(Teacher.class,teacher_id);
		if(getTeacher!=null) {
		entityTransaction.begin();
		
	    entityManager.merge(getTeacher);
		
		entityTransaction.commit();
		System.out.println("Teacher updated");
		}else {
			System.out.println("Teacher not found");
		}
	}
	
	public void deleteTeacher(int teacher_id) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		Teacher getteacher = entityManager.find(Teacher.class, teacher_id);
		if(getteacher!=null) {
		entityTransaction.begin();

	
		entityManager.remove(getteacher);
		
		
		entityTransaction.commit();
		System.out.println("Teacher deleted");
		
		}else {
			System.out.println("Teacher not found");
		}
	}
	
	public void getTeacherById(int teacher_id) {
		EntityManager entityManager = getEntityManager();
		
		Teacher teacher  = entityManager.find(Teacher.class, teacher_id);
		System.out.println(teacher);
	}
	
	public void getAllTeachers() {
		EntityManager entityManager = getEntityManager();
		
		Query query = entityManager.createQuery("select t from Teachers t");
		List<Teacher>teachers_list = query.getResultList();
		System.out.println(teachers_list);
	}

}
