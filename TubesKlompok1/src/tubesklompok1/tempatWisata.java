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
public class tempatWisata {
    public class TempatWisata {
   private String namaWisata;
   private String alamatWisata;
   private long cp_wisata;
   private String nama_cp;
   
   public TempatWisata(String namaWisata,String alamatWisata,String cp_wisata,long cp_wisata,String nama_cp){
       this.namaWisata = namaWisata;
       this.alamatWisata = alamatWisata;
       this.cp_wisata = cp_wisata;
       this.nama_cp = nama_cp;
   }
   public String setNamaWisata(String namaWisata){
       this.namaWisata = namaWisata;
   }
   public void getNamaWisata(){
       return namaWisata;
   }
   public String setAlamatWisata(String alamatWisata){
       this.alamatWisata = alamatWisata;
   }
   public void getAlamatWisata(){
       return alamatWisata;
   }
   public long setCp_wisata(long cp_wisata){
       this.cp_wisata = cp_wisata;
   }
   public getCp_wisata(){
       return cp_wisata;
   }
   public setNama_cp(String nama_cp){
       this.nama_cp = nama_cp;
   }
   public getCp_wsata(){
       return cp_wisata;
   }
}
