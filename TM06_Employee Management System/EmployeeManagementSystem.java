import java.io.*;
import java.util.Scanner;
public class EmployeeManagementSystem {

static void addEmployee(int eid,String ename,int eage,double esal) throws IOException
{
	FileWriter fw=new FileWriter("Employeedat.txt",true);
	String edetails=eid+" "+ename+" "+eage+" "+esal;
	fw.write(edetails);
	fw.write("\n");
	fw.close();	
}
static void displayEmployees() throws IOException
{
	FileReader fr=new FileReader("Employeedat.txt");
	int c;
	while((c=fr.read())!=-1)
	{
		System.out.print((char)c);
	}
	fr.close();
}

	public static void main(String[] args) throws IOException {
		int ch;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Main Menu:\n1. Add an Employee\n2. Display All\n3. Exit\nEnter your choice(1..3):");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1: System.out.println("Enter Employee Id: ");
					int eid=sc.nextInt();
					System.out.println("Enter Employee Name: ");
					String ename=sc.next();
					System.out.println("Enter Employee Age: ");
					int eage=sc.nextInt();
					System.out.println("Enter Employee Salary: ");
					double esal=sc.nextDouble();
					addEmployee(eid,ename,eage,esal);
					break;
			case 2: System.out.println("-------Report------");
					displayEmployees();
					System.out.println("---End of Report---");
					break;
			case 3: System.out.println("Exiting the System...");
					System.exit(1);
			default:
				System.out.println("Invalid option");
				break;			
			}
		}
	}

}
