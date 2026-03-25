import java.util.ArrayList;

public class User {
    private String nama;
    private ArrayList<SesiTidur> daftarSesi;

    public User(String nama) {
        this.nama = nama;
        this.daftarSesi = new ArrayList<>();
    }

    public void tambahSesi(SesiTidur sesi) {
        daftarSesi.add(sesi);
    }

    public void tampilkanLaporan() {
        System.out.println("Laporan Tidur: " + nama);
        for (SesiTidur s : daftarSesi) {
            System.out.println(s.getRingkasan());
        }
    }

    public ArrayList<SesiTidur> getDaftarSesi() {
        return daftarSesi;
    }
}
