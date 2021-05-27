package Day2;
import java.util.Scanner;

public class Assi6 {

	public static void main(String[] args) {
		System.out.println("Enter the ele");
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("after reversing the Array");
		for(int i=4;i>=0;i--)
		{
			System.out.println(arr[i]);

		}

		sc.close();

	}

}
