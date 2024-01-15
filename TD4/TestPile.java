
public class TestPile {
	public static void main(String[] args) {
		Pile pile = new Pile(10);
		
		for(int i=1 ;i<=10;i++) {
			pile.empile(i);
		}
		
		pile.affiche();
		
	}
}
