package CoffeeShop;
import Coffee.*;

import java.util.ArrayList;

public class CoffeeHouse {
	private static CoffeeHouse instance = new CoffeeHouse();
	
	ArrayList <BasicCoffee>	Orders = new ArrayList<>();
	
	private CoffeeHouse() {}
	
	public static CoffeeHouse getInstance() {
		return instance;
	}
	
	public void add(BasicCoffee coffee) {
		Orders.add(coffee);
	}
	
	public void getAllOrder() {
		for (BasicCoffee coffee: Orders) {
			coffee.makeCoffee();
			System.out.println( "total for the coffee $" + coffee.price() );
			System.out.println();
		}
	}
	//getAllOrderPrice
	public void getTotalPrice() {
		double totalPrice=0;
		for (BasicCoffee coffee: Orders) 
			totalPrice +=  coffee.price();
		
		System.out.println( "Total To Pay: $ "+ totalPrice );	
	}
}
