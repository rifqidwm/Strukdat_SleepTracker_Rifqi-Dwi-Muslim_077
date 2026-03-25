public class TidurSiang extends SesiTidur {

    public TidurSiang(int durasi) {
        super("Tidur Siang", durasi);
    }

    @Override
    public int hitungSkor() {
        if (durasi >= 420 && durasi <= 540) return 100;
        else if (durasi >= 360) return 80;
        else if (durasi >= 180) return 60;
        else return 30;
    }
}
