
public class Ex3 {
	public static void main(String[] args) {
		//boucle while
		int i=0,s=0;
		while(i<=100) {
			s+=i;
			i+=5;
		}
		System.out.println(s);
		//boucle for
		int somme=0;
		for(int j=0;j<=100;j+=5) {
			somme+=j;
		}
		System.out.println(somme);
	}
}
