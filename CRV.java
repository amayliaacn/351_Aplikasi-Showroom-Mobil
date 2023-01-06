public class CRV extends Mobil{
    public CRV(String merk, String nmbl, String thn, String warna, long harga){
    super(merk, nmbl, thn, warna , harga);
}
    //590.900.000


    public void detail(){
        System.out.println("========= Detail Mesin =========");
        System.out.println("Transmisi              : Otomatis");
        System.out.println("Tipe Drive             : Front Wheel Drive");
        System.out.println("Konfigurasi Mesin      : 1.5L Silinder Segaris VTEC Turbo DOHC, 16 Katup + DBW");
        System.out.println("Kapasitas              : 1498 cc");
        System.out.println("Konfigurasi Transmisi  : Automatic CVT");
        System.out.println("Kapasitas Seat         : 4");
    }
    public void performa() {
        System.out.println("=========== Performa ===========");
        System.out.println("Tenaga                 : 1090 Ps / 5600 Rpm");
        System.out.println("Torsi                  : 240Nm / 2000 - 5000 Rpm");
    }

    public void detailDimensi() {
        System.out.println("=========== Dimensi ===========");
        System.out.println("Tinggi                 : 1679mm");
        System.out.println("Panjang                : 4584mm");
        System.out.println("Radius Putar           : -");
        System.out.println("Jarak Sumbu Roda       : 2660mm");
        System.out.println("Lebar                  : 1855mm");
    }
}
