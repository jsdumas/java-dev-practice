package algorithmes.chapitres.chap6.devine;

public class TestDevineNombre2 {

	public static void main(String[] args) {
		final int min = 1;
		final int max = 120;
		int nbrTentatives;
		NombreAléatoire nbrAléatoire = new NombreAléatoire(min, max);
		DevineNombre2 devineNombre = new DevineNombre2(nbrAléatoire);
		nbrTentatives = devineNombre.devine();
		System.out.println("Nombre de tentatives = " + nbrTentatives);
	}
}
