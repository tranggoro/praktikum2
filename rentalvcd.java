/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author trian
 */
//superclass
public class rentalvcd {
    String judul, publisher;
    int stok;
    
    public rentalvcd (String judul, String publisher, int stok) {
        this.judul=judul;
        this.publisher=publisher;
        this.stok=stok;
    }    
    rentalvcd(){
    }
}
