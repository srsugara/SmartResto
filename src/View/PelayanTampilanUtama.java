/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerKelolaMenu;
import javax.swing.UIManager;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import Model.DaftarMenuDapurTableModel;
import Model.DaftarMenuData;
import Model.DaftarPesananData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author dilaaaaaaa
 */
public class PelayanTampilanUtama extends javax.swing.JFrame {
    DaftarMenuDapurTableModel makananTableModel;
    DaftarMenuDapurTableModel minumanTabelModel;
    DaftarMenuDapurTableModel dessertTabelModel;
    ControllerKelolaMenu db = new ControllerKelolaMenu();
    List<DaftarMenuData> menu;
    /**
     * Creates new form DaftarMenu
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public PelayanTampilanUtama() throws SQLException, ClassNotFoundException {
                
        menu = db.tampilDaftarMenu("makanan");
        makananTableModel = new DaftarMenuDapurTableModel(menu);
        makananTableModel.setMenuList(menu);
        makananTableModel.fireTableDataChanged();

        menu = db.tampilDaftarMenu("minuman");
        minumanTabelModel = new DaftarMenuDapurTableModel(menu);
        minumanTabelModel.setMenuList(menu);
        minumanTabelModel.fireTableDataChanged();

        menu = db.tampilDaftarMenu("dessert");
        dessertTabelModel = new DaftarMenuDapurTableModel(menu);
        dessertTabelModel.setMenuList(menu);
        dessertTabelModel.fireTableDataChanged();
        
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
        java.awt.GridBagConstraints gridBagConstraints;

        panelJudul = new javax.swing.JPanel();
        labelDaftarMenu = new javax.swing.JLabel();
        paneTab = new javax.swing.JTabbedPane();
        tabMakanan = new javax.swing.JScrollPane();
        tabelMakanan = new javax.swing.JTable();
        tabMinuman = new javax.swing.JScrollPane();
        tabelMinuman = new javax.swing.JTable();
        tabDessert = new javax.swing.JScrollPane();
        tabelDessert = new javax.swing.JTable();
        pesananButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Override");

        panelJudul.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        panelJudul.setLayout(new java.awt.GridBagLayout());

        labelDaftarMenu.setFont(new java.awt.Font("Drift Wood", 0, 36)); // NOI18N
        labelDaftarMenu.setText("PELAYAN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 90, 3, 101);
        panelJudul.add(labelDaftarMenu, gridBagConstraints);

        tabelMakanan.setModel(makananTableModel
        );
        tabMakanan.setViewportView(tabelMakanan);

        paneTab.addTab("Makanan", tabMakanan);

        tabelMinuman.setModel(minumanTabelModel);
        tabMinuman.setViewportView(tabelMinuman);

        paneTab.addTab("Minuman", tabMinuman);

        tabelDessert.setModel(dessertTabelModel);
        tabDessert.setViewportView(tabelDessert);

        paneTab.addTab("Dessert", tabDessert);

        pesananButton.setText("Lihat Pesanan Pelanggan");
        pesananButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesananButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paneTab)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(pesananButton, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jButton1)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(panelJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(paneTab, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(pesananButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pesananButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesananButtonActionPerformed
        List<DaftarPesananData> pesanList=new ArrayList<>();
        PelayanDaftarPesanan daftarOrder = new PelayanDaftarPesanan(this, true, pesanList);
        this.dispose();
        daftarOrder.setVisible(true);
    }//GEN-LAST:event_pesananButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
        public static void main(String args[]) {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
             * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
             */
            try 
            {
                BeautyEyeLNFHelper.frameBorderStyle=BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
                org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
            } 
            catch (Exception e) 
            {
              e.printStackTrace();
            }
            //</editor-fold>
    
            /* Create and display the dialog */
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PelayanTampilanUtama().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(PelayanTampilanUtama.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(PelayanTampilanUtama.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel labelDaftarMenu;
    private javax.swing.JTabbedPane paneTab;
    private javax.swing.JPanel panelJudul;
    private javax.swing.JButton pesananButton;
    private javax.swing.JScrollPane tabDessert;
    private javax.swing.JScrollPane tabMakanan;
    private javax.swing.JScrollPane tabMinuman;
    private javax.swing.JTable tabelDessert;
    private javax.swing.JTable tabelMakanan;
    private javax.swing.JTable tabelMinuman;
    // End of variables declaration//GEN-END:variables
}
