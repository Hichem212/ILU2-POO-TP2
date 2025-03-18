package frontiere;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		
		if(!controlPrendreEtal.resteEtals()) {
			System.out.println("Je suis désolée " + nomVendeur + "je n'ai plus d'étal qui ne soit pas déja occupé");
		}
		else {
			StringBuilder question = new StringBuilder();
			StringBuilder question2 = new StringBuilder();
			installerVendeur(nomVendeur);
			System.out.println("C'est parfait,il me reste un étal pour vous ! ");
			System.out.println("Il me faudrait quelques renseignements : ");
			question.append("Quel produit souhaitez vous vendre ?");
			String produit = Clavier.entrerChaine(question.toString());
			question2.append("Combien souhaitez vous en vendre ?");
			int nbProduit = Clavier.entrerEntier(question2.toString());
			controlPrendreEtal.prendreEtal(nomVendeur, produit, nbProduit);
			
		}
	}

	private void installerVendeur(String nomVendeur) {
		//TODO a completer
		
	}
}
