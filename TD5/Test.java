
public class Test {

	public static void main(String[] args) {

		Point p = new Point();
		p.affiche();
		PointColore pc = new PointColore();
		pc.affiche();
		pc.deplace(5, 3);
		pc.affiche();
		System.out.println(p.getNbPoints());
		
	}

}
