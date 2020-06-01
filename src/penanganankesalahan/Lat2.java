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
public class Lat2 {
    public static void main(String[] args){
        byte[] b = new byte[4];
        System.out.print("input : ");
        try {
            System.in.read(b);
        }
        catch(java.io.IOException e){
            System.err.println(e);
        }
        System.out.println("Hasil : " + (char) b[0] + (char) b[1] + (char) b[2]);
    }
    
}
