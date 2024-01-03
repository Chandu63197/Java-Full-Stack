package org.jsp.manytomanyuni.controller;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.jsp.manytomanyuni.dto.Batch;
public class FindBatchBySubject {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the subject to fetch Batch details");
		String subject = sc.next();
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		String qry1 = "select b from Batch b where b.subject=?1";
		Query q = manager.createQuery(qry1);
		q.setParameter(1, subject);
		List<Batch> bs = q.getResultList();
		if (bs.size() > 0) {
			for (Batch b : bs) {
				System.out.println("Batch Id:" + b.getId());
				System.out.println("Batch Subject:" + b.getSubject());
				System.out.println("Batch Code:" + b.getCode());
				System.out.println("Batch Trainer:"+b.getTrainer());
			}
		} else {
			System.out.println("Entered an Invalid Batch Subject");
		}
		sc.close();
	}
}