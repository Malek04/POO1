import java.util.Scanner;

public class Ex5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un entier de trois chiffres : ");
        int nombre = scanner.nextInt();
        int chiffreUnite = nombre % 10;
        int chiffreDizaine = (nombre / 10) % 10;
        int chiffreCentaine = nombre / 100;
        int somme= chiffreUnite + chiffreDizaine + chiffreCentaine;
        System.out.println("La somme des chiffres de " + nombre + " est : " + somme);
        scanner.close();
    }
}
