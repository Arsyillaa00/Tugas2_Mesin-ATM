/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

/**
 *
 * @author Anggasta
 */
public interface AtmDao {
    
    int getSaldo();
    void setorSaldo(int jumlah);
    void tarikSaldo(int jumlah);
    boolean cekLimitSaldo(); 
    int kelipatanTransaksi(int jumlah);
    
}   
 