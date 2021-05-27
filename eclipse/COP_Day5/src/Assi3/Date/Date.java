package Assi3.Date;

public class Date {
/*
	3->Create Date Class with Data Members day,month, year
	3.1:
	Create an object and initialize it using mutator methods and accesses it using
	accessor methods. Print the date.
	3.2
	Create two objects and initialize them using no-argument and parameterized
	constructor respectively. Print the date.
*/
	private int day;
	private int month;
	private int year;
	
	public Date()
	{
		this.day=1;
		this.month=1;
		this.year=2011;
		
	}
	public Date(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	
}
