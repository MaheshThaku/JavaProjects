//@ author Mahesh Thakur
public class CharCount {
	int countCh(String s)
	{
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
				c++;
		}
		return c;
	}
	public static void main(String[] args) {
		CharCount cc = new CharCount();
		String s="this is Java";
		System.out.println("Number of Characters is : "+cc.countCh(s));
	}

}
