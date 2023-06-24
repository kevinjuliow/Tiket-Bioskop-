package UTS_2;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class XXI extends TiketBioskop {
    private int normal = 40000;
    private int premier = 70000;
    private int dolby = 85000;

    private int hargaTiket;

    public int getHargaTiket() {
        return hargaTiket;
    }

    public void setHargaTiket(int hargaTiket) {
        this.hargaTiket = hargaTiket;
    }

    public int getNormal() {
        return normal;
    }

    public int getPremier() {
        return premier;
    }

    public int getDolby() {
        return dolby;
    }

    @Override
    int hargaHarian() {
        return (getHari().equalsIgnoreCase("jumat")) ? 5000
                : (getHari().equalsIgnoreCase("sabtu")) ? 10000 : (getHari().equalsIgnoreCase("minggu")) ? 15000 : 0;
    }

    @Override
    void displayFilm() {
        System.out.println("1. Fast And Furious X");
        System.out.println("2. Guardians Of The Galaxy Vol 3 ");
    }

    @Override
    public double biayaTotal(int x) {

        return x + (x * 0.05);
    }

    public void displayKursiNormal() {
        System.out.println("A1 A2 A3 A4 A5");
        System.out.println("B1 B2 B3 B4 B5");
        System.out.println("C1 C2 C3 C4 C5");
        System.out.println("D1 D2 D3 D4 D5");
    }

    public void displayKursiPremier() {
        System.out.println("A1 A2 A3 A4");
        System.out.println("B1 B2 B3 B4");
        System.out.println("C1 C2 C3 C4");
        System.out.println("D1 D2 D3 D4");
        System.out.println("E1 E2 E3 E4");
    }

    public void displayKursiDolby() {
        System.out.println("A1 A2 A3 A4");
        System.out.println("B1 B2 B3 B4");
        System.out.println("C1 C2 C3 C4");
        System.out.println("D1 D2 D3 D4");
    }

    String[] pesanKursi(char tanya, TiketBioskop tiket, int pilihStudio, String[] kursi) {
        Scanner scan = new Scanner(System.in);
        if (tanya == 'Y') {
            int index = -1;
            boolean kursiTersedia = false;
            do {
                if (pilihStudio == 1) {
                    ((XXI) tiket).displayKursiNormal();
                } else if (pilihStudio == 2) {
                    ((XXI) tiket).displayKursiPremier();
                } else if (pilihStudio == 3) {
                    ((XXI) tiket).displayKursiDolby();
                }
                System.out.print("Masukkan kursi yang diinginkan : ");
                String pilihKursi = scan.next().toUpperCase();
                ((XXI) tiket).setKursiPilihan(pilihKursi);

                for (int j = 0; j < kursi.length; j++) {
                    if (kursi[j].equals(pilihKursi)) {
                        index = j;
                        kursiTersedia = true;
                        break;
                    }
                }
                if (kursiTersedia) {
                    for (int j = index; j < kursi.length - 1; j++) {
                        kursi[j] = kursi[j + 1];
                    }
                    kursi = Arrays.copyOf(kursi, kursi.length - 1);
                    return kursi;
                } else {
                    System.out.println("Maaf, kursi tidak tersedia.");
                }
            } while (!kursiTersedia);
        } else if (tanya != 'N') {
            System.out.println("Harap pilih dengan benar!");
        }
        return kursi;
    }
}
