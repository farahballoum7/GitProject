public class Matrice {

    // Méthode pour additionner deux matrices
    public static int[][] additionnerMatrices(int[][] matrice1, int[][] matrice2) {
        int lignes = matrice1.length;
        int colonnes = matrice1[0].length;
        
        int[][] resultat = new int[lignes][colonnes];
        
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                resultat[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }
        
        return resultat;
    }

    public static void main(String[] args) {
        // Définir deux matrices
        int[][] matrice1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrice2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        // Appeler la méthode additionnerMatrices
        int[][] resultat = additionnerMatrices(matrice1, matrice2);

        // Afficher le résultat
        System.out.println("Résultat de l'addition des matrices :");
        for (int i = 0; i < resultat.length; i++) {
            for (int j = 0; j < resultat[0].length; j++) {
                System.out.print(resultat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
