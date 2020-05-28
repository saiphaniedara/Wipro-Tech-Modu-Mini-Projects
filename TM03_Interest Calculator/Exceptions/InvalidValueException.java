package Exceptions;

public class InvalidValueException extends Exception {
String msg;
public InvalidValueException(String str)
{
	msg=str;
}
public String toString()
{
	return msg;
}
}
