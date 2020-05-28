package com.mile1.service;
import com.mile1.bean.Student;
public class StudentService {
public int findNumberOfNullMarks(Student data[])
{
	int count=0;
	for(Student s:data)
	{
		try
		{
			if(s.getMarks()==null)
			{
				count++;
			}
		}
		catch(NullPointerException e)
		{}
	}
	return count;
}
public int findNumberOfNullNames(Student data[])
{
	int count=0;
	for(Student s:data)
	{
		try
		{
			if(s.getName()==null)
			{
				count++;
			}
		}
		catch(NullPointerException e)
		{}
	}
	return count;
}
public int findNumberOfNullObjects(Student data[])
{
	int count=0;
	for(Student s:data)
	{
		if(s==null)
		{
			count++;
		}
	}
	return count;
}
}
