package Day3_1131;

import java.util.Scanner;

public class Assi1AcceptArrayString {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int size;

		System.out.println("Enter the number of elements u want insert");
		size = sc.nextInt();
		String[] arr = new String[size];
		dispalyUpperCase(arr);

		sc.close();
	}



	public static void dispalyUpperCase(String[] sarr) {
		System.out.println("Enter the String elements u want insert");
	//	System.out.println("Length"+sarr.length);
		for (int i = 0; i < sarr.length; i++) {
			sarr[i] = sc.next();
		}
		System.out.println("The string ele in uppercase are:");

//		for (int i = 0; i < sarr.length; i++) {
//			System.out.println(sarr[i].toUpperCase());
//
//		}
		for(String name: sarr)
		{
			System.out.println("Name :"+name.toUpperCase());
		}

	}
}
