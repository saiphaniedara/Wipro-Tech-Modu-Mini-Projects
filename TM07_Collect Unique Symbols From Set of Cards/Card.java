
public class Card implements Comparable<Card> {
	char symbol;
	int number;
	public Card(char sym,int num)
	{
		symbol=sym;
		number=num;
	}
	public int compareTo(Card o) {
		if(symbol==o.symbol)
		{
			return 0;
		}
		else
		{
			if(symbol>o.symbol)
			{
				return 1;
			}
			else
			{
				return -1;
			}
		}
	}
}
