/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesklompok1;
import java.util.*;
import java.io.*;
import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Pavilion
 */
public class TubesKlompok1 {
    Scanner input=new Scanner(System.in);
    static int a = 0; //punya petugas
    static int b = 0; //punya pelanggan
    static int c = 0; // punya tempat wisata
    static int d = 0; // punya paket wisata
    Pelanggan pel[] = new Pelanggan[40];
    Petugas pet[] = new Petugas[2];
    tempatWisata tw[]= new tempatWisata[10];
    paketWisata pw[]=new paketWisata[10];
    public long searchIdPetugas(long id){
        for(int i=0;i<pet.length;i++){
            if(pet[i].getId() == id){
                return pet[i].getId();
            } 
        }
        return 0;
    }
    
    public void hapusPtg(){
         System.out.print("ID : ");
                long id2=input.nextByte();
                for(int i=0;i<pet.length;i++){
                    if(pet[i].getId() == id2){
                        pet[i] = null;
                    }
                }
                System.out.println("Hapus Berhasil!");
    }
    public void hapusPlg(){
        System.out.print("ID Pelanggan : ");
        String idpel1=input.next();
        for(int i=0;i<pel.length;i++){
            if(pel[i].getId_pel().equals(idpel1)){
                pel[i] = null;
            }
        }
        System.out.println("Hapus Berhasil!");
    }
    public void hapusTw(){
        System.out.println("Nama Wisata : ");
        String nm=input.next();
        for (int i = 0; i < tw.length; i++) {
            if(tw[i].getNamaWisata().equals(nm)){
                tw[i]=null;
            }
            
        }
        System.out.println("Hapus Berhasil");
        
    }
    public void hapusPw(){
        System.out.println("Kode Paket : ");
        String kd=input.next();
        for (int i = 0; i < pw.length; i++) {
            if(pw[i].getKodePaket().equals(kd)){
                pw[1]=null;
            }
            
        }
        System.out.println("Hapus Berhasil");
    }
    
    public void tambahPtg(){
        System.out.println("=== Tambah Petugas ===");
                System.out.print("Nama : ");
                String nm=input.next();
                System.out.print("Alamat : ");
                String alm=input.next();
                System.out.print("Umur : ");
                int umur=input.nextByte();
                System.out.print("ID : ");
                long id=input.nextByte();
                System.out.print("Nomor HP : ");
                String hp=input.next();
                System.out.print("Jenis Kelamin : ");
                String jenkel=input.next();
                System.out.print("Jabatan : " );
                String jbt=input.next();
                System.out.println("Tambah Petugas berhasil");
                pet[a] = new Petugas();
                try{
                    pet[a].setNama(nm);
                    pet[a].setUmur(umur);
                    pet[a].setAlamat(alm);
                    pet[a].setId(id);
                    pet[a].setNo_hp(hp);
                    pet[a].setJenkel(jenkel);
                    pet[a].setJabatan(jbt);
                    a++;
                    menuPtg();
                }catch (Exception e){
                    System.out.println("Error "+e);
                    menuPtg();
                }
    }
    public void tambahPlg(){
        System.out.println("=== Tambah Pelanggan ===");
        System.out.println("Nama: ");
        String nmpel = input.next();
        System.out.print("Alamat : "); 
        String almpel = input.next();
        System.out.print("Umur : ");
        int umurpel = input.nextByte();
        System.out.print("ID Pelanggan : ");
        String idpel = input.next();
        System.out.print("Nomor HP : ");
        String hppel = input.next();
        System.out.print("Jenis Kelamin : ");
        String jenkelpel = input.next();
        pel[b] = new Pelanggan();
        try{
            pel[b].setNama(nmpel);
            pel[b].setUmur(umurpel);
            pel[b].setAlamat(almpel);
            pel[b].setId_pel(idpel);
            pel[b].setNo_hp(hppel);
            pel[b].setJenkel(jenkelpel);
            b++;
            menuPlg();
        }catch (Exception e){
            System.out.println("Error "+e);
            menuPlg();
        }    
    }
    public void tambahTW(){
        System.out.println("=== Tambah Tempat wisata ===");
        System.out.println("Nama Tempat : ");
        String namatw=input.next();
        System.out.println("Alamat : ");
        String almtw= input.next();
        System.out.println("no Contact Person : ");
        String nocp=input.next();
        System.out.println("Nama Contact Person : ");
        String nmcp=input.next();
        tw[c]= new tempatWisata();
        try {
            tw[c].setNamaWisata(namatw);
            tw[c].setAlamatWisata(almtw);
            tw[c].setCp_wisata(nocp);
            tw[c].setNama_cp(nmcp);
            c++;
            menuTW();
        } catch (Exception e) {
            System.out.println("Error "+e);
            menuTW();
        }
        
    }
    public void tambahPw(){
        System.out.println("=== Tambah Paket Wisata === ");
        System.out.println("Kode Paket : ");
        String kdpw=input.next(); 
        System.out.println("Harga : ");
        double hrg=input.nextDouble();
        pw[d]=new paketWisata();
        try {
            pw[d].setKodePaket(kdpw);
            pw[d].setHarga(hrg);
            d++;
            menuPW();                
            
        } catch (Exception e) {
            System.out.println("Error "+e);
            menuPW();
        }
    }
    
