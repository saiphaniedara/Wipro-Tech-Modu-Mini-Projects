import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeSet<Card> cards=new TreeSet<Card>();
		int i=0;
		char sym;
		int num;
		Card c;
		while(true)
		{
			System.out.println("Enter a card: ");
			sym=sc.next().charAt(0);
			num=sc.nextInt();
			c=new Card(sym,num);
			if(!cards.contains(c))
			{
				cards.add(c);
			}
			i++;
			if(cards.size()==4)
			{
				break;
			}
		}
		System.out.println("Four symbols gathered in "+i+" cards.");
		Iterator iter=cards.iterator();
		while(iter.hasNext())
		{
			c=(Card)iter.next();
			System.out.println(c.symbol+" "+c.number);
		}
		
	}

}
