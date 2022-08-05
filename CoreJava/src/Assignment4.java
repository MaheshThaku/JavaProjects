class str
{
	void q1(String s){
		byte vc=0,cc=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				vc++;
			}
			else
			{
				cc++;
			}
		}
		System.out.println("Vovel r present : "+vc);
		System.out.println("Consonent r present : " +cc +"\n");
	}
	void q2(String s)
	{
		StringBuilder sb =new StringBuilder(s);
		sb.reverse();
		String r=sb.toString();
		if(s.equals(r))
		{
			
			System.out.println("palindrome \n");
		}
		else 
		{
			System.out.println("not palindrome\n");
		}
	}
	void q3(String s)
	{
		int l = s.length();
		char c[]=s.toCharArray();
		System.out.println("repeated chars are : ");
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(c[i]==c[j])
				{
					System.out.println(c[i]+"\n");
				}
			}
		}
	}

}
class Assignment4 {

	public static void main(String[] args) {
//		creating instance of class str
		str s = new str();
		String st="Mahesh";
//		q1 - count vovel and consonents
		s.q1(st);
		
//		q2 - String Palindrome
		s.q2(st.toLowerCase());
		
//		q3 - count reapet characters
		s.q3(st.toLowerCase());

	}

}
