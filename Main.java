import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nik, nama, alamat, notelp, kode, tanggalbyr, waktu;
        String merk, nmbl, ordo, plat, warna, thn;
        long hargaAwal;
        long bayar;
        char pil1, pil2, pil3;
        boolean beli = true, menu = true;
        Scanner in = new Scanner(System.in);

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(isr);

        while (menu) {
            System.out.println("================================================");
            System.out.println("|           Aplikasi Showroom Mobil            |");
            System.out.println("================================================");
            System.out.println("|                 Pilihan Menu                 |");
            System.out.println("================================================");
            System.out.println("| 1.  Beli Mobil                               |");
            System.out.println("| 2.  Jual Mobil                               |");
            System.out.println("| 3.  Keluar                                   |");
            System.out.println("================================================");
            System.out.print("Masukkan menu pilihan [1-3] : ");
            pil1 = in.next().charAt(0);
            System.out.println("\n");

            switch (pil1) {
                case '1':
                    while (beli) {
                        System.out.println("================================================");
                        System.out.println("|                Pembelian Mobil               |");
                        System.out.println("================================================");
                        System.out.println("|                  Daftar Mobil                |");
                        System.out.println("================================================");
                        System.out.println("| 1.  New Xpander GLS MT (2021)                |");
                        System.out.println("| 2.  Picanto GT MT (2010)                     |");
                        System.out.println("| 3.  New CR-V 1.5L Turbo (2021)               |");
                        System.out.println("| 4.  Stargazer Active IVT (2021)              |");
                        System.out.println("| 5.  Rush G AT (2020)                         |");
                        System.out.println("| 6.  Kembali                                  |");
                        System.out.println("================================================");
                        System.out.print("| Masukkan nomor pilihan [1-0] : ");
                        pil2 = in.next().charAt(0);
                        System.out.println("\n");

                        switch (pil2) {
                            case '1':
                                while (true) {
                                    System.out.println("+++++++++++ New Xpander GLS MT (2021) ++++++++++");
                                    Xpander baru = new Xpander("Mitsubishi", "Xpander", "2021", "Abu-Abu", 307100000);

                                    System.out.println("  Merk    : " + baru.getMerk());
                                    System.out.println("  Nama    : " + baru.getNmbl());
                                    System.out.println("  Tahun   : " + baru.getThn());
                                    System.out.println("  Warna   : " + baru.getWarna());
                                    System.out.println("  Harga   : " + baru.getHarga());

                                    System.out.println();
                                    baru.detail();
                                    System.out.println();
                                    baru.performa();
                                    System.out.println();
                                    baru.detailDimensi();
                                    System.out.println();

                                    System.out.print("\nIngin Membeli Mobil? (Ya/Tidak) : ");
                                    pil3 = in.next().charAt(0);
                                    if (pil3 == 'Y' || pil3 == 'y') {
                                        System.out.println("========= Waktu Pembayaran =========");
                                        System.out.print("  Kode Pembayaran     : ");
                                        kode = in.next();
                                        System.out.print("  Tanggal Pembayaran  : ");
                                        tanggalbyr = in.next();
                                        System.out.print("  Waktu Pembayaran    : ");
                                        waktu = in.next();

                                        System.out.print("========== Data Pembelian ==========");
                                        System.out.print("\n  NIK     : ");
                                        nik = in.next();
                                        System.out.print("  Nama    : ");
                                        nama = in.next();
                                        System.out.print("  Alamat  : ");
                                        alamat = in.next();
                                        System.out.print("  No.Telp : ");
                                        notelp = in.next();
                                        System.out.print("  Uang Pembayaran : ");
                                        bayar = in.nextLong();

                                        Transaksi transXpander = new Transaksi(kode, tanggalbyr, waktu, bayar, 250000000);
                                        transXpander.dataCustomer(nik, nama, alamat, notelp);
                                        transXpander.dataMobilBeli("Mitsubishi", "Xpander", "2021", "Abu-Abu", 254000000 - 307100000);
                                        System.out.println();
                                        transXpander.TransaksiPembelian();
                                        new java.util.Scanner(System.in).nextLine();
                                        beli = false;
                                        break;
                                    } else if (pil3 == 'T' || pil3 == 't') {
                                        System.out.println();
                                        break;
                                    } else {
                                        System.out.println("Input Anda Salah\n");
                                    }
                                }
                                break;
                            case '2':
                                while (true) {
                                    System.out.println("+++++++++++++ Picanto GT MT (2020) +++++++++++++");
                                    Picanto baru = new Picanto("KIA", "Picanto", "2020", "Merah", 221800000);

                                    System.out.println("  Merk    : " + baru.getMerk());
                                    System.out.println("  Nama    : " + baru.getNmbl());
                                    System.out.println("  Tahun   : " + baru.getThn());
                                    System.out.println("  Warna   : " + baru.getWarna());
                                    System.out.println("  Harga   : " + baru.getHarga());

                                    System.out.println();
                                    baru.detail();
                                    System.out.println();
                                    baru.performa();
                                    System.out.println();
                                    baru.detailDimensi();
                                    System.out.println();

                                    System.out.print("\nIngin Membeli Mobil? (Ya/Tidak) : ");
                                    pil3 = in.next().charAt(0);
                                    if (pil3 == 'Y' || pil3 == 'y') {
                                        System.out.println("========= Waktu Pembayaran =========");
                                        System.out.print("  Kode Pembayaran     : ");
                                        kode = in.next();
                                        System.out.print("  Tanggal Pembayaran  : ");
                                        tanggalbyr = in.next();
                                        System.out.print("  Waktu Pembayaran    : ");
                                        waktu = in.next();

                                        System.out.println("========== Data Pembelian ==========");
                                        System.out.print("\n  NIK     : ");
                                        nik = in.next();
                                        System.out.print("  Nama    : ");
                                        nama = in.next();
                                        System.out.print("  Alamat  : ");
                                        alamat = in.next();
                                        System.out.print("  No.Telp : ");
                                        notelp = in.next();
                                        System.out.print("  Uang Pembayaran : ");
                                        bayar = in.nextLong();

                                        Transaksi transPicanto = new Transaksi(kode, tanggalbyr, waktu, bayar, 221800000);
                                        transPicanto.dataCustomer(nik, nama, alamat, notelp);
                                        transPicanto.dataMobilBeli("KIA", "Picanto", "2020", "Merah", 221800000);
                                        System.out.println();
                                        transPicanto.TransaksiPembelian();
                                        new java.util.Scanner(System.in).nextLine();
                                        beli = false;
                                        break;
                                    } else if (pil3 == 'T' || pil3 == 't') {
                                        System.out.println();
                                        break;
                                    } else {
                                        System.out.println("Input Anda Salah\n");
                                    }
                                }
                            case '3':
                                while (true) {
                                    System.out.println("+++++++++++ New CR-V 1.5L Turbo (2021)  ++++++++++");
                                    CRV baru = new CRV("Honda", "CR-V", "2021", "Putih", 590900000);

                                    System.out.println("  Merk    : " + baru.getMerk());
                                    System.out.println("  Nama    : " + baru.getNmbl());
                                    System.out.println("  Tahun   : " + baru.getThn());
                                    System.out.println("  Warna   : " + baru.getWarna());
                                    System.out.println("  Harga   : " + baru.getHarga());

                                    System.out.println();
                                    baru.detail();
                                    System.out.println();
                                    baru.performa();
                                    System.out.println();
                                    baru.detailDimensi();
                                    System.out.println();

                                    System.out.print("\nIngin Membeli Mobil? (Ya/Tidak) : ");
                                    pil3 = in.next().charAt(0);
                                    if (pil3 == 'Y' || pil3 == 'y') {
                                        System.out.println("========= Waktu Pembayaran =========");
                                        System.out.print("  Kode Pembayaran     : ");
                                        kode = in.next();
                                        System.out.print("  Tanggal Pembayaran  : ");
                                        tanggalbyr = in.next();
                                        System.out.print("  Waktu Pembayaran    : ");
                                        waktu = in.next();

                                        System.out.println("========== Data Pembelian ==========");
                                        System.out.print("\n  NIK     : ");
                                        nik = in.next();
                                        System.out.print("  Nama    : ");
                                        nama = in.next();
                                        System.out.print("  Alamat  : ");
                                        alamat = in.next();
                                        System.out.print("  No.Telp : ");
                                        notelp = in.next();
                                        System.out.print("  Uang Pembayaran : ");
                                        bayar = in.nextLong();

                                        Transaksi transCRV = new Transaksi(kode, tanggalbyr, waktu, bayar, 590900000);
                                        transCRV.dataCustomer(nik, nama, alamat, notelp);
                                        transCRV.dataMobilBeli("Honda", "CR-V", "2021", "Putih", 590900000);
                                        System.out.println();
                                        transCRV.TransaksiPembelian();
                                        new java.util.Scanner(System.in).nextLine();
                                        beli = false;
                                        break;
                                    } else if (pil3 == 'T' || pil3 == 't') {
                                        System.out.println();
                                        break;
                                    } else {
                                        System.out.println("Input Anda Salah\n");
                                    }
                                }
                            case '4':
                                while (true) {
                                    System.out.println("++++++++++ Stargazer Active IVT (2021) +++++++++");
                                    Stargazer baru = new Stargazer("Hyundai", "Stargazer", "2021", "Hitam", 243300000);

                                    System.out.println("  Merk    : " + baru.getMerk());
                                    System.out.println("  Nama    : " + baru.getNmbl());
                                    System.out.println("  Tahun   : " + baru.getThn());
                                    System.out.println("  Warna   : " + baru.getWarna());
                                    System.out.println("  Harga   : " + baru.getHarga());

                                    System.out.println();
                                    baru.detail();
                                    System.out.println();
                                    baru.performa();
                                    System.out.println();
                                    baru.detailDimensi();
                                    System.out.println();

                                    System.out.print("\nIngin Membeli Mobil? (Ya/Tidak) : ");
                                    pil3 = in.next().charAt(0);
                                    if (pil3 == 'Y' || pil3 == 'y') {
                                        System.out.println("========= Waktu Pembayaran =========");
                                        System.out.print("  Kode Pembayaran     : ");
                                        kode = in.next();
                                        System.out.print("  Tanggal Pembayaran  : ");
                                        tanggalbyr = in.next();
                                        System.out.print("  Waktu Pembayaran    : ");
                                        waktu = in.next();

                                        System.out.println("========== Data Pembelian ==========");
                                        System.out.print("\n  NIK     : ");
                                        nik = in.next();
                                        System.out.print("  Nama    : ");
                                        nama = in.next();
                                        System.out.print("  Alamat  : ");
                                        alamat = in.next();
                                        System.out.print("  No.Telp : ");
                                        notelp = in.next();
                                        System.out.print("  Uang Pembayaran : ");
                                        bayar = in.nextLong();

                                        Transaksi transStar = new Transaksi(kode, tanggalbyr, waktu, bayar, 243300000);
                                        transStar.dataCustomer(nik, nama, alamat, notelp);
                                        transStar.dataMobilBeli("Hyundai", "Stargazer", "2021", "Hitam", 243300000);
                                        System.out.println();
                                        transStar.TransaksiPembelian();
                                        new java.util.Scanner(System.in).nextLine();
                                        beli = false;
                                        break;
                                    } else if (pil3 == 'T' || pil3 == 't') {
                                        System.out.println();
                                        break;
                                    } else {
                                        System.out.println("Input Anda Salah\n");
                                    }
                                }
                            case '5':
                                while (true) {
                                    System.out.println("+++++++++++++++ Rush G AT (2020) +++++++++++++++");
                                    Rush baru = new Rush("Toyota", "Rush", "2020", "Abu - Abu", 289600000);

                                    System.out.println("  Merk    : " + baru.getMerk());
                                    System.out.println("  Nama    : " + baru.getNmbl());
                                    System.out.println("  Tahun   : " + baru.getThn());
                                    System.out.println("  Warna   : " + baru.getWarna());
                                    System.out.println("  Harga   : " + baru.getHarga());

                                    System.out.println();
                                    baru.detail();
                                    System.out.println();
                                    baru.performa();
                                    System.out.println();
                                    baru.detailDimensi();
                                    System.out.println();

                                    System.out.print("\nIngin Membeli Mobil? (Ya/Tidak) : ");
                                    pil3 = in.next().charAt(0);
                                    if (pil3 == 'Y' || pil3 == 'y') {
                                        System.out.println("========= Waktu Pembayaran =========");
                                        System.out.print("  Kode Pembayaran     : ");
                                        kode = in.next();
                                        System.out.print("  Tanggal Pembayaran  : ");
                                        tanggalbyr = in.next();
                                        System.out.print("  Waktu Pembayaran    : ");
                                        waktu = in.next();

                                        System.out.println("========== Data Pembelian ==========");
                                        System.out.print(" \n NIK     : ");
                                        nik = in.next();
                                        System.out.print("  Nama    : ");
                                        nama = in.next();
                                        System.out.print("  Alamat  : ");
                                        alamat = in.next();
                                        System.out.print("  No.Telp : ");
                                        notelp = in.next();
                                        System.out.print("  Uang Pembayaran : ");
                                        bayar = in.nextLong();

                                        Transaksi transRush = new Transaksi(kode, tanggalbyr, waktu, bayar, 289600000);
                                        transRush.dataCustomer(nik, nama, alamat, notelp);
                                        transRush.dataMobilBeli("Toyota", "Rush", "2020", "Abu - Abu", 289600000);
                                        System.out.println();
                                        transRush.TransaksiPembelian();
                                        new java.util.Scanner(System.in).nextLine();
                                        beli = false;
                                        break;
                                    } else if (pil3 == 'T' || pil3 == 't') {
                                        System.out.println();
                                        break;
                                    } else {
                                        System.out.println("Input Anda Salah\n");
                                    }
                                }
                            case '6':
                                System.out.println();
                                beli = false;
                                break;
                            default:
                                System.out.println("Inputan Anda Salah");
                        }
                    }
                    break;
                case '2':
                    System.out.println("================================================");
                    System.out.println("|                Penjualan Mobil               |");
                    System.out.println("================================================");
                    System.out.println("|                 Data Penjualan               |");
                    System.out.println("================================================");

                    System.out.print("  Kode Penjualan      : ");
                    kode = in.next();
                    System.out.print("  Tanggal Penjualan   : ");
                    tanggalbyr= in.next();
                    System.out.print("  Waktu Penjualan     : ");
                    waktu = in.next();
                    System.out.println("============ Data Mobil ============");
                    System.out.print("  Merk    : ");
                    merk = in.next();
                    System.out.print("  Nama    : ");
                    nama = in.next();
                    System.out.print("  Tahun   : ");
                    thn = in.next();
                    System.out.print("  Warna   : ");
                    warna = in.next();
                    System.out.print("  Harga   : ");
                    hargaAwal = in.nextLong();
                    System.out.println("=========== Data Penjual ============");
                    System.out.print("\n  NIK     : ");
                    nik = in.next();
                    System.out.print("  Nama    : ");
                    nama = in.next();
                    System.out.print("  Alamat  : ");
                    alamat = in.next();
                    System.out.print("  No.telp : ");
                    notelp = in.next();

                    Transaksi transJual = new Transaksi(kode,tanggalbyr,waktu,200000000,150000000);
                    transJual.dataCustomer(nik, nama, alamat, notelp);
                    transJual.dataMobilJual(merk, nama, thn, warna, hargaAwal);

                    transJual.TransaksiPenjualan();
                    new java.util.Scanner(System.in).nextLine();
                    break;

                case '0':
                    menu = false;
                    break;
                default:
                    System.out.println("Inputan Anda Salah");

            }
        }
    }
}