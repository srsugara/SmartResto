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
public class BuatLaporanTableModel extends AbstractTableModel{
    private List<LaporanKeuanganData> laporanList;
    private String[] header={"No Pembayaran","Pemasukan"};

    public BuatLaporanTableModel() {
    }

    public BuatLaporanTableModel(List<LaporanKeuanganData> laporanList) {
        this.laporanList = laporanList;
    }

    public List<LaporanKeuanganData> getLaporanList() {
        return laporanList;
    }

    public void setLaporanList(List<LaporanKeuanganData> laporanList) {
        this.laporanList = laporanList;
    }

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }   
    
    public int getRowCount() {
         //To change body of generated methods, choose Tools | Templates.
        return laporanList.size();
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
            return laporanList.get(rowIndex).getNoPembayaran();
        }
        else if(columnIndex==1){
            return laporanList.get(rowIndex).getPemasukan();
        }
        return null;
    }
    
    @Override
    public String getColumnName(int column){
        return header[column];
    }

}
