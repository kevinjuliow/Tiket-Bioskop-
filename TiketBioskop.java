package UTS_2;

public abstract class TiketBioskop {

    private String hari;
    private String pilihMall, jamNonton;
    private String jenisStudio;
    private String film;
    private String kursiPilihan;

    public String getKursiPilihan() {
        return kursiPilihan;
    }

    public void setKursiPilihan(String kursiPilihan) {
        this.kursiPilihan = kursiPilihan;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public String getJenisStudio() {
        return jenisStudio;
    }

    public void setJenisStudio(String jenisStudio) {
        this.jenisStudio = jenisStudio;
    }

    public String getHari() {
        return hari;
    }

    public String getJamNonton() {
        return jamNonton;
    }

    public void setJamNonton(String jamNonton) {
        this.jamNonton = jamNonton;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getPilihMall() {
        return pilihMall;
    }

    public void setPilihMall(String pilihMall) {
        this.pilihMall = pilihMall;
    }

    abstract int hargaHarian();

    abstract void displayFilm();

    abstract String[] pesanKursi(char tanya, TiketBioskop tiket, int pilihStudio, String[] kursi);

    abstract double biayaTotal(int x);

}
