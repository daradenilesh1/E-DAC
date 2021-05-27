import java.util.Scanner;

public class Primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		int n;
		System.out.println("Enter the number:");
		n=sc.nextInt();
		int flag=0;
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;

			}
			
		}
		if(flag==1)
		{
			System.out.println("The number is Non-Prime");

		}
		else
		{
			System.out.println("The number is Prime");

		}
		
		sc.close();

	}

}
