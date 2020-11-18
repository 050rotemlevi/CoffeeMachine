package Coffee;

public class WhippedCream extends CoffeeDecorator {

	public WhippedCream(BasicCoffee basiccoffee) {
		super(basiccoffee);
	}

	@Override
	public void makeCoffee() {
		// TODO Auto-generated method stub
		basiccoffee.makeCoffee();
		System.out.println( "---> Whipped Cream - $ " + coffeepricing.price(this)  );
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return basiccoffee.price() + coffeepricing.price(this);
	}
}
