/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.AtmModel;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.bean.ManagedBean;

@ManagedBean(name = "TransaksiNasabah") 
@RequestScoped 

public class AtmView {
    private AtmModel model;
    private String responSetorTunani;
    private String responTarikTunani;
    private int jumlah;
    
    public AtmView() {
        
        model = new AtmModel();
        
    }

    public String getResponSetorTunani() {
        if(model.kelipatanTransaksi(jumlah) == 1){
            
            model.setorSaldo(jumlah);
            return ("[ Transaksi Setor Tunai Anda Berhasil Dilakukan  ]");
            
        } else{
            
            return ("[ Hanya Menerima Transaksi Setor Tunai Berkelipatan 50000 ]");
            
        }
    } 

    public String getResponTarikTunani() {
                
        if(model.cekLimitSaldo()){
            
            return ("[ Saldo Anda telah mencapai Limit Transaksi ]");
            
        } else if((model.getSaldo() - jumlah) < model.batasSaldo()){
            
            return ("[ Transaksi Gagal, jumlah melebihi batas limit Tarik Tunai ]");
            
        } else if((model.getSaldo() > jumlah) && (model.kelipatanTransaksi(jumlah) == 1)){
            
            model.tarikSaldo(jumlah);
            return ("[ Transaksi Tarik Tunai Anda Berhasil ]");
            
        } else{
            
            return  ("[ Hanya Menerima Transaksi Tarik Tunai Berkelipatan 50000 ]");
            
        }    
    
    }  
    
    public int cekSaldo(){
        
        return model.getSaldo();
        
    }

    public int getJumlah() {
        
        return jumlah;
        
    }

    public void setJumlah(int jumlah) {
        
        this.jumlah = jumlah;
        
    }
   
}     