package Day3_1131;
import java.util.Scanner;
public class Assi6SortArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size;

		System.out.println("Enter the size of array");
		size=sc.nextInt();
		
		int[] arr=new int[size];


		System.out.println("Enter the Elements of array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();  
		}
		
	
	
		for(int i=0;i<arr.length;i++)
		{
		for(int j=i+1;j<arr.length;j++)
		{
			
		
			int temp=0;
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	
			
		}
		
//	int temp=0;
//		
//		  for (int i = 0; i < arr.length; i++) {     
//		        for (int j = i+1; j < arr.length; j++) {     
//		           if(arr[i] > arr[j]) {    
//		               temp = arr[i];    
//		               arr[i] = arr[j];    
//		               arr[j] = temp;    
//		           }     
//		        }     
//		    }    
//	
		System.out.println("After sorting array in ascending order:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	
		sc.close();
	}

}
