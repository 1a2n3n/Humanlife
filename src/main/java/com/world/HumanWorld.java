package com.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

	public class HumanWorld extends Humans {

		public static void main(String[] args) {
			// Humans hum = new Humans();
			Scanner sc = new Scanner(System.in);

			List<Humans> humanList = new ArrayList<Humans>();
			humanList.add(new Humans("Alan", 20, "Yes", "Christian", "England", "British", "Trusty", "male"));
			humanList.add(new Humans("Noby", 10, "Yes", "Muslim", "India", "Indian", "Calm", "female"));
			humanList.add(new Humans("Lena", 30, "No", "Hindu", "India", "Indian", "Sensitiver", "female"));
			humanList.add(new Humans("Bobin", 50, "No", "Christian", "Scotland", "Scottish", "Possesive", "male"));
			String var = sc.nextLine();

			for (Humans h : humanList) {
				// System.out.println(var);
				String s = h.getName();
				// System.out.println(h.getName());
//	        	System.out.println();
				if (var.equals(h.getName())) {
					// System.out.println("dja");
					System.out.println("Name=" + h.getName());
					System.out.println("Age=" + h.getAge());
					System.out.println("Believer=" + h.getBeliever());
					System.out.println("Religion=" + h.getReligion());
					System.out.println("Country=" + h.getCountry());
//	        	 System.out.println("Behaviour="+h.getBehaviour());
					System.out.println("Nationality=" + h.getNationality());
					System.out.println("Behaviour=" + h.getBehaviour());

					System.out.println("Gender=" + h.getGender());
				} 

			}

//			System.out.println(humanList);
		}
	}



