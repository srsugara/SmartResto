/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Syauqi Rahmat Sugara
 */
public class LaporanKeuanganData {
    private int noLaporan,noPembayaran;
    private int totalPemasukan,pemasukan;
    private String tanggal;
    
    public LaporanKeuanganData() {
    }

    public LaporanKeuanganData(int noLaporan, int totalPemasukan) {
        this.noLaporan = noLaporan;
        this.totalPemasukan = totalPemasukan;
    }

    public int getNoLaporan() {
        return noLaporan;
    }

    public void setNoLaporan(int noLaporan) {
        this.noLaporan = noLaporan;
    }

    public int getTotalPemasukan() {
        return totalPemasukan;
    }

    public void setTotalPemasukan(int totalPemasukan) {
        this.totalPemasukan = totalPemasukan;
    }

    public int getNoPembayaran() {
        return noPembayaran;
    }

    public void setNoPembayaran(int noPembayaran) {
        this.noPembayaran = noPembayaran;
    }

    public int getPemasukan() {
        return pemasukan;
    }

    public void setPemasukan(int pemasukan) {
        this.pemasukan = pemasukan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    
    
}
