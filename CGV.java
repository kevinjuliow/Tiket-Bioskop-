package UTS_2;

import java.util.Scanner;
import java.util.Arrays;

public class CGV extends TiketBioskop {

    private int normal = 45000;
    private int goldClass = 80000;
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

    public int getGoldClass() {
        return goldClass;
    }

    @Override
    int hargaHarian() {
        return (getHari().equalsIgnoreCase("jumat")) ? 15000
                : (getHari().equalsIgnoreCase("sabtu")) ? 20000 : (getHari().equalsIgnoreCase("minggu")) ? 25000 : 0;
    }

    @Override
    void displayFilm() {
        System.out.println("1. Fast And Furious X");
        System.out.println("2. Guardians Of The Galaxy Vol 3 ");
        System.out.println("3. Evil Dead Rise ");
        System.out.println("4. The Little Mermaid");
    }

    @Override
    public double biayaTotal(int x) {
        return x + (x * 0.1);
    }

    public void displayKursiNormal() {
        System.out.println("A1 A2 A3 A4 A5");
        System.out.println("B1 B2 B3 B4 B5");
        System.out.println("C1 C2 C3 C4 C5");
        System.out.println("D1 D2 D3 D4 D5");
    }

    public void displayKursiGoldClass() {
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
                        ((CGV) tiket).displayKursiNormal();
                    } else if (pilihStudio == 2) {
                        ((CGV) tiket).displayKursiGoldClass();
                    }
                    System.out.print("Masukkan kursi yang diinginkan : ");
                    String pilihKursi = scan.next().toUpperCase();
                    ((CGV) tiket).setKursiPilihan(pilihKursi);
    
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
            } else {
                System.out.println("Harap pilih dengan benar!");
            }
            return kursi;
       
    }
}
