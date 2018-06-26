package domaine;
/*
 * @author Jules Golhen et Zackariaa Tafnout
 */
public class CompteEpargne {

	//Attributs
	private static int numCompte;
	private int soldeCe;
	
	//Constructeurs
	
	public CompteEpargne(int numCompte, int soldeCe) {
		super();
		CompteEpargne.numCompte = numCompte;
		this.soldeCe = soldeCe;
	}
	//Getters an Setters
	public static int getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(int numCompte) {
		CompteEpargne.numCompte = numCompte;
	}
	public int getSoldeCe() {
		return soldeCe;
	}
	public void setSolde(int soldeCe) {
		this.soldeCe = soldeCe;
	}
	
	//M�thode (remunerer)
	
	public void remunerer() {
		System.out.println("le compte �pargne est caract�ris� par un taux de r�mun�ration de 3%");
}
	
}
