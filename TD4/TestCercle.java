
public class TestCercle {
	public static void main(String[] args) {
		
		Cercle c1 = new Cercle(3.5);
		Cercle c2 = c1.agrandir(2);
		c1.affiche(1);
		c2.affiche(2);
		if(c1.egal(c2)) {
			System.out.println("les deux cercle sont egaux");
		}
		else {
			System.out.println("les cercles sont differents");
		}
	}
}
