package com.mile1.service;
import com.mile1.bean.Student;
import com.mile1.exception.*;
public class StudentReport {
public String findGrade(Student stud)
{
	int[] studentMarks=stud.getMarks();
	int totalMarks=0;
	for(int i=0;i<3;i++)
	{
		if(studentMarks[i]<35)
		{
			return "F";
		}
		else
		{
			totalMarks+=studentMarks[i];
		}
	}
	if(totalMarks<=150)
	{
		return "D";
	}
	else
	{
		if(totalMarks<=200)
		{
			return "C";
		}
		else
		{
			if(totalMarks<=250)
			{
				return "B";
			}
			else
			{
				return "A";
			}
		}
	}
}
public String validate(Student stud) throws NullStudentException,NullMarksArrayException,NullNameException
{
	if(stud==null)
	{
		throw new NullStudentException();
	}
	else
	{
		if(stud.getName()==null)
		{
			throw new NullNameException();
		}
		if(stud.getMarks()==null)
		{
			throw new NullMarksArrayException();
		}
		return findGrade(stud);
	}
}
}
