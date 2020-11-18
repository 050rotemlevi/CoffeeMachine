package Coffee;

public class Americano implements BasicCoffee{

	@Override
	public void makeCoffee() {
		// TODO Auto-generated method stub
		System.out.println( "Americano - $ " + this.price()  );
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return coffeepricing.price(this);
	}

}
