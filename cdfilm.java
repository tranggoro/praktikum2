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
//subclass
class cdfilm extends rentalvcd{
    String aktor, sutradara, kategori;
    
    public cdfilm (String aktor, String sutradara, String kategori, String judul, String publisher, int stok){
        
        this.aktor=aktor;
        this.sutradara=sutradara;
        this.kategori=kategori;
    }
    cdfilm(){
    }
}