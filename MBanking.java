package UTS_2;

public class MBanking extends JenisPembayaran{
    @Override
    public String virtualAccount() {
        return "122"+user.getNoTelp();
    }

    @Override
    public double biayaAdmin(int x) {
        return x + 2000;
    }
}
