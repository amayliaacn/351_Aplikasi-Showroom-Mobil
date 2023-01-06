public class Picanto extends Mobil{
    public Picanto(String merk, String nmbl, String thn, String warna, long harga){
        super(merk, nmbl, thn, warna , harga);
    }
    //221.800.000
    public void detail(){
        System.out.println("========= Detail Mesin =========");
        System.out.println("Transmisi              : Otomatis , Manual");
        System.out.println("Tipe Drive             : Front Wheel Drive");
        System.out.println("Konfigurasi Mesin      : Kappa 1.2 MPI Engine");
        System.out.println("Kapasitas              : 1248 cc");
        System.out.println("Konfigurasi Transmisi  : Manual 5 Speed");
        System.out.println("Kapasitas Seat         : 4");
    }
    public void performa() {
        System.out.println("=========== Performa ===========");
        System.out.println("Tenaga                 : 87 Ps / 6000 Rpm");
        System.out.println("Torsi                  : 12.2 kg.m / 4000 Rpm");
    }

    public void detailDimensi() {
        System.out.println("=========== Dimensi ===========");
        System.out.println("Tinggi                 : 1495mm");
        System.out.println("Panjang                : 3595mm");
        System.out.println("Radius Putar           : -");
        System.out.println("Jarak Sumbu Roda       : 2400mm");
        System.out.println("Lebar                  : 1595mm");
    }
}
