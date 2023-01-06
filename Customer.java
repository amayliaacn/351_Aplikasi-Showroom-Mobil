public class Customer {
    String nik,nama,alamat,notelp;

    public Customer(String nik, String nama, String alamat, String notelp) {
        this.nik = nik;
        this.nama = nama;
        this.alamat = alamat;
        this.notelp = notelp;
    }

    void tampilCustomer(){
        System.out.println("NIK      : "+this.nik);
        System.out.println("Nama     : "+this.nama);
        System.out.println("Alamat   : "+this.alamat);
        System.out.println("No Telp  : "+this.notelp);
    }
}
