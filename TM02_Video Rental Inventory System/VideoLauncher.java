import java.util.Scanner;
public class VideoLauncher {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		VideoStore vs=new VideoStore();
		int ch;
		String name;
		while(true)
		{
			System.out.println("MAIN MENU");
			System.out.println("==========");
			System.out.println("1.Add Videos:\n2.Check Out Video:\n3.Return Video:\n4.Receive Rating\n5.List Inventory:\n6.Exit:");
			System.out.println("Enter your choice (1..6):");
			ch=sc.nextInt();
			System.out.println();
			switch(ch)
			{
			case 1:
				System.out.println("Enter the name of the video you want to add: ");
				name=sc.next();
				vs.addVideo(name);
				break;
			case 2:
				System.out.println("Enter the name of the video you want to check out: ");
				name=sc.next();
				vs.doCheckOut(name);
				break;
			case 3:
				System.out.println("Enter the name of the video you want to return: ");
				name=sc.next();
				vs.doReturn(name);
				break;
			case 4:
				System.out.println("Enter the name of the video you want to rate: ");
				name=sc.next();
				vs.receiveRating(name);
				break;
			case 5:
				vs.listInventory();
				break;
			case 6:
				System.out.println("Exiting...!! Thanks for using this application.");
				System.exit(1);
			default:
				System.out.println("Invalid choice. Try Again...");
				break;
			}
			System.out.println();
		}

	}

}
