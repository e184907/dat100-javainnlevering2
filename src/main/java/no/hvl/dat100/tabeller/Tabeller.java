package no.hvl.dat100.tabeller;

public class Tabeller {
	public static void main(String[] args) {
		int[] tabell = { 1, 2, 3, 4, 5 };
		int[] tabell2 = { 42, 67, 89 };
		int[] tabell3 = { 10, 20, 30 };
		
		skrivUt(tabell);
		tilStreng(tabell2);
		
		
		int totalsum =summer(tabell3);
		
		System.out.println("summen av tabell3 er: " + totalsum);

	}
	// a)

	public static void skrivUt(int[] tabell) {
		System.out.print("[");
		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i]);
			if (i < tabell.length - 1) {
				System.out.print(", ");
			}

		}
		System.out.print("]");

	}

	// b)
	public static String tilStreng(int[] tabell) {
		System.out.println();
		String result = "[";

		System.out.print("[");
		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i]);

			if (i < tabell.length - 1) {
				System.out.print(", ");

			}
		}

		System.out.println("]");
		return result;

	}

	// c)
	public static int summer(int[] tabell) {
		int[] tabell3 = { 10, 20, 30 };
		int antall = tabell3.length;
		System.out.println("antall elementer er: " + antall);
		
		int sum=0;
			for (int i = 0; i<tabell3.length; i++) {
				sum +=tabell3[i];
				
			}
			
		return sum;
			}


	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
