import java.util.Scanner;



public class Power {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double bs,pw;
		double res=0;
		System.out.println("Enter the Base");
		bs=sc.nextDouble();
		
		System.out.println("Enter the Power");
		pw=sc.nextDouble();
//		res=bs*bs;
//		while(pw!=1)
//		{
//			res=res*bs;
//			pw--;
//		}
		res=Math.pow(bs,pw);
		System.out.println("The Result is:"+res);
		sc.close();

	}

}
