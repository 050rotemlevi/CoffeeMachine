package Coffee;

public class Espresso implements BasicCoffee{

	@Override
	public void makeCoffee() {
		// TODO Auto-generated method stub
		System.out.println( "Espresso - $ " + this.price()  );
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return coffeepricing.price(this);
	}

}
