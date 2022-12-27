package assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Q2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/advancejava?useSSL=false","root","devil149");
			
			Statement s = con.createStatement();
			int i = s.executeUpdate("insert into student values(106,'deepu',98.55,'1997-06-14')");
			System.out.println(i+" rows inserted");
			s.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
		}
		
		System.out.println("done");
		}

}


