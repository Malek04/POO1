
public class Client {
	
	private String nom;
	private String prenom;
	private int nblabess;
	
	public Client(String nom, String prenom , int nblabess) {
		this.nom = nom;
		this.prenom = prenom;
		this.nblabess = nblabess;
	}
	
	public String toString() {
		return nblabess +" : "+nom+" "+prenom;
	}
	
}
