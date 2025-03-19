package controleur;

import villagegaulois.Etal;
import villagegaulois.Village;

public class ControlTrouverEtalVendeur {
	private Village village;

	public ControlTrouverEtalVendeur(Village village) {
		this.village = village;
	}

	public Etal trouverEtalVendeur(String nomVendeur) {
		//TODO a completer
		Etal etal = null;
		
		if(village.trouverHabitant(nomVendeur) == null) {
			System.out.println("Il n'y a pas ce vendeur dans le village");
			return null;
		}
		
		 etal= village.rechercherEtal(village.trouverHabitant(nomVendeur));
		 if(etal == null) {
			 System.out.println(nomVendeur + "n'a pas d'étal");
		 }
		
	
		return etal;
	}
}
