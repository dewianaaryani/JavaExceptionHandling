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
public class Lat3 {
    public static void main(String[] args){
//        byte[] b = new byte[5];
//        System.out.print("Input bilangan bulat : ");
//        try{
//            System.in.read(b);
//        }
//        catch(java.io.IOException e);
//        int N = Integer.valueOf(b) .intValue();
//        System.out.println("Hasil : " + (N+2));
    
    byte[] b = new byte[5];
    char[] c = new char[5];
        System.out.print("Input bilangan bulat : ");
        try{
            System.in.read(b);
            for (int i = 0; i<b.length; i++){
                if (Integer.valueOf(b[i]) >= 48 && Integer.valueOf(b[i]) <= 57)
                {
                    c[i] = (char) b[i];
                }
            }
            String cString = new String(c).trim();
            System.out.println("Hasil : " + (Integer.valueOf(cString) + 2));
        }catch(NumberFormatException e){
            System.out.println("Masukkan angka benar: ");
        }catch(Exception e){
            System.err.println(e);
        }
    }
}
