/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author USER
 */
public class main {
    public static void main(String[] args) {
        
       
        
        Dosen d1 = new Dosen();
        d1.nama="Anjas";
        d1.setSKS(15);
        
        Pegawai p1 = new Pegawai();
        p1.nama="Parto";
        d1.setSKS(20);
        DaftarGaji daftar_gaji = new DaftarGaji(3);
        daftar_gaji.addPegawai(d1);
        daftar_gaji.addPegawai(p1);
        daftar_gaji.printSemuaGaji();
    }    
}
