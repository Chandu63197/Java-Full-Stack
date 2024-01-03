package org.jsp.jpahibernate.controller;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.jsp.jpahibernate.dto.Person;
public class FetchPersonByAge {
  public static void main(String[] args) {
	String jpql="select p from Person p where p.age=?1";
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the age to fetch the person");
	int age=s.nextInt();
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	Query q=manager.createQuery(jpql);
	q.setParameter(1,age);
	List<Person> ps=q.getResultList();
	if(ps.size()>0) {
		for(Person p:ps) {
			System.out.println("Id:"+p.getId());
			System.out.println("Name:"+p.getName());
			System.out.println("Age:"+p.getAge());
			System.out.println("Phone:"+p.getPhone());
			System.out.println("Email id:"+p.getEmail());
		}
	}
	else {
		System.out.println("No person found with the entered age");
	}
  }
}
