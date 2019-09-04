import java.util.ArrayList;

public abstract class Cupcake {
	String name;
	String base;
	String cream;
	ArrayList<String> toppings = new ArrayList<String>();
	
	void prepare() {
		System.out.println("Prepare " + name);
		System.out.println("Baking " + base + "flavored base");
		System.out.println("Adding cream ");
		System.out.println("Adding toppings:  " );
		for (String topping : toppings) {
			System.out.println( " " + topping);
		}
	}
	void  bake() {
		System.out.println("In the oven for 10 mins at 300");
}
	void decorate() {
		System.out.println("Decorate the Cupcakes");
}
	void box() {
		System.out.println("Place in Pastry Box");
}
	public String getName() {
		return name;
	}
	
}
