/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.SystemColor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dilaaaaaaa
 */
public class TagihanData{
    private int total,harga,jumlah,totalSatuan;
    private String nama;


    public TagihanData() {
    }

    public TagihanData(int total) {
        this.total = total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getTotalSatuan() {
        return totalSatuan;
    }

    public void setTotalSatuan(int totalSatuan) {
        this.totalSatuan = totalSatuan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
}
