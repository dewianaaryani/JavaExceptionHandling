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
public class kelima {
    //pernyataan throws
    static void methodQ() throws IllegalAccessException{
        System.out.println("isi method");
        throw new IllegalAccessException("coba");
    }
    
    public static void main(String[] args){
        try{
            methodQ();
            
        }
        catch(IllegalAccessException e){
            System.out.println("Caught : " + e);
                    
        }
    }
}
