package org.bnk;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no");
		int n = s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=5;j>=i;j--)
			{
				
				System.out.println("*");
			}
			System.out.println("\n");
		}
		s.close();
	}

}
