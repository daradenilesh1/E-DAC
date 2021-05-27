package pack1.Student;
import java.util.Scanner;

public class Student {
	
	public int rno;
	public String nm;
	private char grade;
	int tmarks;

	
	
	public void acceptInfo()
	{	Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the roll number of the student:");
		rno=sc.nextInt();
		
		System.out.println("Enter the name of the student:");
		nm=sc.next();
		
		System.out.println("Enter the total marks of the student:");
		tmarks=sc.nextInt();
	}
	public void grade()
	{
		if(tmarks>=90)
			grade='Á';
		else if(tmarks>70&&tmarks<90)
			grade='B';
		else if(tmarks<70)
			grade='C';
	}
		
		public void displayInfo()
		{
			grade();
			System.out.println("roll no:"+rno);
			System.out.println("name:"+nm);
			System.out.println("total marks:"+tmarks);
			System.out.println("grade:"+grade);

		}

		
	}
	
	


