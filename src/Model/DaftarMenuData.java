/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author dilaaaaaaa
 */
public class DaftarMenuData {
    private String nama, kode, status, kategori;
    private int harga,jumlah;

    // ------ constructor ---------
    public DaftarMenuData() {
    }

    public DaftarMenuData(String nama, String kode, String status, String kategori, int harga, int jumlah) {
        this.nama = nama;
        this.kode = kode;
        this.status = status;
        this.kategori = kategori;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    
    
    // ------ setter and getter

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    
    
    
}
