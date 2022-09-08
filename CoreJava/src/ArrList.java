import java.util.TreeSet;
class Books implements Comparable<Books>
{
	private String bookId,bookName;

	public Books(String bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + "]";
	}

	@Override
	public int compareTo(Books o) {
		return bookName.compareTo(o.bookName);
	}
	
}
public class ArrList {

	public static void main(String[] args) {
		Books b1 = new Books("101","Java Oracle Press");
		Books b2 = new Books("102","C Programming By BalaguruSwami");
		Books b3= new Books("103","Full Stack by Anudip ");
		Books b4=new Books("104","c++ by NIIT");
		
		TreeSet <Books> Book= new TreeSet<Books>();
		Book.add(b1);
		Book.add(b2);
		Book.add(b3);
		Book.add(b4);
		
		for(Books s:Book)
		{
			System.out.println(s);
		}
	}

}
