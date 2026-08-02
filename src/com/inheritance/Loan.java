package com.inheritance;

import java.util.Scanner;
//parent/super/base class
public class Loan {
	Scanner sc = new Scanner(System.in);
	String getCustomerName() {
		sc.nextLine();
		System.out.println("enter a name:");
		String name = sc.nextLine();
		return name;
	}

	int getCustomerAge() {
		System.out.println("enter your age");
		int age = sc.nextInt();
		return age;
	}

	double getCustomerSalary() {
		System.out.println("enter your salary");
		double salary = sc.nextDouble();
		return salary;
	}

	int cibilInfo() {
		System.out.println("enter your cibil score");
		int cibil = sc.nextInt();
		return cibil;
	}

	double getROI() {
		int cibil = cibilInfo();
		double roi = 12.0;
		if (cibil >= 300 && cibil < 550) {
			System.out.println("poor-high risk for lenders");
			return roi + 1.0;
		} else if (cibil >= 550 && cibil < 650) {
			System.out.println("averege-credit may be approved with difficulty");
			return roi;
		} else if (cibil >= 650 && cibil < 750) {
			System.out.println("good-acceptable to many lenders");
			return roi - 2.0;
		} else if (cibil >= 750 && cibil <= 900) {
			System.out.println("excellent-high approval chances and better intrest rates");
			return roi - 4.0;
		} else {
			System.out.println("invalid cibil score:");
			return roi;
		}
	}
	boolean isValidPhone(){
		System.out.println("enter your phone");
		String phone=sc.next();
	boolean isValid=	phone.matches("^[6-9][0-9]{9}");
		return isValid;
	}
	boolean isAdharValid() {
		System.out.println("enter your adhar:");
		String adhar=sc.next();
	boolean	isAdharValid=adhar.matches("^[2-9][0-9]{11}");
	return isAdharValid;
	}
	boolean isPanValid() {
		System.out.println("enter yor pan details");
		String pan=sc.next();
		boolean isPanValid=pan.matches("^[A-Z]{5}[0-9]{4}[A-Z]{1}");
		return isPanValid;
	}

}
