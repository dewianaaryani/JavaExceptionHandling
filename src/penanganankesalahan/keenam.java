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
public class keenam {
    //try...finally
    
    public static void main(String[] args){
        double angka = 100.0;
        System.out.println("Sebelum");
        
        for (int a=5; a>=0;a--){
            try{
                 System.out.print(angka + "/" + a + " = ");
                 System.out.println((angka / a));
            }
            finally{
                System.out.print("Bagian Finally dijalankan ;");
            }
        }
        System.out.println("Done");
    }
}
