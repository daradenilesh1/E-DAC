package Day2;
import java.util.Scanner;

public class Assi8Max_Min {

	public static void main(String[] args) {
		int size;
		
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
	
		int[] arr=new int[size];
		System.out.println("Enter the ele");

		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int max;
		max=arr[0];
		for(int i=0;i<size;i++)
		{
			
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Max ele is: "+max);
		
		
		int min;
		min=arr[0];
		for(int i=0;i<size;i++)
		{
			
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Min ele is: "+min);
		sc.close();
		

		
	}

}
