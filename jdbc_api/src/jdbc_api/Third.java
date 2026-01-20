package jdbc_api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//import java.sql.SQLException;
import java.util.Scanner;

public class Third {

	public static void main(String[] args) throws Exception {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Please enter the query : ");
			String str = scan.nextLine();
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2","root","root");

			Statement ptmt = con.createStatement();
			
			boolean set= ptmt.execute(str);
			
			System.out.println(set);
			
			if(!set) {
				System.out.println("no of row affected.... not needed but data added or changed...");
				
			}

			else {
				ResultSet rs= ptmt.executeQuery(str);
					while(rs.next()) {
						System.out.println(rs.getInt(1));
						System.out.println(rs.getString(2));	
				}
			}
			
			con.close();
		}
		
	}

}
