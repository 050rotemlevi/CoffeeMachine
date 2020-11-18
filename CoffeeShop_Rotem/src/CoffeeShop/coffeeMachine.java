package CoffeeShop;
import Coffee.*;
import java.util.Scanner;

public class coffeeMachine {
	
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in); 
		
		CoffeeHouse RotemCoffeShop = CoffeeHouse.getInstance();
		
		System.out.println( "Hello ! and Welcome to Rotem Coffee Shop \n"
				+ "please choose your order from the menu \n"
				+ "please choose Basic coffe and toppings" );
		
		
		System.out.println("Type Coffee:  "
				+ "\n\t1. Espresso    - $8 "
				+ "\n\t2. Americano   - $6 "
				+ "\n\t3. Macchihato  - $12"
				+ "\n");
		      	
		System.out.println("Coffee topings: "
				+ "\n\t0. WithOut / no more "
				+ "\n\t1. Cinnamon    - $3.5"
				+ "\n\t2. Liquor      - $1.5"
				+ "\n\t3. WippedCream - $2  "
				+ " \n");
		
		boolean anotherCoffe = true;
		
		while(anotherCoffe) {
			BasicCoffee c = null ;
		
		System.out.println("Please choose Coffee Type (1-3)");
		int coffee = input.nextInt(); 
					
		switch (coffee) {
			case 1: System.out.println("Espresso coffee");
				c = new Espresso(); 
		    	break;
		    case 2: System.out.println("Macchiato coffee");
		    	c = new Macchiato(); 
		    	break;
		    case 3: System.out.println("Americano coffee");
		    	c = new Americano(); 
		    	break;
		    default: 
				System.out.println("Please choose Coffee Type (1-3)");
				coffee = input.nextInt(); 
		    	break;
		}	
		
		boolean anotherTopping = true;
		
		System.out.println("Please choose topping (0-3)");
		while (anotherTopping) {
		
		int topping = input.nextInt();
		
		
		switch (topping) {
		case 0: anotherTopping = false;
			break;
		case 1: System.out.println("Cinnamon topping");
				c = new Cinnamon(c);
			break;
		case 2: System.out.println("Liquor topping");
				c = new Liquor(c);
			break;
		case 3: System.out.println("WhippedCream topping");
				c = new WhippedCream(c);
		    break;
	    default: 
	    		System.out.println("Please choose topping (0-3)");
	    		topping = input.nextInt(); 
	    	break;
		}
		System.out.println("More topping ? (0-3)");
		}
		System.out.println("more coffee drink ? ( Y/N ) ");
		String moreCoffe = input.next();
		
		if (!moreCoffe.equalsIgnoreCase("y"))
			anotherCoffe = false;
		
		RotemCoffeShop.add(c);
	}
		RotemCoffeShop.getAllOrder();
		RotemCoffeShop.getTotalPrice();
		
		System.out.println("\nfor Exit close the windows");
		while(input.hasNext())
		System.out.println("Bye");
	}

}
