
public class Box implements Comparable<Box>{
private double length;
private double width;
private double height;
public Box(double l,double w,double h)
{
	length=l;
	width=w;
	height=h;
}
public double getLength()
{
	return length;
}
public double getWidth()
{
	return width;
}
public double getHeight()
{
	return height;
}
public double volume()
{
	return length*width*height;
}
public int equals(Box b)
{
	if(volume()==b.volume())
	{
		return 0;
	}
	else
	{
		if(volume()>b.volume())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
@Override
public int compareTo(Box o) {
	return equals(o);
}
}
