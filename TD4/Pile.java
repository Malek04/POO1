public class Pile {
	
	private int taille;
	private int[] tab;
	private int sommet;
	
	public Pile(int taille) {
		this.taille = taille;
		this.tab = new int[taille];
		this.sommet = -1;
	}
	
	private boolean pileVide() {
		return sommet == -1;
	}
	
	private boolean pilePleine() {
		return sommet == taille - 1;
	}
	
	public void empile(int e) {
		if(!pilePleine()) {
			tab[++sommet]=e;
		}
		else {
			System.out.println("la pile est pleine");
		}
	}
	
	public void depile() {
		if(!pileVide()) {
			sommet--;
		}
		else {
			System.out.println("la pile est vide");
		}
	}
	
	public void affiche() {
		if(!pileVide()) {
			for (int i=0 ; i<=sommet ; i++) {
				System.out.println(tab[i]);
			}
		}
		else {
			System.out.println("La pile est vide");
		}
	}
	
}