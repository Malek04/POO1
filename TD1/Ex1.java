public class Ex1{
	public static void main(String[] args) {
		/* 1
		 * System.out.println("Bonjour 2éme IAG");
		 * System.out.println("Bienvenue à FSEG Nabeul");
		 */
		//2//
		if (args[0]!="") {
			System.out.println("Bonjour "+args[0]);
		}
		else {
			System.out.println("Bonjour vide");
		}
	}
}