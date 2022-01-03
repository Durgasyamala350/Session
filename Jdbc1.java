package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Jdbc1 {
	public static void main(String[] args) {
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/organization", "root", "Syam@562");
System.out.println("connection created");
String query = "create table Employee (empId int , empName varchar(30),empsal int) ";
Statement st = con.createStatement();// to run
System.out.println("statement created");
st.execute(query);
System.out.println("table created");}
		catch (Exception ex) {
System.out.println(ex);
}}}


