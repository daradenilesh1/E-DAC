package Day2;

import java.util.Scanner;



public class Assi7EleCheckinArray {

	public static void main(String[] args) {
		int size,ch;

		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
	
		int[] arr=new int[size];
		System.out.println("Enter the ele");

		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element which u want to search");
		ch=sc.nextInt();
		int flag=0;
		// 10 20 30 60 80 90
		// 30
		for(int i=0;i<size;i++)
		{
		if(arr[i]==ch)
		{
			flag=1;
			System.out.println("Element "+ch +" is present at location "+i);
			break;
		}

 	   }
		if(flag==0)
		{
			System.out.println("Element is absent");
		}
		sc.close();
		



		
	}

}
