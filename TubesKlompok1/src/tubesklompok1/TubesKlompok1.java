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
    static int q = 0; // punya Perjalanan
    Pelanggan pel[] = new Pelanggan[40];
    Petugas pet[] = new Petugas[5];
    tempatWisata tw[]= new tempatWisata[10];
    paketWisata pw[]=new paketWisata[10];
    Perjalanan per[]=new Perjalanan[10];
    public String searchIdPetugas(String id){
        for(int i=0;i<pet.length;i++){
            if(pet[i].getId() == id){
                return pet[i].getId();
            } 
        }
        return null;
    }
    
    public void hapusPtg(){
         System.out.print("ID : ");
                String id2=input.next();
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
        System.out.print("Nama Wisata : ");
        String nm=input.next();
        for (int i = 0; i < tw.length; i++) {
            if(tw[i].getNamaWisata().equals(nm)){
                tw[i]=null;
            }
            
        }
        System.out.println("Hapus Berhasil");
        
    }
    public void hapusPw(){
        System.out.print("Kode Paket : ");
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
                String id=input.next();
                System.out.print("Nomor HP : ");
                String hp=input.next();
                System.out.print("Jenis Kelamin : ");
                String jenkel=input.next();
                System.out.print("Jabatan : " );
                String jbt=input.next();
                System.out.println("Tambah Petugas berhasil");
                pet[a] = new Petugas();
                try{
                    a = 0;
                    while(pet[a] != null){
                        a++;
                    }
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
            b = 0;
            while(pel[b] != null){
                b++;
            }
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
        System.out.print("Nama Tempat : ");
        String namatw=input.next();
        System.out.print("Alamat : ");
        String almtw= input.next();
        System.out.print("no Contact Person : ");
        String nocp=input.next();
        System.out.print("Nama Contact Person : ");
        String nmcp=input.next();
        tw[c]= new tempatWisata();
        try {
            c = 0;
            while(tw[c] != null){
                c++;
            }
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
        System.out.print("Kode Paket : ");
        String kdpw=input.next(); 
        System.out.print("Harga : ");
        double hrg=input.nextDouble();
        pw[d]=new paketWisata();
        try {
            d = 0;
            while(pw[d] != null){
                d++;
            }
            pw[d].setKodePaket(kdpw);
            pw[d].setHarga(hrg);
            d++;
            menuPW();                
            
        } catch (Exception e) {
            System.out.println("Error "+e);
            menuPW();
        }
    }
    public void tambahPer(){
        int i=0;
        System.out.println("=== Tambah Perjalanan === ");
        System.out.print("Kode Perjalanan : ");
        String kdpj=input.next(); 
        System.out.print("Tgl Perjalanan : ");
        String tgl=input.next();
        System.out.print("Kode Paket Wisata : ");
        String pkt=input.next();
        per[q]=new Perjalanan();
        try {
            q = 0;
            while(per[q] != null){
                q++;
            }
            per[q].setKodeperjalanan(kdpj);
            per[q].setTglperjalanan(tgl);
            while(i<pw.length){
                if(pw[i].getKodePaket().equals(pkt)){
                    per[q].setPaket(pw[i]);
                }
                else i++;
            }
            q++;
            menuPW();                
            
        } catch (Exception e) {
            System.out.println("Error "+e);
            menuPW();
        }
    }
    
    public void tambahTwPw(){
        System.out.print("Masukan Kode Paket Wisata :");
        String id=input.next();
        int x = 0;
        try {
            while (x<pw.length){
                if(pw[x].getKodePaket().equals(id)){
                    System.out.print("Masukan Nama Tempat Wisata :");
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
    public void removeTw(){
        System.out.print("Masukan Kode Paket Wisata :");
        String id=input.next();
        int x = 0;
        try {
            while (x<pw.length){
                if(pw[x].getKodePaket().equals(id)){
                    System.out.print("Masukan Nama Tempat Wisata :");
                    String nm=input.next();
                    int i = 0;
                    try {
                        while(i<tw.length){
                            if (tw[i].getNamaWisata().equals(nm)) {
                                 pw[x].removeTempatWisata(tw[i]);
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
        String id1=input.next();
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
    public void searchPw(){
        System.out.print("Kode : ");
        String id1=input.next();
        int i=0;
        try{
            while ( i<pw.length){
                if(pw[i].getKodePaket().equals(id1)){
                    System.out.println("Kode Paket : "+pw[i].getKodePaket());
                    System.out.println("Harga : "+pw[i].getHarga());
                    System.out.println("Tujuan : ");
                    for (int k = 0; k <pw[i].getJumlahWisata(); k++) {
                        System.out.println("    -"+pw[i].getTempatWisata(k).getNamaWisata());   
                    }
                break;
                }
                else i++;
            }   
        }catch(Throwable e){
            System.out.println("Kesalahan! Data tidak ditemukan");
        }
    }
    public void searchPer(){
        System.out.print("Kode Perjalanan: ");
        String idper = input.next();
        int i = 0;
        while(i < per.length){
            if(per[i].getKodeperjalanan().equals(idper)){
                System.out.println("Kode Perjalanan: "+per[i].getKodeperjalanan());
                System.out.println("Tgl Perjalanan: "+per[i].getTglperjalanan());
                System.out.println("Kode Paket Wisata: "+per[i].getPaket().getKodePaket());
            }else i++;
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
                    System.out.println("    -"+pw[i].getTempatWisata(k).getNamaWisata()); 
                }
                i++;
            }
            else i++;
        }
    }
    public void tampilPer(){
        int i = 0;
        while(i<per.length){
            if(per[i] != null){
                System.out.println("Kode Perjalanan: "+per[i].getKodeperjalanan());
                System.out.println("Tgl Perjalanan: "+per[i].getTglperjalanan());
                System.out.println("Kode Paket Wisata: "+per[i].getPaket().getKodePaket());
                i++;
            }else i++;
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
                System.out.println("Salah menginputkan angka");
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
                System.out.println("=== Tambah Petugas ===");
                System.out.print("Nama : ");
                Scanner inputnm = new Scanner(System.in);
                String nm=inputnm.next();
                System.out.print("Alamat : ");
                Scanner inputalm = new Scanner(System.in);
                String alm=inputalm.next();
                System.out.print("Umur : ");
                Scanner inputumur = new Scanner(System.in);
                int umur=inputumur.nextByte();
                System.out.print("ID : ");
                Scanner inputid = new Scanner(System.in);
                String id=inputid.next();
                System.out.print("Nomor HP : ");
                Scanner inputhp = new Scanner(System.in);
                String hp=inputhp.next();
                System.out.print("Jenis Kelamin : ");
                Scanner inputjenkel = new Scanner(System.in);
                String jenkel=inputjenkel.next();
                System.out.print("Jabatan : " );
                Scanner inputjbt = new Scanner(System.in);
                String jbt=inputjbt.next();
                System.out.println("Tambah Petugas berhasil");
                pet[a] = new Petugas();
                try{
                    while(pet[a] != null){
                        a++;
                    }
                    if(pet[a] == null){
                        pet[a].setNama(nm);
                        pet[a].setUmur(umur);
                        pet[a].setAlamat(alm);
                        pet[a].setId(id);
                        pet[a].setNo_hp(hp);
                        pet[a].setJenkel(jenkel);
                        pet[a].setJabatan(jbt);
                        a++;
                    }
                    menuPtg();
                }catch (Exception e){
                    System.out.println("Error "+e);
                    menuPtg();
                }
                break;
            case 2:
                hapusPtg();
                menuPtg();
                break;
            case 3:
                tampilPtg();
                menuPtg();
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
                menuPW();
                break;
            case 4:
                removeTw();
                menuPW();
                break;
            case 5:
                tampilPw();
                menuPW();
                break;
            case 6:
                searchPw();
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
                tambahPer();
                menuPer();
                break;
            case 2:
                tambahPer();
                menuPer();
                break;
            case 3:
                tampilPer();
                menuPer();
                break;
            case 4:
                searchPer();
                menuPer();
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
