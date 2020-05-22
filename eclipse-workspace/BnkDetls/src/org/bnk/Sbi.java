package org.bnk;

public class Sbi implements Bank,Axis {
	@Override
	public void fixed() {
		System.out.println("Fixed account is 4%");
		
	}
	@Override
	public void savings() {
		System.out.println("Savings account is 7%");
		
	}
    @Override
    public void deposit() {
    	System.out.println("Deposit account is 10%");
    	
    }

	public static void main(String[] args) {
		Sbi s = new Sbi();
		s.deposit();
		s.fixed();
		s.savings();
	
		
	}

}
