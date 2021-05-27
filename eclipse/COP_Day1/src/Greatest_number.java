import java.util.Scanner;

public class Greatest_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n1,n2,n3;
		System.out.println("Enter the 1st number:");
		n1=sc.nextInt();
		System.out.println("Enter the 2nd number:");
		n2=sc.nextInt();
		System.out.println("Enter the 3rd number:");
		n3=sc.nextInt();
		if(n1>n2)
		{
			if(n1>n3)
			{
				System.out.println("The greatest number is:"+n1);

			}
			else
			{
				System.out.println("The greatest number is:"+n3);

			}
		 }else if(n2>n1) {
			if(n2>n3) {
				System.out.println("The greatest number is:"+n2);
			}else {
				System.out.println("The greatest number is:"+n3);
			}
		}
		sc.close();

	


		

	}

}
