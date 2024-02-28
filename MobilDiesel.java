/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author HENDRY
 */
public class MobilDiesel extends Mobil{
    String bahan_bakar;
    
    MobilDiesel (String merk, int harga, int kecepatan, String bahan_bakar) {
        super(merk,200,0);
        this.bahan_bakar = bahan_bakar;
    }
    
    void setBahanBakar(String bahan_bakar) {
        this.bahan_bakar = bahan_bakar;
    }
    
    String getBahanBakar(){
        return bahan_bakar;
    }
    
    void infoMobilDiesel(){
        super.infoMobil();
        System.out.println("Bahan Bakar" + getBahanBakar());
        System.out.println("-----------------------");
    }
}
