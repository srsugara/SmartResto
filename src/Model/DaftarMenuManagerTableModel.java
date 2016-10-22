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
public class DaftarMenuManagerTableModel extends AbstractTableModel{
    
    private List<DaftarMenuData> menuList;
    private String[] header={"Nama","Harga"};

    public DaftarMenuManagerTableModel() {
    }

    
    public DaftarMenuManagerTableModel(List<DaftarMenuData> menuList) {
        this.menuList = menuList;
    }

    public List<DaftarMenuData> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<DaftarMenuData> menuList) {
        this.menuList = menuList;
    }
    
    

    public int getRowCount() {
         //To change body of generated methods, choose Tools | Templates.
        return menuList.size();
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
            return menuList.get(rowIndex).getNama();
        }
        else if(columnIndex==1){
            return menuList.get(rowIndex).getHarga();
        }
        else if(columnIndex==2){
            return menuList.get(rowIndex).getJumlah();
        }
        else if(columnIndex==3){
            return menuList.get(rowIndex).getStatus();
        }
        return null;
    }
    
    @Override
    public String getColumnName(int column){
        return header[column];
    }
    
}
