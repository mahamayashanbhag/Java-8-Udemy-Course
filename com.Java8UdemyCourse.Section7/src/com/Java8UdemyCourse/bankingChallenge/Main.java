package com.Java8UdemyCourse.bankingChallenge;

public class Main {

	public static void main(String[] args) {
//		banking b = new banking(12345, "Bob Marley", "bobm@gmail.com", 1234567890);
//		
//		b.deposit(1000);
//		
//		b.withdrawl(1700);
		
		vipPerson p1 = new vipPerson();
		System.out.println(p1.getName());
		
		vipPerson p2 = new vipPerson("Bob", 25000.00);
		System.out.println(p2.getName());
		
		
		vipPerson p3 = new vipPerson("Tim", 300.00, "tim@email.com");
		System.out.println(p3.getName());
		
		

	}

}
