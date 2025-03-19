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
			return ;
		}
		
		else if(!installerVendeur(nomVendeur)) {
			System.out.println("Je suis désolé " + nomVendeur + ", mais il faut être un habitant de notre village pour commercer ici");
			return;
		}

		else {
			StringBuilder question = new StringBuilder();
			StringBuilder question2 = new StringBuilder();
			System.out.println("C'est parfait,il me reste un étal pour vous ! ");
			System.out.println("Il me faudrait quelques renseignements : ");
			question.append("Quel produit souhaitez vous vendre ?");
			String produit = Clavier.entrerChaine(question.toString());
			question2.append("Combien souhaitez vous en vendre ?");
			int nbProduit = Clavier.entrerEntier(question2.toString());
			int numeroEtal = controlPrendreEtal.prendreEtal(nomVendeur, produit, nbProduit);
			
			if(numeroEtal != 1) {
				System.out.println("Le vendeur Bonemine s'est installé à l'étal n° " + numeroEtal );
			}
			else {
				System.out.println("Désolé un problème est survenue lors de l'installation");
			}
			
		}
	}

	private boolean installerVendeur(String nomVendeur) {
		return controlPrendreEtal.verifierIdentite(nomVendeur);
	}


}
