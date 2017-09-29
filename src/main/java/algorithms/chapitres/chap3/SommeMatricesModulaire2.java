package algorithms.chapitres.chap3;

import java.util.Scanner;

public class SommeMatricesModulaire2 {
	static Scanner reader = new Scanner(System.in);

	public static void lireMatrice(int[][] matrice) {
		for (int i = 0; i < matrice.length; i++)
			for (int j = 0; j < matrice[i].length; j++) {
				System.out.print("Entrez matrice[" + i + "][" + j + "] : ");
				matrice[i][j] = reader.nextInt();
			}
	}

	public static int[][] ajouteMatrice(int[][] matrice1, int[][] matrice2) {
		int[][] r�sultat;
		if (matrice1.length != matrice2.length)
			return null;
		for (int i = 0; i < matrice1.length; i++)
			if (matrice1[i].length != matrice2[i].length)
				return null;
		r�sultat = new int[matrice1.length][];
		for (int i = 0; i < matrice1.length; i++) {
			r�sultat[i] = new int[matrice1[i].length];
			for (int j = 0; j < matrice1[i].length; j++)
				r�sultat[i][j] = matrice1[i][j] + matrice2[i][j];
		}
		return r�sultat;
	}

	public static void �crireMatrice(int[][] matrice) {
		for (int i = 0; i < matrice.length; i++)
			for (int j = 0; j < matrice[i].length; j++)
				System.out.println("matrice[" + i + "][" + j + "] = " + matrice[i][j]);
	}

	public static void main(String[] args) {
		final int taille = 3;
		// d�claration et cr�ation des matrices
		int matrice1[][] = new int[taille][taille];
		int matrice2[][] = new int[taille][taille];
		// lecture des matrices
		System.out.println("Saisie de la premi�re matrice");
		lireMatrice(matrice1);
		System.out.println("Saisie de la deuxi�me matrice");
		lireMatrice(matrice2);
		// addition des deux matrices
		int[][] matrice3 = ajouteMatrice(matrice1, matrice2);
		// �criture de la matrice r�sultat
		System.out.println("Affichage du r�sultat");
		�crireMatrice(matrice3);
	}
}