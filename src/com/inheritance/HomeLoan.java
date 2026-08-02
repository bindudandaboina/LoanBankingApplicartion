package com.inheritance;

public class HomeLoan extends Loan{
	void homeLoanDocInfo(){
		System.out.println("home loan documents have been recevied successfully!!");
	}

	public static void main(String[] args) {
		System.out.println("welcome to home loan banking loan");
		
		HomeLoan p = new HomeLoan();
		
		boolean isValidPhone=p.isValidPhone();
		boolean isAdharValid=p.isAdharValid();
		boolean isPanValid=p.isPanValid();
		
				
		if(isValidPhone&&isAdharValid&&isPanValid) {
			String name = p.getCustomerName();
			System.out.println("welcome to home loan banking ms:" + name);
			
			double salary = p.getCustomerSalary();
			int age = p.getCustomerAge();
			double cibil = p.cibilInfo();

			if (salary >= 6000000.00 && (age > 21 && age <= 60) && (cibil > 300 && cibil <= 900)) {
				System.out.println("congratulations!! you are eligible for personal loan !!");
				System.out.println("your rate of intrest is:" + p.getROI());
			} else {
				System.out.println("you are not eligible for home loan");
			}
		}else {
			System.out.println("invalid details");
		}
		
	}

}
