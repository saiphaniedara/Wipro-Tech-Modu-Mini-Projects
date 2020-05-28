import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of employees: ");
		int n=sc.nextInt();
		Employee e;
		String firstName,lastName,email,add;
		int mob;
		EmployeeRegister er=new EmployeeRegister();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of Employee "+i+" : ");
			System.out.println("Enter the Firstname: ");
			firstName=sc.next();
			System.out.println("Enter the Lastname: ");
			lastName=sc.next();
			System.out.println("Enter the mobile: ");
			mob=sc.nextInt();
			System.out.println("Enter the email: ");
			email=sc.next();
			System.out.println("Enter the Address: ");
			add=sc.next();
			e=new Employee(firstName,lastName,mob,email,add);
			er.addEmployee(e);
		}
		er.displayAllEmployees();
		
	}
}
