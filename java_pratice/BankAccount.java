package com.mca;
import java.util.Scanner;
public class BankAccount {
	private String accType;
	private double balance;
	
	public BankAccount() {
		this.accType = "Checking";
		this.balance = 0.0;
	}
	public BankAccount(String accType){
		this.accType = accType;
		this.balance=0.0;
	}
	public BankAccount(String accType, double intlBlnc){
		this.accType=accType;
		this.balance=intlBlnc;
	}
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Cash deposited: "+amount);
		}else {
			System.out.println("Deposit amount must be positive");
		}
	}
	public void deposit(String checkNum,double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Check deposited : checknum: "+checkNum+" Amount: "+amount);
		}else {
			System.out.println("Deposit amount must positive");
		}
	}
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance-=amount;
			System.out.println("Withdraw: "+amount);
		}else {
			System.out.println("insufficient balance");
		}
	}
	public double checkblnc() {
		return balance;
	}
	public String accType() {
		return accType;
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        BankAccount acc=new BankAccount();
        int choice;
        while(true) {
        	System.out.println("BankAccount");
        	System.out.println("1.Deposit cash");
        	System.out.println("2.Deposit check");
        	System.out.println("3.Withdraw");
        	System.out.println("4.Check Balance");
        	System.out.println("5.Exit");
        	
        	System.out.println("Enter your choice 1 to 5");
            choice=sc.nextInt();
        	
        	switch(choice) {
        	case 1:
        		System.out.println("Enter amount to diposit: ");
        		double amount=sc.nextDouble();
        		acc.diposit(amount);
        		break;
        	case 2:
        		System.out.println("Enter checknumber: ");
        		String checknum=sc.next();
        		System.out.println("Enter check amount to deposit");
        		double checkAmount=sc.nextDouble();
        		acc.deposit(checknum,checkAmount);
        		break;
        	case 3:
        		System.out.println("Entr amount to withdraw");
        		double withdrawAmt=sc.nextDouble();
        		System.out.println("withdraw amount: "+withdrawAmt);
        		break;
        	case 4:
        		double balance=acc.checkblnc();
        		System.out.println("balance: "+balance);
        		break;
        	case 5:
        		System.out.println("Exit");
        		sc.close();
        		return;
        	default:
        		System.out.println("invalid choice. please enter between 1 to 5");
        	}
        }
	}
}
