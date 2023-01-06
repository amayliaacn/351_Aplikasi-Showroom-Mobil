public class Stargazer extends Mobil{
    public Stargazer(String merk, String nmbl, String thn, String warna, long harga){
        super(merk, nmbl, thn, warna , harga);
    }
    //243.300.00
    public void detail(){
        System.out.println("========= Detail Mesin =========");
        System.out.println("Transmisi              : Otomatis , Manual");
        System.out.println("Tipe Drive             : -");
        System.out.println("Konfigurasi Mesin      : 1.5L MPI 16-Valve, HLA");
        System.out.println("Kapasitas              : 1497 cc");
        System.out.println("Konfigurasi Transmisi  : 6 Speed Manual");
        System.out.println("Kapasitas Seat         : 7");
    }
    public void performa() {
        System.out.println("=========== Performa ===========");
        System.out.println("Tenaga                 : 115 Ps / 6300 Rpm");
        System.out.println("Torsi                  : 14.7 Kgm / 4500 Rpm");
    }

    public void detailDimensi() {
        System.out.println("=========== Dimensi ===========");
        System.out.println("Tinggi                 : 1690mm");
        System.out.println("Panjang                : 4460mm");
        System.out.println("Radius Putar           : 5.4m");
        System.out.println("Jarak Sumbu Roda       : 2780mm");
        System.out.println("Lebar                  : 1780m");
    }
}
