import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2,t;
		
		System.out.println("Enter first numbers");
		n1=sc.nextInt();
		System.out.println("Enter second numbers");
		n2=sc.nextInt();
		t=n1;
		n1=n2;
		n2=t;
		System.out.println("After swapping the numbers:="+n1+" "+n2);
		sc.close();
		
	}

}
