/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DaftarMenuData;
import Model.DaftarPesananData;
import Model.DataTagihanTableModel;
import Model.PesananSementara;
import Model.TagihanData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Ayu Aldila Salma
 */
public class ControllerKelolaPesanan {
    

    // -------------- tampil daftar pesanan berdasarkan no meja ----------------------------------------
    public List<DaftarPesananData> tampilDaftarPesananDapur(int noMeja) throws SQLException, ClassNotFoundException   {
       List<DaftarPesananData> pesanan = new ArrayList<>();
        Connection con = ConnectionDB.connectDB(); // koneksi ke database
        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT dm.nama,ps.jumlah FROM pesanan_sementara as ps INNER JOIN daftarmenu as dm ON ps.id_menu=dm.kode AND ps.status=0 AND ps.no_meja="+noMeja);
            
            while ( rs.next() ) {
                DaftarPesananData order = new DaftarPesananData();
                order.setKodeMakanan(rs.getString("nama"));
                order.setJumlahPesanan(rs.getInt("jumlah"));
                               
                pesanan.add(order);
            }
        }
        catch(SQLException e){
            
        }
        
        finally {
            if ( con != null ) {
                con.close();
            }
        }
        
        return pesanan;        
    }
    
    // -------------- tampil daftar pesanan berdasarkan pelanggan ----------------------------------------
    public List<DaftarPesananData> tampilDaftarPesananPelanggan() throws SQLException, ClassNotFoundException   {
       List<DaftarPesananData> pesanan = new ArrayList<>();
        Connection con = ConnectionDB.connectDB(); // koneksi ke database
        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT dm.nama,ps.jumlah FROM pesanan_sementara as ps INNER JOIN daftarmenu as dm ON ps.id_menu=dm.kode AND ps.status=0");
            
            while ( rs.next() ) {
                DaftarPesananData order = new DaftarPesananData();
                order.setKodeMakanan(rs.getString("nama"));
                order.setJumlahPesanan(rs.getInt("jumlah"));
                               
                pesanan.add(order);
            }
        }
        catch(SQLException e){
            
        }
        
        finally {
            if ( con != null ) {
                con.close();
            }
        }
        
        return pesanan;        
    }
    
    
    // ----------------- Tambah Daftar Pesanan Ke Database ----------------------------------
    public void tambahDaftarPesanan(List<PesananSementara> pesanan) throws SQLException {
        
        Connection con = ConnectionDB.connectDB();
        
        try {
            PreparedStatement stat = con.prepareStatement("INSERT INTO pesanan_sementara VALUES (?, ?, ?, ?, ?, ?, ?)"); // query untuk memasukkan data ke database
            for ( int i = 0; i < pesanan.size(); i++) {
                stat.setInt(1, pesanan.get(i).getIdPesanan());
                stat.setString(2, pesanan.get(i).getKodeMenu());
                stat.setInt(3, pesanan.get(i).getNoMeja());
                stat.setInt(4, pesanan.get(i).getJumlah());
                stat.setInt(5, pesanan.get(i).getId());
                stat.setInt(6, pesanan.get(i).getTotal());
                stat.setInt(7, pesanan.get(i).getStatus());
                stat.addBatch();
            }
            stat.executeBatch();
        }
        finally {
            if ( con != null ) {
                con.close();
            }
        }
    }
    
     // ------------- Ambil ID terakhir pesanan dari database -------------------------------
    public int getIdPesanan() throws SQLException, ClassNotFoundException   {

        Connection con = ConnectionDB.connectDB(); // koneksi ke database
        PesananSementara id = null;
        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT id_pesanan FROM pesanan_sementara");
            
            while ( rs.next() ) {
                id = new PesananSementara();
                id.setIdPesanan(rs.getInt("id_pesanan"));
            }
        }
        catch(SQLException e){
            
        }
        
        finally {
            if ( con != null ) {
                con.close();
            }
        }
        
        return id.getIdPesanan();        
    }
    
    // ------------- Ambil ID terakhir pesanan dari database -------------------------------
    public int getIdPesanan(int noMeja) throws SQLException, ClassNotFoundException   {

        Connection con = ConnectionDB.connectDB(); // koneksi ke database
        PesananSementara id = null;
        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT id_pesanan FROM pesanan_sementara WHERE no_meja = "+noMeja+ " AND status = 0");
            
            while ( rs.next() ) {
                id = new PesananSementara();
                id.setIdPesanan(rs.getInt("id_pesanan"));
            }
        }
        catch(SQLException e){
            
        }
        
        finally {
            if ( con != null ) {
                con.close();
            }
        }
        
        return id.getIdPesanan();        
    }
    
    public int getIdTransaksiBaru() throws SQLException, ClassNotFoundException   {

        Connection con = ConnectionDB.connectDB(); // koneksi ke database
        PesananSementara id = null;
        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT id_pesanan FROM pesanan_sementara WHERE status = 0");
            
            while ( rs.next() ) {
                id = new PesananSementara();
                id.setIdPesanan(rs.getInt("id_pesanan"));
            }
        }
        catch(SQLException e){
            
        }
        
        finally {
            if ( con != null ) {
                con.close();
            }
        }
        
        return id.getIdPesanan();        
    }
    
     // ------------- Ambil status terakhir pesanan dari database -------------------------------
    public int getStatusPesanan(int idPesanan) throws SQLException, ClassNotFoundException   {

        Connection con = ConnectionDB.connectDB(); // koneksi ke database
        PesananSementara id = null;
        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT status FROM pesanan_sementara WHERE id_pesanan = " + idPesanan);
            
            while ( rs.next() ) {
                id = new PesananSementara();
                id.setStatus(rs.getInt("status"));
            }
        }
        catch(SQLException e){
            
        }
        
        finally {
            if ( con != null ) {
                con.close();
            }
        }
        
        return id.getStatus();        
    }
   
    // --------------- method untuk menampilkan data tagihan --------------------------------
    public List<TagihanData> tampilTagihan(int id) throws SQLException, ClassNotFoundException   {
        Connection con = ConnectionDB.connectDB(); // koneksi ke database
        List<TagihanData> tagihanList=new ArrayList<>();
        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT dm.nama,dm.harga,ps.jumlah,ps.total FROM daftarmenu AS dm INNER JOIN pesanan_sementara AS ps ON dm.kode=ps.id_menu AND ps.id_pesanan = '" + id + "'");
            
            while ( rs.next() ) {
                TagihanData tagihan = new TagihanData();
                
                tagihan.setNama(rs.getString("dm.nama"));
                tagihan.setHarga(rs.getInt("dm.harga"));
                tagihan.setJumlah(rs.getInt("jumlah"));
                tagihan.setTotalSatuan(rs.getInt("total"));
                tagihanList.add(tagihan);
            }
        }
        catch(SQLException e){
            
        }
        
        finally {
            if ( con != null ) {
                con.close();
            }
        }
        return tagihanList;        
    }   
    
    // --------------- method untuk menampilkan data tagihan --------------------------------
    public List<TagihanData> tampilDetailTagihan(int id, int noMeja) throws SQLException, ClassNotFoundException   {
        Connection con = ConnectionDB.connectDB(); // koneksi ke database
        List<TagihanData> tagihanList=new ArrayList<>();
        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT dm.nama,dm.harga, ps.jumlah,ps.total FROM daftarmenu AS dm INNER JOIN pesanan_sementara AS ps ON dm.kode=ps.id_menu "
                    + "AND no_meja = '" + noMeja + "' WHERE ps.status = 0");
            
            while ( rs.next() ) {
                TagihanData tagihan = new TagihanData();
                
                tagihan.setNama(rs.getString("dm.nama"));
                tagihan.setHarga(rs.getInt("dm.harga"));
                tagihan.setJumlah(rs.getInt("jumlah"));
                tagihan.setTotalSatuan(rs.getInt("total"));
                tagihanList.add(tagihan);
            }
        }
        catch(SQLException e){
            
        }
        
        finally {
            if ( con != null ) {
                con.close();
            }
        }
        return tagihanList;        
    }   
    
    // ---------------- method untuk menghitung total tagihan keseluruhan ----------------
    public int hitungTotalTagihan(int id) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionDB.connectDB(); // koneksi ke database
        TagihanData total=null;
        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT SUM(Total) AS totalsemua FROM pesanan_sementara WHERE status=0 AND id_pesanan = "+id);
            
           while ( rs.next() ) {
                total = new TagihanData();
                
                total.setTotal(rs.getInt("totalsemua"));
           }   
            
        }
        catch(SQLException e){
            
        }
        
        finally {
            if ( con != null ) {
                con.close();
            }
        }
        
        return total.getTotal();  
    } 
    
}
