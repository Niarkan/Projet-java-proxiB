package domaine;
/*
 * @author Jules Golhen et Zackariaa Tafnout
 */
public class ClientParticulier extends Client {

	// Attribut
	private int NumSecu;

	// Constructeurs
	
	public ClientParticulier(String nom, String prenom, String adresse, int codepostal, String ville, int numSecu) {
		super(nom, prenom, adresse, codepostal, ville, telephone);
		NumSecu = numSecu;
	}

	// Getter and Setters
	
	public int getNumSecu() {
		return NumSecu;
	}

	public void setNumSecu(int numSecu) {
		NumSecu = numSecu;
	}

}
