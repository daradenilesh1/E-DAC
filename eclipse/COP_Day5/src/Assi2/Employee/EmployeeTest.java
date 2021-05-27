package Assi2.Employee;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {

	
		
		Employee[] emp=new Employee[5];
		int n;
		//System.out.println("How many emp object u want to create");
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("\nEnter Employee Id, Name, Address, Salary: ");
		for(int i=0;i<emp.length;i++)
		{
			emp[i]=new Employee(sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
		}
		
		System.out.println("\nEmployee Details: ");
		for(int i=0;i<emp.length;i++)
		{
			System.out.println(emp[i].getEmpid());
			System.out.println(emp[i].getName());
			System.out.println(emp[i].getAddress());
			System.out.println(emp[i].getSlary());
		}

		System.out.println("Employees whos Salary greater than 20000");
		for(int i=0;i<emp.length;i++)
		{
			if(emp[i].getSlary()>20000)
			{
				System.out.println(emp[i].getEmpid());
				System.out.println(emp[i].getName());
				System.out.println(emp[i].getAddress());
				System.out.println(emp[i].getSlary());
			}
		}
		
		

	}

}
