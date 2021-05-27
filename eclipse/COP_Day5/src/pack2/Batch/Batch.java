package pack2.Batch;
import java.util.Scanner;


public class Batch {

	int batch_id;
	String batch_name;
	int no;

	
	
	public void acceptInfo()
	{	Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the batch id:");
		batch_id=sc.nextInt();
		
		System.out.println("Enter the batch name");
		batch_name=sc.next();
		
		System.out.println("Enter the total no of stu in batch:");
		no=sc.nextInt();
	}
		
		public void displayInfo()
		{
			System.out.println("batch id:"+batch_id);
			System.out.println("batch name:"+batch_name);
			System.out.println("total number:"+no);

		}

		

}
