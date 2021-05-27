package Day2;
import java.util.Scanner;
//import java.util.lang;

public class Assi2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int rno,m1,m2,m3,m4,m5,total;
		double percentage;
		String name;
		System.out.println("-------Student Information-----------");
		System.out.println("Enter the Roll no:");
		rno=sc.nextInt();
		System.out.println("Enter the Name of the student:");
		name=sc.next();
		
		System.out.println("Enter the Marks of 5 subject:");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		m4=sc.nextInt();
		m5=sc.nextInt();
		total=m1+m2+m3+m4+m5;
		System.out.println("Total Marks of 5 subject is:"+total);
		
		percentage=((total*100)/500);
		System.out.println("Percentage is:"+percentage);
		if(percentage>75)
			System.out.println("Grade:"+'A');
			else if(percentage>60 && percentage<74)
			System.out.println("Grade:"+'B');
			else if(percentage<74)
				System.out.println("Grade:"+'C');
		sc.close();
	}

}
