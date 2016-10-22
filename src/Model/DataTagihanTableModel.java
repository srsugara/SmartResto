 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.event.EventListenerList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dilaaaaaaa
 */
public class DataTagihanTableModel extends AbstractTableModel {
    
    private List<TagihanData> tagihanList;
    private String[] header = {"No", "Nama Menu", "Harga Satuan", "Jumlah", "Total Harga"};

    public DataTagihanTableModel() {
    }

    public DataTagihanTableModel(List<TagihanData> tagihanList) {
        this.tagihanList = tagihanList;
    }

    public List<TagihanData> getTagihanList() {
        return tagihanList;
    }

    public void setTagihanList(List<TagihanData> tagihanList) {
        this.tagihanList = tagihanList;
    }
    
        
    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }
    
    @Override
    public int getRowCount() {
        return tagihanList.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if ( columnIndex == 0 ) {
            return rowIndex + 1;
        }
        if ( columnIndex == 1 ){
            return tagihanList.get(rowIndex).getNama();
        }
        else if ( columnIndex == 2 ){
            return tagihanList.get(rowIndex).getHarga();
        }
        else if ( columnIndex == 3 ){
            return tagihanList.get(rowIndex).getJumlah();
        }
        else if ( columnIndex == 4 ){
            return tagihanList.get(rowIndex).getTotalSatuan();
        }
        return null;
    }
    
    @Override
    public String getColumnName(int column){
        return header[column];
    }
    
    
    
    
}
