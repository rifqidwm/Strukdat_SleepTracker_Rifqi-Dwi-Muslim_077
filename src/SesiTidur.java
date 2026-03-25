public abstract class SesiTidur {
    protected String jenis;
    protected int durasi;

    public SesiTidur(String jenis, int durasi) {
        this.jenis = jenis;
        this.durasi = durasi;
    }

    public int getDurasi() {
        return durasi;
    }

    public String getJenis() {
        return jenis;
    }

    public abstract int hitungSkor();

    public String getRingkasan() {
        int skor = hitungSkor();
        String keterangan = "";

        if (skor == 100) {
            keterangan = "Udah ideal, badan kamu dapet recovery yang baik.";
        } else if (skor >= 80) {
            keterangan = "Lumayan oke, tinggal dibenerin dikit.";
        } else if (skor >= 60) {
            keterangan = "Masih kurang, coba benerin waktu tidur lagi ya.";
        } else {
            keterangan = "Kurang banget, hayoo tidur berlebihan maupun kekurangan ga baik yaa.";
        }

        return jenis + " | " + durasi + " menit | Skor: " + skor + "\n " + keterangan;
    }
}
