import java.util.Scanner;
import java.util.Random;
public class NombreHasard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String rejouer;
        do {
            int nombreSecret = rand.nextInt(10) + 1; // nombre entre 1 et        10
            int tentative = 0;
            boolean trouve = false;
            System.out.println(nombreSecret);
            System.out.println("Un nombre entre 1 et 10 a été choisi. À vous de le deviner !");
            while (tentative < 3 && !trouve) {
                System.out.print("Tentative " + (tentative + 1) + " : ");
                int proposition = sc.nextInt();
                tentative++;
                if (proposition == nombreSecret) {
                    System.out.println("Bravo, nombre trouvé !!");
                    trouve = true;
                }
            }
            if (!trouve) {
                System.out.println("Échec, nombre non trouvé. Le nombre était : " + nombreSecret);
            }
            System.out.print("Voulez-vous rejouer ? (oui/non) : ");
            rejouer = sc.next( );
        } while (rejouer.equalsIgnoreCase("oui"));
        System.out.println("Merci d'avoir joué !");
        sc.close();
    }
}