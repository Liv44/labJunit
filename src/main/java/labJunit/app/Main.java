package labJunit.app;

public class Main {

	public static void main(String[] args) {
		Calculatrice c = new Calculatrice();
		
		//System.out.println("Donnez un nombre");
		double s = c.somme(10, 20);
		System.out.println("10 + 20 = " +s);
		
		double p = c.produit(5, 7);
		System.out.println("5 * 7 = " + p);
		
	}

}
