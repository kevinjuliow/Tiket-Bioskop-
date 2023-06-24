package UTS_2;

public abstract class JenisPembayaran implements BiayaAdmin {
    User user;
    String idBooking;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getIdBooking() {
        return user.getNoTelp() + user.getUsername();
    }

    public abstract String virtualAccount();

}
