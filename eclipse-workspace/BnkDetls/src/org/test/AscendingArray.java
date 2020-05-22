package org.test;

import java.util.Scanner;

public class AscendingArray {
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the no of elements");
	    int n = s.nextInt();
	    int a[]=new int[6];
	    for(int i=0;i<n;i++)
	    {
	    	 a[i] = s.nextInt();
	    }
	    for(int i=0;i<n;i++)
	    {
	    	for(int j=i+1;j<n;j++)
	    	{
	    		if(a[i]>a[j])
	    		{
	    			int temp=a[i];
	    			a[i]=a[j];
	    			a[j]=temp;
	    		}
	    	}
	    }
	    System.out.println("Ascending order");
	    for(int i=0;i<n-1;i++)
	    {
	    		System.out.println(a[i]+",");
	    	}
	    	System.out.println(a[n-1]);
	    
	    s.close();
	}

}
