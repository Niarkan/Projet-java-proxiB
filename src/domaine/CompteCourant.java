package domaine;
/*
 * @author Jules Golhen et Zackariaa Tafnout
 */
public class CompteCourant {

	// Attributs
	private int numCompte;
	private int soldeCc;

	// Constructeur
	public CompteCourant(int numCompte, int soldeCc) {
		super();
		this.numCompte = numCompte;
		this.soldeCc = soldeCc;
	}

	// Getters and Setters
	public int getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}

	public int getSoldeCc() {
		return soldeCc;
	}

	public void setSoldeCc(int soldeCc) {
		this.soldeCc = soldeCc;
	}
	
	// Méthode (autoriserDecouvert)
	
	public void autoriserDecouvert() {
		System.out.println("le compte " + getNumCompte() + " qui a un solde de " + getSoldeCc() + " est autorisé à un découvert de 1000 euros");
		
	// Condition
		
		if(soldeCc<-1000)
			
			System.out.println("transaction impossible");
		
		else
			System.out.println("transaction effectuée");
			
}

}