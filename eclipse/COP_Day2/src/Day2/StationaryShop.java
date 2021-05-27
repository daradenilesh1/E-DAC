package Day2;
import java.util.Scanner;
public class StationaryShop {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("****Welcome to the Stationary Shop****");
		System.out.println("Price Details are as follows: \n 1.Pen: 10Rs \n 2.Pensil: 5Rs \n 3.Notebook: 20Rs \n 4.Bottle: 30Rs \n 5.ColourBox: 50Rs");
		int ch,total=0,ans;
		do{
		System.out.println("Enter the number which item you want to purchase:");
		ch=sc.nextInt();
		
		
		switch(ch)
		{
		case 1:
			System.out.println("You Purchased the Pen");
			total=total+10;
			break;
		case 2:
			System.out.println("You Purchased the Pencil");
			total=total+5;
			break;
		case 3:
			System.out.println("You Purchased the Notebook");
			total=total+20;
			break;
		case 4:
			System.out.println("You Purchased the Bottle");
			total=total+30;
			break;
		case 5:
			System.out.println("You Purchased the ColourBox");
			total=total+50;
			break;
		default:
			System.out.println("Enter correct choice");	
		}
		System.out.println("Your Total bill is:"+total+"Rs");	
		
		System.out.println("You want to continue(1/0)");
		ans=sc.nextInt();
	}while(ans==1);
		if(ans==0)
		{
			System.out.println("-----Thanks for visiting us, Have a nice Day-----");

		}

		sc.close();

	}


}
