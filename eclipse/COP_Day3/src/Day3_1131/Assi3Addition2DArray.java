package Day3_1131;

import java.util.Scanner;

public class Assi3Addition2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row,column;
		System.out.println("Enter the number of rows");
		row=sc.nextInt();
		System.out.println("Enter the number of columns");
		column=sc.nextInt();
		int[][] arr1=new int[row][column];
		int[][] arr2=new int[row][column];
		int[][] arr3=new int[row][column];
		System.out.println("Enter the elements of 1st matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter the elements of 2nd matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}
		
		

		System.out.println("The Addition of above 2 matrix is:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr3[i][j]=arr1[i][j]+arr2[i][j];
				
			}
		}
		

		//System.out.println("The Addition of above 2 matrix is:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(arr3[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		sc.close();
	}

}
