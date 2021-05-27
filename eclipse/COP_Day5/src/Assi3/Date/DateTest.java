package Assi3.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1=new Date();
		d1.setDay(13);
		d1.setMonth(8);
		d1.setYear(1998);
		
		System.out.println("Details are:");

		System.out.println(d1.getDay());
		System.out.println(d1.getMonth());
		System.out.println(d1.getYear());
		
		Date d2=new Date();

		System.out.println("Details of d2 are:");

		System.out.println(d2.getDay());
		System.out.println(d2.getMonth());
		System.out.println(d2.getYear());
		
		
		Date d3=new Date(2,5,2020);
		System.out.println("details of d3 are:");
		
		System.out.println(d3.getDay());
		System.out.println(d3.getMonth());
		System.out.println(d3.getYear());

	}

}
