package UTS_2;

public class GoPay extends JenisPembayaran{
    @Override
    public String virtualAccount() {
        return "37001"+user.getNoTelp();
    }

    @Override
    public double biayaAdmin(int x) {
        return x + 1500;
    }
}
