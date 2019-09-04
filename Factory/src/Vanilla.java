
public class Vanilla extends CupcakeStore{

	Cupcake createCupcake(String item) {
		if (item.equals("chocolate")) {
			return new ChocolateVanilla();
		} else if (item.equals("Vanilla")) {
			return new DoubleVanilla();
		} else {
			return null;
		}
	}
}
