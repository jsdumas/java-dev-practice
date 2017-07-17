package algorithmes.chapitres.chap4;

import java.util.Scanner;

public class TestEnsemble {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int valeur;
		Ensemble ensemble = new Ensemble(10);
		do {
			System.out.print("Entrez une valeur : ");
			valeur = reader.nextInt();
		} while (ensemble.ins�re(valeur));
		System.out.print("Entrez la valeur � supprimer : ");
		valeur = reader.nextInt();
		if (ensemble.supprime(valeur))
			System.out.println("La valeur faisait bien partie de l'ensemble.");
		else
			System.out.println("La valeur ne fait pas partie de l'ensemble.");
		System.out.println("Affichage de l'ensemble");
		ensemble.affiche();
	}
}
