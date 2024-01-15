public class Ex3 {

	static int f1(int a , int b) {
		a++;
		b++;
		System.out.println(a+" "+b);
		a=a+b;
		return a;
	}

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		System.out.println(a+" "+b);
		f1(b,a);
		System.out.println(a+" "+b);
		b=f1(b,a);
		System.out.println(a+" "+b);
	}

}
