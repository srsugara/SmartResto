/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DaftarMenuData;
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
 * @author dilaaaaaaa
 */
public class ControllerKelolaMenu {

    // ------------- tampil Daftar Menu berdasarkan kategori -------------------------------
    public List<DaftarMenuData> tampilDaftarMenu(String kategori) throws SQLException, ClassNotFoundException   {
       List<DaftarMenuData> menu = new ArrayList<>();
        Connection con = ConnectionDB.connectDB(); // koneksi ke database
        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT kode, nama, harga, status FROM daftarmenu WHERE kategori = '" + kategori +"'");
            
            while ( rs.next() ) {
                DaftarMenuData daftarMenu = new DaftarMenuData();
                daftarMenu.setKode(rs.getString("kode"));
                daftarMenu.setNama(rs.getString("nama"));
                daftarMenu.setHarga(rs.getInt("harga"));
                daftarMenu.setStatus(rs.getString("status"));
                menu.add(daftarMenu);
            }
        }
        catch(SQLException e){
            
        }
        
        finally {
            if ( con != null ) {
                con.close();
            }
        }
        
        return menu;        
    } 
    
    // ------------- tampil Status Menu berdasarkan nama makanan -------------------------------
    public String tampilDaftarMenu(String nama, String kategori) throws SQLException, ClassNotFoundException   {
        Connection con = ConnectionDB.connectDB(); // koneksi ke database
        DaftarMenuData daftarMenu = null;
        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT status FROM daftarmenu WHERE kategori = '" + kategori + "' && nama = '" + nama + "'");
            
            while ( rs.next() ) {
                daftarMenu = new DaftarMenuData();
                daftarMenu.setStatus(rs.getString("status"));
            }
        }
        catch(SQLException e){
            
        }
        
        finally {
            if ( con != null ) {
                con.close();
            }
        }
        
        return daftarMenu.getStatus();        
    } 
    
    // ------------- tampil ID Menu berdasarkan nama menu -------------------------------
    public String getIdMenu(String nama) throws SQLException, ClassNotFoundException   {
        Connection con = ConnectionDB.connectDB(); // koneksi ke database
        DaftarMenuData daftarMenu = null;
        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT kode FROM daftarmenu WHERE nama = '" + nama + "'");
            
            while ( rs.next() ) {
                daftarMenu = new DaftarMenuData();
                daftarMenu.setKode(rs.getString("kode"));
            }
        }
        catch(SQLException e){
            
        }
        
        finally {
            if ( con != null ) {
                con.close();
            }
        }
        
        return daftarMenu.getKode();        
    }
    
    // ------------ tampil harga menu berdasarkan nama menu --------------------------------
    public int getHargaMenu(String nama) throws SQLException, ClassNotFoundException   {
        Connection con = ConnectionDB.connectDB(); // koneksi ke database
        DaftarMenuData daftarMenu = null;
        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT harga FROM daftarmenu WHERE nama = '" + nama + "'");
            
            while ( rs.next() ) {
                daftarMenu = new DaftarMenuData();
                daftarMenu.setHarga(rs.getInt("harga"));
            }
        }
        catch(SQLException e){
            
        }
        
        finally {
            if ( con != null ) {
                con.close();
            }
        }
        
        return daftarMenu.getHarga();        
    }
    
    // ----------------- Tambah Data Menu ke database ----------------------------------
    public void tambahDaftarMenu(DaftarMenuData menu) throws SQLException {
        
        Connection con = ConnectionDB.connectDB();
        
        try {
            PreparedStatement stat = con.prepareStatement("INSERT INTO daftarmenu VALUES (?, ?, ?, ?, ?)"); // query untuk memasukkan data ke database
            stat.setString(1, menu.getKode());
            stat.setString(2, menu.getNama());
            stat.setInt(3, menu.getHarga());
            stat.setString(4, menu.getKategori());
            stat.setString(5, menu.getStatus());
            stat.executeUpdate();
        }
        finally {
            if ( con != null ) {
                con.close();
            }
        }
    }
    
    // ----------------- Hapus Data Menu dari database -----------------------------------
    
    public void hapusDaftarMenu(DaftarMenuData menu) throws SQLException {
        
        Connection con = ConnectionDB.connectDB();
        try {
            PreparedStatement ps = con.prepareStatement("DELETE FROM daftarmenu WHERE kode = ? "); // query untuk menghapus data dari database
            ps.setString(1, menu.getKode());
            ps.executeUpdate();
        }
        finally {
            if ( con != null ) {
                con.close();
            }
        }
    }
    
    // ----------------- Update Data Menu  Pada Database -----------------------------------
    
    public void ubahDaftarMenu(String kode, int harga, String nama) throws SQLException{
        
        Connection con = ConnectionDB.connectDB();
        try {
            Statement st = con.createStatement();
            int result =  st.executeUpdate("UPDATE daftarmenu SET nama = '" + nama + "', harga = "+harga+" WHERE kode = '"+kode+"'"); // query untuk mengubah data
            if(result >= 1){      
                JOptionPane.showMessageDialog(null, "Berhasil mengupdate data.");
            }else{
                JOptionPane.showMessageDialog(null, "Gagal mengupdate data.");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }        
        finally {
            if ( con != null ) {
                con.close();
            }
        }
    }
    
    // ------------- Ubah Status Ketersediaan Menu -------------------------
    public void ubahStatusMenu(String status,String nama){
        
        Connection con = ConnectionDB.connectDB();
        try {
            Statement st = con.createStatement();
            int result =  st.executeUpdate("UPDATE daftarmenu SET status='" + status + "' WHERE nama='" + nama + "'");
            if(result >= 1){      
                JOptionPane.showMessageDialog(null, "Ubah status menu berhasil.");
            }else{
                JOptionPane.showMessageDialog(null, "Maaf status menu gagal diubah");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    
    
}
