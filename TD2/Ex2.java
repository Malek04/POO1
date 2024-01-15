import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		String c;
		Double n,s=0.0,max=0.0;
		int index=0;
		String[] Noms = new String[10];
		Double[] Notes = new Double[10];
		
		for(int i=0;i<10;i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("entrer votre nom");
			c = sc.next();
			Noms[i] = c;
			System.out.println("entrer votre note");
			n = sc.nextDouble();
			Notes[i] = n;
			s+=n;
			if (Notes[i]>max){
				max=Notes[i];
				index = i;
			}
		}
		for(int i=0;i<10;i++) {
			System.out.println("Nom: "+Noms[i]+" Note: "+Notes[i]);
		}
		System.out.println("la moyenne de tout les notes est "+s/10);
		System.out.println("la meilleur note est: "+max);
		System.out.println("la personne qui a la meilleur note est: "+Noms[index]);
	}
}
