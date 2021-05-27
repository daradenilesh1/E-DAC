package Day2;

public class Ass3swap {
	public static void swap(int i,int j)
	{
		int temp;
		temp=i;
		i=j;
		j=temp;
		System.out.println(" after swapping the numbers The values are:"+i+" "+j);


	}

	public static void main(String[] args) {
		swap(10,20);

		
	}

}
