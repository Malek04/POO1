
public class Cercle {
	private double rayon;
	
	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	public Cercle agrandir(int val) {
		double n_rayon = this.rayon+val;
		Cercle c2 = new Cercle(n_rayon);
		return c2;
	}
	
	public void affiche(int d) {
		System.out.println("c"+d+"("+this.rayon+")");
	}
	
	public boolean egal(Cercle c) {
		if(c==null) {
			return false;
		}
		else {
			return this.rayon == c.rayon;
		}
	}
}
