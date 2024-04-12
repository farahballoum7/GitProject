import java.util.Random;

public class SimulationDes {
    public static void main(String[] args) {
        Random random = new Random();
        int resultat = random.nextInt(6) + 1; // Génère un nombre aléatoire entre 1 et 6
        System.out.println("Le résultat du lancer de dé est : " + resultat);
    }
}