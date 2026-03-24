public class SaranTidur {

    public static void beriSaran(User user) {
        int total = 0;
        int jumlah = 0;

        for (SesiTidur s : user.getDaftarSesi()) {
            total += s.hitungSkor();
            jumlah++;
        }

        int rata = total / jumlah;

        System.out.println("Skor rata-rata: " + rata);

        if (rata >= 85) {
            System.out.println("Tidurmu udah bagus, tinggal dijaga aja konsistensinya.");
        } else if (rata >= 70) {
            System.out.println("Lumayan oke, tapi masih bisa dibenerin dikit.");
        } else if (rata >= 50) {
            System.out.println("Agak berantakan, coba atur jam tidur lagi.");
        } else {
            System.out.println("Ini sih udah chaos, badan kamu butuh istirahat serius.");
        }
    }
}
