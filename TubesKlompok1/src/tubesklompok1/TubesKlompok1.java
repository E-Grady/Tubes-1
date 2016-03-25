/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesklompok1;
import java.util.*;
/**
 *
 * @author Pavilion
 */
public class TubesKlompok1 {
    Scanner input=new Scanner(System.in);
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
        System.out.println("Masukan Angka :");
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
        int menuPtg=input.nextInt();
        
        switch(menuPtg){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
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
        int menuPlg=input.nextInt();
        
         switch(menuPlg){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
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
                break;
            default:
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
                break;
            default:
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
                break;
            default:
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
