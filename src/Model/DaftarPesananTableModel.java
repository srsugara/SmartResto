/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Syauqi Rahmat Sugara
 */
public class DaftarPesananTableModel extends AbstractTableModel{
    private List<DaftarPesananData> pesananList;
    private String[] header={"Daftar Pesanan","Jumlah"};

    public DaftarPesananTableModel() {
    }

    
    public DaftarPesananTableModel(List<DaftarPesananData> pesananList) {
        this.pesananList = pesananList;
    }

    public List<DaftarPesananData> getPesananList() {
        return pesananList;
    }

    public void setPesananList(List<DaftarPesananData> pesananList) {
        this.pesananList = pesananList;
    }

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }   
    
    public int getRowCount() {
         //To change body of generated methods, choose Tools | Templates.
        return pesananList.size();
    }

    @Override
    public int getColumnCount() {
         //To change body of generated methods, choose Tools | Templates.
        return header.length;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //To change body of generated methods, choose Tools | Templates.
        if(columnIndex==0){
            return pesananList.get(rowIndex).getKodeMakanan();
        }
        else if(columnIndex==1){
            return pesananList.get(rowIndex).getJumlahPesanan();
        }
        return null;
    }
    
    @Override
    public String getColumnName(int column){
        return header[column];
    }

    public void setValueAt(Object valueAt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
