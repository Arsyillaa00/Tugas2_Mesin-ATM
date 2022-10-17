package Mvc;

public class AtmTampilan {    
    
    public static AtmTampilan instance = new AtmTampilan();
    
    public AtmTampilan(){}
    
    public static AtmTampilan getInstance() {
        
        return instance;
        
    }
    
    public void displayPesan(String message){
       
     System.out.print(message);  
     
    }
   
    public void displayPesanBaris(String message){
       
     System.out.println(message);
     
    }
   
    public void displaySaldo(int jumlah){  
       
     System.out.println(jumlah);  
     
   }
    
}    
 