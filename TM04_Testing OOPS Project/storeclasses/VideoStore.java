package storeclasses;
public class VideoStore {
static Video[] store=new Video[10];
int i=0;
public void addVideo(String name)
{
	store[i]=new Video(name);
	i++;
	System.out.println("Video \""+name+"\" added successfully");
}
public void doCheckOut(String name)
{
	for(int j=0;j<i;j++)
	{
		if(store[j].getName().equals(name))
		{
			store[j].doCheckOut();
			System.out.println("Video \""+name+"\" checked out successfully");
			break;
		}
	}
}
public void doReturn(String name)
{
	for(int j=0;j<i;j++)
	{
		if(store[j].getName().equals(name))
		{
			store[j].doReturn();
			System.out.println("Video \""+name+"\" returned successfully");
			break;
		}
	}
}
public void receiveRating(String name,int rating)
{
	for(int j=0;j<i;j++)
	{
		if(store[j].getName().equals(name))
		{
			store[j].receiveRating(rating);
			System.out.println("Rating \""+store[j].getRating()+"\" has been mapped to the Video \""+name+"\".");
			break;
		}
	}
}
public void listInventory()
{
	System.out.println("-------------------------------------------------------");
	System.out.printf("%15s %20s %10s","Video Name","| Checkout Status","| Rating  ");
	System.out.println();
	for(int j=0;j<i;j++)
	{
		System.out.format("%15s %20b %10d" ,store[j].getName(),store[j].getCheckOut(),store[j].getRating());
		System.out.println();
	}
	System.out.println("-------------------------------------------------------");
	
}
public String getLastAddedVideo()
{
	if(i==0)
	{
		return "No videos in the store";
	}
	else
	{
	return store[i-1].getName();
	}
}
public boolean getCheckOut(String name)
{
	boolean cout=false;
	for(int j=0;j<i;j++)
	{
		if(store[j].getName().equals(name))
		{
			cout=store[j].getCheckOut();
		}
	}
	return cout;
}
public int getRating(String name)
{
	for(Video v:store)
	{
		if(v.getName().equals(name))
		{
			return v.getRating();
		}
	}
	return 0;
}
}
