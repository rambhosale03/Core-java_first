package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.model.Employee;

@Repository("dao")
public class EmployeeDaoImpl implements Emploeedao {

	@Autowired
	private DataSource dataSource;
	private String Sql_query="SELECT * FROM Employee";

	List<Employee> employees=null;
	
	@Override
	public List<Employee> getEmployeeInfo() {
		
		try
		{
			//register driver
			//connection
			Connection con=dataSource.getConnection();
			
			 PreparedStatement stmt = con.prepareStatement(Sql_query);
			 
			 ResultSet rs = stmt.executeQuery();
			 
			 employees=new ArrayList<>();
			 
			 while(rs.next())
			 {
				 Employee emp=new Employee();
				 
//				 Integer i=rs.getInt(1);
//				 emp.setId(i);
//				 
//				 String nm=rs.getString(2);
//				 emp.setName(nm);
//				 
//				 String c=rs.getString(3);
//				 emp.setCity(c);
				 
				 emp.setId(rs.getInt(1));
				 emp.setName(rs.getString(2));
				 emp.setCity(rs.getString(3));
				 
				 employees.add(emp);
			 }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return employees;
	}

}
