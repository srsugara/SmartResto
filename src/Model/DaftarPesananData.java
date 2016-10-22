/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Syauqi Rahmat Sugara
 */
public class DaftarPesananData{
    private int idPesanan, noMeja, jumlahPesanan, totalTagihan;
    private String kodeMakanan;
    
    // --------- konstruktor --------------------
    public DaftarPesananData() {
    }    
    
    public DaftarPesananData(int idPesanan, String kodeMakanan, int noMeja, int jumlahPesanan, int totalTagihan) {
        this.idPesanan = idPesanan;
        this.kodeMakanan = kodeMakanan;
        this.noMeja = noMeja;
        this.jumlahPesanan = jumlahPesanan;
        this.totalTagihan = totalTagihan;
    }

    // ----------- setter and getter -------------

    public int getNoMeja() {
        return noMeja;
    }

    public void setNoMeja(int noMeja) {
        this.noMeja = noMeja;
    }

    public int getIdPesanan() {
        return idPesanan;
    }

    public void setIdPesanan(int idPesanan) {
        this.idPesanan = idPesanan;
    }

    public String getKodeMakanan() {
        return kodeMakanan;
    }

    public void setKodeMakanan(String kode) {
        this.kodeMakanan = kode;
    }

    public int getJumlahPesanan() {
        return jumlahPesanan;
    }

    public void setJumlahPesanan(int jumlahPesanan) {
        this.jumlahPesanan = jumlahPesanan;
    }

    public int getTotalTagihan() {
        return totalTagihan;
    }

    public void setTotalTagihan(int totalTagihan) {
        this.totalTagihan = totalTagihan;
    }

    
    
}
