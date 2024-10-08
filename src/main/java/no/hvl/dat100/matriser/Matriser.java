package no.hvl.dat100.matriser;

public class Matriser {

	public static void main(String[] args) {

		int[][] matrise1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrise2 = { { 3, 2, 1 }, { 6, 5, 4 }, { 9, 8, 7 } };
		
		// Utskrift av metoder

		// a)
		System.out.println("Utskrift matrise: ");
		skrivUt(matrise1);

		System.out.println();

		// b)
		System.out.println("Matrise som string: " + "\n" + tilStreng(matrise1));


		

		// c)
		int[][] skalerMatrise = skaler(2, matrise1);
		System.out.println("Utskrift multiplisert matrise: ");
		skrivUt(skalerMatrise);

		System.out.println();

		// d)
		
		System.out.print("Matrise1 og matrise2 er lik: ");
		System.out.println(erLik(matrise1, matrise2));
		System.out.println();

		// e)
	
		System.out.println("Matrise1:");
		skrivUt(matrise1);
		int[][] speiletMatrise = speile(matrise1);
		
		System.out.println("Matrise1 speilet:");
		skrivUt(speiletMatrise);
	
		}
		
	

	// Implementerte metoder

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int[] rad : matrise) {
			for (int element : rad) {
				System.out.print(element + " ");
			}
			System.out.println();
		}

	}


	// b) MÅ ENDRES TIL FUNKE FOR MATRISE!!

	// b)

	public static String tilStreng(int[][] matrise) {

		String result = "";

		for (int j = 0; j < matrise.length; j++) {

			for (int i = 0; i < matrise[j].length; i++) {
				result += matrise[j][i];
				
				result += " ";

			}
			result += "\n";
		}


		
		return result;

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] skalerMatrise = new int[matrise.length][matrise[0].length];

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				skalerMatrise[i][j] = matrise[i][j] * tall;
			}
		}
		return skalerMatrise;

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if (a.length != b.length) {
			return false;

		}
		for (int i = 0; i < a.length; i++) {
			if (a[i].length != b[i].length) {
				return false;

			}
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j]) {
					return false;

				}

			}

		}
		return true;
	}

	// e)
	public static int[][] speile(int[][] matrise) {
		int[][] matrise1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		int rader = matrise1.length;
		int kolonner = matrise1[0].length;
		
		int[][] speilet = new int[rader][kolonner];
		
		for (int i =0; i<rader; i++) {
			for(int j=0; j<kolonner; j++) {
				speilet[i][j]=matrise1[rader-1-i][j];
				
			}
			
		}

		return speilet;

	}


	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");

	}
}
