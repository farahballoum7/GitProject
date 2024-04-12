import java.util.Random;

public class CalculMoyenneAleatoire {
    
    // Méthode pour générer un tableau de nombres aléatoires
    public static double[] genererTableau(int taille, double min, double max) {
        double[] tableau = new double[taille];
        Random random = new Random();
        
        // Remplissage du tableau avec des nombres aléatoires dans la plage spécifiée
        for (int i = 0; i < taille; i++) {
            tableau[i] = min + (max - min) * random.nextDouble();
        }
        
        return tableau;
    }
    
    // Méthode pour calculer la moyenne d'un tableau de nombres
    public static double calculerMoyenne(double[] tableau) {
        double somme = 0;
        
        // Calcul de la somme de tous les éléments du tableau
        for (double nombre : tableau) {
            somme += nombre;
        }
        
        // Calcul de la moyenne
        double moyenne = somme / tableau.length;
        return moyenne;
    }
    
    public static void main(String[] args) {
        // Génération d'un tableau de nombres aléatoires
        int taille = 10;
        double min = 0;
        double max = 100;
        double[] nombresAleatoires = genererTableau(taille, min, max);
        
        // Affichage du tableau généré
        System.out.println("Tableau généré : ");
        for (double nombre : nombresAleatoires) {
            System.out.print(nombre + " ");
        }
        System.out.println(); // Pour sauter une ligne
        
        // Calcul de la moyenne du tableau généré
        double moyenne = calculerMoyenne(nombresAleatoires);
        System.out.println("La moyenne des nombres est : " + moyenne);
    }
}
