import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double ce,fa;
		System.out.println("donner une degre en celsius");
		ce = sc.nextDouble();
		fa = ce * 9/5 +32;
		System.out.println(fa);
		sc.close();
	}
}
