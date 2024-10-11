package de.hansemerkur.beispiele;

public class Passwort {
    public static boolean passwortTest(){
       if(data.length() < 10){
        return false;

       }else{
        return true;
       }
        
    }

    static String data="Hund";
    
    public static void setData(String neuPasswort){
        data=neuPasswort;
    }  

    public static void printData(){
       System.out.println("Passwort:"+data);
       
    }
}
