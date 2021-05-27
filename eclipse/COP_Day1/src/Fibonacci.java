import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number:");
		n=sc.nextInt();
		
		int first=0;
		int second=1;
		int third=0;
		System.out.println(first);
		System.out.println(second);

		for(int i=0;i<(n-2);i++)
		{
			third=first+second;
			System.out.println(third);
			first=second;
			second=third;
		}
		sc.close();
	}

}
