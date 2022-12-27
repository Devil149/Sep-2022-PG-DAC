package assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Q16 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// create connection
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/advancejava?useSSL=false&allowPublicKeyRetrieval=true","root","devil149");
			// create query statement
			PreparedStatement s = con.prepareStatement("Select * from employee order by salary desc limit 1");
			ResultSet rs = s.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3)+" "+rs.getString(4));
			}
			s.close();
			// close connection
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
}
