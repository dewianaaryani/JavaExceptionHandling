/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penanganankesalahan;
/**
 * @author Dedew ketje
 */
public class Lat1 {
    public static void main (String[] args){
       int n = 0;
        System.out.print("Input : ");
       try{
       n = System.in.read();
       }
       catch(java.io.IOException a){
           System.err.println(a);
       }
       System.out.println("Hasil : " + (char) n);
    }
}