/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesklompok1;

/**
 *
 * @author Pavilion
 */
public class paketWisata {
    private tempatWisata[] daftarTujuanWisata = new tempatWisata[5];
    private String kodePaket;
    private double harga;
    
    public paketWisata(String kodePaket,double harga){
        this.kodePaket=kodePaket;
        this.harga=harga;
    }
    
    public void setKodePaket(String kdp){
        kodePaket=kdp;
    }
    
    public String getKodePaket(){
        return kodePaket; 
    }
    
    public void setHarga(double hrg){
        harga=hrg;
    }
    public double getHarga(){
        return harga;
    }
    
    private int idxpkt=0;
    public void addTempatWisata(tempatWisata w){
        this.daftarTujuanWisata[idxpkt]=w;
        this.idxpkt++;
    }
    
    public void removeTempatWisata(tempatWisata w){
    
    }
    
    

}
