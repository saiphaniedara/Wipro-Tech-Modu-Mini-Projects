import java.util.*;
public class EmployeeRegister{
	ArrayList<Employee> employeeRegister=new ArrayList<Employee>();
	public void addEmployee(Employee e)
	{
		employeeRegister.add(e);
	}
	public void displayAllEmployees()
	{
		Collections.sort(employeeRegister);
		System.out.println("Employee List: \n");
		System.out.format("%-15s %-15s %-15s %-30s %-15s\n","Firstname","Lastname","Mobile","Email","Address");
		Iterator<Employee> iter=employeeRegister.listIterator();
		while(iter.hasNext())
		{
			Employee e=iter.next();
			System.out.printf("%-15s %-15s %-15s %-30s %-15s\n",e.firstName,e.lastname,e.mobile,e.email,e.address);
		}
	}
	
}
