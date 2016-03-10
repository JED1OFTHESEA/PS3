package base;

import java.util.Date;

public class Account {
	private int id=0;
	private double balance=0;
	private double annualInterestRate=0;
	private Date dateCreated;
	
	public Account(){
	}
	public Account (int accountID, double initialBalance){
		accountID=id;
		initialBalance=balance;
	}
	public int getid(){
		return id;
	}
	public double getbalance(){
		return balance;
	}
	public double getannualinterest(){
		return annualInterestRate;
	}
	public Date getDate(){
		return dateCreated;
	}
	public void setid(int id){
		this.id=id;
	}
	public void setbalance(double balance){
		this.balance=balance;
	}
	public void setannualinterest(double annualInterestRate){
		this.annualInterestRate=annualInterestRate;
	}
	public double getMonthlyInterestRate(){
		double MonthlyInterest=getannualinterest()/12;
		return MonthlyInterest;
	}
	public double withdraw(double withdrawalAmount){
		balance=balance-withdrawalAmount;
		return balance;
	}
	public double deposit(double depositAmount){
		balance=balance+depositAmount;
		return balance;
	}
	
}
