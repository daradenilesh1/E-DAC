package Day3_1131;
import java.util.Scanner;

public class Assi2Accept2DArrayDisplay {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row,column;
		// TODO Auto-generated method stub
		System.out.println("Enter the number of rows");
		row=sc.nextInt();
		System.out.println("Enter the number of columns");
		column=sc.nextInt();
		int[][] arr=new int[row][column];
		System.out.println("Enter the elements of 2D array");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("The Elements of array are:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println("");

			
		}
		
		
		
		sc.close();
	}

}
