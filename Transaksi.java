import org.w3c.dom.ls.LSOutput;

public class Transaksi implements Harga{
    private String kode, tanggalbyr, waktu;
    private int thn;
    private long bayar,harga,hargaAwal,hargaJual;
    private Mobil mbl;
    private Customer cust;

    public Transaksi(){}

    public Transaksi(String kode, String tanggalbyr, String waktu, long bayar, long harga) {
        this.kode = kode;
        this.tanggalbyr = tanggalbyr;
        this.waktu = waktu;
        this.bayar = bayar;
        this.harga = harga;
    }

    public void dataMobilBeli (String merk, String nmbl, String thn, String warna, long harga){
        mbl = new Mobil(merk,nmbl,thn,warna,harga);
    }

    public void dataMobilJual (String merk, String nmbl, String thn, String warna, long harga){
        mbl = new Mobil(merk,nmbl,thn,warna,harga);
    }

    public void dataCustomer(String nik, String nama, String alamat, String notelp){
        cust = new Customer(nik,nama,alamat,notelp);
    }

    public int pembelian(){
        return(int)(this.bayar - this.harga);
    }

    public void penjualan(){
        if (2022 - thn == 1){
            hargaJual = (long) (this.hargaAwal - (this.hargaAwal * 0.20));
        }
        else if (2022 - thn == 2) {
            hargaJual = (long) (this.hargaAwal - (this.hargaAwal * 0.15));
        }
        else if (2022 - thn == 3) {
            hargaJual = (long) (this.hargaAwal - (this.hargaAwal * 0.10));

        }
        else if (2022 - thn == 4) {
            hargaJual = (long) (this.hargaAwal - (this.hargaAwal * 0.5));
        }
        else {
            hargaJual = (long) (this.hargaAwal - (this.hargaAwal * 0.5));
        }

        System.out.println("Harga Jual    : "+hargaJual);
    }

    public void TransaksiPembelian(){
        System.out.println("================================================");
        System.out.println("|            Bukti Transaksi Pembelian         |");
        System.out.println("================================================");
        System.out.println("Kode Transaksi    : "+this.kode);
        System.out.println("Tanggal           : "+this.tanggalbyr);
        System.out.println("Waktu             : "+this.waktu);
        System.out.println("Total Bayar       : "+this.bayar);
        System.out.println("Harga             : "+this.harga);
        System.out.println("Kembalian         : "+pembelian());
        System.out.println();

        mbl.tampilMobilBeli();
        System.out.println();
        cust.tampilCustomer();
    }

    public void TransaksiPenjualan(){
        System.out.println("================================================");
        System.out.println("|            Bukti Transaksi Pembelian         |");
        System.out.println("================================================");
        System.out.println("Kode Transaksi     : "+this.kode);
        System.out.println("Tanggal            : "+this.tanggalbyr);
        System.out.println("Waktu              : "+this.waktu);
        System.out.println("Tahun              : "+this.thn);

        mbl.tampilMobilJual();
        cust.tampilCustomer();
    }
}
