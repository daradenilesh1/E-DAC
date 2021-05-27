package Assi4.Customer;
import java.util.Scanner;
public class Customer {
	
	private String name;
	private String email;
	private int age;
	private double creditLimit;
	
	public Customer(String name,String email,int age,double creditLimit)
	{
		this.name=name;
		this.email=email;
		this.age=age;
		this.creditLimit=creditLimit;
	}
	
	public Customer()
	{
		this.name="Riya";
		this.email="riya@gmail.com";
		this.age=25;
		this.creditLimit=10000;
		
	}
	
	public void getDetails()
	{	
		
		double cl;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of customer:");
		nm=sc.next();
		System.out.println("Enter cr/*String nm;edit limit");
		cl=sc.nextDouble();*/
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	public void display()
	{
		System.out.println("Name:"+this.name);
		System.out.println("Email:"+this.email);
		System.out.println("Age:"+this.age);
		System.out.println("CreditLimit:"+this.creditLimit);
	}
	
	
	
	
/*
Problem Statement 4:
->Create a java applicstion for the following.
 Create a Customer class , with data members (all private : tight encapsulation)
name(String),email(String),age(int), creditLimit(double)

4.1 Supply a parameterized constructor to accept all details from user

4.2 Supply an argument less  constructor to init default name to "Riya" , email to "riya@gmail.com",age=25,creditLimit=10000
(Must use constructor chaining)

4.3 Write a method , getDetails to return String form of customer name & credit limit only.
4.4 Supply getter & setter for creditLimit.

Naming convention : public void setCreditLimit(double limit) {...}
public double getCreditLimit(){...}

4.5 Create a TestCustomer class . Use scanner to accept user i/ps.
Create 2 customers using 2 different constructors(4.1 : customer1 ,4.2 : customer2)
Display customer details of both customers.
Prompt user , for changing creditLimit of the customer2.
Display new credit limit on the console.
*/


}
