package Day4_1131;

public class CustomerTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Customer c=new Customer();
Customer c1=new Customer();
c.AcceptInfo();
c.ShowDetails();
c.setCreditLimit(90000);
System.out.println(c.getCreditLimit());
c.ShowDetails();

c1.AcceptInfo();
c1.ShowDetails();
	}

}
