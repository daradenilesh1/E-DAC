package Day3_1131;

public class Assi4VarArgs {

	public static void main(String[] args) {
		
		int res=summation(12,45,45,25,84,74,15,99);
		System.out.println("Summation is:"+res);

		

	}	public static int summation(int...arr)

	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	
	}

}
