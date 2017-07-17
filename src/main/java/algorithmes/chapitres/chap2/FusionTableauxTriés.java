package algorithmes.chapitres.chap2;

public class FusionTableauxTri�s {

	public static void main(String[] args) {
		final int taille1 = 10;
		final int taille2 = 20;
		int temp;
		boolean permut�;
		// d�claration et cr�ation des tableaux � trier et � fusionner
		int[] t1 = new int[taille1];
		int[] t2 = new int[taille2];
		// remplissage des deux tableaux
		for (int i = 0; i < taille1; i++)
			t1[i] = (int) (Math.random() * 101);
		for (int i = 0; i < taille2; i++)
			t2[i] = (int) (Math.random() * 101);
		// tri bulle de t1
		do {
			permut� = false;
			for (int i = 0; i < taille1 - 1; i++) {
				if (t1[i] > t1[i + 1]) {
					// �change entre t1[i] et t1[i+1]
					temp = t1[i];
					t1[i] = t1[i + 1];
					t1[i + 1] = temp;
					permut� = true;
				}
			}
		} while (permut�);
		// tri bulle de t2
		do {
			permut� = false;
			for (int i = 0; i < taille2 - 1; i++) {
				if (t2[i] > t2[i + 1]) {
					// �change entre t2[i] et t2[i+1}
					temp = t2[i];
					t2[i] = t2[i + 1];
					t2[i + 1] = temp;
					permut� = true;
				}
			}
		} while (permut�);
		// Affichage des tableaux
		System.out.println("Tableau t1 tri�");
		for (int i = 0; i < taille1; i++)
			System.out.print(t1[i] + " ");
		System.out.println();

		System.out.println("Tableau t2 tri�");
		for (int i = 0; i < taille2; i++)
			System.out.print(t2[i] + " ");
		System.out.println();
		// fusion des deux tableaux
		// d�claration et cr�ation du r�sultat
		int taille3 = taille1 + taille2;
		int[] t3 = new int[taille3];
		int i = 0;
		int j = 0;
		int k = 0;
		// remplissage de t3 � partir de t1 et t2
		while ((i < taille1) && (j < taille2)) {
			if (t1[i] < t2[j]) {
				t3[k] = t1[i];
				i++;
			} else {
				t3[k] = t2[j];
				j++;
			}
			k++;
		}
		while (i < taille1) {
			t3[k] = t1[i];
			i++;
			k++;
		}
		while (j < taille2) {
			t3[k] = t2[j];
			j++;
			k++;
		}

		System.out.println("R�sultat de la fusion : ");
		for (i = 0; i < taille3; i++)
			System.out.print(t3[i] + " ");
		System.out.println();
	}
}
