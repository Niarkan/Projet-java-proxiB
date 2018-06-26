package domaine;
/*
 * @author Jules Golhen et Zackariaa Tafnout
 */
public class ClientPro extends Client {

	// Attributs
	private int numSiret;

	// Constructeur

	public ClientPro(String nom, String prenom, String adresse, int codepostal, String ville, int numSiret) {
		super(nom, prenom, adresse, codepostal, ville, telephone);
		this.numSiret = numSiret;
	}

	// Getters and setters

	public int getNumSiret() {
		return numSiret;
	}

	public void setNumSiret(int numSiret) {
		this.numSiret = numSiret;
	}
}
