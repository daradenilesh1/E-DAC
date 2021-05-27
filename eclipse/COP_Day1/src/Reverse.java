import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	System.out.println(rev);
	sc.close();


	}

}
