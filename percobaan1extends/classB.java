/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan1extends;

public class classB extends classA {
    public int z;
    public void getNilaiZ(){
        System.out.println("nilai Z:"+z);
    }
    public void getJumlah(){
        System.out.println("Jumlah"+(x+y+z));
    }
}
