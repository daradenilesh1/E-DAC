package Day2;
import java.util.Scanner;
public class Assi10GrossSalary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		int sal;
		System.out.println("Enter your basic sallary");
		sal=sc.nextInt();
		if(sal<=10000)
		{
			System.out.println("HRA = 20%, DA = 80% ");

		}
		else if(sal<=20000)
		{
			
				System.out.println("HRA = 25%, DA = 90% ");
			
		}
		else if(sal>20000)
		{
			
				System.out.println("HRA = 30%, DA = 95% ");
			
		}
		sc.close();
	}

}
