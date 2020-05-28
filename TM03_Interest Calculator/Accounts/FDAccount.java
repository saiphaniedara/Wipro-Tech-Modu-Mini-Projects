package Accounts;
import Exceptions.InvalidValueException;

public class FDAccount extends Account{
int noOfDays;
	public FDAccount(double amount,int days,int age) throws InvalidValueException {
		super(amount);
		noOfDays=days;
		interestRate=getInterestRate(days,age);		
	}
	public FDAccount(double amount,int days) throws InvalidValueException {
		super(amount);
		noOfDays=days;
		interestRate=getInterestRate(days);
	}
	public double getInterestRate(int days,int age) throws InvalidValueException
	{
		if(days<7)
		{
			throw new InvalidValueException("Days should be greater than or equal to 7");
		}
		if(days>=7&&days<15)
		{
			if(age<60)
			{
				return 4.50;
			}
			else
			{
				return 5.00;
			}
		}
		if(days>14&&days<30)
		{
			if(age<60)
			{
				return 4.75;
			}
			else
			{
				return 5.25;
			}
		}
		if(days>29&&days<46)
		{
			if(age<60)
			{
				return 5.50;
			}
			else
			{
				return 6.00;
			}
		}
		if(days>45&&days<61)
		{
			if(age<60)
			{
				return 7;
			}
			else
			{
				return 7.50;
			}
		}
		if(days>60&&days<185)
		{
			if(age<60)
			{
				return 7.50;
			}
			else
			{
				return 8.00;
			}
		}
		if(days>184&&days<366)
		{
			if(age<60)
			{
				return 8.00;
			}
			else
			{
				return 8.50;
			}
		}
		if(days>365)
		{
			throw new InvalidValueException("Days should be less than or equal to 365");
		}
		return 0;
	}
	public double getInterestRate(int days) throws InvalidValueException
	{
		if(days<7)
		{
			throw new InvalidValueException("Days should be greater than or equal to 7");
		}
		if(days>=7&&days<15)
		{
			return 6.50;
		}
		if(days>14&&days<46)
		{
			return 6.75;
		}
		if(days>45&&days<61)
		{
			return 8;
		}
		if(days>60&&days<185)
		{
			return 8.50;
		}
		if(days>184&&days<366)
		{
			return 10.00;
		}
		if(days>365)
		{
			throw new InvalidValueException("Days should be less than or equal to 365");
		}
		return 0;
	}
	public double calculateInterest()
	{
		double interest=(amount*interestRate)/100;
		return interest;
	}

}
