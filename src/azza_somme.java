import fr.jussieu.script.*;

public class Methodes{    
    /**
     * Méthode qui calcule la somme de ses 3 paramètres entiers.
     */
    public static int somme3(int a, int b, int c)
    {
        return a+b+c;
    }
    
    /**
     * Méthode qui prend un paramètre un tableau d'entier et
     * calcule la somme des entiers du tableau.
     * @param a le tableau d'entiers.
     * @return la somme des valeurs contenues dans le tableau.
     */    
    public static int somme_tab(int [] a)
    {
        int somme = 0;

        for (int i=0; i < a.length; i++)
            somme = somme + a[i];

        return somme;
    }
    
    /**
     * Méthode qui prend un paramètre un tableau d'entier et calcule la
     * moyenne des entiers du tableau, en utilisant la méthode <CODE>somme_tab()</CODE>.
     * @param a le tableau d'entiers.
     * @return la moyenne des valeurs contenues dans le tableau.
     */
    public static double moyenne_tab(int [] a)
    {
        double somme = somme_tab(a);
        return somme / a.length;
    }
    
    /**
     * Méthode qui calcule une somme de carrés.
     * @param x l'indice de départ.
     * @param y l'indice d'arrivée.
     * @return la somme <CODE>&Sigma;<SUB>k=x</SUB><SUP>y</SUP>k<SUP>2</SUP></CODE>
     * des carrés des nombres compris entre <CODE>x</CODE> et <CODE>y</CODE>.
     */
    public static int somme_carres(int x, int y)
    {
        int s = 0;
        for (int i = x; i <= y; i++)
            s = s + i*i;
        return s;
    }
    
    /**
     * Méthode qui prend en paramètre un tableau de <CODE>char</CODE>
     * et renvoie un tableau renversé.
     * @param t le tableau de <CODE>char</CODE>.
     * @return un tableau contenant les caractères de <CODE>t</CODE>
     * en ordre inversé.
     */
    public static char [] renverse(char [] t)
    {
        char [] res;
        res = new char [t.length];
        for (int i = 0; i < t.length; i++)
            res[i] = t[t.length-i-1];
        return res;
    }
                            
    /**
     * Méthode qui teste si un tableau de char est un palindrome.
     */
    public static boolean est_palindrome(char [] t)
    {
        char [] res = renverse(t);
        for (int i = 0; i < t.length; i++)
            if (res[i] != t[i])
                return false;
        return true;
    }    

    /**
     * Méthode qui teste si un point (a,b) est strictement à
     * l'intérieur d'un cercle de centre (x,y) et de rayon r.
     */
    public static boolean est_interne(int a, int b, int x, int y, double r)
    {
        double distance;
        distance = Math.sqrt((x-a)*(x-a) + (y-b)*(y-b));
        return distance < r;
    }

    /**
     * Méthode qui, étant donnés 2 carrés de base horizontale, donnés
     * par coin inférieur gauche et longueur de côté, teste si le
     * second carré est "inclus" dans le premier.
     */
    public static boolean est_contenu_dans(int x1, int y1, int c1, int x2, int y2, int c2)
    {
        return (x2 >= x1) && (y2 >= y1) && (x2+c2 <= x1+c1) && (y2+c2 <= y1+c1);
    }

    /**
     * Méthode qui teste si un entier est premier.
     */
    public static boolean est_premier(int p)
    {
        if (p <= 1)
            return false;
        for (int  i = 2; i <= p-1; i++)
            if (p%i == 0)
                return false;

        // si on arrive ici, on sait que pour tout i de 2,...,p-1,
        // l'entier p n'est pas divisible par i.
        return true;
    }

    /**
     * Méthode qui prend en paramètre 2 tableaux d'entiers supposés de
     * même taille et renvoie le tableau "somme".
     */
    public static int [] somme_2tab(int [] t1, int [] t2)
    {
        int [] res = new int [t1.length];
        for (int i = 0; i < t1.length; i++)
            res[i] = t1[i] + t2[i];
        return res;
    }    

    /**
     * Méthode qui compte le nombre de multiples de n dans un tableau t.
     */
    public static int nombre_multiples(int [] t, int n)
    {
        int nb_mul = 0;
        for (int i = 0; i < t.length; i++)
            if (t[i] % n == 0)
                nb_mul++;
        return nb_mul;
    }

    
    /**
     * Méthode de saisie d'un tableau d'entiers (non écrite en cours-TD).
     * @return le tableau saisi par l'utilisateur.
     */
    public static int [] readTableauInt()
    {
        int n;
        do
            {
                Deug.print("Entrez la taille (positive) du tableau : ");
                n = Deug.readInt();
            }
        while (n <= 0);

        int [] t = new int [n];
        
        for (int i = 0; i < n; i++)
            {
                Deug.print("Entrez t[" + i + "] : ");
                t[i] = Deug.readInt();
            }
        return t;
    }
    
    
    public static void main (String args[])
    {
        // Ici, on peut tester les fonctions précédentes...
        // Exemple
        int [] t = readTableauInt();
        Deug.print("Entrez un entier : ");
        int n = Deug.readInt();
        Deug.println("Il y a " + nombre_multiples(t,n) + " entiers dans le tableau divisibles par " + n);
    }
}