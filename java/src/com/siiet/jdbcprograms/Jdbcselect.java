package com.siiet.jdbcprograms;

import java.sql.*;

import javax.sql.*;  //step 1 import packages

public class Jdbcselect {
	public static void main(String[] args) {
		
	
		//step2 load and register the driver
		//step 3 establish the connection
   try {
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sriindu","root","deepthi@2003");
	
	//step 4 create statement
	Statement st=conn.createStatement();
	
	//step 5 execute query
	String strselect="Select booktitle,price,quantity from student";
	
    //process the result set to display
    ResultSet rst=st.executeQuery(strselect);
	System.out.println("The records are");
	int rowcount=0;
	while(rst.next()) {
		String booktitle=rst.getString("booktitle");
		int price=rst.getInt("price");
		int quantity=rst.getInt("quantity");
		System.out.println(booktitle+" "+price+" "+quantity);
		++rowcount;
    	  }
				
	
   }catch(SQLException e){
		
			e.printStackTrace();
		}
	}
}
