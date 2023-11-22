
/*
 * Anggota Kelompok:
 * Rachmat Thirdi Maliki_235150200111032
 * Rafi Ananta Nugraha_235150200111035
 * Gilang Fachrul HUda_235150207111034
 */
import java.util.*;
public class ArrayOjek {
    public static void main(String[] args) {
        
        while (true){
            Scanner input = new Scanner (System.in);
            String menu;    
            System.out.println("Pilih Menu : ");
            System.out.println("- Naik Ojek");
            System.out.println("- Kirim Barang");
            System.out.println("- Tambah Nama Driver");
            System.out.println("- Keluar");
            System.out.print("Masukkan Pilihan : ");
            menu = input.nextLine().trim();
            switch (menu.toLowerCase().trim()){
               case "naik ojek" -> {
                   System.out.print("masukkan jarak : ");
                   int jarak = input.nextInt();
                   if (jarak<=0){
                       System.out.println("jarak yang anda masukkan tidak valid");
                   }else {
                       System.out.print("masukkan kendaraan(mobil/motor) : ");
                       String kendaraan = input.next();
                       float harga = 0 ;
                       if (kendaraan.equalsIgnoreCase("mobil")){
                           if (jarak<=2 && jarak>0){
                               harga = 25000;
                           }else if (jarak>2 && jarak<=5){
                               harga = 40000;
                           }else if (jarak>5 && jarak<=10){
                               harga = 65000;
                           }else if (jarak>10){
                               harga = jarak*15000;
                           }
                       }else if (kendaraan.equalsIgnoreCase("motor")){
                           if (jarak<=2 ){
                               harga = 15000;
                           }else if (jarak>2 && jarak<=5){
                               harga = 20000;
                           }else if (jarak>5 && jarak<=10){
                               harga = 30000;
                           }else if (jarak>10){
                               harga = jarak*8000;
                           }
                       }else {
                           System.out.println("opsi kendaraan yang anda pilih tidak valid");
                           break;
                       }      
                       System.out.print("masukkan opsi payment (sampay,ova,cash) : ");
                       String bayar = input.next();
                       if (bayar.equalsIgnoreCase("sampay")){
                           harga = harga*90/100;
                       }else if (bayar.equalsIgnoreCase("ova")){
                           harga = harga*95/100;
                       }else if (bayar.equalsIgnoreCase("cash")){
                           harga += 0;
                       }else {
                            System.out.println("opsi pembayaran yang anda pilih tidak valid");
                            break;
                       }
                       System.out.println("jumlah yang harus anda bayar adalah :Rp " + harga); 
                   }
                break;
               }case "kirim barang" -> { 
                   System.out.print("masukkan jarak : ");
                   int jarak = input.nextInt();
                   if (jarak<=0){
                       System.out.println("jarak yang anda masukkan tidak valid");
                   }else {
                       System.out.print("masukkan berat (dalam kg) :");
                       int berat = input.nextInt();
                       int biaya = jarak*berat*1000;
                       if (berat<=0){
                           System.out.println("berat yang anda masuukan tidak valid");
                       }else System.out.println("jumlah yang harus anda bayarkan :Rp "+biaya);                
                   }
                break;
                
                }case "tambah nama driver" ->{
                    Scanner scan= new Scanner(System.in);
                    System.out.print("berapa jumlah driver yang akan dimasukkan : ");
                    int counter= input.nextInt();
                    String []Drive= new String[counter];
                for(int i=0;i<counter;i++)
                {
                    System.out.print("masukkan nama driver : ");
                    Drive[i]=scan.nextLine();
                }
                System.out.println("");
                System.out.println("Driver yang tersedia saat ini : ");
                System.out.println("");
                for(int i=0;i<counter;i++)
                {
                    System.out.println("Driver "+(i+1)+" : "+Drive[i]);
                }
                System.out.println("===================================");
                
                }
               
               
               
               case "keluar" ->{
                    System.out.println("sampai jumpa");
                    return;
                }
                default -> {System.out.println ("tidak ada di pilihan menu");
                   break;
                }
            }    
        }
    }
}
