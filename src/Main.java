import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama kamu: ");
        String nama = input.nextLine();

        User user = new User(nama);

        for (int i = 1; i <= 3; i++) {
            System.out.println("\nSesi ke-" + i);
            System.out.println("Pilih jenis tidur:");
            System.out.println("1. Tidur Siang");
            System.out.println("2. Tidur Malam");
            System.out.println("3. Tidur Nyantai");

            System.out.print("Pilihan (1/2/3): ");
            int pilihan = input.nextInt();
            input.nextLine();

            System.out.print("Durasi (menit): ");
            int durasi = input.nextInt();
            input.nextLine();

            SesiTidur sesi;
            if (pilihan == 1) sesi = new TidurSiang(durasi);
            else if (pilihan == 2) sesi = new TidurMalam(durasi);
            else if (pilihan == 3) sesi = new TidurNyantai(durasi);
            else sesi = new TidurMalam(durasi);

            user.tambahSesi(sesi);
        }

        System.out.println("\n=====================");
        user.tampilkanLaporan();

        System.out.println("\nRekomendasi:");
        SaranTidur.beriSaran(user);

        input.close();
    }
}
