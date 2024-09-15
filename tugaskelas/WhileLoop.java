package tugaskelas;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;

        System.out.println("Bilangan genap dari 1 sampai 20:");

        // Menggunakan while-loop untuk iterasi dari 1 sampai 20
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}

