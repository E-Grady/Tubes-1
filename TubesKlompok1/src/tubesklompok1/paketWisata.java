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
    private int jumlahWisata;
    
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
    
    private static int idxpkt=0;
    public void addTempatWisata(tempatWisata w){
        for(int a=0;a<daftarTujuanWisata.length;a++){
            if(daftarTujuanWisata[a]==null){
                this.daftarTujuanWisata[idxpkt]=w;
                this.idxpkt++;
                this.jumlahWisata++;
            }
        }
    }
    
    public void removeTempatWisata(tempatWisata w){
        for(int i=0;i<daftarTujuanWisata.length;i++){
            if(daftarTujuanWisata[i].getNamaWisata()==w.getNamaWisata()){
                daftarTujuanWisata[i]=null;
                jumlahWisata--;
            }
        }
    }
    
}
