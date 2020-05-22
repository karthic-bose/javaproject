package org.bnk;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the input");
	String l = s.nextLine();
	for(int i=0;i<l.length();i++)
	{
		char c = l.charAt(i);
		if((c >= 'a' && c<='z' ) || (c >='A' && c <='Z'))
		{
			System.out.println("false");
		}
	}
	
	s.close();
	}
}
  