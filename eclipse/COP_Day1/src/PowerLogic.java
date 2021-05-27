import java.util.Scanner;

public class PowerLogic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int bs=1,pw,re=1;
		//int res;
		System.out.println("Enter the Base");
		bs=sc.nextInt();
		
		System.out.println("Enter the Power");
		pw=sc.nextInt();
		
		for(int i=1;i<=pw;i++)
		{
			re=re*bs;
			//bs=bs*bs;
		}
		System.out.println("The result is:"+re);

		sc.close();

	}

}
