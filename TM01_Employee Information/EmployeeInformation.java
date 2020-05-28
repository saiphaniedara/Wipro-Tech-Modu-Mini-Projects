public class EmployeeInformation
{
public static void main(String[] args)
{
int[] empno={1001,1002,1003,1004,1005,1006,1007};
String[] empname={"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
String[] jdate={"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","1/1/2000","12/06/2006"};
char[] empdcode={'e','c','k','r','m','e','c'};
String[] dep={"R&D","PM","Acct","FrontDesk","Engg","Manufacturing","PM"};
int[] basic={20000,30000,10000,12000,50000,23000,29000};
int[] hra={8000,12000,8000,6000,20000,9000,12000};
int[] it={3000,9000,1000,2000,20000,4400,10000};
int sid=Integer.parseInt(args[0]);
int index=java.util.Arrays.binarySearch(empno,sid);
if(index>=0)
{
int salary=basic[index]+hra[index]-it[index];
System.out.printf("%6s %10s %12s %13s %10s","Emp No."," Emp Name"," Department"," Designation"," Salary");
System.out.println();
switch(empdcode[index])
{
case 'e':
salary+=20000;
System.out.format("%6d %10s %12s %13s %10d",empno[index],empname[index],dep[index],"Engineer",salary);
break;
case 'c':
salary+=32000;
System.out.format("%6d %10s %12s %13s %10d",empno[index],empname[index],dep[index],"Consultant",salary);
break;
case 'k':
salary+=12000;
System.out.format("%6d %10s %12s %13s %10d",empno[index],empname[index],dep[index],"Clerk",salary);
break;
case 'r':
salary+=15000;
System.out.format("%6d %10s %12s %13s %10d",empno[index],empname[index],dep[index],"Receptionist",salary);
break;
case 'm':
salary+=40000;
System.out.format("%6d %10s %12s %13s %10d",empno[index],empname[index],dep[index],"Manager",salary);
break;
}
}
else
{
System.out.println("There is no employee with empid : "+sid);
}
}
}