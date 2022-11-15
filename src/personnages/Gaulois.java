package personnages;

public class Gaulois {

	private String nom;
	private int effetPotion = 1;
	private int force;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];

	public Gaulois(String nom, int force) {
		super();
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
		return "Le gaulois " + nom + " : ";
	}
	

	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] tropheesGagner = romain.recevoirCoup((force / 3) * effetPotion);

			
		for (int i = 0; tropheesGagner != null && i < tropheesGagner.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = tropheesGagner[i];
		}
	}

	
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée");
	}
	
	public void faireUneDonnation(Musee musee) {
		if (this.nbTrophees > 0) {
			this.parler(" Je donne au musee tous mes trophees ");
			for (int i = 0; trophees[i] != null && i < this.nbTrophees; i++) {
				System.out.println("je te donne un " + trophees[i] + "!");
				musee.donnerTrophee(this, trophees[i]);
				trophees[i]=null;
			}
			nbTrophees=0;
		}
	}

	@Override
	public String toString() {
		return "Gaulois [nom= " + nom + ", force= " + force + ", effetPotion= " + effetPotion + "]";
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("astérix", 8);
//		System.out.println(asterix);
//		System.out.println(asterix.nom);
		Romain minus = new Romain("Minus",6);
		asterix.parler("Bonjour");
		asterix.prendreParole();
		asterix.frapper(minus);
		
		asterix.boirePotion(5);
		asterix.frapper(minus);
		Musee musee1 = new Musee();
		asterix.faireUneDonnation(musee1);
		
	}
	

}
