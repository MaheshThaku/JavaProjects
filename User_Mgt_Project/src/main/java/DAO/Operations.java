package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import connection.Connect;

public class Operations {
//	1.Adding new User in Database
	public static int addUser(String uName,String Pass) throws SQLException
	{
		int rq = 0;
		try(Connection c = Connect.dbConn())
		{
			PreparedStatement ps = c.prepareStatement("insert into users values(?,?)");
			ps.setString(1, uName);
			ps.setString(2, Pass);
			rq=ps.executeUpdate();
		}
		catch(SQLException s)
		{
			System.out.println("username already present");
//			s.printStackTrace();
		}
		return rq;
	}
	
//	2.Update Password of existing user
	public static int upRec(String uName,String pass)
	{
		int rq = 0;
		try(Connection c = Connect.dbConn())
		{
			PreparedStatement ps = c.prepareStatement("update users SET password=? where uname=?");
			ps.setString(1, pass);
			ps.setString(2, uName);
			
			rq=ps.executeUpdate();
		}
		catch(SQLException s)
		{
			System.out.println("username already present");
			s.printStackTrace();
		}
		return rq;
	}

//	3.delete an record
	public static int delRec(String uName)
	{
		int rq = 0;
		try(Connection c = Connect.dbConn())
		{
			PreparedStatement ps = c.prepareStatement("delete from users where uname=?");
			ps.setString(1, uName);
			
			rq=ps.executeUpdate();
		}
		catch(SQLException s)
		{
			s.printStackTrace();
		}
		return rq;
	}
	
	public static boolean searchRec(String uName)
	{
		boolean b=true;
		try(Connection c = Connect.dbConn())
		{
			PreparedStatement pst = c.prepareStatement("select * from users where uname=?");
			pst.setString(1, uName);
			if(pst.execute()) {
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{
				
				System.out.println(rs.getString(1)+"\t"+rs.getString(2));
			}
			return true;
			}
			else return false;
		}
		catch(SQLException s)
		{
			s.printStackTrace();
		}
		return b;
	}
	
//	Retrieve all Records from DB
	public static void showAllRec()
	{
		try(Connection c = Connect.dbConn())
		{
			Statement smt = c.createStatement();
			ResultSet rs = smt.executeQuery("select * from users");
			while(rs.next())
				System.out.println(rs.getString(1)+"\t\t"+rs.getString(2));
		}
		catch(SQLException s)
		{
			s.printStackTrace();
		}
		
	}
}
