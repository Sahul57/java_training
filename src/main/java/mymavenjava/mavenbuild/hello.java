package mymavenjava.mavenbuild;

import java.util.ArrayList;
import java.util.Scanner;

public class hello {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<Integer>();
		System.out.println("enter the size");
		int l=sc.nextInt();
		for(int i=0;i<l;i++)
		{
			int e=sc.nextInt();
			arr.add(e);
		}
		System.out.println(arr);
	}

}
