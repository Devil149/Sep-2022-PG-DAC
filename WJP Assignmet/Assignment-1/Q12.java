package assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/advancejava?useSSL=false","root","devil149");
			
			do {
				
				System.out.println("0 Exit");
				System.out.println("1 Entry in Employee table");
				System.out.println("2 Entry in Address table");
				byte a = sc.nextByte();
				switch (a) {
				case 0 :
					flag = false;
					break;
				case 1 :
					System.out.println("Enter employee id : ");
					int emid = sc.nextInt();
					System.out.println("Enter employee name : ");
					String name = sc.next();
					System.out.println("Enter salary : ");
					float sal = sc.nextFloat();
					System.out.println("Enter JoinDate yyyy-mm-dd : ");
					String jd = sc.next();
					
					PreparedStatement s = con.prepareStatement("insert into employee values(?, ?, ?, ?)");
					s.setInt(1, emid);
					s.setString(2, name);
					s.setFloat(3, sal);
					s.setString(4, jd);
					int i = s.executeUpdate();
					System.out.println(i+" rows inserted in employee");
					break;
				case 2 :
					System.out.println("Enter address id : ");
					int adid = sc.nextInt();
					System.out.println("Enter city : ");
					String city = sc.next();
					System.out.println("Enter country : ");
					String country = sc.next();
					System.out.println("Enter employee id : ");
					int aemid = sc.nextInt();
					
					PreparedStatement ps = con.prepareStatement("insert into empadd values(?, ?, ?, ?)");
					ps.setInt(1, adid);
					ps.setString(2, city);
					ps.setString(3, country);
					ps.setInt(4, aemid);
					int x = ps.executeUpdate();
					System.out.println(x+" rows inserted in address");
					break;
				default : 
					System.out.println("Please Enter a valid input!!!!!!!!!!!!!!!!!!!!!!!");
					break;
				}
			}while(flag);
			sc.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
		}
		System.out.println("Thank you for the Entry!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}

}


