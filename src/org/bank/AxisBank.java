package org.bank;

public class AxisBank extends BankInfo{
@Override
public void savings() {

	super.savings();
}
	public void deposit() {
	System.out.println("Deposit 6.5%");
}
public static void main(String[] args) {
	AxisBank a = new AxisBank();
	a.deposit();
	a.savings();
	
}
}
