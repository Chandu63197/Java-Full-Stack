package org.jsp.jpahibernate.controller;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.jsp.jpahibernate.dto.Person;
public class FetchPersonByPhonePassword {
	public static void main(String[] args) {
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q = manager.createNamedQuery("verifyPersonByPhoneandPassword");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Phone number and password  to verify the person");
		long phone=s.nextLong();
		String password=s.next();
		q.setParameter(1, phone);
		q.setParameter(2, password);
		try{
			    Person p=(Person)q.getSingleResult();
				System.out.println("Id:" + p.getId());
				System.out.println("Name:" + p.getName());
				System.out.println("Age:" + p.getAge());
				System.out.println("Phone:" + p.getPhone());
				System.out.println("Email id:" + p.getEmail());
		} catch(NoResultException e){
			System.out.println("No person found with the entered Phone number and password");
		}
	}
}