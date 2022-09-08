import java.util.Iterator;
import java.util.Stack;
/*
 * Stack - LIFO
 * push();
 * pop();
 * peek();
 * search();
 */
class temp
{
	public static void main(String args[])
	{
		Stack<String> st = new Stack<>();
		st.push("cat");
		st.push("Lion");
		st.push("dog");
		
		
		Iterator<String> itr =  st.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		st.pop();
		System.out.println(st);
		
		System.out.println(st.search("Lion"));
		
		
	}
}