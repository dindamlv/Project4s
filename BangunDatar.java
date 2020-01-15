import java.util.Scanner;

public class BangunDatar {

    Scanner sc = new Scanner(System.in);
    public static BangunDatar obj = new BangunDatar();
    
    
    public static void main(String[] args) {
       int option;
       System.out.println("Luas Bangun Datar");
       System.out.println("1. Persegi");
       obj.LuasPersegi();
       System.out.println("2. Persegi Panjang");
       obj.LuasPersegiPanjang();
       System.out.println("3. Segitiga");
       obj.LuasSegitiga();
       
       /*System.out.println("2. Persegi Panjang");
       System.out.println("3. Segitiga");
       System.out.println("Masukan Pilihan Anda : ");        
       option = sc.nextInt();
       
       switch(option){
            case 1 : LuasPersegi();
                     break;
            case 2 : LuasPersegiPanjang();
                     break;
            case 3 : LuasSegitiga();
                     break;
            default : System.out.println("Pilihan Tidak Tersedia");
                     break;                     
       
    }*/
        
    }


    public void LuasPersegi() {
        
        int sisi = 15;
        int hasilPersegi;
        System.out.println("Meghitung Luas Persegi");
        System.out.println("Sisi : 15");
        hasilPersegi = sisi*sisi;
        System.out.println("Luas Persegi : Sisi x Sisi = " +hasilPersegi);
        
    }

    public void LuasSegitiga() {

        int alas = 10;
        int tinggi = 20;
        int hasilSegitiga;
        System.out.println("Menghitung Luas Segitiga"); 
        System.out.println("Alas : 10");
        System.out.println("Tinggi: 20");
        hasilSegitiga = alas*tinggi*1/2;
        System.out.println("Luas Segitiga : 1/2 x Alas x Tinggi = " +hasilSegitiga);   

       
    }
    
    public void LuasPersegiPanjang(){
        
        int panjang = 25;
        int lebar = 15;
        int hasilPersegiP;
        System.out.println("Menghitung Luas Persegi Panjang");
        System.out.println("Panjang : 25");
        System.out.println("Lebar : 15");
        hasilPersegiP = panjang*lebar;
        System.out.println("Luas Persegi Panjang : Panjang x Lebar = " +hasilPersegiP);
    }
    
   
}




