import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeMap<Character,Vector<Card>> cards=new TreeMap<Character,Vector<Card>>();
		Vector<Card> v;
		System.out.println("Enter Number of Cards: ");
		int n=sc.nextInt();
		Card c;
		char sym;
		int num;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter card "+(i+1)+": ");
			sym=sc.next().charAt(0);
			num=sc.nextInt();
			c=new Card(sym,num);
			v=new Vector<Card>();
			if(cards.containsKey(sym))
			{
				v.addAll(cards.get(sym));
				v.add(c);
				cards.replace(sym,v);
				
			}
			else
			{
				v.add(c);
				cards.put(sym,v);
			}

		}
		Set<Character> symbols=cards.keySet();
		System.out.println("Distinct symbols are: ");
		for(char sy:symbols)
		{
			System.out.print(sy+" ");
		}
		System.out.println();
		int sum,noc;
		Iterator<Character> iter=symbols.iterator();
		while(iter.hasNext())
		{
			sum=0;
			noc=0;
			char symb=iter.next();
			System.out.println("Cards in "+symb+" Symbol");
			Iterator<Card> ir=cards.get(symb).iterator();
			while(ir.hasNext())
			{
				int cnum=ir.next().number;
				System.out.println(symb+" "+cnum);
				noc++;
				sum+=cnum;
			}
			System.out.println("Number of Cards: "+noc);
			System.out.println("Sum of Numbers: "+sum);
		}
		
	}

}