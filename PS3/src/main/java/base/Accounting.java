package base;
import java.util.Date;

public class Accounting {
	
	//Default Variables
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	//Default Constructor
	public Accounting() {
	}

	//Accounting Constructor
	public Accounting(int id, double balance, double annualInterestRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = new Date();
	}

	//Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		return annualInterestRate/12;
	}
	
	//Withdraw method
	public void withdraw(double amount) throws InsufficientFundsException{
		if(amount <= balance){
		balance = balance - amount;
	}
		else{
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}
	
	//Deposit method
	public void deposit(double amount){
		balance = balance + amount;
	}
}