
public class CupcakeTestDrive {
	public static void main(String[] args) {
		CupcakeStore van = new Vanilla();
		CupcakeStore choc = new Chocolate();
		
		System.out.println("Order 1:  ");
		Cupcake cupcake = van.orderCupcake("Vanilla");
		System.out.println("Kamil wants a " + cupcake.getName() + "\n");
		
		System.out.println("Order 2:  ");
		Cupcake cupcake2 = choc.orderCupcake("Chocolate");
		System.out.println("Kamil wants a " + cupcake2.getName() + "\n");
		
		System.out.println("Order 3:  ");
		Cupcake cupcake3 = choc.orderCupcake("Vanilla");
		System.out.println("Kamil wants a " + cupcake3.getName() + "\n");
	}

}
