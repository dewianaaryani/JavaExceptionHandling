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
public class test {
    public static void main(String[] args){
        System.out.println("Sebelum");
        try{
            System.out.println(5/0);
        }
        catch(Throwable t){
            System.err.println("Terjadi");
        }
        System.out.println("Sesudah");
    }
}
