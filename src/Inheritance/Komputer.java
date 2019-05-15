package Inheritance;

public class Komputer extends Elektronik {
    private int harga, jumlah;

    public Komputer(int harga, int jumlah, String Kode, String Merk, String Tipe) {
        super(Kode, Merk, Tipe);
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public int getHarga() {
        return harga;
    }

    public int getJumlah() {
        return jumlah;
    }
    
   
    public int TotalBeli(){
        int TotalBeli = getHarga()*getJumlah();
        return TotalBeli;
    }

    
}
