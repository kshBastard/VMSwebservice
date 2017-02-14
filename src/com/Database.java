package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database 
{
public Connection Get_Connection() throws Exception
{
try
{
	Class.forName("com.mysql.jdbc.Driver").newInstance();
	System.out.println("loading.....");
String connectionURL = "jdbc:mysql://localhost:3306/VMS";
Connection connection = null;


connection = DriverManager.getConnection(connectionURL, "root", "java");
System.out.println(" database connected");
return connection;
}
catch (SQLException e)
{
throw e; 
}
catch (Exception e)
{
throw e; 
}
}

}
