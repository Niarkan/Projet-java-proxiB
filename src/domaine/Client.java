package domaine;

public class Client {

	// Attributs

	protected static String nom;
	protected String prenom;
	protected String adresse;
	protected int codepostal;
	protected String ville;
	protected static int telephone;

	// Constructeurs
	
	public Client(String nom, String prenom, String adresse, int codepostal, String ville, int telephone) {
		super();
		Client.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codepostal = codepostal;
		this.ville = ville;
		Client.telephone = telephone;
	}
	// Getters and setters

	public static String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		Client.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCodepostal() {
		return codepostal;
	}

	public void setCodepostal(int codepostal) {
		this.codepostal = codepostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		Client.telephone = telephone;
}
	
	public String toString() {
		return("le client " + getNom() + " " + getPrenom() + " habite à " + getAdresse() + " " + getCodepostal() + " " + getVille() + " son numéro de téléphone est : " + getTelephone() );
	}
	
}