    public void tambahTwPw(){
        System.out.println("Masukan Kode Paket Wisata :");
        String id=input.next();
        int x = 0;
        
        try {
            while (x<pw.length){
                if(pw[x].getKodePaket().equals(id)){
                     
                    System.out.println("Masukan Nama Tempat Wisata :");
                    String nm=input.next();
                    int i = 0;
                    try {
                        while(i<tw.length){
                            if (tw[i].getNamaWisata().equals(nm)) {
                                 pw[x].addTempatWisata(tw[i]);
                                 break;
                    
                            }
                            else i++;
                        }
                    } catch (Throwable e) {
                         System.out.println("Kesalahan ! Data tidak ditemukan");
                     }
                    menuTW();
                    break;              
                } else x++;
            }
            
        } catch (Exception e) {
            System.out.println(""+e);
        }
        
        
    }
    
    public void searchIdPtg(){
        System.out.print("ID : ");
        long id1=input.nextByte();
        int i=0;
        try{while ( i<pet.length){
            if(pet[i].getId()==id1){
                System.out.println("Nama : "+pet[i].getNama());
                System.out.println("Alamat : "+pet[i].getAlamat());
                System.out.println("Umur : "+pet[i].getUmur());
                System.out.println("ID : "+pet[i].getId());
                System.out.println("Nomor HP : "+pet[i].getNo_hp());
                System.out.println("Jenis Kelamin : "+pet[i].getJenkel());
                System.out.println("Jabatan : "+pet[i].getJabatan());
                break;
                
            }
            else i++;
        }}catch(Throwable e){
            System.out.println("Kesalahan! Data tidak ditemukan");
        }
    }
    public void searchIdPlg(){
        System.out.print("ID : ");
        String idpel=input.next();
        int i=0;
        try{while ( i<pel.length){
            if(pel[i].getId_pel().equals(idpel)){
                System.out.println("Nama : "+pel[i].getNama());
                System.out.println("Alamat : "+pel[i].getAlamat());
                System.out.println("Umur : "+pel[i].getUmur());
                System.out.println("ID Pelanggan: "+pel[i].getId_pel());
                System.out.println("Nomor HP : "+pel[i].getNo_hp());
                System.out.println("Jenis Kelamin : "+pel[i].getJenkel());
                break;
                
            }
            else i++;
        }}catch(Throwable e){
            System.out.println("Kesalahan! Data tidak ditemukan");
        }
    }
    public void searchTw(){
        System.out.println("Nama Wisata : ");
        String nm=input.next();
        int i=0;
        try {
            while(i<tw.length){
                if (tw[i].getNamaWisata().equals(nm)) {
                    System.out.println("Nama Tempat : "+tw[i].getNamaWisata());
                    System.out.println("Alamat : "+tw[i].getAlamatWisata());
                    System.out.println("no Contact : "+tw[i].getCp_wisata());
                    System.out.println("Nama CP : "+tw[i].getNama_cp());
                    break;
                    
                }
                else i++;
            }
        } catch (Throwable e) {
            System.out.println("Kesalahan ! Data tidak ditemukan");
        }
    }
    
    public String searchIdPelanggan(String id_pel){
        for(int i=0;i<pel.length;i++){
            if(pel[i].getId_pel() == id_pel){
                return pel[i].getId_pel();
            } 
        }
        return " ";
    }
    
    public void tampilPtg(){
        int i = 0;
        while(i<pet.length){
            if(pet[i] != null){
                System.out.println("Nama : "+pet[i].getNama());
                System.out.println("Alamat : "+pet[i].getAlamat());
                System.out.println("Umur : "+pet[i].getUmur());
                System.out.println("ID : "+pet[i].getId());
                System.out.println("Nomor HP : "+pet[i].getNo_hp());
                System.out.println("Jenis Kelamin : "+pet[i].getJenkel());
                System.out.println("Jabatan : "+pet[i].getJabatan());
                i++;
                        
            }else{
                i++;
             }
            }
    }
    public void tampilPlg(){
        int i = 0;
        while(i<pel.length){
            if(pel[i] != null){
                System.out.println("Nama : "+pel[i].getNama());
                System.out.println("Alamat : "+pel[i].getAlamat());
                System.out.println("Umur : "+pel[i].getUmur());
                System.out.println("ID Pelanggan: "+pel[i].getId_pel());
                System.out.println("Nomor HP : "+pel[i].getNo_hp());
                System.out.println("Jenis Kelamin : "+pel[i].getJenkel());
                i++;
                menuPlg();
            }else{
                i++;
             }
            }
    }
    public void tampilTw(){
        int i=0;
        while(i<tw.length){
            if(tw[i]!=null){
                System.out.println("Nama Tempat : "+tw[i].getNamaWisata());
                System.out.println("Alamat : "+tw[i].getAlamatWisata());
                System.out.println("no Contact : "+tw[i].getCp_wisata());
                System.out.println("Nama CP : "+tw[i].getNama_cp());
                i++;
            }
            else i++;
        }
    }
    public void tampilPw(){
        int i=0;
        int j=0;
        while(i<pw.length){
            if(pw[i]!=null){
                System.out.println("Kode Paket : "+pw[i].getKodePaket());
                System.out.println("Harga : "+pw[i].getHarga());
                System.out.println("Tujuan : ");
                for (int k = 0; k <pw[i].getJumlahWisata(); k++) {
                    System.out.println("    1."+pw[i].getTempatWisata(k).getNamaWisata());
                    
                }
                
                i++;
            }
            else i++;
        }
    }
       
