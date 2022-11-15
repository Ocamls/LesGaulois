package personnages;

public class Musee {
	private Trophee[] trophees = new Trophee[4];
	private int nbTrophee=0;
	
	public Musee() {
	}
	
	public void donnerTrophee(Gaulois gaulois, Equipement equipement) {
		Trophee don = new Trophee(gaulois,equipement);
		trophees[nbTrophee] = don;
		nbTrophee ++;
	}

	/* Il y a une erreur sur le code en Caml voir sur internet comment faire */
	
	public void extraireInstructionCaml() {
		String guillemet = "\"";
		String virgule = ",";
		String pointvirgule = ";";
		StringBuilder nom = new StringBuilder();
		nom.append("let musee = [");
		for (int i = 0; i < this.nbTrophee; i++) {
			nom.append(' ');
			nom.append(guillemet);
			nom.append(trophees[i].donnerNom());
			nom.append(guillemet);
			nom.append(virgule);
			nom.append(' ');
			nom.append(guillemet);
			nom.append(trophees[i].getEquipement());
			nom.append(guillemet);
			if (i + 1 != this.nbTrophee) {
				nom.append(pointvirgule);
			}

		}
		nom.append(" ]");
		System.out.println(nom);
	}
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Musee musee1 = new Musee();
		
		musee1.extraireInstructionCaml();
	}
}