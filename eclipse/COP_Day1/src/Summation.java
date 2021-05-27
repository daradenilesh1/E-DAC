import java.util.Scanner;

public class Summation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		int n;
		int sum=0;
		System.out.println("Enter the number upto which u want to summation:");
		n=sc.nextInt();
	
		
		for(int i=0;i<=n;i++)
		{
			sum=sum+i;
			
		}
		System.out.println(sum);
		sc.close();


	}

}
