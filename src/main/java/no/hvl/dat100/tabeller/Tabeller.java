package no.hvl.dat100.tabeller;

public class Tabeller {
	public static void main(String[] args) {
		int[] tabell = {1,2,3,4,5};
		skrivUt(tabell);
	}
	// a)
	
	public static void skrivUt(int[] tabell) {
		System.out.print("[");
		for(int i =0; i<tabell.length; i++) {
			System.out.print(tabell[i]);
			if (i<tabell.length-1) {
				System.out.print(", ");
			}
			
		}
		System.out.print("]");

	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden summer ikke implementert");
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
