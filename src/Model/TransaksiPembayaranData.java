/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.Date;
import java.util.TimeZone;
/**
 *
 * @author Syauqi Rahmat Sugara
 */
public class TransaksiPembayaranData {
    private String jam;
    private Date tglPembayaran;
    private TimeZone waktu;
    private int idTransaksi;
    private int idPesanan;
    private int total, bayar, kembalian;
    
    public TransaksiPembayaranData() {
    }

    public TransaksiPembayaranData(Date tglPembayaran, TimeZone waktu, int idTransaksi, int idPesanan, int total, int bayar, int kembalian) {
        this.tglPembayaran = tglPembayaran;
        this.waktu = waktu;
        this.idTransaksi = idTransaksi;
        this.idPesanan = idPesanan;
        this.total = total;
        this.bayar = bayar;
        this.kembalian = kembalian;
    }

    public int getBayar() {
        return bayar;
    }

    public void setBayar(int bayar) {
        this.bayar = bayar;
    }

    public int getKembalian() {
        return kembalian;
    }

    public void setKembalian(int kembalian) {
        this.kembalian = kembalian;
    }

    public Date getTglPembayaran() {
        return tglPembayaran;
    }

    public void setTglPembayaran(Date tglPembayaran) {
        this.tglPembayaran = tglPembayaran;
    }

    public TimeZone getWaktu() {
        return waktu;
    }

    public void setWaktu(TimeZone waktu) {
        this.waktu = waktu;
    }
       
    public int getIdPesanan() {
        return idPesanan;
    }

    public void setIdPesanan(int idPesanan) {
        this.idPesanan = idPesanan;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

}
