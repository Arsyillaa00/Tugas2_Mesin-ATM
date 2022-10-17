/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Dao.AtmDao;
/**
 *
 * @author Anggasta
 */
public class AtmModel implements AtmDao{

    KetetapanSaldo saldo;
    
    public AtmModel(){
        
        this.saldo = KetetapanSaldo.getInstance();
        
    }
    
    public int batasSaldo(){
        
        return this.saldo.limitSaldo;
        
    }
    
    @Override
    public int getSaldo() {
        
        return this.saldo.getSaldoAwal(); 
        
    }

    @Override
    public void setorSaldo(int jumlah) {
        
        saldo.setSaldoAwal(saldo.getSaldoAwal() + jumlah);
        
    }

    @Override
    public void tarikSaldo(int jumlah) {
        
        saldo.setSaldoAwal(saldo.getSaldoAwal() - jumlah);
        
    }

    @Override
    public boolean cekLimitSaldo() {
        
        if(this.saldo.getSaldoAwal() <= this.saldo.limitSaldo){
            return true;
        } else {
            return false;
        }
        
    }
    
    @Override
    public int kelipatanTransaksi(int jumlah) {
        
        if(jumlah % 50000 == 0){
            return 1;
        } else {
            return 0; 
        }
        
    } 
}    
   