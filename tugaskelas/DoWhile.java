package tugaskelas;

public class DoWhile {
    public static void main(String[] args) {
        int angka = 1;

        System.out.println("Bilangan genap dari 1 sampai 20:");

        do {
            if (angka % 2 == 0) {
                System.out.print(angka + " ");
            }
            angka++;
        } while (angka <= 20);
    }
}
