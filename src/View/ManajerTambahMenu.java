/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerKelolaMenu;
import Model.DaftarMenuData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

/**
 *
 * @author Syauqi Rahmat Sugara
 */
public class ManajerTambahMenu extends javax.swing.JDialog {
    
    ControllerKelolaMenu db;
    /**
     * Creates new form TambahMenu
     */
    public ManajerTambahMenu(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        
        db = new ControllerKelolaMenu();
                
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dataMenuPane = new javax.swing.JPanel();
        namaLabel = new javax.swing.JLabel();
        hargaLabel = new javax.swing.JLabel();
        namaMenuText = new javax.swing.JTextField();
        kembaliButton = new javax.swing.JButton();
        tambahButton = new javax.swing.JButton();
        kategoriLabel = new javax.swing.JLabel();
        kategoriComboBox = new javax.swing.JComboBox();
        kodeLabel = new javax.swing.JLabel();
        kodeMenuText = new javax.swing.JTextField();
        hargaMenuText = new javax.swing.JTextField();
        judulLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Override");

        dataMenuPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));

        namaLabel.setText("Nama     : ");

        hargaLabel.setText("Harga    : ");

        kembaliButton.setText("Kembali");
        kembaliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliButtonActionPerformed(evt);
            }
        });

        tambahButton.setText("Tambah");
        tambahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahButtonActionPerformed(evt);
            }
        });

        kategoriLabel.setText("Kategori :");

        kategoriComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Makanan", "Minuman", "Dessert" }));

        kodeLabel.setText("Kode      :");

        javax.swing.GroupLayout dataMenuPaneLayout = new javax.swing.GroupLayout(dataMenuPane);
        dataMenuPane.setLayout(dataMenuPaneLayout);
        dataMenuPaneLayout.setHorizontalGroup(
            dataMenuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataMenuPaneLayout.createSequentialGroup()
                .addGroup(dataMenuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dataMenuPaneLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(dataMenuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dataMenuPaneLayout.createSequentialGroup()
                                .addComponent(kategoriLabel)
                                .addGap(18, 18, 18)
                                .addComponent(kategoriComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dataMenuPaneLayout.createSequentialGroup()
                                .addGroup(dataMenuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(dataMenuPaneLayout.createSequentialGroup()
                                        .addGroup(dataMenuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(hargaLabel)
                                            .addComponent(kodeLabel))
                                        .addGap(19, 19, 19))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataMenuPaneLayout.createSequentialGroup()
                                        .addComponent(namaLabel)
                                        .addGap(18, 18, 18)))
                                .addGroup(dataMenuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(namaMenuText)
                                    .addGroup(dataMenuPaneLayout.createSequentialGroup()
                                        .addComponent(kodeMenuText)
                                        .addGap(2, 2, 2))
                                    .addComponent(hargaMenuText, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(dataMenuPaneLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(kembaliButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(tambahButton)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        dataMenuPaneLayout.setVerticalGroup(
            dataMenuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataMenuPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dataMenuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kategoriLabel)
                    .addComponent(kategoriComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(dataMenuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kodeLabel)
                    .addComponent(kodeMenuText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dataMenuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaMenuText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaLabel))
                .addGap(18, 18, 18)
                .addGroup(dataMenuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hargaLabel)
                    .addComponent(hargaMenuText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dataMenuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kembaliButton)
                    .addComponent(tambahButton))
                .addGap(54, 54, 54))
        );

        judulLabel.setFont(new java.awt.Font("Panefresco 250wt", 0, 28)); // NOI18N
        judulLabel.setText("Tambah Menu ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(judulLabel)
                .addGap(116, 116, 116))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dataMenuPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2147483334, 2147483334, 2147483334))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(judulLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataMenuPane, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(456, 389));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tambahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahButtonActionPerformed
      try {
            String kategori = kategoriComboBox.getSelectedItem().toString();
            String nama = namaMenuText.getText();
            String harga = hargaMenuText.getText();
            String kode = kodeMenuText.getText();
            
            
            if ( !kategori.isEmpty() && !nama.isEmpty() && !harga.isEmpty() && !kode.isEmpty() ) { // melakukan pengecekan inputan
                if(harga.matches("[0-9]*")){   
                    DaftarMenuData menu = new DaftarMenuData();
                    menu.setKode(kode);
                    menu.setNama(nama);
                    menu.setKategori(kategori);
                    menu.setHarga(Integer.parseInt(harga));
                    menu.setStatus("tersedia");
                    db.tambahDaftarMenu(menu);
                    JOptionPane.showMessageDialog(this, "Data Menu Berhasil di Simpan");
                    clear();
                }else{
                    JOptionPane.showMessageDialog(this, "Harga harus format angka");
                }
            }
            else {
                JOptionPane.showMessageDialog(this, "Data tidak boleh kosong");
            }
            
        }
        catch ( SQLException ex ) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tambahButtonActionPerformed
    
    private void kembaliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliButtonActionPerformed
        // TODO add your handling code here:
        ManajerKelolaMenu kelolaMenu;
        try {
            kelolaMenu = new ManajerKelolaMenu(this, true);
            this.dispose();
            kelolaMenu.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(ManajerTambahMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManajerTambahMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_kembaliButtonActionPerformed
    
    private void clear() {
        namaMenuText.setText("");
        hargaMenuText.setText("");
        kodeMenuText.setText("");
    }
        
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dataMenuPane;
    private javax.swing.JLabel hargaLabel;
    private javax.swing.JTextField hargaMenuText;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JComboBox kategoriComboBox;
    private javax.swing.JLabel kategoriLabel;
    private javax.swing.JButton kembaliButton;
    private javax.swing.JLabel kodeLabel;
    private javax.swing.JTextField kodeMenuText;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JTextField namaMenuText;
    private javax.swing.JButton tambahButton;
    // End of variables declaration//GEN-END:variables
}
