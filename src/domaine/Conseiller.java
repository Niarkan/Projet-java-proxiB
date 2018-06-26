package domaine;

import java.util.ArrayList;

/*
 * @author Jules Golhen et Zackariaa Tafnout
 */
import domaine.CompteCourant;
import domaine.CompteEpargne;

public class Conseiller implements Igestion{

	// Attibuts
	private String nom;
	private int nbrClients;

	// Constructeur

	public Conseiller(String nom, int nbrClients) {
		super();
		this.nom = nom;
		this.nbrClients = nbrClients;
	}

	// getters and setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbrClients() {
		return nbrClients;
	}

	public void setNbrClients(int nbrClients) {
		this.nbrClients = nbrClients;
	
		
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
	public void lireInfoClient(ArrayList<Client>  listeClient1) {
		// TODO Auto-generated method stub
		
		for(Client mesClient : listeClient1) {
			System.out.println(mesClient);
		}
		
	}

	@Override
	public void modifierInfoClient() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void simulerCredit() {
		// TODO Auto-generated method stub
		
	}

	//M�thode gestion patrimoine
	
	public void gererPatrimoine(Client nom, CompteEpargne compteClient, int montant, String bourse) {
		// TODO Auto-generated method stub
		
			System.out.println("le conseiller " + getNom() + " place le montant de " + montant + " � " + "du compte "+ CompteEpargne.getNumCompte() +" de M."+ Client.getNom() +" dans la bourse de " + bourse);
			
			// Condition
			
			if(compteClient.getSoldeCe()>500000)
				
				System.out.println("transaction effectu�e");
			
			else
				System.out.println("transaction impossible");
		
	}

	@Override
	public void proposerCB() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void faireVirement(CompteCourant compteBob, CompteEpargne compteFred, int argentAcrediter) {
		
		//on r�cupere le solde du Compte a d�biter
		int soldeCc = compteBob.getSoldeCc();
		System.out.println("Solde du compte est de a d�biter est de " + compteBob.getSoldeCc()+ " �." );
		//On r�cupere le solde du compte a cr�diter
		int soldeCe = compteFred.getSoldeCe();
		System.out.println("Solde du compte a cr�diter est de " + compteFred.getSoldeCe()+" �." );
		//On annonce le montant du virement
		System.out.println("le montant a virer est de "+ argentAcrediter +" �.");
		//on d�bite le compte
		soldeCc -= argentAcrediter;
//		System.out.println(soldeCc);
		//On cr�dite le compte
		soldeCe += argentAcrediter;
		System.out.println(soldeCe);
		// On V�rifie si le virement ne met pas en d�couvert le d�biteur, sinon on annonce le succ�es du virement
		
		if(  soldeCc - argentAcrediter < -1000) {
			System.out.println("Le virement mettrais a d�couvert le compte cela annule le virement");
		}else {
			System.out.println("le virement entre les compte a bien �t� �ffectu�");
		}
		
		
		
		
		
		
		
	}

}