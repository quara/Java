/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesar_cipher;

/**
 *
 * @author Rohit
 */
public class Caesar_Cipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Caesar c=new Caesar();
        //System.out.println("Encryption order is: "+ new String(c.encrypt));
        //System.out.println("\nDecryption order is: "+ new String(c.decrypt));
        
        String secret="STUDYING AT ANSCHUTZ LIBRARY";
        String e_secret=c.encyption(secret);
        System.out.println(e_secret);
        String d_message=c.decryption(e_secret);
        System.out.println(d_secret);
        
        
        
    }
    
}
