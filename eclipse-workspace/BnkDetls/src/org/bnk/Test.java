package org.bnk;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
	      
		Scanner s=new Scanner(System.in);
	       System.out.println("Enter the input");
	       String l = s.nextLine();
	      String u = l.toUpperCase();
	      System.out.println(u);
	      s.close();
	}
}
