package com.inheritance;

import java.util.Scanner;

//child or sub or derived class
public class PersonalLoan extends Loan {
	Scanner sc = new Scanner(System.in);

	void personalLonDocInfo() {
		System.out.println("personal loan documents have been recevied successfully!!");
	}

	public static void main(String[] args) {
		System.out.println("welcome to banking loan");
		// scenario 1:child object vs child reference
		// by using child object and child reference we can call both
		// child class functionalities as well as parent class functionalities.
		PersonalLoan p = new PersonalLoan();

		// scenario 2:parent object vs parent reference
		// by using parent object and parent reference we can call
		// only parent class functionalities.

		boolean isValidPhone = p.isValidPhone();
		boolean isAdharValid = p.isAdharValid();
		boolean isPanValid = p.isPanValid();
		// scenario 3:child object vs parent reference
		// can we store child object into parent reference..?yes
		// by using child object and parent reference we can
		// only parent class functionalities but not a child class functionalities
		
		// what is upcasting and what is dynamic method dispatching?
		// upcasting means storing child into parent.
		
		// dynamic method dispatching means,generally by using child object & parent
		// reference we can only parent class functionalities.
		// but,when we override the method from parent to child even though its point to parent reference
		// the method is executing from child at runtime is the process DMD(abstraction).

		if (isValidPhone && isAdharValid && isPanValid) {
			String name = p.getCustomerName();
			System.out.println("welcome to banking ms:" + name);

			double salary = p.getCustomerSalary();
			int age = p.getCustomerAge();
			double cibil = p.cibilInfo();

			if (salary >= 7000000.00 && (age > 21 && age <= 55) && (cibil > 300 && cibil <= 900)) {
				System.out.println("congratulations!! you are eligible for personal loan !!");
				System.out.println("your rate of intrest is:" + p.getROI());
			} else {
				System.out.println("you are not eligible for loan");
			}
		} else {
			System.out.println("invalid details");
		}

	}

}
