import java.util.Scanner;

public class AllPrime {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	    int n,f;
		System.out.println("Enter the no upto which you want to find prime no");
		n=sc.nextInt();
		System.out.println("Prime Numbers:  ");
		for(int i=3;i<n;i++)
		{
			f=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					f=1;
					break;
				}
				
				else {
					
				}
			}
			if(f==0)
				System.out.print(i+"\t");	
		}	
		sc.close();
		
	}

}
