package personnages;

public class Gaulois {

	private String nom;
	private int force;
	private int effetPotion = 1;

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
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		
		int coup = (force/3)*effetPotion;
		romain.recevoirCoup(coup);
	}
	
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée");
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
	}
	

}
