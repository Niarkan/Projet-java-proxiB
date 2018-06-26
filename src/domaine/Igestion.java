package domaine;
/*
 * @author Jules Golhen et Zackariaa Tafnout
 */
import domaine.CompteEpargne;

import java.util.ArrayList;

import domaine.CompteCourant;

public interface Igestion {
	
	/**
	 * M�thode permettant le virment de compte courant a compte epargne
	 * @param Ici nous retrouvons le compte a d�biter
	 * @param Ici nous retrouvons le compte a cr�diter
	 * @param Ici Nous retrouvons le montant a virer
	 */
	//M
	public void faireVirement(CompteCourant compteBob, CompteEpargne compteFred, int argentAcrediter);
	
	public void creerClient();

	public void creerCompte();

	/**
	 * m�thode perm�ttant d'afficher la liste des client de l'Agence
	 * @param Ici on affiche la liste des clients.
	 */
	public void lireInfoClient(ArrayList<Client>  listeClient1);

	public void modifierInfoClient();

	public void simulerCredit();

	/**
	 * M�thode perm�ttant de faire des placement non toxique en bourse
	 * @param Nous r�cup�rons le Nom du client
	 * @param Nous recup�rons son nom de compte
	 * @param Nous definissont le montant du placement en bourse
	 * @param Nous defissont la ou le placment vas etre fait
	 */
	public void gererPatrimoine(Client nom, CompteEpargne compteFred, int montant, String bourse);

	public void proposerCB();

}
