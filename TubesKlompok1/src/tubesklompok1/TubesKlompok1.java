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
public class TubesKlompok1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pelanggan p1=new Pelanggan("joko","Laki","Bandung",12,"85745987889","Pel001");
        Pelanggan p2=new Pelanggan("joki","cabe","Bandung",9,"85734587889","Pel002");
        Pelanggan p3=new Pelanggan("susanti","cabe","Bandung",10,"85886987889","Pel003");
        
        
        tempatWisata ancol=new tempatWisata("Anchore","Jakarteh","85475845875","Agus");
        tempatWisata monas=new tempatWisata("Moon Hass","Jakarteh","854746645875","Tejo");
        tempatWisata TMII=new tempatWisata("Taman Mini","Jakarteh","85475665875","Joni");
        
        paketWisata paketJkt= new paketWisata("jkt48",1500000);
        
        paketJkt.addTempatWisata(ancol);
        paketJkt.addTempatWisata(monas);
        paketJkt.addTempatWisata(TMII);
        
       paketJkt.removeTempatWisata(monas);
       System.out.println(paketJkt.getJumlahWisata());
       paketJkt.addTempatWisata(ancol);
       paketJkt.addTempatWisata(monas);
        int i = 0;
        while(i<paketJkt.getJumlahWisata()){
           if(paketJkt.getTempatWisata(i)==null){
                i++;
            }else{
                System.out.println(paketJkt.getTempatWisata(i).getNamaWisata());
                i++;
            }
            
        }
        
        Perjalanan jalan1=new Perjalanan("per001",5);
        
        jalan1.addPelanggan(p1);
        jalan1.addPelanggan(p2);
        jalan1.addPelanggan(p3);
        
        jalan1.setPaket(paketJkt);
        
        System.out.println(jalan1.getPelanggan(0).getNama());
        System.out.println(jalan1.getPelanggan(1).getNama());
        System.out.println(jalan1.getPelanggan(2).getNama());
        System.out.println("Paket :");
        System.out.println(jalan1.getPaket().getKodePaket());
        
        jalan1.removePaket();
        System.out.println("Paket :");
        if(jalan1.getPaket()!=null){
            System.out.println(jalan1.getPaket().getKodePaket());
        }else{
            System.out.println("Kosong");
        }
    }
    
}
