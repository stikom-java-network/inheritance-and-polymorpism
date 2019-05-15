package Inheritance;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String kode,merk,tipe;
        int harga,jumlah;
        
        Komputer Kom = new Komputer(0,0,"","","");
        TV Tv = new TV(0,0,"","","");
        
        System.out.println("1. Komputer");
        System.out.println("2. TV");
        System.out.print("Masukkan Inputan : ");
        int input = Integer.parseInt(br.readLine());
        
        if(input == 1) {
            System.out.println("===DATA KOMPUTER===");
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
            
            Kom = new Komputer(harga, jumlah, kode, merk, tipe);
            System.out.print("Total Beli: "+Kom.TotalBeli());
            
        }else{
             System.out.println("===DATA TV===");
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
            
            Tv = new TV(harga, jumlah, kode, merk, tipe);
            System.out.print("Total Beli: "+Tv.TotalBeli());
            
        }
    
    }
    
}
