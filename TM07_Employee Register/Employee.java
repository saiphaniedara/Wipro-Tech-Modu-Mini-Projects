
public class Employee implements Comparable<Employee>{
	String firstName;
	String lastname;
	Integer mobile;
	String email;
	String address;
	public Employee(String fname,String lname,int mob,String email,String add)
	{
		firstName=fname;
		lastname=lname;
		mobile=mob;
		this.email=email;
		address=add;
	}
	public int compareTo(Employee e) {
		return firstName.compareTo(e.firstName);
	}
}
