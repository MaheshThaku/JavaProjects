//@ author Mahesh Thakur
public class ArrayAvg {
	
	float arrAvg(int arr[])
	{
		int s=0,c=0;
		for(int i=0;i<arr.length;i++)
		{
			s+=arr[i];
			c++;
		}
		return s/c;
	}
	
	public static void main(String args[])
	{
		int a[] = {3,4,5};
		ArrayAvg o = new ArrayAvg();
		System.out.println(o.arrAvg(a));
	}

}
