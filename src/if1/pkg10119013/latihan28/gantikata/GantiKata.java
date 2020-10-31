/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan28.gantikata;

/**
 *
 * @author Fiona Avila
 */

import java.util.Scanner;


public class GantiKata {
    
    static Scanner scan = new Scanner(System.in);
    
    String kalimat, gantiKata, menjadiKata;
    
    public void inputKalimat(){
        System.out.print("Masukkan Kalimat : ");
        kalimat = scan.nextLine();
        System.out.print("Ganti Kata : ");
        gantiKata = scan.next();
        System.out.print("Menjadi Kata : ");
        menjadiKata = scan.next();
    }

    public String ubahKalimat(){
        String akhir = kalimat.replaceAll(gantiKata,menjadiKata);
        return akhir;
    }

    public void tampilKalimat(String akhir){
        System.out.println("Kalimat Awal : ".concat(kalimat));
        System.out.println("Kalimat Baru : ".concat(ubahKalimat()));
    }

    public static void main(String[] args) {
        
        System.out.println("=====PROGRAM MENGGANTI KATA=====");
        System.out.println();
        
        GantiKata kata = new GantiKata();
        
        kata.inputKalimat();
        System.out.println();
        System.out.println();
        
        System.out.println("=====HASIL FORMATTING=====");
        System.out.println();
        kata.tampilKalimat(kata.ubahKalimat());
    }
    
}
