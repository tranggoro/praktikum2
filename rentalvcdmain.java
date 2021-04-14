/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author triane
 */
//run

import java.util.Scanner;
public class rentalvcdmain {

    public static void main (String[] args){
        int pilih, kembali;
        do{
        
        cdfilm film = new cdfilm();  
            
        System.out.println("==================");
        System.out.println("Rental        VCD ");
        System.out.println("==================");
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan film      : ");
        film.judul = input.nextLine();
        System.out.print("Aktor             : ");
        film.aktor = input.nextLine();
        System.out.print("Sutradara         : ");
        film.sutradara = input.nextLine();
        System.out.print("Publisher         : ");
        film.publisher = input.nextLine();
            
        System.out.println("Kategori          : ");
        System.out.println("1.Semua Umur");
        System.out.println("2.Remaja");
        System.out.println("3.Dewasa");
        System.out.println("4.Anak-Anak");
        System.out.print("Masukan Pilihan   : ");
        int pil;
        pil = input.nextInt();
        if (pil == 1){
            film.kategori = "Semua Umur";
        }
        else if (pil == 2){
            film.kategori = "Remaja";
        }
        else if (pil == 3){
            film.kategori = "Dewasa";
        }
        else if (pil == 4){
            film.kategori = "Anak-Anak";
        }
        else{
            film.kategori = "Anda Salah Memasukkan Pilihan";
        }
        
        
        System.out.print("Stok              : ");
        film.stok = input.nextInt();
        
        //OUTPUT
        System.out.println("===Hasil===");
        System.out.println("Judul Film      : "+film.judul);
        System.out.println("Aktor           : "+film.aktor);
        System.out.println("Sutradara       : "+film.sutradara);
        System.out.println("Publisher       : "+film.publisher);
        System.out.println("Kategori        : "+film.kategori);
        System.out.println("Stok            : "+film.stok);
        
        System.out.println("apakah anda ingin mengulang lagi??");
        System.out.println("1 iya");
        System.out.println("2 tidak");
            
        kembali=input.nextInt();
        }
        while(kembali<2);
    }
}

