
public class Test {
	public static void main(String[] args) {
		Eleve e1 = new Eleve(args[0]);
		for(int i=1 ; i<args.length ; i++) {
			e1.ajouterNote(Integer.valueOf(args[i]).intValue());
		}
		System.out.println(e1.toString());
	}
}
