package Assi4.Customer;
import java.util.Scanner;

public class CustomerTest {

	public static void main(String[] args) {
		double ncl;
		Scanner sc=new Scanner(System.in);
		Customer customer1=new Customer("Nilesh","dnilesh@gmail.com",25,50000);
		Customer customer2=new Customer();
	
		customer1.display();
		customer2.display();
	
		System.out.println("*****changing CreditLimit");
		System.out.println("Enter new CreditLimit");
		ncl=sc.nextInt();
		customer2.setCreditLimit(ncl);
		System.out.println("updated credit limit is:"+customer2.getCreditLimit());
	}

}
