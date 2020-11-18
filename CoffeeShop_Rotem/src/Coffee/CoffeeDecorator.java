package Coffee;

public abstract class CoffeeDecorator implements BasicCoffee {
		
	protected BasicCoffee basiccoffee;
	
	public CoffeeDecorator (BasicCoffee basiccoffee) {
		this.basiccoffee = basiccoffee;
	}

	public abstract void makeCoffee();
	
	public abstract double price();
}
