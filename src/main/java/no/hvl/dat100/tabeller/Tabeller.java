package no.hvl.dat100.tabeller;

public class Tabeller {
	public static void main(String[] args) {
		int[] tabell = { 1, 2, 3, 4, 5 };
		int[] tabell2 = { 42, 67, 89 };
		int[] tabell3 = { 10, 20, 30 };
		int[] tabell4 = { 5, 10, 15 };

		int[] tabell5 = { 1, 3, 5, 7, 10 };
		int[] tabell6 = { 2, 4, 6, 8, 10 };
		int[] tabell7 = { 1, 2, 3, 4, 5 };
		int[] tabell8 = { 6, 7, 8, 9, 10 };


		
		
		
		
		
		// Utskrift av metoder
		
		
		// a)
		System.out.print("Utskrift tabell: ");
		skrivUt(tabell);
		
		System.out.println();
		
		
		
		// b)
		System.out.println("Utskrift string: " + tilStreng(tabell2));

		System.out.println();

		
		
		// c)
		System.out.println("Summen av tabell3 er: " + summer(tabell3));

		System.out.println();
		
		
		
		// d)
		// 			Her kan du redigere variabelen for å sjekke om den er i tabell4
		int tall4 = 5;
		finnesTall(tabell4, tall4);
		
		System.out.println();
		

		
		// e)
		int tall5 = 7;
		int posisjon = posisjonTall(tabell5, tall5);

		if (posisjon != -1) {
			System.out.println("Tallet " + tall5 + " finnes i posisjonen " + posisjon + " i tabell5");
		} else {
			System.out.println("Tallet " + tall5 + " finnes ikke i tabellen");

		}
		
		System.out.println();
		

		
		// f)
		System.out.print("Tabell6 reversert er: ");
		reverser(tabell6);
		
		System.out.println();
		
	
		
		// g)
		System.out.println("Tabellen er sortert: " + erSortert(tabell));
		
		System.out.println();
		
		

		// h)
		int[] sammensattTabell = settSammen(tabell7, tabell8);
		System.out.print("Tabell7 og tabell8 satt sammen er: ");
		skrivUt(sammensattTabell);

	}
	
	
	
	
	
	
	
	
	// Implementerte metoder
	
	

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

	// b) SE PÅ!!
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
		System.out.println("Antall elementer er: " + antall);

		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];

		}

		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				System.out.println("Tallet " + tall + " er i tabellen");
				return true;
			}

		}
		System.out.println("Tallet er ikke i tabellen");
		return false;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;

			}
		}
		return -1;
	}

	// f) (har ikke fått denne til å fungere)
	public static int[] reverser(int[] tabell) {
		System.out.print("[");
		int[] reversert = new int[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			reversert[i] = tabell[tabell.length - 1 - i];

			System.out.print(tabell[tabell.length - 1 - i]);
			if (i < tabell.length - 1) {
				System.out.print(", ");

			}

		}
		System.out.println("]");
		return reversert;

	}

	// g)
	public static boolean erSortert(int[] tabell) {

		int j = 0;
		boolean sortert = true;

		while (sortert && j < tabell.length - 1) {
			if (tabell[j] > tabell[j + 1]) {
				sortert = false;
			}
			j++;
		}
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell7, int[] tabell8) {
		int[] sammensatt = new int[tabell7.length + tabell8.length];
		
		for (int i = 0; i < tabell7.length; i++) {
			sammensatt[i] = tabell7[i];
		}
		
		for (int i = 0; i < tabell8.length; i++) {
			sammensatt[tabell7.length + i] = tabell8[i];
		}

		return sammensatt;

	}
}
