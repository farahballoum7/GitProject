public class suite {
    public static void main(String[] args) {
        int n = 10; // Nombre d'éléments dans la suite de Fibonacci
        int a = 0, b = 1;
        System.out.print("Suite de Fibonacci : ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
