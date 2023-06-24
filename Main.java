package UTS_2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    static String[] kursiNormalCGV = {"A1", "A2", "A3", "A4", "A5", "B1", "B2", "B3", "B4", "B5", "C1", "C2", "C3",
        "C4", "C5", "D1", "D2", "D3", "D4", "D5"};
    static String[] kursiGoldClassCGV = {"A1", "A2", "A3", "A4", "B1", "B2", "B3", "B4", "C1", "C2", "C3", "C4", "D1",
        "D2", "D3", "D4"};
    static String[] kursiNormalCINEPLEX = {"A1", "A2", "A3", "A4", "A5", "B1", "B2", "B3", "B4", "B5", "C1", "C2",
        "C3", "C4", "C5", "D1", "D2", "D3", "D4", "D5"};
    static String[] kursiPremiumCINEPLEX = {"A1", "A2", "A3", "A4", "A5", "B1", "B2", "B3", "B4", "B5", "C1", "C2",
        "C3", "C4", "C5"};
    static String[] kursiNormalXXI = {"A1", "A2", "A3", "A4", "A5", "B1", "B2", "B3", "B4", "B5", "C1", "C2", "C3",
        "C4", "C5", "D1", "D2", "D3", "D4", "D5"};
    static String[] kursiPremierXXI = {"A1", "A2", "A3", "A4", "B1", "B2", "B3", "B4", "C1", "C2", "C3", "C4", "D1",
        "D2", "D3", "D4", "E1", "E2", "E3", "E4"};
    static String[] kursiDolbyXXI = {"A1", "A2", "A3", "A4", "B1", "B2", "B3", "B4", "C1", "C2", "C3", "C4", "D1",
        "D2", "D3", "D4"};
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LocalDate tanggal = LocalDate.now();
        // scan.useDelimiter("\n");
        String input;
        do {
            System.out.println("=======Selamat Datang di Website Resmi Kami=======");
            System.out.println("-----------------Nonton Film Yuk!-----------------");
            System.out.println("Tekan tombol apapun untuk melanjutkan atau tekan tombol 'q' untuk keluar ");
            input = scan.nextLine();
        } while (input.isEmpty());

        if (input.equalsIgnoreCase("q")) {
            System.out.println("Terima kasih...");
            System.exit(0);
        }
        User user = new User();
        System.out.println("==================================================================================");
        System.out.println("\t\t\tDaftar Akun");
        System.out.print("Masukkan Nama Depan Anda\t\t: ");
        user.setNamaDepan(scan.next());
        System.out.print("Masukkan Nama Belakang Anda\t\t: ");
        user.setNamaBelakang(scan.next());
        System.out.print("Masukkan Username Anda\t\t\t: ");
        user.setUsername(scan.next());
        System.out.print("Masukkan Password Anda\t\t\t: ");
        user.setPassword(scan.next());
        System.out.print("Masukkan Email Anda\t\t\t: ");
        user.setEmail(scan.next());
        while (true) {
            user.setUsia(inputInt("Masukkan Usia Anda\t\t\t: "));
            if (user.getUsia() < 6) {
                System.out.println("Harap masukkan usia dengan benar! (tidak boleh dibawah 6 tahun)\n");
            } else {
                break;
            }
        }
        do {
            user.setNoTelp(inputInt("Masukkan Nomor Telpon\t\t\t: "));
            if (user.getNoTelp() < 0) {
                System.out.println("Harap masukkan no telpon dengan benar!\n");
            }
        } while (user.getNoTelp() < 0);

        int pilihan = 1;
        do {
            System.out.println("================================================================");
            int jmlTiket;
            while (true) {
                jmlTiket = (inputInt("Masukkan jumlah tiket yang diinginkan   : "));
                if (jmlTiket <= 0) {
                    System.out.println("Harap masukkan jumlah tiket dengan benar!\n");
                } else {
                    break;
                }
            }
            TiketBioskop tiket[] = new TiketBioskop[jmlTiket];

            for (int i = 0; i < tiket.length; i++) {
                System.out.println("\n--------Tiket " + (i + 1) + "--------");
                System.out.println("\nBioskop yang tersedia : \n1. CGV Studio\n2. Cineplex Studio\n3. XXI Studio\n");
                int pilihBioskop;
                while (true) {
                    pilihBioskop = inputInt("Masukkan bioskop yang diinginkan : ");
                    if (1 <= pilihBioskop && pilihBioskop <= 3) {
                        break;
                    } else {
                        System.out.println("Input salah, harap masukkan pilihan dengan benar!\n");
                    }
                }
                System.out.println("");

                //
                //
                //
                // ======================================== BIOSKOP 1
                char tanya = 'N';

                if (pilihBioskop == 1) {
                    while (tanya != 'Y') {
                        tiket[i] = new CGV();
                        System.out.println("Mall yang tersedia :\n1. Pakuwon Mall Yogyakarta\n2. Transmart\n");
                        int pilihMall;
                        while (true) {
                            pilihMall = inputInt("Masukkan mall yang diinginkan : ");
                            if (1 <= pilihMall && pilihMall <= 2) {
                                break;
                            } else {
                                System.out.println("Input salah, harap masukkan pilihan dengan benar!\n");
                            }
                        }
                        String mall = pilihMall == 1 ? "Pakuwon Mall Yogyakarta" : "Transmart";
                        tiket[i].setPilihMall(mall);
                        if (pilihMall == 1) {
                            System.out.println(
                                    "Pakuwon Mall, Jl. Ring Road Utara, Kaliwaru, Condongcatur,  Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta\n");
                        } else if (pilihMall == 2) {
                            System.out.println(
                                    "Transmart, Jl. Raya Solo KM.8 No.234, Corongan, Maguwoharjo, Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta\n");
                        }
                        System.out.println("Jenis studio yang tersedia :\n1. Normal Studio\n2. Gold Class Studio\n");
                        int pilihStudio;
                        while (true) {
                            pilihStudio = inputInt("Masukkan pilihan studio : ");
                            if (1 <= pilihStudio && pilihStudio <= 2) {
                                break;
                            } else {
                                System.out.println("Input salah, harap masukkan pilihan dengan benar!\n");
                            }
                        }
                        String studio = pilihStudio == 1 ? "Normal Studio" : pilihBioskop == 2 ? "Gold Class Studio" : null;
                        tiket[i].setJenisStudio(studio);

                        System.out.println("");
                        ((CGV) tiket[i]).displayFilm();
                        System.out.println("");
                        int pilihFilm;
                        while (true) {
                            pilihFilm = inputInt("Masukkan film yang diinginkan : ");
                            if (1 <= pilihFilm && pilihFilm <= 4) {
                                break;
                            } else {
                                System.out.println("Input salah, harap masukkan pilihan dengan benar!\n");
                            }
                        }
                        String filmPilihan = pilihFilm == 1 ? "Fast and Furious X"
                                : pilihFilm == 2 ? "Guardians Of The Galaxy Vol 3"
                                        : pilihFilm == 3 ? "Evil Dead Rise " : "The Little Mermaid";
                        tiket[i].setFilm(filmPilihan);
                        System.out.println("\nHari Nonton");
                        System.out.println("1. Senin \n2. Selasa \n3. Rabu \n4. Kamis \n5. Jumat \n6. Sabtu \n7. Minggu\n");
                        int pilihHari;
                        while (true) {
                            pilihHari = inputInt("Masukkan hari nonton : ");
                            if (1 <= pilihHari && pilihHari <= 7) {
                                break;
                            } else {
                                System.out.println("Input salah, harap masukkan pilihan dengan benar!\n");
                            }
                        }
                        String hari = pilihHari == 1 ? "Senin" : pilihHari == 2 ? "Selasa" : pilihHari == 3 ? "Rabu" : pilihHari == 4 ? "Kamis" : pilihHari == 5 ? "Jumat" : pilihHari == 6 ? "Sabtu" : pilihHari == 7 ? "Minggu" : null;
                        tiket[i].setHari(hari);

                        System.out.println("");
                        if (pilihMall == 1) {
                            System.out.println("1. 12:00\n2. 15:30\n3. 18:00\n4. 20:00\n5. 21:00\n");
                            int jam;
                            while (true) {
                                jam = inputInt("Pilih jam nonton yang diinginkan : ");
                                if (1 <= jam && jam <= 5) {
                                    break;
                                } else {
                                    System.out.println("Input salah, harap masukkan pilihan dengan benar!\n");
                                }
                            }
                            String jamNonton = jam == 1 ? "12:00"
                                    : jam == 2 ? "15:30" : jam == 3 ? "18:00" : jam == 4 ? "20:00" : "21:00";
                            tiket[i].setJamNonton(jamNonton);
                        } else if (pilihMall == 2) {
                            System.out.println("1. 13:00\n2. 14:30\n3. 17:00\n4. 19:45\n5. 21:05\n");
                            int jam;
                            while (true) {
                                jam = inputInt("Pilih jam nonton yang diinginkan : ");
                                if (1 <= jam && jam <= 5) {
                                    break;
                                } else {
                                    System.out.println("Input salah, harap masukkan pilihan dengan benar!\n");
                                }
                            }
                            String jamNonton = jam == 1 ? "13:00"
                                    : jam == 2 ? "14:30" : jam == 3 ? "17:00" : jam == 4 ? "19:45" : "21:05";
                            tiket[i].setJamNonton(jamNonton);
                        }
                        do {
                            System.out.print("\nApakah ingin beli tiket?\nPilih (Y/N) :  ");
                            tanya = scan.next().toUpperCase().charAt(0);
                        } while (tanya != 'Y' && tanya != 'N');
                        System.out.println("");
                        if (tanya == 'N') {
                            continue;
                        }

                        switch (pilihStudio) {
                            case 1:
                                kursiNormalCGV = ((CGV) tiket[i]).pesanKursi(tanya, tiket[i], pilihStudio, kursiNormalCGV);
                                System.out.println("\n-----Bioskop CGV-----");
                                ((CGV) tiket[i]).setJenisStudio("Normal Studio");
                                System.out.println("Jenis studio      : Normal");
                                System.out.println("Hari nonton       : " + ((CGV) tiket[i]).getHari());
                                System.out.println("Jam nonton        : " + ((CGV) tiket[i]).getJamNonton());
                                System.out.println("Kursi             : " + ((CGV) tiket[i]).getKursiPilihan());
                                System.out.println("Film yang dipilih : " + ((CGV) tiket[i]).getFilm());
                                System.out.println("Jadwal nonton     : " + ((CGV) tiket[i]).getHari());
                                ((CGV) tiket[i]).setHargaTiket(((CGV) tiket[i]).getNormal() + ((CGV) tiket[i]).hargaHarian());
                                System.out.println("Harga tiket       : Rp." + ((CGV) tiket[i]).getHargaTiket());
                                System.out.println("Biaya + admin     : Rp." + ((CGV) tiket[i]).biayaTotal(((CGV) tiket[i]).getHargaTiket()));
                                break;
                            case 2:
                                kursiGoldClassCGV = ((CGV) tiket[i]).pesanKursi(tanya, tiket[i], pilihStudio,
                                        kursiGoldClassCGV);
                                System.out.println("\n-----Bioskop CGV-----");
                                ((CGV) tiket[i]).setJenisStudio("Gold Class Studio");
                                System.out.println("Jenis studio      : Gold Class Studio");
                                System.out.println("Hari nonton       : " + ((CGV) tiket[i]).getHari());
                                System.out.println("Jam nonton        : " + ((CGV) tiket[i]).getJamNonton());
                                System.out.println("Kursi             : " + ((CGV) tiket[i]).getKursiPilihan());
                                System.out.println("Film yang dipilih : " + ((CGV) tiket[i]).getFilm());
                                System.out.println("Jadwal nonton     : " + ((CGV) tiket[i]).getHari());
                                ((CGV) tiket[i]).setHargaTiket(((CGV) tiket[i]).getGoldClass() + ((CGV) tiket[i]).hargaHarian());
                                System.out.println("Harga tiket       : Rp." + ((CGV) tiket[i]).getHargaTiket());
                                System.out.println("Biaya + admin     : Rp."
                                        + ((CGV) tiket[i]).biayaTotal(((CGV) tiket[i]).getHargaTiket()));

                        }
                    }

                } //
                //
                //
                // ===================================================== BIOSKOP 2
                else if (pilihBioskop == 2) {
                    while (tanya != 'Y') {
                        tiket[i] = new CINEPLEX();
                        System.out.println("Mall yang tersedia :\n1. QBig\n2. Living World\n");
                        int pilihMall;
                        while (true) {
                            pilihMall = inputInt("Masukkan mall yang diinginkan : ");
                            if (1 <= pilihMall && pilihMall <= 2) {
                                break;
                            } else {
                                System.out.println("Input salah, harap masukkan pilihan dengan benar!\n");
                            }
                        }
                        String mall = pilihMall == 1 ? "QBig" : "Living World";
                        tiket[i].setPilihMall(mall);
                        if (pilihMall == 1) {
                            System.out.println("Q Big, Jl. Dewan Karang Nongko, Corongan, "
                                    + " Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta\n");
                        } else if (pilihMall == 2) {
                            System.out.println("Living World, Jl. Abimayu, Krajan, Wedomartani, "
                                    + " Kec. Ngemplak, Kabupaten Sleman, Daerah Istimewa Yogyakarta\n");
                        }

                        System.out.println("Jenis studio yang tersedia :\n1. Normal Studio\n2. Premium Studio\n");
                        int pilihStudio;
                        while (true) {
                            pilihStudio = inputInt("Masukkan pilihan studio : ");
                            if (1 <= pilihStudio && pilihStudio <= 2) {
                                break;
                            } else {
                                System.out.println("Input salah, harap masukkan pilihan dengan benar!\n");
                            }
                        }
                        String studio = pilihStudio == 1 ? "Normal Studio" : pilihBioskop == 2 ? "Premium Studio" : null;
                        tiket[i].setJenisStudio(studio);

                        System.out.println("");
                        ((CINEPLEX) tiket[i]).displayFilm();
                        System.out.println("");
                        int pilihFilm;
                        while (true) {
                            pilihFilm = inputInt("Masukkan film yang diinginkan : ");
                            if (1 <= pilihFilm && pilihFilm <= 3) {
                                break;
                            } else {
                                System.out.println("Input salah, harap masukkan pilihan dengan benar!\n");
                            }
                        }
                        String filmPilihan = pilihFilm == 1 ? "Fast and Furious X"
                                : pilihFilm == 2 ? "Guardians Of The Galaxy Vol 3"
                                        : pilihFilm == 3 ? "Evil Dead Rise " : "T Evil Dead Rise";
                        tiket[i].setFilm(filmPilihan);
                        System.out.println("\nHari Nonton");
                        System.out.println("1. Senin \n2. Selasa \n3. Rabu \n4. Kamis \n5. Jumat \n6. Sabtu \n7. Minggu\n");
                        int pilihHari;
                        while (true) {
                            pilihHari = inputInt("Masukkan hari nonton : ");
                            if (1 <= pilihHari && pilihHari <= 7) {
                                break;
                            } else {
                                System.out.println("Input salah, harap masukkan pilihan dengan benar!\n");
                            }
                        }
                        String hari = pilihHari == 1 ? "Senin" : pilihHari == 2 ? "Selasa" : pilihHari == 3 ? "Rabu" : pilihHari == 4 ? "Kamis" : pilihHari == 5 ? "Jumat" : pilihHari == 6 ? "Sabtu" : pilihHari == 7 ? "Minggu" : null;
                        tiket[i].setHari(hari);
                        System.out.println("");

                        if (pilihMall == 1) {
                            System.out.println("1. 10:00\n2. 11:30\n3. 18:00\n4. 20:00\n5. 21:30\n");
                            int jam;
                            while (true) {
                                jam = inputInt("Pilih jam nonton yang diinginkan : ");
                                if (1 <= jam && jam <= 5) {
                                    break;
                                } else {
                                    System.out.println("Input salah, harap masukkan pilihan dengan benar!\n");
                                }
                            }
                            String jamNonton = jam == 1 ? "10:00"
                                    : jam == 2 ? "11:30" : jam == 3 ? "18:00" : jam == 4 ? "20:00" : "21:00\n";
                            tiket[i].setJamNonton(jamNonton);
                        } else if (pilihMall == 2) {
                            System.out.println("1. 12:00\n2. 16:30\n3. 17:50\n4. 19:45\n5. 21:10\n");
                            int jam;
                            while (true) {
                                jam = inputInt("Pilih jam nonton yang diinginkan : ");
                                if (1 <= jam && jam <= 5) {
                                    break;
                                } else {
                                    System.out.println("Input salah, harap masukkan pilihan dengan benar!\n");
                                }
                            }
                            String jamNonton = jam == 1 ? "12:00"
                                    : jam == 2 ? "16:30" : jam == 3 ? "17:50" : jam == 4 ? "19:45" : "21:10";
                            tiket[i].setJamNonton(jamNonton);
                        }
                        do {
                            System.out.print("\nApakah ingin beli tiket?\nPilih (Y/N) :  ");
                            tanya = scan.next().toUpperCase().charAt(0);
                        } while (tanya != 'Y' && tanya != 'N');
                        System.out.println("");
                        if (tanya == 'N') {
                            continue;
                        }
                        switch (pilihStudio) {
                            case 1:
                                kursiNormalCINEPLEX = ((CINEPLEX) tiket[i]).pesanKursi(tanya, tiket[i], pilihStudio,
                                        kursiNormalCINEPLEX);
                                System.out.println("\n-----Bioskop CINEPLEX-----");
                                System.out.println("Jenis studio      : Normal Studio");
                                System.out.println("Hari nonton       : " + ((CINEPLEX) tiket[i]).getHari());
                                System.out.println("Jam nonton        : " + ((CINEPLEX) tiket[i]).getJamNonton());
                                System.out.println("Kursi             : " + ((CINEPLEX) tiket[i]).getKursiPilihan());
                                System.out.println("Film yang dipilih : " + filmPilihan);
                                System.out.println("Jadwal nonton     : " + ((CINEPLEX) tiket[i]).getHari());
                                ((CINEPLEX) tiket[i]).setHargaTiket(
                                        ((CINEPLEX) tiket[i]).getNormal() + ((CINEPLEX) tiket[i]).hargaHarian());
                                System.out.println("Harga tiket       : Rp." + ((CINEPLEX) tiket[i]).getHargaTiket());
                                System.out.println("Biaya + admin     : Rp." + ((CINEPLEX) tiket[i]).biayaTotal(
                                    (((CINEPLEX) tiket[i]).getHargaTiket())));
                                break;
                            case 2:
                                kursiPremiumCINEPLEX = ((CINEPLEX) tiket[i]).pesanKursi(tanya, tiket[i], pilihStudio,
                                        kursiPremiumCINEPLEX);
                                System.out.println("\n-----Bioskop CINEPLEX-----");
                                System.out.println("Jenis studio      : Premium Studio");
                                System.out.println("Hari nonton       : " + ((CINEPLEX) tiket[i]).getHari());
                                System.out.println("Jam nonton        : " + ((CINEPLEX) tiket[i]).getJamNonton());
                                System.out.println("Kursi             : " + ((CINEPLEX) tiket[i]).getKursiPilihan());
                                System.out.println("Film yang dipilih : " + filmPilihan);
                                System.out.println("Jadwal nonton     : " + ((CINEPLEX) tiket[i]).getHari());
                                ((CINEPLEX) tiket[i]).setHargaTiket(((CINEPLEX) tiket[i]).getPremium() + ((CINEPLEX) tiket[i]).hargaHarian());
                                System.out.println("Harga tiket       : Rp." + ((CINEPLEX) tiket[i]).getHargaTiket());
                                System.out.println("Biaya + admin     : Rp." + ((CINEPLEX) tiket[i]).biayaTotal(
                                        (((CINEPLEX) tiket[i]).getHargaTiket())));
                                break;
                        }
                    }

                } //
                //
                //
                //
                //
                //
                //
                //
                // ===================================== Bioskop 3
                else if (pilihBioskop == 3) {
                    while (tanya != 'Y') {
                        tiket[i] = new XXI();
                        System.out.println("Mall yang tersedia :\n1. Jogja City\n2. Plaza Ambarrukmo\n");
                        int pilihMall;
                        while (true) {
                            pilihMall = inputInt("Masukkan mall yang diinginkan : ");
                            if (1 <= pilihMall && pilihMall <= 2) {
                                break;
                            } else {
                                System.out.println("Input salah, harap masukkan pilihan dengan benar!");
                            }
                        }
                        String mall = pilihMall == 1 ? "Jogja City" : "Plaza Ambarrukmo";
                        tiket[i].setPilihMall(mall);
                        if (pilihMall == 1) {
                            System.out.println(
                                    "Jogja City, Jl. Magelang No.KM. 6 No. 18, Kutu Patran, Sinduadi, Kec. Mlati, Kabupaten Sleman, Daerah Istimewa Yogyakarta\n");
                        } else if (pilihMall == 2) {
                            System.out.println("Plaza Ambarrukmo, Jl. Laksda Adisucipto No.KM 6.5, Ambarukmo, Caturtunggal, Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta\n");
                        }
                        System.out.println(
                                "Jenis studio yang tersedia :\n1. Normal Studio\n2. Premier Studio\n3. Dolby Studio\n");
                        int pilihStudio;
                        while (true) {
                            pilihStudio = inputInt("Masukkan pilihan studio : ");
                            if (1 <= pilihStudio && pilihStudio <= 3) {
                                break;
                            } else {
                                System.out.println("Input salah, harap masukkan pilihan dengan benar!\n");
                            }
                        }
                        String studio = pilihStudio == 1 ? "Normal Studio"
                                : pilihStudio == 2 ? "Premier Studio" : pilihStudio == 3 ? "Dolby Studio" : null;
                        tiket[i].setJenisStudio(studio);
                        System.out.println("");
                        ((XXI) tiket[i]).displayFilm();
                        int pilihFilm;
                        while (true) {
                            pilihFilm = inputInt("\nMasukkan film yang diinginkan : ");
                            if (1 <= pilihFilm && pilihFilm <= 2) {
                                break;
                            } else {
                                System.out.println("Input salah, harap masukkan pilihan dengan benar!\n");
                            }
                        }
                        String filmPilihan = pilihFilm == 1 ? "Fast and Furious X"
                                : pilihFilm == 2 ? "Guardians Of The Galaxy Vol 3" : "Guardians Of The Galaxy Vol 3";
                        tiket[i].setFilm(filmPilihan);
                        System.out.println("\nHari Nonton");
                        System.out.println("1. Senin \n2. Selasa \n3. Rabu \n4. Kamis \n5. Jumat \n6. Sabtu \n7. Minggu\n");
                        int pilihHari;
                        while (true) {
                            pilihHari = inputInt("Masukkan hari nonton : ");
                            if (1 <= pilihHari && pilihHari <= 7) {
                                break;
                            } else {
                                System.out.println("Input salah, harap masukkan pilihan dengan benar!\n");
                            }
                        }
                        String hari = pilihHari == 1 ? "Senin" : pilihHari == 2 ? "Selasa" : pilihHari == 3 ? "Rabu" : pilihHari == 4 ? "Kamis" : pilihHari == 5 ? "Jumat" : pilihHari == 6 ? "Sabtu" : pilihHari == 7 ? "Minggu" : null;
                        tiket[i].setHari(hari);
                        if (pilihMall == 1) {
                            System.out.println("\n1. 14:00\n2. 16:30\n3. 18:00\n4. 22:00\n5. 23:00\n");
                            int jam;
                            while (true) {
                                jam = inputInt("Pilih jam nonton yang diinginkan : ");
                                if (1 <= jam && jam <= 5) {
                                    break;
                                } else {
                                    System.out.println("Input salah, harap masukkan pilihan dengan benar!\n");
                                }
                            }
                            String jamNonton = jam == 1 ? "14:00"
                                    : jam == 2 ? "16:30" : jam == 3 ? "18:00" : jam == 4 ? "22:00" : "23:00";
                            tiket[i].setJamNonton(jamNonton);

                        } else if (pilihMall == 2) {
                            System.out.println("1. 11:00\n2. 13:30\n3. 17:00\n4. 21:00\n5. 22:00\n");
                            int jam;
                            while (true) {
                                jam = inputInt("Pilih jam nonton yang diinginkan : ");
                                if (1 <= jam && jam <= 5) {
                                    break;
                                } else {
                                    System.out.println("Input salah, harap masukkan pilihan dengan benar!\n");
                                }
                            }
                            String jamNonton = jam == 1 ? "11:00"
                                    : jam == 2 ? "13:30" : jam == 3 ? "17:00" : jam == 4 ? "22:00" : "22:00";
                            tiket[i].setJamNonton(jamNonton);
                        }

                        do {
                            System.out.print("\nApakah ingin beli tiket?\nPilih (Y/N) :  ");
                            tanya = scan.next().toUpperCase().charAt(0);
                        } while (tanya != 'Y' && tanya != 'N');
                        System.out.println("");
                        if (tanya == 'N') {
                            continue;
                        }

                        if (pilihStudio == 1) {
                            kursiNormalXXI = ((XXI) tiket[i]).pesanKursi(tanya, tiket[i], pilihStudio, kursiNormalXXI);
                            System.out.println("\n-----Bioskop XXI-----");
                            System.out.println("Jenis Studio      : Normal Studio");
                            System.out.println("Hari Nonton       : " + ((XXI) tiket[i]).getHari());
                            System.out.println("Jam Nonton        : " + ((XXI) tiket[i]).getJamNonton());
                            System.out.println("Kursi             : " + ((XXI) tiket[i]).getKursiPilihan());
                            System.out.println("Film yang dipilih : " + filmPilihan);
                            System.out.println("Jadwal Nonton     : " + ((XXI) tiket[i]).getHari());
                            ((XXI) tiket[i]).setHargaTiket(((XXI) tiket[i]).getNormal() + ((XXI) tiket[i]).hargaHarian());
                            System.out.println("Harga tiket       : Rp." + ((XXI) tiket[i]).getHargaTiket());
                            System.out.println("Biaya + admin     : Rp." + ((XXI) tiket[i])
                                    .biayaTotal((((XXI) tiket[i]).getHargaTiket())));
                        } else if (pilihStudio == 2) {
                            kursiPremierXXI = ((XXI) tiket[i]).pesanKursi(tanya, tiket[i], pilihStudio, kursiPremierXXI);
                            System.out.println("\n-----Bioskop XXI-----");
                            System.out.println("Jenis studio      : Premier Studio");
                            System.out.println("Hari nonton       : " + ((XXI) tiket[i]).getHari());
                            System.out.println("Jam nonton        : " + ((XXI) tiket[i]).getJamNonton());
                            System.out.println("Kursi             : " + ((XXI) tiket[i]).getKursiPilihan());
                            System.out.println("Film yang dipilih : " + filmPilihan);
                            System.out.println("Jadwal nonton     : " + ((XXI) tiket[i]).getHari());
                            ((XXI) tiket[i]).setHargaTiket(((XXI) tiket[i]).getPremier() + ((XXI) tiket[i]).hargaHarian());
                            System.out.println("Harga tiket       : Rp." + ((XXI) tiket[i]).getHargaTiket());
                            System.out.println("Biaya + admin     : Rp." + ((XXI) tiket[i])
                                    .biayaTotal((((XXI) tiket[i]).getHargaTiket())));
                        } else if (pilihStudio == 3) {
                            kursiDolbyXXI = ((XXI) tiket[i]).pesanKursi(tanya, tiket[i], pilihStudio, kursiDolbyXXI);
                            System.out.println("\n-----Bioskop XXI-----");
                            System.out.println("Jenis studio      : Dolby Studio");
                            System.out.println("Hari nonton       : " + ((XXI) tiket[i]).getHari());
                            System.out.println("Jam nonton        : " + ((XXI) tiket[i]).getJamNonton());
                            System.out.println("Kursi             : " + ((XXI) tiket[i]).getKursiPilihan());
                            System.out.println("Film yang dipilih : " + filmPilihan);
                            System.out.println("Jadwal nonton     : " + ((XXI) tiket[i]).getHari());
                            ((XXI) tiket[i]).setHargaTiket(((XXI) tiket[i]).getDolby() + ((XXI) tiket[i]).hargaHarian());
                            System.out.println("Harga tiket       : Rp." + ((XXI) tiket[i]).getHargaTiket());
                            System.out.println("Biaya + admin     : Rp." + ((XXI) tiket[i])
                                    .biayaTotal((((XXI) tiket[i]).getHargaTiket())));
                        }
                    }

                }
            }

            int hargaTotal = 0;
            System.out.println(
                    "\n\n==================================================================================================================================");
                    System.out.println("\t=================================================INFO TRANSAKSI===================================================");
            for (int i = 0; i < tiket.length; i++) {
                System.out.println("---Tiket " + (i + 1) + "---");
                String jenisBioskop = tiket[i] instanceof CGV ? "CGV"
                        : tiket[i] instanceof CINEPLEX ? "CINEPLEX " : tiket[i] instanceof XXI ? "XXI" : null;
                System.out.println("Jenis Bioskop      : " + jenisBioskop);
                System.out.println("Mall               : " + tiket[i].getPilihMall());
                System.out.println("Jenis Studio       : " + tiket[i].getJenisStudio());
                System.out.println("Hari Nonton        : " + tiket[i].getHari());
                System.out.println("Jam Nonton         : " + tiket[i].getJamNonton());
                System.out.println("Film yang Ditonton : " + tiket[i].getFilm());
                System.out.println("Kursi              : " + tiket[i].getKursiPilihan());
                if (tiket[i] instanceof CGV) {
                    System.out.println("------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Harga Tiket        : Rp." + ((CGV) tiket[i]).getHargaTiket());
                    System.out.println("Harga + Admin      : Rp."
                            + ((CGV) tiket[i]).biayaTotal(((CGV) tiket[i]).getHargaTiket()));
                    hargaTotal += ((CGV) tiket[i]).biayaTotal(((CGV) tiket[i]).getHargaTiket());
                }
                if (tiket[i] instanceof CINEPLEX) {
                    System.out.println("------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Harga Tiket        : Rp." + ((CINEPLEX) tiket[i]).getHargaTiket());
                    System.out.println("Harga + Admin      : Rp."
                            + ((CINEPLEX) tiket[i]).biayaTotal(((CINEPLEX) tiket[i]).getHargaTiket()));
                    hargaTotal += ((CINEPLEX) tiket[i]).biayaTotal(((CINEPLEX) tiket[i]).getHargaTiket());
                }
                if (tiket[i] instanceof XXI) {
                    System.out.println("------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Harga Tiket        : Rp." + ((XXI) tiket[i]).getHargaTiket());
                    System.out.println("Harga + Admin      : Rp."
                            + ((XXI) tiket[i]).biayaTotal(((XXI) tiket[i]).getHargaTiket()));
                    hargaTotal += ((XXI) tiket[i]).biayaTotal(((XXI) tiket[i]).getHargaTiket());
                }

                
            }
            char jawab = 'N';
            JenisPembayaran pembayaran = null;
            System.out.println("=============================================================================================================================");
            System.out.println("Biaya Total        : Rp." + hargaTotal);
            while (jawab != 'Y'){
            System.out.println("\n\t-Jenis Pembayaran-\n1. M-Banking\n2. Ovo\n3. GoPay\n4. Dana");
            int pilihPembayaran;
            while (true) {
                pilihPembayaran = inputInt("\nPilih metode pembayaran : ");
                if (1 <= pilihPembayaran && pilihPembayaran <= 4) {
                    break;
                } else {
                    System.out.println("Input salah, harap masukkan pilihan dengan benar!\n");
                }
            }
           
            System.out.println();
                switch (pilihPembayaran) {
                    case 1:
                        pembayaran = new MBanking();
                        pembayaran.setUser(user);
                        System.out.println("Biaya + Admin   : Rp." + ((MBanking) pembayaran).biayaAdmin(hargaTotal));
                        System.out.println("Virtual Account : " + ((MBanking) pembayaran).virtualAccount());
                        System.out.println("ID BOOKING      : " + pembayaran.getIdBooking());
                        break;
                    case 2:
                        pembayaran = new Ovo();
                        pembayaran.setUser(user);
                        System.out.println("Biaya + Admin   : Rp." + ((Ovo) pembayaran).biayaAdmin(hargaTotal));
                        System.out.println("Virtual Account : " + ((Ovo) pembayaran).virtualAccount());
                        System.out.println("ID BOOKING      : " + pembayaran.getIdBooking());
                        break;
                    case 3:
                        pembayaran = new GoPay();
                        pembayaran.setUser(user);
                        System.out.println("Biaya + Admin   : Rp." + ((GoPay) pembayaran).biayaAdmin(hargaTotal));
                        System.out.println("Virtual Account : " + ((GoPay) pembayaran).virtualAccount());
                        System.out.println("ID BOOKING      : " + pembayaran.getIdBooking());
                        break;
                    case 4:
                        pembayaran = new Dana();
                        pembayaran.setUser(user);
                        System.out.println("Biaya + Admin   : Rp." + ((Dana) pembayaran).biayaAdmin(hargaTotal));
                        System.out.println("Virtual Account : " + ((Dana) pembayaran).virtualAccount());
                        System.out.println("ID BOOKING      : " + pembayaran.getIdBooking());
                        break;
                    default:
                        System.out.println("Maaf metode pembayaran tidak tersedia...\n");
                        break;
    
                }
                System.out.println("------------------------------------------------------------------------------------------------------------------------");
                
                
                do {
                    System.out.print("Lanjutkan Pembayaran\nPilih (Y/N) ? ");
                    jawab = scan.next().toUpperCase().charAt(0);
                } while (jawab != 'Y' && jawab != 'N');
                System.out.println("");
                if (jawab == 'N') {
                    continue;
                }
            }
            String userName = null;
            String pw = null ; 
            System.out.println("\t-Konfirmasi Akunt");
            do {
                System.out.println("Mohon konfirmasi Ulang Username dan Password anda");
                System.out.print("Username : ");
                 userName = scan.next();
                System.out.print("Password : ");
                 pw = scan.next(); 
                 if (!userName.equals(user.getUsername()) || !pw.equals(user.getPassword())){
                    System.out.println("\nUsername atau Password salah\n");
                 }
            }while (!userName.equals(user.getUsername()) || !pw.equals(user.getPassword()));
            

            int pilihanAkhir = 0;
            if (jawab == 'Y' ) {
                System.out.println("\nKonfirmasi Pembayaran.....");
                if (pembayaran instanceof MBanking) {
                    System.out.println("Pembayaran M-Banking Berhasil!");
                    System.out.println("\n1. Tampilkan Nota Transaksi");
                    System.out.println("2. Keluar");
                    while (true) {
                        pilihanAkhir = inputInt("\nMasukkan Pilihan Anda : ");
                        if (1 <= pilihanAkhir && pilihanAkhir <= 2) {
                            break;
                        } else {
                            System.out.println("Input salah, harap masukkan pilihan dengan benar!\n");
                        }
                    }
                } else if (pembayaran instanceof Ovo) {
                    System.out.println("Pembayaran Ovo Berhasil!");
                    System.out.println("\n1. Tampilkan Nota Transaksi");
                    System.out.println("2. Keluar");
                    while (true) {
                        pilihanAkhir = inputInt("\nMasukkan Pilihan Anda : ");
                        if (1 <= pilihanAkhir && pilihanAkhir <= 2) {
                            break;
                        } else {
                            System.out.println("Input salah, harap masukkan pilihan dengan benar!\n");
                        }
                    }
                } else if (pembayaran instanceof GoPay) {
                    System.out.println("Pembayaran GoPay Berhasil!");
                    System.out.println("\n1. Tampilkan Nota Transaksi");
                    System.out.println("2. Keluar");
                    while (true) {
                        pilihanAkhir = inputInt("Masukkan Pilihan Anda : ");
                        if (1 <= pilihanAkhir && pilihanAkhir <= 2) {
                            break;
                        } else {
                            System.out.println("Input salah, harap masukkan pilihan dengan benar!\n");
                        }
                    }
                } else if (pembayaran instanceof Dana) {
                    System.out.println("Pembayaran Dana Berhasil!");
                    System.out.println("\n1. Tampilkan Nota Transaksi");
                    System.out.println("2. Keluar");
                    while (true) {
                        pilihanAkhir = inputInt("Masukkan Pilihan Anda : ");
                        if (1 <= pilihanAkhir && pilihanAkhir <= 2) {
                            break;
                        } else {
                            System.out.println("Input salah, harap masukkan pilihan dengan benar!\n");
                        }
                    }
                }
            } else if (jawab == 'N') {
                System.out.println("\n1. Kembali Ke Menu Utama");
                System.out.println("2. Keluar Aplikasi");
                while (true) {
                    pilihanAkhir = inputInt("Masukkan Pilihan Anda : ");
                    if (1 <= pilihanAkhir && pilihanAkhir <= 2) {
                        break;
                    } else {
                        System.out.println("Input salah, harap masukkan pilihan dengan benar!\n");
                    }
                }
                if (pilihan == 2) {
                    System.out.println("===Terima kasih Telah Menggunakan Aplikasi===");
                    System.exit(0);
                }
            }

            if (pilihanAkhir == 1) {
                System.out.println(
                        "\n\n==================================================================================================================================");
                System.out.println("Tanggal Transaksi : " + tanggal);
                for (int i = 0; i < tiket.length; i++) {
                    System.out.println("Tiket " + (i + 1));
                    String jenisBioskop = tiket[i] instanceof CGV ? "CGV"
                            : tiket[i] instanceof CINEPLEX ? "CINEPLEX " : tiket[i] instanceof XXI ? "XXI" : null;
                    System.out.println("Jenis Bioskop      : " + jenisBioskop);
                    System.out.println("Mall               : " + tiket[i].getPilihMall());
                    System.out.println("Jenis Studio       : " + tiket[i].getJenisStudio());
                    System.out.println("Hari Nonton        : " + tiket[i].getHari());
                    System.out.println("Jam Nonton         : " + tiket[i].getJamNonton());
                    System.out.println("Film yang Ditonton : " + tiket[i].getFilm());
                    System.out.println("Kursi              : " + tiket[i].getKursiPilihan());
                    System.out.println("------------------------------------------------------------------------------------------------------------------------");
                    if (tiket[i] instanceof CGV) {
                        System.out.println("Harga Tiket        : Rp." + ((CGV) tiket[i]).getHargaTiket());
                        System.out.println("Harga + Admin      : Rp."
                                + ((CGV) tiket[i]).biayaTotal(((CGV) tiket[i]).getHargaTiket()));
                        hargaTotal += ((CGV) tiket[i]).biayaTotal(((CGV) tiket[i]).getHargaTiket());
                    }
                    if (tiket[i] instanceof CINEPLEX) {
                        System.out.println("Harga Tiket        : Rp." + ((CINEPLEX) tiket[i]).getHargaTiket());
                        System.out.println("Harga + Admin      : Rp."
                                + ((CINEPLEX) tiket[i]).biayaTotal(((CINEPLEX) tiket[i]).getHargaTiket()));
                        hargaTotal += ((CINEPLEX) tiket[i]).biayaTotal(((CINEPLEX) tiket[i]).getHargaTiket());
                    }
                    if (tiket[i] instanceof XXI) {
                        System.out.println("Harga Tiket        : Rp." + ((XXI) tiket[i]).getHargaTiket());
                        System.out.println("Harga + Admin      : Rp."
                                + ((XXI) tiket[i]).biayaTotal(((XXI) tiket[i]).getHargaTiket()));
                        hargaTotal += ((XXI) tiket[i]).biayaTotal(((XXI) tiket[i]).getHargaTiket());
                    }

                    System.out.println("==============================================");
                }
                System.out.println("TERIMA KASIH");
                System.exit(0);
            } else if (pilihanAkhir == 2) {
                System.exit(0);
            }

        } while (pilihan != 2);
    }
    public static int inputInt(String kalimat) {
        Scanner scan = new Scanner(System.in);
        while (true) { // perulangan while selama bernilai true
            try { // blok try
                System.out.print(kalimat);// mencetak objek dari kalimat
                String i = scan.next(); // input i
                return Integer.parseInt(i); // mengembalikan variabel i
            } catch (NumberFormatException e) { // blok untuk menangkap dan menangani pengecualian pada blok try
                System.out.println("Error... Harap masukkan angka!\n");
                // jika bernilai true, mencetak kalimat diatas
            }
        }
    }
}
