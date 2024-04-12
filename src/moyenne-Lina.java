public class CalculMoyenne {
    
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
        // Exemple d'utilisation de la méthode pour calculer la moyenne d'un tableau de nombres
        double[] nombres = {5.5, 7.2, 10.8, 3.4, 6.1};
        double moyenne = calculerMoyenne(nombres);
        System.out.println("La moyenne des nombres est : " + moyenne);
    }
}
