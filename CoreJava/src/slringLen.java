import java.util.StringTokenizer;

public class slringLen {

	public static void main(String[] args) {
		String s="This is string";
		StringTokenizer stn = new StringTokenizer(s," ");
		String small=new String();
		
		
		for(int i=0;i<=stn.countTokens();i++)
		{
			System.out.println(stn.nextToken());
		}
		
		
		
//		while(stn.hasMoreTokens())
//		{
//			int c=stn.nextToken().length();
//			System.out.println(c);	
//		
//		}
	}

}
