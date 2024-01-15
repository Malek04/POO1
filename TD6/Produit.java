
public class Produit {

	private String ref;
	private double prix;
	private int qte;
	
	public Produit(String ref, double prix) {
		this.ref = ref;
		this.prix = prix;
		this.qte = 0;
	}
	
	public String toString() {
		return ref+" : "+prix+"DT, diponible"+qte;
	}
	
}
