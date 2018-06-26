package domaine;

/*
 * @author Jules Golhen et Zackariaa Tafnout
 */


import java.util.ArrayList;

public class Gerant implements Igestion{

	// Attributs
	private String nom;
	private int Nbrconseiller;

	// Constructeurs
	public Gerant(String nom, int nbrconseiller) {
		super();
		this.nom = nom;
		Nbrconseiller = nbrconseiller;
	}

	// Getters and Setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbrconseiller() {
		return Nbrconseiller;
	}

	public void setNbrconseiller(int nbrconseiller) {
		Nbrconseiller = nbrconseiller;
	}

	//Méthode (auditerAgence)
		public void auditerAgence(Agence pAgence) {
			System.out.println("le gérant " + getNom() + " audite l'agence " + pAgence.getNumeroId() + " dont il y'a " + getNbrconseiller() + " conseillers");
	}

		@Override
		public void faireVirement(CompteCourant CompteBob, CompteEpargne CompteFred, int argentAcrediter) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void creerClient() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void creerCompte() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void modifierInfoClient() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void simulerCredit() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void gererPatrimoine(Client nom, CompteEpargne compteFred, int montant, String bourse) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void proposerCB() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void lireInfoClient(ArrayList<Client> listeClient1) {
			// TODO Auto-generated method stub
			
		}
}
