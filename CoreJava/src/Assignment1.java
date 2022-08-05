import java.util.Scanner;

public class Assignment1 {
//	Question 1 - Fibonacci Series
	void fibSeries(int no)
	{	
		System.out.println("Fibonacci Series is : ");
		int f = 0,l=1,fin=0;
		for(int i=0;i<=no;i++)
		{
			fin = f+l;
			f=l;
			l=fin;
			System.out.print(fin + " ");
			
		}
	}
//	Question 2 - Prime Number
	void primeN(int n)
	{
		boolean f=false;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
				f=true;
		}
		if(f==false)
			System.out.println(n+" is prime Number : ");
		else
			System.out.println(n+" is Composite Number : ");
	}
//	Question -3 finding maximum number in array
	int maxN(int arr[])
	{
		int m=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>m)
				m=arr[i];
		}
		return m;
	}
//	Question - 4
	
	// Function to print Matrix
    void printMatrix(int M[][],
                            int rowSize,
                            int colSize)
    {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++)
                System.out.print(M[i][j] + " ");
 
            System.out.println();
        }
    }
 
    // Function to add the two matrices
    // and store in matrix C
    static int[][] add(int A[][], int B[][],
                       int size)
    {
    	
        int i, j;
        int C[][] = new int[size][size];
 
        for (i = 0; i < size; i++)
            for (j = 0; j < size; j++)
                C[i][j] = A[i][j] + B[i][j];
 
        return C;
    }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		Assignment1 a = new Assignment1();
		int ch;
		System.out.println("Enter your choice\n1.Fibonacci Series\n2.Check Prime Number\n3.Find Maximum Number in Array\n4.Adding elements of two Matrices\n5.Exit");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("enter a number where you went to print fibonacci series");
			int no=sc.nextInt();
			a.fibSeries(no);
			break;
		case 2:
			System.out.println("enter a number to check prime or not : ");
			int no1=sc.nextInt();
			new Assignment1().primeN(no1);
			break;
		case 3:
			int b[]= {4,5,4,3};
			System.out.println(a.maxN(b));
			break;
		case 4:
			int arr1[][]= {{2,3},{4,2}};
			int arr2[][]= {{2,3},{4,2}};
		
			int sum[][] = Assignment1.add(arr1,arr2,2);	
			System.out.println("matrics 1");
			a.printMatrix(arr1, 2, 2);

			System.out.println("\nmatrics 2");
			a.printMatrix(arr2, 2, 2);
			
			System.out.println("\nfinal Matrics");
			a.printMatrix(sum, 2, 2);
			break;
			default:System.out.println("invalid choice");
		}			
	}
}
