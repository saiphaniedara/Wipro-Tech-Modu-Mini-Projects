package com.mile1.main;
import com.mile1.bean.Student;
import com.mile1.exception.*;
import com.mile1.service.*;
public class StudentMain {
static Student data[]=new Student[4];
static
{
	data[0]=new Student("Sekar",new int[] {35,35,35});
	data[1]=new Student(null,new int[] {11,22,33});
	data[2]=null;
	data[3]=new Student("Manoj",null);
}
public static void main(String[] args)
{
	StudentService studser=new StudentService();
	StudentReport studrep=new StudentReport();
	String grade;
	for(int i=0;i<data.length;i++)
	{
		try
		{
			grade=studrep.validate(data[i]);
		}
		catch(NullMarksArrayException e)
		{
			grade="NullMarksArrayException occured";
		}
		catch(NullNameException e)
		{
			grade="NullNameException occured";
		}
		catch(NullStudentException e)
		{
			grade="NullStudentException occured";
		}
		System.out.println("GRADE = "+grade+"\n");
	}
	System.out.println("Number of Objects with Marks array as null = "+studser.findNumberOfNullMarks(data)+"\n");
	System.out.println("Number of Objects with Name as null = "+studser.findNumberOfNullNames(data)+"\n");
	System.out.println("Number of Objects that are entirely null = "+studser.findNumberOfNullObjects(data)+"\n");
}
}
