package Coffee;

public class Macchiato implements BasicCoffee{

	@Override
	public void makeCoffee() {
		// TODO Auto-generated method stub
		System.out.println( "Macchiato - $ " + this.price()  );
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return coffeepricing.price(this);
	}

}
