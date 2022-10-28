//@ Developed by Mahesh Thakur
package Student_Mgm;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		String ch,name,mobile;
		Scanner sc = new Scanner(System.in);
		int id;
		do {
		System.out.println("\t 1. Add Student   \r\n"
				+ "         2. See Student detail  \r\n"
				+ "         3. Delete a student\r\n"
				+ "         4. Update student details\r\n"
				+ "         9. Exit");
		
		System.out.println("Enter your choice:");
		ch=sc.next();
		switch(Integer.parseInt(ch))
		{
		case 1:
			System.out.print("enter name : ");
			name=sc.next();
			System.out.print("enter mobile number : ");
			mobile=sc.next();
			Student s1 = new Student(name,mobile ); 
			StudentDAO.insertStudent(s1);
			break;
			
		case 2:
			System.out.print("Enter id for Retrieve record : ");
			id=sc.nextInt();
			Student sd = StudentDAO.getStudent(id);
			System.out.println(sd);
			break;
			
		case 3:
			System.out.print("Enter id for deleting record : ");
			id=sc.nextInt();
			if(StudentDAO.deleteStudent(id)==true)
			{
				System.out.println("Record Deleted succesfully");
			}
			else
				System.out.println("Record not found");
			break;
			
		case 4:
			System.out.print("Enter id for update record : ");
			id=sc.nextInt();
			System.out.print("enter name : ");
			name=sc.next();
			System.out.print("enter mobile number : ");
			mobile=sc.next();
			
			if(StudentDAO.updateStudent(id,mobile,name)==true)
				{
		
				System.out.println("record updated");
				}
			else
				System.out.println("record not found");
			break;
		case 9:
			break;
		}
		System.out.println("press Y for execute again : ");
		ch=sc.next();
		}while(ch.equals("y")||ch.equals("Y"));
		sc.close();
	}
}
