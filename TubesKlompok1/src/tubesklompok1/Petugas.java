/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesklompok1;

import tubesklompok1.Orang;

/**
 *
 * @author UKI
 */
public class Petugas extends Orang {
    private long id;
    private String jabatan;
      
    public Petugas(String nama, String jenkel, String alamat, int umur, String no_hp,long id, String jabatan){
        super(nama,jenkel,alamat,umur,no_hp);
        this.id = id;
        this.jabatan = jabatan;
    }
    public Petugas(){}
    public void setId(long id){
        this.id = id;
    }
    public long getId(){
        return id;
    }
    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }
    public String getJabatan(){
        return jabatan;
    }
}
