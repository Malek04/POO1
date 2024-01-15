
public class Salaire {
	String nom;
	String entreprise;
	int salaire;
	
	public Salaire(String nom, String entreprise, int salaire) {
		this.nom = nom;
		this.entreprise = entreprise;
		this.salaire = salaire;
	}
	
	public void affiche() {
		System.out.println(nom +" "+entreprise+" "+salaire );
	}
}
