import java.util.ArrayList;

public class Pharmacie {
	
	private String nom;
	private String adresse;
	private ArrayList<Client> clients = new ArrayList<Client>();
	private ArrayList<Produit> produits = new ArrayList<Produit>();
	
	public Pharmacie(String nom,String adresse) {
		
		this.nom = nom;
		this.adresse = adresse;
		this.clients = new ArrayList<Client>();
		this.produits = new ArrayList<Produit>();

	}
	
	
}
