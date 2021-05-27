package Day4_1131;
import java.util.Scanner;
public class Employee {
	private int employee_id;
	private String name;
	private double basic_salary;
	private double hra;
	private double medical;
	private double pf;
	private double pt;
	private double net_salary;
	private double gross_salary;
	
	
	public void AcceptInfo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee id:");
		employee_id=sc.nextInt();
		
		System.out.println("Enter the employee name:");
		name=sc.next();
		
		System.out.println("Enter the basic salary:");
		basic_salary=sc.nextDouble();
		
	}
	public void calculate()
	{
	
	hra=((0.5)*basic_salary);
	pf=((0.12)*basic_salary);
	pt=200;
	medical=500;
	
	
	
	gross_salary=basic_salary+hra+medical;
	net_salary=gross_salary-(pt+pf);

	}
	public void DisplayEmployee()
	{
		System.out.println("Basic salary is:"+basic_salary);
		System.out.println("HRA is:"+hra);
		System.out.println("PF is:"+pf);
		System.out.println("PT is:"+pt);
		System.out.println("Gross salary is:"+gross_salary);
		System.out.println("Basic salary is:"+net_salary);


		
	}

}
