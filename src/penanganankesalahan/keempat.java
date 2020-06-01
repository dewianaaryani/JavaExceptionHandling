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
public class keempat {
    
    //pelemparan exception secara sengaja dengan throw
    static void mencoba(){
        try{
            throw new NullPointerException("coba");
        }
        catch (NullPointerException e){
            throw e;
        }
    }
    
    public static void main(String[] args){
        try{
            mencoba();
        }
        catch(NullPointerException e){
            System.out.println("RE-Caught : " + e);
        }
    }
}
