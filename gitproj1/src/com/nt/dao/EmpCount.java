package com.nt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpCount {
	private String query="select count(*) from emp";
	Connection con=null;{

	try {
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost@1521:orcl","system","manager");
PreparedStatement ps=con.prepareStatement(query);
ResultSet rs=ps.executeQuery();
rs.next();
System.out.println(rs.getInt(1));
}
	catch(SQLException se) {
		se.printStackTrace();
	}
}
}
