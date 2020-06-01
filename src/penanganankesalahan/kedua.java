/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penanganankesalahan;

/**
 *
 * @author Dedew ketje
 */
public class kedua {
    public static void main(String[] args){
        System.out.println("Sebelum");
        try{
            System.out.println(5/0);
        }
        catch(Throwable i){
            System.err.print("pesan : ");
            System.err.println(i.getMessage());  //menampilkan error dimans
        }
//            System.err.println("Sesudah");
System.out.println("sesudah");
    }
}
