//@ Developed by Mahesh Thakur
package Student_Mgm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int st_id;
	
	@Column(name="Student_Names", length = 50, nullable = false)
	private String sname;
	
	@Column(name="Contact_Numbers", length=10 , nullable = false, unique = true)
	private String contact;
	
	public int getSt_id() {
		return st_id;
	}
	public void setSt_id(int st_id) {
		this.st_id = st_id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
		
	public Student(String sname, String contact) {
		super();
		this.sname = sname;
		this.contact = contact;
	}
	
	public Student() {
		super();
	}
	
	public Student(int st_id, String sname, String contact) {
		super();
		this.st_id = st_id;
		this.sname = sname;
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Student [st_id=" + st_id + ", sname=" + sname + ", contact=" + contact + "]";
	}

}
