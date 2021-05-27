package Day4_1131;

import java.util.Scanner;

public class Date {
	private int day;
	private int month;
	private int year;
	
	
	public void AcceptDate()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Day");
		day=sc.nextInt();
		
		System.out.println("Enter the Month");
		month=sc.nextInt();
		
		System.out.println("Enter the Year");
		year=sc.nextInt();
		
		sc.close();

		
	}
	
	
	public void DisplayDate()
	{
		System.out.println("Day:"+day);
		
		System.out.println("Month:"+month);
		
		System.out.println("Year:"+year);
		
	}
	
		

}
