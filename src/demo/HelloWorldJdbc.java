package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloWorldJdbc {

	public static void main(String[] args) {
		System.out.println("Hello JDBC");
		try {
			// create connection
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

			// create statement
			Statement stmt = con.createStatement();

			// execute the query
			ResultSet rs = stmt.executeQuery("SELECT * FROM JM2004_LOGIN");

			while (rs.next()) {
				System.out.println(rs.getString(1) + "  " + rs.getString(2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}

	}
}
