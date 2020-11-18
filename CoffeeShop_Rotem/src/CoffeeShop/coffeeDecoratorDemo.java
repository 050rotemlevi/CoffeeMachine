package CoffeeShop;
import Coffee.*;

public class coffeeDecoratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CoffeeHouse ch = CoffeeHouse.getInstance();
		CoffeeHouse ch2 = CoffeeHouse.getInstance();
		
		BasicCoffee coffee1 = new Espresso ();
		
		//coffee1.makeCoffee();
		
		coffee1 = new Cinnamon(coffee1);
		coffee1 = new Cinnamon(coffee1);
		coffee1 = new Cinnamon(coffee1);
		
		//offee1.makeCoffee();
		//System.out.println(coffee1.price());
		
		ch.add(coffee1);
		
		BasicCoffee coffee2 = new Liquor(new Cinnamon(new Espresso()));
		ch.add(coffee2);
		
		BasicCoffee coffee3 = new WhippedCream( new Liquor(new Cinnamon(new Macchiato())));
		ch2.add(coffee3);
		
		ch.getAllOrder();
		ch2.getTotalPrice();
	}

}
