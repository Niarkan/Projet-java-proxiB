package lanceur;
/*
 * @author Jules Golhen et Zackariaa Tafnout
 */

import java.util.ArrayList;


import domaine.Agence;
import domaine.Client;
import domaine.CompteCourant;
import domaine.CompteEpargne;
import domaine.Conseiller;
import domaine.Gerant;


public class NotreAppli {

	public static void main(String[] args) {

		// Declaration

		Agence agence1;
		Gerant gerant1;
		Conseiller conseiller1;
		Client client1, client2;
		CompteCourant CompteBob;
		CompteEpargne CompteFred;

		ArrayList<Client> listeClient1;

		// Affectation + Instanciation

		agence1 = new Agence("A584862", "26/06/2018");
		gerant1 = new Gerant("Baudouin", 1);
		conseiller1 = new Conseiller("Miraud", 1);
		client1 = new Client("Serat", "Bob", "31 rue Pervanche", 31000, "Toulouse", 4654 );
		client2 = new Client("Pinot", "Fred", "47 rue Folio", 14000, "Colommiers", 4669);
		CompteBob = new CompteCourant(4556, 601000);
		CompteFred = new CompteEpargne(8914, 500000);
		

		listeClient1 = new ArrayList<Client>();

		// On ajoute les clients a la liste des clients

		listeClient1.add(client1);
		listeClient1.add(client2);

		//Méthode Lire informations
		
		for(Client mesClient:listeClient1) {
			System.out.println(mesClient);
		}
		conseiller1.lireInfoClient(listeClient1);
		
		// On renseigne les deux compte, celui a créditer, le compte bénéficiare puis le montant a virer	
		conseiller1.faireVirement(CompteBob, CompteFred, 1001);

		//Utilisation de de la méthode d'audit de l'agence
		gerant1.auditerAgence(agence1);
		
		//Utilisation de la méthode de Gestion de patrimoine
		conseiller1.gererPatrimoine(client2, CompteFred, 500, "Tokyo");
		
	}

}
