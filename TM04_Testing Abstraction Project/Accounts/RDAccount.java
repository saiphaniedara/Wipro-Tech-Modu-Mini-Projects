package Accounts;
import Exceptions.InvalidValueException;

public class RDAccount extends Account{
	int noOfMonths;
	double monthlyAmount;
	public RDAccount(double amount,int months,int age) throws InvalidValueException {
		super(amount);
		noOfMonths=months;
		monthlyAmount=amount/months;
		interestRate=getInterestRate(age,months);
	}
	public double getInterestRate(int age,int months) throws InvalidValueException
	{
		if(months<6)
		{
			throw new InvalidValueException("Months must be greater than or equal to 6. Try Again");
		}
		if(months>5&&months<9)
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
		if(months>=9&&months<12)
		{
			if(age<60)
			{
				return 7.75;
			}
			else
			{
				return 8.25;
			}
		}
		if(months>=12&&months<15)
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
		if(months>=15&&months<18)
		{
			if(age<60)
			{
				return 8.25;
			}
			else
			{
				return 8.75;
			}
		}
		if(months>=18&&months<=21)
		{
			if(age<60)
			{
				return 8.75;
			}
			else
			{
				return 9.25;
			}
		}
		if(months>21)
		{
			throw new InvalidValueException("Months must be less than or equal to 21. Try again");
		}
		return 0;
	}
	public double calculateInterest()
	{
		double interest=0.0;
		double p=0.0;
		for(int i=0;i<noOfMonths;i++)
		{
			p+=(monthlyAmount);
			interest+=p*interestRate/100;
		}
			return interest/12;
	}

}
