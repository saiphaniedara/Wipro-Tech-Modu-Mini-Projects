import java.util.Scanner;
import Accounts.*;
import Exceptions.InvalidValueException;
public class InterestCalculator {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Account ac;
		int ch;
		double amount;
		while(true)
		{
			System.out.println("MAIN MENU\n----------");
			System.out.println("\t1. Interest Calculator - SB\n\t2. Interest Calculator - FD\n\t3. InterestCalculator - RD\n\t4. Exit");
			
			System.out.println("Enter your option (1..4): ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Types of SB Accounts\n------------------------- ");
				System.out.println("\t1. Normal\n\t2.NRI\nSelect your account type(1 or 2): ");
				int toa=sc.nextInt();
				System.out.println("Enter the Average amount in your account: ");
				amount=sc.nextLong();
				try
				{
				ac=new SBAccount(toa,amount);
				System.out.println("Interest gained: Rs. "+ac.calculateInterest());
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				break;
				
			case 2:
				System.out.println("Enter the FD amount: ");
				amount=sc.nextLong();
				System.out.println("Enter the number of days: ");
				int days=sc.nextInt();
				if(amount<10000000)
				{
					System.out.println("Enter your age: ");
					int age=sc.nextInt();
					try
					{
						if(days<0)
						{
							throw new InvalidValueException("Invalid Number of days. Please enter non-negative value");
						}
						ac=new FDAccount(amount,days,age);
						System.out.println("Interest gained is: Rs. "+ac.calculateInterest());
					}
					catch(InvalidValueException e)
					{
						System.out.println(e);
					}
				}
				else
				{
					try
					{
						if(days<0)
						{
							throw new InvalidValueException("Invalid Number of days. Please enter non-negative value");
						}
						ac=new FDAccount(amount,days);
						System.out.println("Interest gained is: Rs. "+ac.calculateInterest());
					}
					catch(InvalidValueException e)
					{
						System.out.println(e);
					}
				}
				break;
			case 3:
				System.out.println("Enter the RD amount: ");
				amount=sc.nextLong();
				System.out.println("Enter the number of months: ");
				int months=sc.nextInt();
				System.out.println("Enter your age: ");
				int age=sc.nextInt();
				try
				{
					if(months<0)
					{
						throw new InvalidValueException("Invalid Number of months. Please enter non-negative value");
					}
					ac=new RDAccount(amount,months,age);
					System.out.println("Interest gained is: Rs. "+ac.calculateInterest());
				}
				catch(InvalidValueException e)
				{
					System.out.println(e);
				}
				break;
			case 4:
				System.out.println("Exiting..! Thank you for using this application.");
				System.exit(1);
			}
		}

	}

}
