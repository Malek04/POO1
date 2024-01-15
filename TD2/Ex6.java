
public class Ex6 {
	public static void main(String[] args) {
		switch (Integer.valueOf(args[0]).intValue()) {
			case 1 : System.out.println("Janvier");
				break;
			case 2 : System.out.println("Fevrier");
				break;
			case 3 : System.out.println("Mars");
				break;
			case 4 : System.out.println("Avril");
				break;
			case 5 : System.out.println("Mai");
				break;
			case 6 : System.out.println("Juin");
				break;
			case 7 : System.out.println("Juillet");
				break;
			case 8 : System.out.println("Aout");
				break;
			case 9 : System.out.println("Septembre");
				break;
			case 10 : System.out.println("Octobre");
				break;
			case 11 : System.out.println("Novembre");
				break;
			case 12 : System.out.println("Decembre");
				break;
			default : System.out.println("ce n'est pas un mois");
				break;
		}	
	}
}
