package frontiere;

import controleur.ControlLibererEtal;
import villagegaulois.Etal;
import villagegaulois.Village;

public class BoundaryLibererEtal {
	private ControlLibererEtal controlLibererEtal;

	public BoundaryLibererEtal(ControlLibererEtal controlLibererEtal) {
		this.controlLibererEtal = controlLibererEtal;
	}

	public void libererEtal(String nomVendeur) {
		//TODO a completer
		
		Etal etal = controlLibererEtal.libererEtal(nomVendeur);
		
		 String produit = etal.getProduit();
	      int quantite = etal.getQuantite();
	      
		
	}

}
