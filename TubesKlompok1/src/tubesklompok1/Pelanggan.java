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
public class Pelanggan extends Orang {
    private String id_pel;
    
    public Pelanggan(String nama,String jenkel,String alamat,int umur,String no_hp,String id_pel){
        super(nama,jenkel,alamat,umur,no_hp);
        this.id_pel=id_pel;
    }
    
    public void setId_pel(String x){
        id_pel=x;
    }
    
    public String getId_pel(){
        return id_pel;
    }
    
}
