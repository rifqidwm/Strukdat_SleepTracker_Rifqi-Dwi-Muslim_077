public class TidurMalam extends SesiTidur {

    public TidurMalam(int durasi) {
        super("Tidur Malam", durasi);
    }

    @Override
    public int hitungSkor() {
        if (durasi >= 420 && durasi <= 540) return 100;
        else if (durasi >= 360) return 80;
        else if (durasi >= 180) return 60;
        else return 30;
    }
}
