import java.util.Scanner; // Import kelas Scanner

public class Main {
    public static void main(String[] args) {
        // Deklarasi variabel dan tipe data
        int angka = 10;
        float pecahan = 3.14f; // Gunakan tanda f setelah pecahan
        char karakter = 'A';

        // Output
        System.out.println("Variabel dan Tipe Data:");
        System.out.println("Angka: " + angka);
        System.out.println("Pecahan: " + pecahan);
        System.out.println("Karakter: " + karakter);

        // Array satu dimensi
        int[] arraySatuDimensi = {1, 2, 3, 4, 5};

        System.out.println("\nArray Satu Dimensi:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Elemen " + i + ": " + arraySatuDimensi[i]);
        }

        // Array multidimensi dan for
        int[][] arrayMultiDimensi = {{1, 2, 3}, {4, 5, 6}};

        System.out.println("\nArray Multidimensi:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Elemen " + i + "," + j + ": " + arrayMultiDimensi[i][j]);
            }
        }

        // Penggunaan if dan for
        int nilai = 85;

        if (nilai >= 60) {
            System.out.println("\nAnda lulus!");
        } else {
            System.out.println("\nAnda tidak lulus.");
        }

        // Penggunaan while
        int counter = 0;
        while (counter < 5) {
            System.out.println("\nNilai counter: " + counter);
            counter++;
        }

        // Penggunaan do while
        int bilangan = 1;
        do {
            System.out.println("Bilangan: " + bilangan);
            bilangan++;
        } while (bilangan <= 5);

        // Input
        Scanner scanner = new Scanner(System.in);
        int inputAngka;
        System.out.print("\nMasukkan sebuah angka: ");
        inputAngka = scanner.nextInt();
        System.out.println("Anda memasukkan: " + inputAngka);

        // Komentar
        // Ini adalah komentar satu baris
        /*
        Ini adalah komentar
        beberapa baris
        */
    }
}
