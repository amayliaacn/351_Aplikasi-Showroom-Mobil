public class Xpander extends Mobil{
    public Xpander(String merk, String nmbl, String thn, String warna, long harga){
        super(merk, nmbl, thn, warna , harga);
    }

    public void detail(){
        System.out.println("========= Detail Mesin =========");
        System.out.println("Transmisi              : Otomatis , Manual");
        System.out.println("Tipe Drive             : Front Wheel Drive");
        System.out.println("Konfigurasi Mesin      : 4A91 1.5L MIVEC DOHC 16-Valve");
        System.out.println("Kapasitas              : 1500 cc");
        System.out.println("Konfigurasi Transmisi  : Manual 5 Speed");
        System.out.println("Kapasitas Seat         : 7");
    }
    public void performa() {
        System.out.println("=========== Performa ===========");
        System.out.println("Tenaga                 : 77 Kw(105 Ps) / 6000 Rpm");
        System.out.println("Torsi                  : 141Nm / 4000 Rpm");
    }

    public void detailDimensi() {
        System.out.println("=========== Dimensi ===========");
        System.out.println("Tinggi                 : 1730mm");
        System.out.println("Panjang                : 4585mm");
        System.out.println("Radius Putar           : 5.2m");
        System.out.println("Jarak Sumbu Roda       : 2775mm");
        System.out.println("Lebar                  : 1750m");
    }
}
