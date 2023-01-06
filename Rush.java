public class Rush extends Mobil{
    public Rush(String merk, String nmbl, String thn, String warna, long harga){
        super(merk, nmbl, thn, warna , harga);
    }
    //289.600.000
    public void detail(){
        System.out.println("========= Detail Mesin =========");
        System.out.println("Transmisi              : Otomatis , Manual");
        System.out.println("Tipe Drive             : Rear Wheel Drive");
        System.out.println("Konfigurasi Mesin      : 2NR-VE,DOHC, Dual VVT-i");
        System.out.println("Kapasitas              : 1496 cc");
        System.out.println("Konfigurasi Transmisi  : Automatic 4-Speed");
        System.out.println("Kapasitas Seat         : 7");
    }
    public void performa() {
        System.out.println("=========== Performa ===========");
        System.out.println("Tenaga                 : 104 Ps / 6000 Rpm");
        System.out.println("Torsi                  : 13.9 kgm / 4200 Rpm");
    }

    public void detailDimensi() {
        System.out.println("=========== Dimensi ===========");
        System.out.println("Tinggi                 : 1705mm");
        System.out.println("Panjang                : 4435mm");
        System.out.println("Radius Putar           : -");
        System.out.println("Jarak Sumbu Roda       : 2685mm");
        System.out.println("Lebar                  : 1695mm");
    }
}
