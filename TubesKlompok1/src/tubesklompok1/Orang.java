package tubesklompok1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JalluWMT
 */
public class Orang {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesklompok1;

/**
 *
 * @author JalluWMT
 */
public abstract class Orang {
    private String nama;
    private String jenkel;
    private String alamat;
    private int umur;
    private long no_hp;
    
    public void Orang (String nama, String jenkel,String alamat, int umur,long no_hp){
     this.nama = nama;
     this.jenkel = jenkel;
     this.alamat = alamat;
     this.umur = umur;
     this.no_hp = no_hp;
}
    public String getNama(){
        return this.nama;
    }
    public String getJenkel(){
        return this.jenkel;
    }
    public String getAlamat(){
        return this.alamat;
    }
    public int getUmur(){
        return this.umur;
    }
    public long getNo_hp(){
        return this.no_hp;
    }
}

}
