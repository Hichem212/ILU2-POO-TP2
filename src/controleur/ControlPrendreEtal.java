package controleur;

import java.util.Iterator;

import personnages.Gaulois;
import villagegaulois.Etal;
import villagegaulois.Village;

public class ControlPrendreEtal {
	private Village village;
	private ControlVerifierIdentite controlVerifierIdentite;

	public ControlPrendreEtal(ControlVerifierIdentite controlVerifierIdentite,Village village) {
		this.controlVerifierIdentite = controlVerifierIdentite;
		this.village = village;
	}

	public boolean resteEtals() {
		//TODO a completer, attention le retour ne dit pas etre false :-)
		return village.rechercherEtalVide();
	}	

	public int prendreEtal(String nomVendeur, String produit, int nbProduit) {
		//TODO a completer
		int numeroEtal = -1;
		
		if(!verifierIdentite(nomVendeur) ) {
			System.out.println("Je suis désolé " + nomVendeur +" mais il faut être un habitant de notre village pour commercer ici");
		}
		else {
			System.out.println("Bonjour " + nomVendeur + " ,je vais regarder si je peux vous trouver un étal ");
			Gaulois vendeur = village.trouverHabitant(nomVendeur);
		    numeroEtal = village.installerVendeur(vendeur, produit, nbProduit);
		}
		
		return numeroEtal;
	}

	public boolean verifierIdentite(String nomVendeur) {
		//TODO a completer, attention le retour ne dit pas etre false :-)
		return controlVerifierIdentite.verifierIdentite(nomVendeur);

	}
}
