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
    static int a = 0;
    static int b = 0;
    Pelanggan pel[] = new Pelanggan[40];
    Petugas pet[] = new Petugas[2];
    public long searchIdPetugas(long id){
        for(int i=0;i<pet.length;i++){
            if(pet[i].getId() == id){
                return pet[i].getId();
            } 
        }
        return 0;
    }
    public String searchIdPelanggan(String id_pel){
        for(int i=0;i<pel.length;i++){
            if(pel[i].getId_pel() == id_pel){
                return pel[i].getId_pel();
            } 
        }
        return " ";
    }
    /**
     */
    
    
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
                long id=inputid.nextByte();
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
                break;
            case 2:
                System.out.print("ID : ");
                Scanner cariid1 = new Scanner(System.in);
                long id2=cariid1.nextByte();
                for(int i=0;i<pet.length;i++){
                    if(pet[i].getId() == id2){
                        pet[i] = null;
                    }
                }
                System.out.println("Hapus Berhasil!");
                break;
            case 3:
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
                break;
            case 4:
                System.out.print("ID : ");
                Scanner cariid = new Scanner(System.in);
                long id1=cariid.nextByte();
                if(searchIdPetugas(id1) != 0){
                    System.out.println("Data ketemu!");
                }else{
                    System.out.println("Data tidak ada!");
                }
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
                System.out.println("=== Tambah Pelanggan ===");
                System.out.println("Nama: ");
                Scanner inputnmpel = new Scanner(System.in);
                String nmpel = inputnmpel.next();
                System.out.print("Alamat : ");
                Scanner inputalmpel = new Scanner(System.in);
                String almpel = inputalmpel.next();
                System.out.print("Umur : ");
                Scanner inputumurpel = new Scanner(System.in);
                int umurpel = inputumurpel.nextByte();
                System.out.print("ID Pelanggan : ");
                Scanner inputidpel = new Scanner(System.in);
                long idpel = inputidpel.nextByte();
                System.out.print("Nomor HP : ");
                Scanner inputhppel = new Scanner(System.in);
                String hppel = inputhppel.next();
                System.out.print("Jenis Kelamin : ");
                Scanner inputjenkelpel = new Scanner(System.in);
                String jenkelpel = inputjenkelpel.next();
                pel[b] = new Pelanggan();
                try{
                    pel[b].setNama(nmpel);
                    pet[a].setUmur(umurpel);
                    pet[a].setAlamat(almpel);
                    pet[a].setId(idpel);
                    pet[a].setNo_hp(hppel);
                    pet[a].setJenkel(jenkelpel);
                    b++;
                    menuPlg();
                }catch (Exception e){
                    System.out.println("Error "+e);
                    menuPlg();
                }
                break;
            case 2:
                System.out.print("ID Pelanggan : ");
                Scanner cariidpel = new Scanner(System.in);
                String idpel1=cariidpel.next();
                for(int i=0;i<pel.length;i++){
                    if(pel[i].getId_pel() == idpel1){
                        pel[i] = null;
                    }
                }
                System.out.println("Hapus Berhasil!");
                break;
            case 3:
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
                    }else{
                        i++;
                    }
                }
                break;
            case 4:
                System.out.println("ID Pelanggan : ");
                Scanner inputidpel1 = new Scanner(System.in);
                String idpel2 = inputidpel1.next();
                searchIdPelanggan(idpel2);
                if(searchIdPelanggan(idpel2) != " "){
                    System.out.println("Data ketemu!");
                }else{
                    System.out.println("Data tidak ada!");
                }
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
         
         
    public void menuPW(){      //PaketWIsata
        System.out.println("Paket WIsata :");
        System.out.println("1.Tambah");
        System.out.println("2.Hapus");
        System.out.println("3.Tampilkan");
        System.out.println("4.Cari");
        System.out.println("5.Kembali ke menu awal");
        System.out.print("Masukan Input : ");
        int menuPW=input.nextInt();
        
         switch(menuPW){
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
        
   /*     Pelanggan p1=new Pelanggan("joko","Laki","Bandung",12,"85745987889","Pel001");
        Pelanggan p2=new Pelanggan("joki","cabe","Bandung",9,"85734587889","Pel002");
        Pelanggan p3=new Pelanggan("susanti","cabe","Bandung",10,"85886987889","Pel003");
        
        Petugas pt = new Petugas("Udin", "L", "Bandung", 24, "087774878528",00001, "Admin");
        
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
        ancol.printWisata(paketJkt);
        
        Perjalanan jalan1=new Perjalanan("per001",5);
        
        jalan1.addPelanggan(p1);
        jalan1.addPelanggan(p2);
        jalan1.addPelanggan(p3);
        
        jalan1.setPaket(paketJkt);
        
        p1.printPelanggan(jalan1);
        jalan1.removePaket();
        System.out.println("Paket :");
        if(jalan1.getPaket()!=null){
            System.out.println(jalan1.getPaket().getKodePaket());
        }else{
            System.out.println("Kosong");
        }
    }*/
    
}
