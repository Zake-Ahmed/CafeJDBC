package com.qa.jdbcDemo;

public class Runner {

	public static void main(String[] args) {
	JDBC jdbc = new JDBC();
	jdbc.connect()	;
	// Create our Cafe object
	Cafe newCafe = new Cafe();
	
	Drink latte = new Drink("latte", "grande", true, 1.73f);
	Drink drink2 = new Drink("caramel frappe", "venti", false, 5.35f);
	Drink drink3 = new Drink("caramel mocha", "demi", true, 4.28f);
	Drink drink4 = new Drink("vanilla frappe", "tall", false, 1.95f);
	Drink drink5 = new Drink("black", "short", true, 4.15f);
	
	
	newCafe.addDrink(latte);
//	newCafe.addDrink(drink2);
//	newCafe.addDrink(drink3);
//	newCafe.addDrink(drink4);
//	newCafe.addDrink(drink5);
	}


}


