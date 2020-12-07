/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remedprorpl;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class RemedPRORPL {

    /**
     * @param args the command line arguments
     */
    
    static void nama() {
    System.out.println("Vigo Oktario Arifianto");}
    
    static void kelas() {
    System.out.println("X RPL 3 / 38");}
    
    static void usia() {
    System.out.println("Usia : " + (2020 - 2005));}
        
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sken = new Scanner(System.in); 
        int tugas1, tugas2, tugas3, nilaiPKN, rerataPKN;
        boolean keluar = true;
        String ulang;
        
        nama();
        kelas();
        usia();
        
        System.out.println("\n");
        System.out.println("Nilai Rapor PKN");
        
        System.out.println("Masukkan nilai tugas 1 anda :");
        tugas1 = sken.nextInt();
        
        System.out.println("Masukkan nilai tugas 2 anda :");
        tugas2 = sken.nextInt();
        
        System.out.println("Masukkan nilai tugas 3 anda :");
        tugas3 = sken.nextInt();
        
        nilaiPKN = (tugas1 + tugas2 + tugas3);
        rerataPKN = (nilaiPKN / 3);
        System.out.println("Nilai rapor PKN anda = " + rerataPKN);
        
        if (rerataPKN >= 85) {
        System.out.println("Grade anda adalah A");}
        
        if (rerataPKN >= 75 && rerataPKN <= 85) {
        System.out.println("Grade anda adalah B");}
        
        if (rerataPKN >= 70 && rerataPKN <= 75) {
        System.out.println("Grade anda adalah C");}
        
        else {
        System.out.println("Mohon Maaf, anda tidak naik kelas");}
        
        System.out.println("\n");
        
            while( keluar ) {
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab Ya atau Tidak ");

            ulang = sken.nextLine();
           
            if (ulang.equalsIgnoreCase("ya") ){
                keluar = false;
            }
        
    }
    
    }
}
