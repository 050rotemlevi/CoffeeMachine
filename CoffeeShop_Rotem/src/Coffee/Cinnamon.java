package Coffee;

public class Cinnamon extends CoffeeDecorator {

	public Cinnamon(BasicCoffee basiccoffee) {
		super(basiccoffee);
	}

	@Override
	public void makeCoffee() {
		// TODO Auto-generated method stub
		basiccoffee.makeCoffee();
		System.out.println( "---> Cinnamon - $ " + coffeepricing.price(this) );
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return basiccoffee.price() + coffeepricing.price(this);
	}

}
