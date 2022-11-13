package personnages;

public class Romain {

	private String nom;
	private int force;
	public Romain(String nom, int force) {
		assert (force > 0) : "erreur la force doit être positive";
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + " >>");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert (force > 0) : "La force doit être positive";
		int forceDuRomain = force;
		force = force - forceCoup;
		if (force > 0) {
			parler("Aie");
		} else {
			parler("J'abandonne");
		}
		assert (forceDuRomain > force) : "La force doit diminué";

	}
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		minus.prendreParole();
		minus.parler("Bonjour");
		minus.recevoirCoup(6);
	}
}
