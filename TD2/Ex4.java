public class Ex4 {

    public static void main(String[] args) {
    	int somme = 0;
        int count = 0;
        int i = 2;
        int k = 102;
        while (count < 100) {
            int p = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    p++;
                    break;
                }
            }
            if (p == 0) {
                somme+=i;
                count++;
            }
            i++;
        }
        System.out.println(somme);
    }
}