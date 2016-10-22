/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DaftarPesananData;
import Model.LaporanKeuanganData;
import Model.TransaksiPembayaranData;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author dilaaaaaaa
 */
public class ControllerKelolaTransaksi {
    
    public static Date waktu() throws ParseException {

        java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
//        java.util.Timer utilTime= new java.util.Timer();
//        java.sql.Time sqlTime = new java.sql.Time();
        return sqlDate;
        
    }
    
    public int getIdTransaksi() throws SQLException, ClassNotFoundException   {

        Connection con = ConnectionDB.connectDB(); // koneksi ke database
        TransaksiPembayaranData id = null;
        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT id_transaksi FROM transaksi_pembayaran");
            
            while ( rs.next() ) {
                id = new TransaksiPembayaranData();
                id.setIdTransaksi(rs.getInt("id_transaksi"));
            }
        }
        catch(SQLException e){
            
        }
        
        finally {
            if ( con != null ) {
                con.close();
            }
        }
        
        return id.getIdTransaksi();        
    }
    // ---------------- tambah data transaksi pembayaran -------------------------
    public void tambahDaftarTransaksi(DaftarPesananData pesanan) throws SQLException {
        
        Connection con = ConnectionDB.connectDB();
        
        try {
            PreparedStatement stat = con.prepareStatement("INSERT INTO daftarpesanan VALUES (?, ?, ?)"); // query untuk memasukkan data ke database
            stat.setInt(1, pesanan.getIdPesanan());
            stat.setInt(2, pesanan.getNoMeja());
            stat.setInt(3, pesanan.getTotalTagihan());
            stat.executeUpdate();
        }
        finally {
            if ( con != null ) {
                con.close();
            }
        }
    }
    
    // ---------------- tambah Transaksi Pembayaran ---------------------------
    public void tambahTransaksiPembayaran(TransaksiPembayaranData transaksi) throws SQLException {
        
        Connection con = ConnectionDB.connectDB();
        
        try {
            PreparedStatement stat = con.prepareStatement("INSERT INTO transaksi_pembayaran VALUES (?, ?, ?, ?, ?, ?, ?)"); // query untuk memasukkan data ke database
            stat.setInt(1, transaksi.getIdTransaksi());
            stat.setInt(2, transaksi.getIdPesanan());
            stat.setInt(3, transaksi.getTotal());
            stat.setInt(4, transaksi.getBayar());
            stat.setInt(5, transaksi.getKembalian());
            stat.setDate(6, waktu());
            stat.setString(7, transaksi.getJam());
            
//            stat.setTime(5, (Time) transaksi.getWaktu());
            stat.executeUpdate();
        }
        catch (ParseException ex) {
            Logger.getLogger(ControllerKelolaTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }        finally {
            if ( con != null ) {
                con.close();
            }
        }
    }
    
    public void tambahLaporanKeuangan(LaporanKeuanganData laporan) throws SQLException {
        Connection con = ConnectionDB.connectDB();
        
        try {
            PreparedStatement stat = con.prepareStatement("INSERT INTO laporan_keuangan VALUES (?, ?, ?, ?)"); // query untuk memasukkan data ke database
            stat.setInt(1, laporan.getNoLaporan());
            stat.setInt(2, laporan.getNoPembayaran());
            stat.setString(3, laporan.getTanggal());
            stat.setInt(4, laporan.getPemasukan());
            
//            stat.setTime(5, (Time) transaksi.getWaktu());
            stat.executeUpdate();
        }
        finally {
            if ( con != null ) {
                con.close();
            }
        }
    }
    
    // ---------------- mengambil status transaksi dari id terakhir pesanan -----------------
    public boolean getStatusTransaksi (int id) throws SQLException {
        Connection con = ConnectionDB.connectDB(); // koneksi ke database
        boolean status = false;
        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT id_pesanan FROM daftarpesanan WHERE id_pesanan = " + id);
            if ( !rs.next() ) {
                status = false;
            } 
            else {
                status = true;
            }
        }
        catch(SQLException e){
            
        }
        
        finally {
            if ( con != null ) {
                con.close();
            }
        }
        
        return status;
    } 
    
    // ---------------- ubah status transaksi dari id terakhir pesanan -----------------
    public void updateStatusTransaksi (int id) throws SQLException {
        Connection con = ConnectionDB.connectDB(); // koneksi ke database
        boolean status = false;
        try {
            Statement st = con.createStatement();
            int result =  st.executeUpdate("UPDATE pesanan_sementara SET status = 1 WHERE id_pesanan = " + id);
        }
        catch(SQLException e){
            
        }
        
        finally {
            if ( con != null ) {
                con.close();
            }
        }
    } 
    
    // --------------- update total tagihan jika id transaksi sudah ada dalam database --------------------------------
    public void updateDaftarTransaksi (int id, int total) throws SQLException {
        Connection con = ConnectionDB.connectDB();
        try {
            Statement st = con.createStatement();
            int result =  st.executeUpdate("UPDATE daftarpesanan SET total_tagihan = " + total + " WHERE id_pesanan = " + id); // query untuk mengubah data
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }        
        finally {
            if ( con != null ) {
                con.close();
            }
        }
    }
    
    public List<LaporanKeuanganData> tampilTransaksi(String tgl) throws SQLException, ClassNotFoundException   {
        List<LaporanKeuanganData> transaksiList=new ArrayList<>();
        Connection con = ConnectionDB.connectDB(); // koneksi ke database
        
        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT id_transaksi,total FROM transaksi_pembayaran WHERE tanggal='"+tgl+"'");
            
            while ( rs.next() ) {
                LaporanKeuanganData transaksi = new LaporanKeuanganData();
                transaksi.setNoPembayaran(rs.getInt("id_transaksi"));
                transaksi.setPemasukan(rs.getInt("total"));
                transaksiList.add(transaksi);
            }
        }
        catch(SQLException e){
            
        }
        
        finally {
            if ( con != null ) {
                con.close();
            }
        }
        return transaksiList;        
    }
    
    public List<LaporanKeuanganData> tampilLaporan() throws SQLException, ClassNotFoundException   {
        List<LaporanKeuanganData> laporanList=new ArrayList<>();
        Connection con = ConnectionDB.connectDB(); // koneksi ke database
        
        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT tanggal,pemasukan FROM laporan_keuangan");
            
            while ( rs.next() ) {
                LaporanKeuanganData laporan = new LaporanKeuanganData();
                laporan.setTanggal(rs.getString("tanggal"));
                laporan.setPemasukan(rs.getInt("pemasukan"));
                laporanList.add(laporan);
            }
        }
        catch(SQLException e){
            
        }
        
        finally {
            if ( con != null ) {
                con.close();
            }
        }
        return laporanList;        
    }
    
    public int hitungTotalPemasukan(String tgl) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionDB.connectDB(); // koneksi ke database
        LaporanKeuanganData total=null;
        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT SUM(total) AS pemasukan FROM transaksi_pembayaran WHERE tanggal = '"+tgl+"'");
            
           while ( rs.next() ) {
                total = new LaporanKeuanganData();
                
                total.setPemasukan(rs.getInt("pemasukan"));
           }   
            
        }
        catch(SQLException e){
            
        }
        
        finally {
            if ( con != null ) {
                con.close();
            }
        }
        
        return total.getPemasukan();  
    } 
    
}
