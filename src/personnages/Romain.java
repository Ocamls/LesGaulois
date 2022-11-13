package personnages;

public class Romain {

	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipements = 0;

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

	public void sEquiper(Equipement equipement) {
		switch (nbEquipements) {
		case 2: {
			System.out.println("Le soldat " + nom + " est déjà bien protégé ! ");
			break;
		}
		case 1: {
			if (equipement == equipements[0]) {
				System.out.println("Le soldat " + nom + " possède déjà un " + equipement);
				break;
			} else {
				ajouterEquipement(equipement);
				break;
			}
		}
		default: {
			ajouterEquipement(equipement);
			break;
		}
		}
	}

	private void ajouterEquipement(Equipement equipement) {
		equipements[nbEquipements] = equipement;
		nbEquipements++;
		System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement);
	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		minus.prendreParole();
		minus.parler("Bonjour");
		minus.recevoirCoup(6);
		System.out.println(Equipement.BOUCLIER);
		
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.BOUCLIER);

	}
}
