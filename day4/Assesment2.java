package day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Assesment2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create connection
		Connection ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/tweets","root","11245@Navnish");
		
		
		PreparedStatement ipt = ct.prepareStatement("Insert into Twitter values (?,?,?,?)");
		ipt.setInt(1, 3);
		ipt.setString(2, "Selvi");
		ipt.setString(3, "Home Maker");
		ipt.setInt(4, 200);
		
		int rst = ipt.executeUpdate();
		
		if(rst>0)
		{
			System.out.println("Insertion success");
		}
		
		
		PreparedStatement pt= ct.prepareStatement("Select * From Twitter where name like '%a%'");
		
		ResultSet rs  = pt.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getInt(4));
		}
		
		rs.close();
		ipt.close();
		pt.close();
		ct.close();	
				
	}

}

