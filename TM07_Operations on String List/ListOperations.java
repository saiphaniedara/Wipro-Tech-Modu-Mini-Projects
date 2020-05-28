import java.util.*;
public class ListOperations {
	ArrayList<String> list=new ArrayList<String>();
	public void insert(String s)
	{
		if(list.contains(s))
		{
			System.out.println("Item already exists");
		}
		else
		{
			list.add(s);
			System.out.println("Inserted successfully");
		}
	}
	public void delete(String s)
	{
		if(list.contains(s))
		{
			list.remove(s);
			System.out.println("Deleted successfully");
		}
		else
		{
			System.out.println("Item doesn't exist");
		}
	}
	public void search(String s)
	{
		if(list.contains(s))
		{
			System.out.println("Item found in the list");
		}
		else
		{
			System.out.println("Item not found in the list");
		}
	}
	public void display()
	{
		System.out.println("The items in the list are:");
		Iterator<String> i=list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch;
		String inp;
		ListOperations lo=new ListOperations();
		while(true)
		{
			System.out.println("1. Insert\n2. Search\n3. Delete\n4. Display\n5. Exit\nEnter your choice: ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter the item to insert: ");
				inp=sc.next();
				lo.insert(inp);
				break;
			case 2:
				System.out.println("Enter the item to search: ");
				inp=sc.next();
				lo.search(inp);
				break;
			case 3:
				System.out.println("Enter the item to delete: ");
				inp=sc.next();
				lo.delete(inp);
				break;
			case 4:
				lo.display();
				break;
			case 5:
				System.exit(1);
			default:
				System.out.println("Invalid Choice");
				
			}
		}

	}

}
