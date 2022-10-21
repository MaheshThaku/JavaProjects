package User_Mgt_Project;

import java.sql.SQLException;
import java.util.Scanner;

import DAO.Operations;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ) throws SQLException
	{
		System.out.println("1.Create a User\r\n"
				+ "2.Update password\r\n"
				+ "3.Delete a User\r\n"
				+ "4.Retrieve a User\r\n"
				+ "5.List of all User\r\n"
				+ "6.Exit");
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your choice : ");
		int choice=Integer.parseInt(sc.next());

		String uName,pass;
		switch(choice)
		{
//        1.Create a User
		case 1:
			System.out.print("Enter user name : ");
			uName = sc.next();
			System.out.print("Enter new Password : ");
			pass = sc.next();
			pass=pass.replace(" ", "");
			if(pass.length()>6)
			{
				if(Operations.addUser(uName,pass)>=1)
					System.out.println("new user add succesfully");
			}
			else {
				System.out.println("password length is too smaller");
			}
			break;

//			2.Update password
		case 2: 
			System.out.println("Enter user name : ");
			uName=sc.next();
			System.out.println("Enter new Password : ");
			pass=sc.next();
			pass=pass.replace(" ", "");
			if(pass.length()>6)
			{
				if(Operations.upRec(uName, pass)==1)
					System.out.println("your password is changed");
			}
			else
				System.out.println("somthing went wrong");
			break;

//			Delete a User
		case 3:
			System.out.print("Enter User Name for delete Record");
			uName=sc.next();
			if(Operations.delRec(uName)==1)
				System.out.println("Record deleted Succesfully");
			else
				System.out.println("Record Not found");
			break;
//			4.Retrieve a User
		case 4:
			System.out.print("Enter User name : ");
			uName=sc.next();
			if(Operations.searchRec(uName))
			{}
			else System.out.println("no record found");
			break;
			
//			5.List of all User
		case 5:
			Operations.showAllRec();
			break;
//			6.Exit
		case 6:
			System.exit(0);
			break;

		}
		sc.close();
	}
}
