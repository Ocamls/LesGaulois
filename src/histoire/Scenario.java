package histoire;

import personnages.*;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 5);
		Romain minus = new Romain("Minus", 6);
		Druide panoramix = new Druide("Panoramix", 5, 10);

		panoramix.preparerPotion();

		panoramix.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste");

		panoramix.booster(asterix);

		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");

		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		/* Il faut que j'essaye de trouver la raison de pourquoi le 
		 * Gualois abandonne directement et à chaque fois le combat */
	}
}
