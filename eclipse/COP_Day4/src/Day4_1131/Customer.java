package Day4_1131;

import java.util.Scanner;

public class Customer {

	private String name;
	private String email;
	private int age;
	private double creditLimit;
	
	public void AcceptInfo()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the name");
		name=sc.next();
		
		System.out.println("Enter the email");
		email=sc.next();
		
		System.out.println("Enter the age");
		age=sc.nextInt();
		
		System.out.println("Enter the CreditLimit");
		creditLimit=sc.nextInt();
		
		//sc.close();
	}
	
	
	 public void ShowDetails()
	 {
		 System.out.println("The Name of Customer is:"+name);
		 System.out.println("The CreditLimit of Customer is:"+creditLimit);

	 }
	 
	 public void setCreditLimit(double limit)
	 {
		 System.out.println("----Changing Credit Limit-----");
		 creditLimit=limit;
	 }
	 
	 public double getCreditLimit()
	 {
		 return creditLimit;
	 }
	
}
