package frontiere;


import controleur.ControlEmmenager;

public class BoundaryEmmenager {
	private ControlEmmenager controlEmmenager;

	public BoundaryEmmenager(ControlEmmenager controlEmmenager) {
		this.controlEmmenager = controlEmmenager;
	}

	public void emmenager(String nomVisiteur) {
		if (controlEmmenager.isHabitant(nomVisiteur)) {
			System.out.println(
					"Mais vous êtes déjà un habitant du village !");
		} else {
			StringBuilder question = new StringBuilder();
			question.append("Êtes-vous :\n");
			question.append("1 - un druide.\n");
			question.append("2 - un gaulois.\n");
			int choixUtilisateur = -1;
			do {
				choixUtilisateur = Clavier.entrerEntier(question.toString());
				switch (choixUtilisateur) {
				case 1:
					emmenagerDruide(nomVisiteur);
					break;

				case 2:
					StringBuilder question2 = new StringBuilder();
					
					System.out.println("Bienvenue villageois " + nomVisiteur);
					question2.append("Quelle est votre force ?\n");
					
					int force = 0;
					force = Clavier.entrerEntier(question2.toString());
					controlEmmenager.ajouterGaulois(nomVisiteur, force);
					
				
					break;

				default:
					System.out
							.println("Vous devez choisir le chiffre 1 ou 2 !");
					break;
				}
			} while (choixUtilisateur != 1 && choixUtilisateur != 2);
		}
	}

	private void emmenagerDruide(String nomVisiteur) {
		StringBuilder question = new StringBuilder();
		StringBuilder question1 = new StringBuilder();
		StringBuilder question2 = new StringBuilder();

		System.out.println("Bienvenue druide " + nomVisiteur);
		question.append("Quelle est votre force ?\n");
		
		int force,potionFaible,potionForte;
		
		force = Clavier.entrerEntier(question.toString());
		question1.append("Quelle est la force de la potion la plus faible que vous produisez ?\n");
		potionFaible = Clavier.entrerEntier(question1.toString());
		question2.append("Quelle est la force de la potion la plus forte que vous produisez ?\n");
		potionForte = Clavier.entrerEntier(question2.toString());
		
		if(potionFaible>potionForte) {
			System.out.println("Attention Druide,vous vous êtres trompé entre le minimum et le maximum");
		}
		else {
			controlEmmenager.ajouterDruide(nomVisiteur, force, potionFaible, potionForte);			
		}
	}
	
	
	
	
	
}
