import java.util.*;
public class StringOperations {
	ArrayList<String> ops=new ArrayList<String>();
	public ArrayList<String> operation1(String s1,String s2)
	{
		String op=new String();
		for(int i=0;i<s1.length();i++)
		{
			if(i%2==0)
			{
				op+=s2;
			}
			else
			{
				op+=s1.charAt(i);
			}
		}
		ops.add(op);
		return ops;
	}
	public ArrayList<String> operation2(String s1,String s2)
	{
		if(s1.indexOf(s2)==s1.lastIndexOf(s2))
		{
			ops.add(s1+s2);
		}
		else
		{
			String revs2=new String(new StringBuffer(s2).reverse());
			int ind=s1.lastIndexOf(s2);
			String op=s1.substring(0,ind)+revs2;
			ops.add(op);
		}
		
		return ops;
	}
	public ArrayList<String> operation3(String s1,String s2)
	{
		if(s1.indexOf(s2)!=s1.lastIndexOf(s2))
		{
			String op=s1.replaceFirst(s2,"");
			ops.add(op);
		}
		else
		{
			ops.add(s1);
		}
		return ops;
	}
	public ArrayList<String> operation4(String s1,String s2)
	{
		if(s2.length()%2==0)
		{
			String op=s2.substring(0,(s2.length())/2)+s1+s2.substring(s2.length()/2);
			ops.add(op);
		}
		else
		{
			String op=s2.substring(0,((s2.length())/2)+1)+s1+s2.substring((s2.length()/2)+1);
			ops.add(op);
		}
		return ops;
	}
	public ArrayList<String> operation5(String s1,String s2)
	{
		char[] cs=s2.toCharArray();
		for(int i=0;i<cs.length;i++)
		{
			s1=s1.replace(cs[i],'*');
		}
		ops.add(s1);
		return ops;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> al=new ArrayList<String>();
		System.out.println("Enter S1 = ");
		String s1=sc.next();
		System.out.println("Enter S2 = ");
		String s2=sc.next();
		StringOperations sop=new StringOperations();
		al=sop.operation1(s1, s2);
		al=sop.operation2(s1, s2);
		al=sop.operation3(s1, s2);
		al=sop.operation4(s1, s2);
		al=sop.operation5(s1, s2);
		Iterator<String> alitr=al.listIterator();
		System.out.print("{");
		while(alitr.hasNext())
		{
			System.out.print("\""+alitr.next()+"\"");
			if(alitr.hasNext())
			{
				System.out.print(",");
			}
		}
		System.out.print("}");
	}

}
