package Accounts;

public abstract class Account {
public	double interestRate;
public	double amount;
public Account(double a)
{
	amount=a;
}
public abstract double calculateInterest();
}
