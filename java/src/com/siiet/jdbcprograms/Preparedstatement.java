package com.siiet.jdbcprograms;

import java.sql.*; 
//step 1:import packages

public class Preparedstatement {
	public static void main(String[] args) {
		//step 2 load and register the driver
		//step 3 Establish connection
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sriindu","root","deepthi@2003");
			//step 4:create statment
			Statement st=conn.createStatement();
			//step 5:execute a SQL 
//insert values
			//String sqlinsert="insert into student values(6,'python',500,2)";
			//System.out.println("The sql statement is"+sqlinsert);
			//int countinsert=st.executeUpdate(sqlinsert);
			//System.out.println(countinsert +"record inserted");
//update query		
			//String updateqry="update student set booktitle='react'where booktitle='javascript'";
			//int rowupdate=st.executeUpdate(updateqry);
			//System.out.println(rowupdate);
//delete record from database
			//String sqldelete="delete from student where bookid=1";
			//System.out.println("The sql statement is"+sqldelete);
			//int countdeleted=st.executeUpdate(sqldelete);
			
			//System.out.println(countdeleted+"record deleted");
			String strselect="select booktitle,price,quantity from student";
			System.out.println("The sql statement is "+strselect);
//to display
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
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
