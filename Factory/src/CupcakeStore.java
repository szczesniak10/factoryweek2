
public abstract class CupcakeStore {
	
	abstract Cupcake createCupcake(String item);
	
	public Cupcake orderCupcake(String type) {
		Cupcake cupcake = createCupcake(type);
		System.out.println(" Making a " + cupcake.getName() + " ");
		cupcake.prepare();
		cupcake.bake();
		cupcake.box();
		return cupcake;
		
	}
}