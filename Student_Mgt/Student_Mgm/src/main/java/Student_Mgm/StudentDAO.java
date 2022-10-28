//@ Developed by Mahesh Thakur
package Student_Mgm;

import org.hibernate.Session;

public class StudentDAO {

//	insertStudent(Student st);
	public static void insertStudent(Student st) {
		
		try {
			Session s = HibernateUtil.getSeesion();
			s.save(st);
			s.beginTransaction().commit();
			s.close();
		} catch (Exception e) {
			System.out.println("Contact number already present");
		}
	}

//  Student getStudent(int id);
	public static Student getStudent(int id) {
		Student stu=new Student();
		try {
			Session s = HibernateUtil.getSeesion();
			s.beginTransaction().commit();
			stu=(Student)s.get(Student.class, id);
			s.close();
		} catch (Exception e) {
			System.out.println("id not found");
		}
		return stu;
	}

//  boolean deleteStudent(int id);
	public static boolean deleteStudent(int id) {
		boolean b=false;
		try {
			Session s = HibernateUtil.getSeesion();
			Student st = s.get(Student.class, id);
			s.delete(st);
			s.beginTransaction().commit();
			b=true;
			s.close();
		} catch (Exception e) {
			System.out.println("id not found");
		}
		return b;
	}

//  boolean updateStudent(int id);
	public static boolean updateStudent(int id,String con,String name) {
		boolean b=false;
		try {
			Session s = HibernateUtil.getSeesion();
			Student st = new Student(id, con,name);
			s.beginTransaction();
			s.update(st);
			s.getTransaction().commit();
			b=true;
			s.close();
		} catch (Exception e) {
			System.out.println("Id not found");
		}
		return b;
	}
}
