class Video {
String videoName;
boolean checkOut;
int rating;
public Video(String name)
{
	videoName=name;
}
public String getName()
{
	return videoName;
}
public void doCheckOut()
{
	checkOut=true;
	System.out.println(videoName+" checked out successfully");
}
public void doReturn()
{
	checkOut=false;
	System.out.println(videoName+" returned successfully");
}
public void receiveRating(int rating)
{
	this.rating=rating;
}
public int getRating()
{
	return rating;
}
public boolean getCheckOut()
{
	return checkOut;
}
}

