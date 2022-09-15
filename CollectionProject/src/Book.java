//@ author Mahesh Thakur
// this is simple POJO Class
public class Book implements Comparable<Book>{
//	private data members:
//		bid,subject,author
	private int bid;
	private String subjects;
	private String author;

	static int bookCounter=1;
	
//	making parameterized constructor 
	public Book(int bid, String subjects, String author) {
		super();
		this.bid = bid;
		this.subjects = subjects;
		this.author = author;
	}
	
//	generating getter setter methods
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getSubjects() {
		return subjects;
	}
	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
//	@Override - toString method
	public String toString() {
		return "Book"+(bookCounter++)+" [bid=" + bid + ", subjects=" + subjects + ", author=" + author + "]";
	}

//	@override - compareTo method of Comparable interface
	public int compareTo(Book o) {
		if(this.getBid()>o.getBid())
			return 1;
		if(this.getBid()<o.getBid())
			return -1;
		return 0;
	}
}
