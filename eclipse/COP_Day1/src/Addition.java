
import java.util.*;
public class Addition {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		int num1,num2,res;
		System.out.println("Enter two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		res=num1+num2;
		System.out.println("Addition is="+res);
		
		
		char c1,c2,addn;
		System.out.println("Enter two characters");
		c1=sc.next().charAt(0);
		c2=sc.next().charAt(0);
		addn=(char)(c1+c2);
		System.out.println("Addition is="+addn);
		sc.close();

		}

}
