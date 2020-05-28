import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Box: ");
		int n=sc.nextInt();
		Box b;
		TreeSet<Box> boxes=new TreeSet<Box>();
		double l,w,h;
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the Box "+i+" details:\nEnter Length: ");
			l=sc.nextDouble();
			System.out.println("Enter Width: ");
			w=sc.nextDouble();
			System.out.println("Enter Height: ");
			h=sc.nextDouble();
			b=new Box(l,w,h);
			boxes.add(b);
		}
		System.out.println("Unique Boxes in the Set are: ");
		Iterator<Box> bitr=boxes.iterator();
		while(bitr.hasNext())
		{
			b=bitr.next();
			System.out.print("Length = "+b.getLength()+" Width = "+b.getWidth()+" Height = "+b.getHeight()+" Volume = ");
			System.out.printf("%.2f\n",b.volume());
		}
	}

}
