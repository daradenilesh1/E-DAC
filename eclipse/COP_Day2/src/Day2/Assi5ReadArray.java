package Day2;
import java.util.Scanner;
public class Assi5ReadArray {

	public static void main(String[] args) {
		System.out.println("Enter the ele");
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements in array are:");
		for(int i:arr)
		{
			System.out.println(i);

		}
		sc.close();
		

	}

}
