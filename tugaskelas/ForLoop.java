package tugaskelas;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("Bilangan genap dari 1 sampai 20:");

        // Menggunakan for-loop untuk iterasi dari 1 sampai 20
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

