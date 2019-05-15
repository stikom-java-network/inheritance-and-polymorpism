package Polymorpism;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String kode,merk,tipe;
        int harga,jumlah;
        
       Elektronik[] e = new Elektronik[2];
        
       for (int i = 0; i < e.length; i++) {
            System.out.println("===DATA ELEKTRONIK===");
            System.out.print("Masukkan Kode: ");
            kode = br.readLine();
            System.out.print("Masukkan Merk: ");
            merk = br.readLine();
            System.out.print("Masukkan Tipe: ");
            tipe = br.readLine();
            System.out.print("Masukkan Harga: ");
            harga = Integer.parseInt(br.readLine());
            System.out.print("Masukkan Jumlah: ");
            jumlah = Integer.parseInt(br.readLine());
            System.out.println("===================");
            
            System.out.println("1. Komputer");
            System.out.println("2. TV");
            System.out.print("Masukkan Pilihan: ");
            int pilih = Integer.parseInt(br.readLine());
            
            if(pilih == 1){
                e[i] = new Komputer(harga, jumlah, kode, merk, tipe);
                System.out.println("Total Beli: "+e[i].TotalBeli());
            }else{
                e[i] = new TV(harga, jumlah, kode, merk, tipe);
                System.out.println("Total Beli: "+e[i].TotalBeli());
            }
            
        }
       
       
    
    }
    
}
