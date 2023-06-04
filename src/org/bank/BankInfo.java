package org.bank;

public class BankInfo {
public void savings() {
	System.out.println("Int 3 %");
}
public void fixed() {
	System.out.println("Int 6%");
}
public void deposit() {
	System.out.println("Int 7%");

}
public static void main(String[] args) {
	BankInfo b= new BankInfo ();
	b.savings();
	b.fixed();
	b.deposit();
}
}
