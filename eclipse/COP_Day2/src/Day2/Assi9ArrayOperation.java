package Day2;
import java.util.Scanner;
public class Assi9ArrayOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
	
		int[] arr=new int[size];
		//System.out.println("-----Array Operation------");
		System.out.println("Enter the ele");

		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int ans;
		do {
		int ch,sum=0;
		System.out.println("-----Array Operation------");
		System.out.println("1.Summation");
		System.out.println("2.Maximum");
		System.out.println("3.Minimum");
		System.out.println("Enter your choice");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:

			for(int i=0;i<size;i++)
			{
				sum=sum+arr[i];
			}
			System.out.println("summation is:"+sum);
			break;
			
		case 2:
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
			break;
		case 3:
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
			break;
		default:
			System.out.println("Enter Correct value:");

			
			
		}
		System.out.println("Do you want to continue(0/1):");
		ans=sc.nextInt();

		}while(ans==1);
	
		sc.close();
	}

}
