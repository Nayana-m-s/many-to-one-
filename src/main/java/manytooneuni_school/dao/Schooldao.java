package manytooneuni_school.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import manytooneuni_school.dto.School;
public class Schooldao {
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		return entityManagerFactory.createEntityManager();
	}
	
	public void saveSchool(School school) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		entityManager.persist(school);
		
		System.out.println("School saved to School");
			
		entityTransaction.commit();
	}
	
	public void updateSchool(int school_id , School school ) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		School getSchool = entityManager.find(School.class,school_id);
		if(getSchool!=null) {
		entityTransaction.begin();
		
	    entityManager.merge(getSchool);
		
		entityTransaction.commit();
		System.out.println("School updated");
		}else {
			System.out.println("School not found");
		}
	}
	
	public void deleteSchool(int school_id) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		School getSchool = entityManager.find(School.class, school_id);
		if(getSchool!=null) {
		entityTransaction.begin();

	
		entityManager.remove(getSchool);
		
		
		entityTransaction.commit();
		System.out.println("School deleted");
		
		}else {
			System.out.println("School not found");
		}
	}
	
	public void getSchoolById(int school_id) {
		EntityManager entityManager = getEntityManager();
		
		School school = entityManager.find(School.class, school_id);
		System.out.println(school);
	}
	
	public void getAllSchools() {
		EntityManager entityManager = getEntityManager();
		
		Query query = entityManager.createQuery("select s from Students s");
		List<School>school_list = query.getResultList();
		System.out.println(school_list);
	}

}
