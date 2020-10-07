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
public class DaftarGaji {
    public  Pegawai[] listPegawai;
    public  int jumlahPegawaiSekarang = 0;
    
    public DaftarGaji(int jumlah_pegawai){
        listPegawai = new Pegawai[jumlah_pegawai];
    }
    
    public void addPegawai(Pegawai p){
        listPegawai[jumlahPegawaiSekarang] = p;
        jumlahPegawaiSekarang++;
    }
    
    public void printSemuaGaji(){
        for (int i=0;i<jumlahPegawaiSekarang;i++){
            System.out.print(listPegawai[i].nama+" mendapatkan gaji ");
            System.out.println(listPegawai[i].getGaji());
        }
    }
}
