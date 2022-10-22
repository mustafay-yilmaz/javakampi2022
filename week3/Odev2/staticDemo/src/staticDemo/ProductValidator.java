package staticDemo;

public class ProductValidator {

	static {
		System.out.println("Static Yapýcý blok çalýţtý");
	}

	public ProductValidator() {
		System.out.println("Yapýcý blok çalýţtý");
	}

	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * public void bisey() {
	 * 
	 * }
	 * 
	 * public class BaskaBirClass { public static void sil() {
	 * 
	 * } }
	 */
}
