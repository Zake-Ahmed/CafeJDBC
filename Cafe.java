package com.qa.jdbcDemo;

import java.sql.Connection;
import java.sql.Statement;

public class Cafe {
	Statement stmt = null;
	Connection conn = null;
	JDBC db = new JDBC();

	public void addDrink(Drink drink) {
		try {
			conn = db.connect();
			stmt = conn.createStatement();
			String queryOld = "insert into drinks (type , size , dairyFree , cost) values ( 'latte' , 'large' , true , 3.25) ;";
			String query = "INSERT INTO drinks(type, size, dairyFree, cost) VALUES('"+ drink.getType() + "', '"+ drink.getSize() +"', " + drink.isDairyFree()+ ", "+ drink.getCost()+");";
			String doubleQuery="INSERT INTO drinks(type, size, dairyFree, cost) VALUES"
					+ "('"+ drink.getType() +"', '"+ drink.getSize() +"', " + drink.isDairyFree()+ ", "+ drink.getCost()+"),"
					+ "('"+ drink.getType() +"', '"+ drink.getSize() +"', " + drink.isDairyFree()+ ", "+ drink.getCost()+")"+ 
					";";
			System.out.println(doubleQuery);
			stmt.executeUpdate(doubleQuery);// pass in our SQL query into stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
