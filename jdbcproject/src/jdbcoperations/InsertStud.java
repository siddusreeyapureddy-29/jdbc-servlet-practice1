package jdbcoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertStud {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lab_test",
	                "root",
	                "root");
			PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?)");
			ps.setInt(1,9);
			ps.setString(2, "manaswini");
			ps.setInt(3, 2);
		    int n=ps.executeUpdate();
		    if(n>0) {
		    	System.out.println(n+"rows inserted");
		    }
		    else {
		    	System.out.println("Something went wrong check again!!!");
		    }
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
