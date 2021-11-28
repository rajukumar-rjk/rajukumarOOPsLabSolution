package com.greatlearning.main;
import java.util.Scanner;
import com.greatlearning.service.CredentialService;
import com.greatlearning.model.*;
public class Driver {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter your First Name");
		String firstName = sc.next();
		
		System.out.println("Enter your Last Name");
		String lastName = sc.next();
		
		System.out.println("Choose your department");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		
		int choice = sc.nextInt();
		Employee emp;
		
		switch(choice) {
			case 1:
				emp = new Employee(firstName,lastName,"tech");
				break;

			case 2:
				emp = new Employee(firstName,lastName,"admin");
				break;

			case 3:
				emp = new Employee(firstName,lastName,"hr");
				break;

			case 4:
				emp = new Employee(firstName,lastName,"lg");
				break;

			default:
				System.out.println("Wrong choice");
				return;
		}
		
		CredentialService cs = new CredentialService();		
		String email = cs.generateEmailAddress(emp);
		String password = cs.generatePassword();
		cs.showCredentials(emp, email, password);

		
	}
}