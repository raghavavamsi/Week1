package day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TweetDatabase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create connection
		Connection ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/tweets","root","11245@Vamsi");
		
		Statement st = ct.createStatement();
		
		/*int rs =st.executeUpdate("Insert into Twitter values (1,'Naveen','Twitter msg',50)");
		
		if(rs>0)
		{
			System.out.println("Insertion success");
		}
		*/
		
		ResultSet rs = st.executeQuery("Select * From Twitter;");
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getInt(4));
		}
				
				
	}

}



	

