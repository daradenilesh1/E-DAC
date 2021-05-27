import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans=1;
		while(ans!=0)
		{
		Scanner sc=new Scanner(System.in);

		int n;
		System.out.println("Enter the number:");
		n=sc.nextInt();
		
		int cpy;
		cpy=n;
		int rev=0,rem=0;
		
		while(cpy!=0)
		{
			rem=cpy%10;
			rev=rev*10+rem;
			cpy=cpy/10;
		}
	//	System.out.println(rev);

		if(rev==n)
		{
			System.out.println("palindrome");

		}
		else
		{
			System.out.println("Non palindrome");

		}
		System.out.println("want to conti.(Press 1 or 0)");
		ans=sc.nextInt();
		//sc.close();

		}

	}

}
