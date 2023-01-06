public class Mobil {
    private String merk, nmbl, thn, warna;
    private long harga;

    public Mobil(String merk, String nmbl, String thn, String warna, long harga) {
        this.merk = merk;
        this.nmbl = nmbl;
        this.thn = thn;
        this.warna = warna;
        this.harga = harga;
    }



    public String getMerk() {
        return merk;
    }

    public String getNmbl() {
        return nmbl;
    }

    public String getThn() {
        return thn;
    }

    public String getWarna() {
        return warna;
    }

    public long getHarga() {
        return harga;
    }

    public void tampilMobilBeli(){
        System.out.println("Merk     : "+this.merk);
        System.out.println("Nama     : "+this.nmbl);
        System.out.println("Tahun    : "+this.thn);
        System.out.println("Warna    : "+this.warna);
        System.out.println("Harga    : "+this.harga);
    }

    public void tampilMobilJual(){
        System.out.println("Merk     : "+this.merk);
        System.out.println("Nama     : "+this.nmbl);
        System.out.println("Tahun    : "+this.thn);
        System.out.println("Warna    : "+this.warna);
    }

    public void detail(){}
    public void performa(){}
    public void detailDimensi(){}
}
