package pack3.Test;
import pack1.Student.Student;
import pack2.Batch.Batch;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.acceptInfo();
		s.displayInfo();
		
		System.out.println("--------------");
		
		Batch b=new Batch();
		b.acceptInfo();
		b.displayInfo();

	}

}
