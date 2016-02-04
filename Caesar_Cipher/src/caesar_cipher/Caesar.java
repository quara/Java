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
public class Caesar {
    
    public static int alpha_count=26; 
    char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    
    public final char[] encrypt=new char[alpha_count];
    public final char[] decrypt=new char[alpha_count];
    
    public Caesar(){
    for(int i=0;i<alpha_count;i++){
        encrypt[i]=alphabet[((i+3)%alpha_count)];
        decrypt[encrypt[i]-'A']=alphabet[i];
  }
    }
    
    public String encyption(String secret){
    
    char[] mess=secret.toCharArray();
    for(int i=0;i<mess.length;i++){
    
        if(Character.isUpperCase(mess[i])){
        mess[i]=encrypt[mess[i]-'A'];
        }
        
    }
    return new String(mess);
    
    }
    
    public String decryption(String secret){
    
    char[] mess=secret.toCharArray();
    for(int i=0;i<mess.length;i++){
        if(Character.isUpperCase(mess[i])){
            mess[i]=decrypt[mess[i]-'A'];
        }
    }
    
    return new String(mess);
    }
    
    
}
