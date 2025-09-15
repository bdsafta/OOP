/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop;

/**
 *
 * @author MSI
 */
public class OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Buku buku1 = new Buku();
        buku1.judul ="Belajar OOP Java";
        buku1.penulis ="Budi Safta Nugraha";
        buku1.penerbit ="Erlangga";
        buku1.tahun_terbit = 2003 ;
        
        buku1.infoBuku();
    }
    
}
