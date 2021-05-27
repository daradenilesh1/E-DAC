package Day3_1131;
import java.util.Scanner;

public class Assi5MegeArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size1,size2;
		
		System.out.println("Enter the size of 1st array");
		size1=sc.nextInt();
		
		System.out.println("Enter the size of 2nd array");
		size2=sc.nextInt();
		
		int[] arr1=new int[size1];
		int[] arr2=new int[size2];
		int[] arr3=new int[size1+size2];
		
		
		System.out.println("Enter the Elements of 1st array");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		
		System.out.println("Enter the Elements of 2nd array");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		
		System.out.println("The Third array after Merging 1 & 2 is:");
		int l=0;
			for(int j=0;j<arr1.length;j++,l++) {
				arr3[j]=arr1[j];
			}
			for(int j=0;j<arr2.length;j++,l++) {
				arr3[l]=arr2[j];
			}
			for(int i=0;i<arr3.length;i++) {
				System.out.println(arr3[i]);
			}
		
		sc.close();
		
	}

}
