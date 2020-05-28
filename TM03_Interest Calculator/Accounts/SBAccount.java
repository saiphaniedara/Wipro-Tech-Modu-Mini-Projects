package Accounts;
public class SBAccount extends Account{
	public SBAccount(int toa,double amount) throws Exception {
		super(amount);
		if(toa==1)
		{
			interestRate=4;
		}
		else
		{
			if(toa==2)
			{
				interestRate=6;
			}
			else
			{
				throw new Exception("Invalid Type of Account");
			}
		}
	}
	public double calculateInterest()
	{
		double interest=(amount*interestRate)/100;
		return interest;
	}

}
