/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;

/**
 *
 * @author dilaaaaaaa
 */
public class PesananSementara {
    private int id, idPesanan, jumlah, total, noMeja, status;
    private String kodeMenu;
    private List<DaftarMenuData> daftarMenu;

    public PesananSementara() {
    }

    public PesananSementara(int id, int idPesanan, int jumlah, int total, int noMeja, int status, String kodeMenu, List<DaftarMenuData> daftarMenu) {
        this.id = id;
        this.idPesanan = idPesanan;
        this.jumlah = jumlah;
        this.total = total;
        this.noMeja = noMeja;
        this.status = status;
        this.kodeMenu = kodeMenu;
        this.daftarMenu = daftarMenu;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getNoMeja() {
        return noMeja;
    }

    public void setNoMeja(int noMeja) {
        this.noMeja = noMeja;
    }   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPesanan() {
        return idPesanan;
    }

    public void setIdPesanan(int idPesanan) {
        this.idPesanan = idPesanan;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<DaftarMenuData> getDaftarMenu() {
        return daftarMenu;
    }

    public void setDaftarMenu(List<DaftarMenuData> daftarMenu) {
        this.daftarMenu = daftarMenu;
    }

    public String getKodeMenu() {
        return kodeMenu;
    }

    public void setKodeMenu(String kodeMenu) {
        this.kodeMenu = kodeMenu;
    }
    
    
    
}
