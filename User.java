package UTS_2;

public class User {
    private String namaDepan, namaBelakang, username, email, password;
    private int usia, noTelp;

    public User(String namaDepan, String namaBelakang, String username, String email, String password, int usia,
            int noTelp) {
        setNamaDepan(namaDepan);
        setNamaBelakang(namaBelakang);
        setUsername(username);
        setPassword(password);
        setEmail(email);
        setUsia(usia);
        setNoTelp(noTelp);
    }

    public User() {
    }

    // Setter getter
    public String getNamaDepan() {
        return namaDepan;
    }

    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public int getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(int noTelp) {
        this.noTelp = noTelp;
    }
}
