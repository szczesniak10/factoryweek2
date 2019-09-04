public class Chocolate extends CupcakeStore{

	Cupcake createCupcake(String item) {
		if (item.equals("Vanilla")) {
			return new VanillaChocolate();
		} else if (item.equals("Chocolate")) {
			return new DoubleChocolate();
		} else {
			return null;
		}
	}
}