package no.hvl.dat100.tabeller;

public class Tabeller {
	public static void main(String[] args) {
		int[] tabell = { 1, 2, 3, 4, 5 };
		int[] tabell2 = { 42, 67, 89 };
		int[] tabell3 = { 10, 20, 30 };
		int[] tabell4 = { 5, 10, 15 };
		int[] tabell5= {1,3,5,7,10};
		int[] tabell6 = {2,4,6,8,10};
		
		
		skrivUt(tabell);
		tilStreng(tabell2);
		
		
		int totalsum =summer(tabell3);
		System.out.println("summen av tabell3 er: " + totalsum);
		
		//Her kan du redigere variabelen for å sjekke om den er i tabell4
		int tall4=5;
		finnesTall(tabell4, tall4);
			
		int tall5=7;
		int posisjon =posisjonTall(tabell5, tall5);
		
		if (posisjon !=-1) {
			System.out.println("Tallet " + tall5 + " finnes i posisjonen " + posisjon + " i tabell5");
		} else {
			System.out.println("Tallet " + tall5 + " finnes ikke i tabellen");
			
		}
		//ikke fått denne til å fungere
		int[] motsatt = reverser(tabell6);
		System.out.println(motsatt);
		
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
		int antall = tabell.length;
		System.out.println("antall elementer er: " + antall);
		
		int sum=0;
			for (int i = 0; i<tabell.length; i++) {
				sum +=tabell[i];
				
			}
			
		return sum;
			}


	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for (int i =0; i<tabell.length; i++) {
			if (tabell[i]==tall) {
				System.out.println("Tallet " + tall + " er i tabellen");
				return true;
			}
			
		}
		System.out.println("Tallet er ikke i tabellen");
		return false;
		

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for (int i =0; i<tabell.length; i++) {
			if (tabell[i]==tall) {
				return i;
				
			}
		}
		return -1;
	}

	// f) har ikke fått denne til å fungere
	public static int[] reverser(int[] tabell) {
		int[] reversert = new int[tabell.length];
		for (int i =tabell.length; i>=0; i--) {
			System.out.println(tabell[i]);
			if (i>0) {
				System.out.println(", ");
			reversert[i]=(tabell.length-1-i);	
			}
		System.out.println("]");
		}
		
		
		
		return reservert;
		
		
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
