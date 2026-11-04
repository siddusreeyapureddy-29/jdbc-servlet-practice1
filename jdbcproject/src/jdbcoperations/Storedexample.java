package jdbcoperations;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Storedexample {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lab_test","root","root");
		System.out.println("Enter from account id:");
		int fromAccount=sc.nextInt();
		System.out.println("Enter to account id:");
		int toAccount=sc.nextInt();
		System.out.println("Enter amount:");
		double amount=sc.nextDouble();
		CallableStatement cs=con.prepareCall("{call transfer_money(?,?,?)}");
		cs.setInt(1,fromAccount);
		cs.setInt(2, toAccount);
		cs.setDouble(3, amount);
		cs.execute();
		System.out.println("Money transfered successfully");
		con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
