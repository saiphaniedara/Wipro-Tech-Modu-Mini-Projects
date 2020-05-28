import java.util.Scanner;
class VideoStore {
Video[] store=new Video[10];
int i=0;
static Scanner sc=new Scanner(System.in);
public void addVideo(String name)
{
	store[i]=new Video(name);
	i++;
	System.out.println("Video \""+name+"\" added successfully");
}
public void doCheckOut(String name)
{
	for(int j=0;j<store.length;j++)
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
	for(int j=0;j<store.length;j++)
	{
		if(store[j].getName().equals(name))
		{
			store[j].doReturn();
			System.out.println("Video \""+name+"\" returned successfully");
			break;
		}
	}
}
public void receiveRating(String name)
{
	for(int j=0;j<store.length;j++)
	{
		if(store[j].getName().equals(name))
		{
			System.out.println("Enter the rating for this video: ");
			int rating=sc.nextInt();
			store[j].receiveRating(rating);
			System.out.println("Rating \""+rating+"\" has been mapped to the Video\""+name+"\".");
			break;
		}
	}
}
public void listInventory()
{
	System.out.println("-------------------------------------------------------");
	System.out.printf("%15s %20s %8s","Video Name","| Checkout Status","| Rating");
	System.out.println();
	for(int j=0;j<i;j++)
	{
		System.out.format("%15s %20b %8d" ,store[j].getName(),store[j].getCheckOut(),store[j].getRating());
		System.out.println();
	}
	System.out.println("-------------------------------------------------------");
	
}
}
