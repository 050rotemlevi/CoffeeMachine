package Coffee;

public class Liquor extends CoffeeDecorator {

	public Liquor(BasicCoffee basiccoffee) {
		super(basiccoffee);
	}

	@Override
	public void makeCoffee() {
		// TODO Auto-generated method stub
		basiccoffee.makeCoffee();
		System.out.println( "---> Liquor - $ " + coffeepricing.price(this) );
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return basiccoffee.price() + coffeepricing.price(this);
	}
	
}
