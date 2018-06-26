package domaine;
/*
 * @author Jules Golhen et Zackariaa Tafnout
 */
public class Agence {
	
	//Attributs
	private String numeroId;
	private String dateCreation;
	
	//Constructeur
	public Agence(String numeroId, String dateCreation) {
		super();
		this.numeroId = numeroId;
		this.dateCreation = dateCreation;
	}
	//Getters and setters
	public String getNumeroId() {
		return numeroId;
	}
	public void setNumeroId(String numeroId) {
		this.numeroId = numeroId;
	}
	public String getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	
}