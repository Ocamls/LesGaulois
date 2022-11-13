package personnages;

public class Village {
	private String nom; 
	private Chef chef; 
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	public Village(String Nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public void setChef(Chef chef) {
		this.chef = chef; 
	}
	public String getNom() {
		return nom;
	}

	
	public void ajouterVillageois(Gaulois gauloisAAjouter) {
		villageois[nbVillageois] = gauloisAAjouter; 
		nbVillageois ++;
	}
	
	public Gaulois trouverHabitant(int numVillageois) {
		return villageois[numVillageois];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef " + chef.getNom() + " vivent les légendaires gaulois : ");
		for (int i=0; i<nbVillageois; i++) {
			System.out.println("-" +villageois[i].getNom());
		}
	}
//	@Override
//	public String toString() {
//		return "Le chef " + chef.getNom() + " . Voici les villageois : "  + villageois;
//	}
	
	public static void main(String[] args) {
		Village irreductibles = new Village("Village des Irréductibles",30);
		
//		Gaulois gaulois = irreductibles.trouverHabitant(30); /* On obtient une erreur index out range (car on veut accéder à une donnée en dehors du tableau  : << Index 30 out of bounds for length 30 >> */
		
		Chef abraracourcix = new Chef("Abraracourcix", 6, irreductibles);
		irreductibles.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 25);
		irreductibles.ajouterVillageois(asterix);
//		System.out.println(irreductibles);
		Gaulois gaulois = irreductibles.trouverHabitant(0);
		irreductibles.ajouterVillageois(obelix);
		
		System.out.println(gaulois);
		irreductibles.afficherVillageois();
	}

}
