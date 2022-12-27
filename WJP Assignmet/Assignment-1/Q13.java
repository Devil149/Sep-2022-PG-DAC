package assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Q13 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// create connection
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/advancejava?useSSL=false&allowPublicKeyRetrieval=true","root","devil149");
			// create query statement
			PreparedStatement s = con.prepareStatement("Select e.empid, e.Name, e.Salary, e.Joindate, a.addid, a.city, a.country from employee as e inner join empadd as a ON e.empid=a.empid");
			ResultSet rs = s.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getString(6)+" "+rs.getString(7));
			}
			s.close();
			// close connection
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
}
