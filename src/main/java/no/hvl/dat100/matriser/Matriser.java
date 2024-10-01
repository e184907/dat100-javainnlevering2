package no.hvl.dat100.matriser;

public class Matriser {
	
	public static void main(String[] args) {
		
		int[][] matrise1 = {
				
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
				
		};
		
		
		
		
		
		
		
		// Utskrift av metoder
		
		// a)
		System.out.println("Utskrift matrise: ");
		skrivUt(matrise1);
		
		System.out.println();
		
		
		// b)
		int [][] skalerMatrise = skaler(2, matrise1);
		System.out.println("Utskrift mutiplisert matrise: ");
		skrivUt(skalerMatrise);
		
		System.out.println();
		
		
		
		
		
		
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

	// b)
	public static String tilStreng(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int [][] skalerMatrise = new int[matrise.length][matrise[0].length];
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				skalerMatrise[i][j] = matrise[i][j] * tall;
			}
		}
		return skalerMatrise;
		
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden erLik ikke implementert");
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
