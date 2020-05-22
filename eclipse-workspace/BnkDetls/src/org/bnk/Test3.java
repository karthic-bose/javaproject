package org.bnk;

public class Test3 {
	public static void main(String[] args) {
		int a[]= {1,5,2,4,7,9,10,20,25,30,14};
         for(int i=0;i<a.length;i++)
         {
        	 if(a[i] % 2 == 1)
        	 {
        		 System.out.println("odd no");
        		 System.out.println(a[i]);
        	 }
        	 else
        	 {
        		 System.out.println("Even no");
        		 System.out.println(a[i]);
        	 }
         }
	}

}
