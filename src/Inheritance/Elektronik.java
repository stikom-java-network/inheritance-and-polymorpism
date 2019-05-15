package Inheritance;

public class Elektronik {
    private String Kode,Merk,Tipe;

    public Elektronik(String Kode, String Merk, String Tipe) {
        this.Kode = Kode;
        this.Merk = Merk;
        this.Tipe = Tipe;
    }

    public String getKode() {
        return Kode;
    }

    public String getMerk() {
        return Merk;
    }

    public String getTipe() {
        return Tipe;
    }
    
}
