package Day2;

public class Assi4Funoverload {
	public static void addition(int i,int j)
	{
		int result=0;
		result=i+j;
		System.out.println("The Addition is:"+result);
	}
	public static void addition(int i,int j,int k)
	{
		//int result=0;
		int result=i+j+k;
		System.out.println("The Addition is:"+result);
	}
	public static void addition(int i,double j)
	{
		double result;
		result=i+j;
		System.out.println("The Addition is:"+result);
	}
	public static void addition(String i,String j)
	{
		//int result=0;
		String result=i+j;
		System.out.println("The Addition is:"+result);
	}
	
	
	

	public static void main(String[] args) {
		addition(15,36);
		addition(52,77,44);
		addition(26,52.3);
		addition("Nilesh","Darade");

	}

}