    public void main() {  
          //Menu Utama 
        
        System.out.println("Menu :");
        System.out.println("1.Petugas");
        System.out.println("2.Pelanggan");
        System.out.println("3.Tempat Wisata");
        System.out.println("4.Paket Wisata");
        System.out.println("5.Prjalanan");
        System.out.println("6.Exit");
        System.out.print("Masukan Angka : ");
        int menu1= input.nextInt();
        
        switch(menu1){
            case 1:
                menuPtg();
                break;
            case 2:
                menuPlg();
                break;
            case 3:
                menuTW();
                break;
            case 4:
                menuPW();
                break;
            case 5:
                menuPer();
                break;
            case 6:
                System.exit(1);
                break;
            default:
                break;
        }
    }
              
    public void menuPtg(){    
        System.out.println("Petugas :");
        System.out.println("1.Tambah");
        System.out.println("2.Hapus");
        System.out.println("3.Tampilkan");
        System.out.println("4.Cari");
        System.out.println("5.Kembali ke menu awal");
        System.out.print("Masukkan Input: ");
        int menuPtg=input.nextInt();
        switch(menuPtg){
            case 1:
                tambahPtg();
                break;
            case 2:
                hapusPtg();
                break;
            case 3:
                tampilPtg();
                break;
            case 4:
                searchIdPtg();
                break;
            case 5:
                main();
                break;
            default:
                System.out.println("Salah menginputkan angka");
                break;
        }
    }    
           
    public void menuPlg(){    
        System.out.println("Pelanggan :");
        System.out.println("1.Tambah");
        System.out.println("2.Hapus");
        System.out.println("3.Tampilkan");
        System.out.println("4.Cari");
        System.out.println("5.Kembali ke menu awal");
        System.out.print("Masukan Input : ");
        int menuPlg=input.nextInt();
        
         switch(menuPlg){
            case 1:
                tambahPlg();
                break;
            case 2:
                hapusPlg();
                break;
            case 3:
                tampilPlg();
                break;
            case 4:
                searchIdPlg();
                break;
            case 5:
                main();
                break;
            default:
                System.out.println("Salah menginputkan angka");
                break;
        }
    }
         
         
    public void menuTW(){    
        System.out.println("Tempat Wisata :");
        System.out.println("1.Tambah");
        System.out.println("2.Hapus");
        System.out.println("3.Tampilkan");
        System.out.println("4.Cari");
        System.out.println("5.Kembali ke menu awal");
        System.out.print("Masukan Input : ");
        int menuTW=input.nextInt();
        
         switch(menuTW){
            case 1:
                tambahTW();
                break;
            case 2:
                hapusTw();
                break;
            case 3:
                tampilTw();
                break;
            case 4:
                searchTw();
                break;
            case 5:
                main();
                break;
            default:
                System.out.println("Salah menginputkan angka");
                break;
        }
    }     
         
         
    public void menuPW(){      //PaketWIsata
        System.out.println("Paket WIsata :");
        System.out.println("1.Tambah");
        System.out.println("2.Tambah Tempat Wisata");
        System.out.println("3.Hapus Paket Wisata");
        System.out.println("4.Hapus Tempat Wisata");
        System.out.println("5.Tampilkan");
        System.out.println("6.Cari");
        System.out.println("7.Kembali ke menu awal");
        System.out.print("Masukan Input : ");
        int menuPW=input.nextInt();
        
         switch(menuPW){
            case 1:
                tambahPw();
                break;
            case 2:
                tambahTwPw();
                break;
            case 3:
                hapusPw();
                break;
            case 4:
                break;
            case 5:
                tampilPw();
                break;
            case 6:
                break;
            case 7:
                main();
                break;
            default:
                System.out.println("Salah menginputkan angka");
                break;
        }
}
         
         
    public void menuPer(){      //Perjalanan
        System.out.println("Perjalanan :");
        System.out.println("1.Tambah");
        System.out.println("2.Hapus");
        System.out.println("3.Tampilkan");
        System.out.println("4.Cari");
        System.out.println("5.Kembali ke menu awal");
        System.out.print("Masukan Input : ");
        int menuPer=input.nextInt();
        
         switch(menuPer){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                main();
                break;
            default:
                System.out.println("Salah menginputkan angka");
                break;
        }
    }    
        
   
    
}
