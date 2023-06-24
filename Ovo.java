package UTS_2;

public class Ovo extends JenisPembayaran{
    @Override
    public String virtualAccount() {
        return "39358"+user.getNoTelp();
    }


    @Override
    public double biayaAdmin(int x) {
        return x + 1500;
    }
}
