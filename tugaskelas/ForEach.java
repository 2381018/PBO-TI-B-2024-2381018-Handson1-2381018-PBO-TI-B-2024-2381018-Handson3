package tugaskelas;

public class ForEach {
    public static void main(String[] args) {
        // Membuat array yang berisi angka dari 1 hingga 20
        int[] angka = new int[20];
        for (int i = 0; i < 20; i++) {
            angka[i] = i + 1;
        }

        System.out.println("Bilangan genap dari 1 sampai 20:");

        // Menggunakan for-each untuk mencari bilangan genap
        for (int num : angka) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}