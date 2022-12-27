package assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter city for details : ");
		String city = sc.next();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// create connection
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/advancejava?useSSL=false&allowPublicKeyRetrieval=true","root","devil149");
			// create query statement
			PreparedStatement s = con.prepareStatement("Select * from empadd group by addid having city = ? ");
			s.setString(1, city);
			ResultSet rs = s.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}
			s.close();
			// close connection
			con.close();
			sc.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
}
