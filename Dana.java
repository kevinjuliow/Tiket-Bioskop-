package UTS_2;

public class Dana extends JenisPembayaran{
    @Override
    public String virtualAccount() {
        return "1255"+user.getNoTelp();
    }

    @Override
    public double biayaAdmin(int x) {
        return x + 1000;
    }
}
