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
        // TODO code application logic here
        Petugas pet = new Petugas("Agus","L","Kartika 4",20,"08774878528",1234,"Staff");
        Pelanggan pel = new Pelanggan("Budi","L","Kartika 1",38,"08783988841","B01");
        
        Perjalanan per = new Perjalanan("A01",40);
        per.addPelanggan(pel);
        
        tempatWisata tw = new tempatWisata("Batu Akik","Jonggol","08777777777","Yudi");
        
        paketWisata pw = new paketWisata("P01",500000);
        pw.addTempatWisata(tw);
    }
    
}
