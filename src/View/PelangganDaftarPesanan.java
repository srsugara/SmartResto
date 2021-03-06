/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerKelolaMenu;
import Controller.ControllerKelolaPesanan;
import Controller.ControllerKelolaTransaksi;
import Model.DaftarMenuData;
import Model.DaftarPesananTableModel;
import Model.DaftarPesananData;
import Model.PesananSementara;
import Model.TagihanData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

/**
 *
 * @author dilaaaaaaa
 */
public class PelangganDaftarPesanan extends javax.swing.JDialog {
    
    private ControllerKelolaMenu dbMenu = new ControllerKelolaMenu();
    private ControllerKelolaPesanan dbPesan = new ControllerKelolaPesanan();
    private ControllerKelolaTransaksi dbTransaksi = new ControllerKelolaTransaksi();
    private DaftarPesananTableModel pesananTabelModel;
    private List<DaftarPesananData> daftar;
    private List<TagihanData> tagihan;
    private int total = 0;
    /**
     * Creates new form DaftarOrder
     */
   
    public PelangganDaftarPesanan(java.awt.Frame parent, boolean modal, List<DaftarPesananData> daftar) {
        super(parent, modal);
        
        this.daftar = daftar;
        pesananTabelModel = new DaftarPesananTableModel(daftar);
        pesananTabelModel.setPesananList(daftar);
        pesananTabelModel.fireTableDataChanged();     
        initComponents();
        buttonOrder.setVisible(false);
        tambahButton.setVisible(false);
        kurangButton.setVisible(false);
    }
    
    public PelangganDaftarPesanan(java.awt.Dialog parent, boolean modal, List<DaftarPesananData> daftar) {
        super(parent, modal);
        
        this.daftar = daftar;
        pesananTabelModel = new DaftarPesananTableModel(daftar);
        pesananTabelModel.setPesananList(daftar);
        pesananTabelModel.fireTableDataChanged();
        
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

        panelJudul = new javax.swing.JPanel();
        judulLabel = new javax.swing.JLabel();
        panelNoMeja = new javax.swing.JPanel();
        labelNoMeja = new javax.swing.JLabel();
        pesananScrollPane = new javax.swing.JScrollPane();
        tabelPesanan = new javax.swing.JTable();
        buttonOrder = new javax.swing.JButton();
        tambahButton = new javax.swing.JButton();
        kurangButton = new javax.swing.JButton();
        separator = new javax.swing.JSeparator();
        menuBar = new javax.swing.JMenuBar();
        menuHome = new javax.swing.JMenu();
        menuTagihan = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Override");

        panelJudul.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        panelJudul.setLayout(new java.awt.GridBagLayout());

        judulLabel.setFont(new java.awt.Font("Drift Wood", 0, 36)); // NOI18N
        judulLabel.setText("PESANAN SAYA");
        panelJudul.add(judulLabel, new java.awt.GridBagConstraints());

        panelNoMeja.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true)));

        labelNoMeja.setText("No. Meja : 1");

        javax.swing.GroupLayout panelNoMejaLayout = new javax.swing.GroupLayout(panelNoMeja);
        panelNoMeja.setLayout(panelNoMejaLayout);
        panelNoMejaLayout.setHorizontalGroup(
            panelNoMejaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNoMejaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNoMeja, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
        );
        panelNoMejaLayout.setVerticalGroup(
            panelNoMejaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelNoMeja, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        tabelPesanan.setModel(pesananTabelModel);
        pesananScrollPane.setViewportView(tabelPesanan);

        buttonOrder.setText("Pesan");
        buttonOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOrderActionPerformed(evt);
            }
        });

        tambahButton.setText("+");
        tambahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahButtonActionPerformed(evt);
            }
        });

        kurangButton.setText("-");
        kurangButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurangButtonActionPerformed(evt);
            }
        });

        menuHome.setText("Menu Utama");
        menuHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuHomeMouseClicked(evt);
            }
        });
        menuBar.add(menuHome);

        menuTagihan.setText("Tagihan");
        menuTagihan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTagihanMouseClicked(evt);
            }
        });
        menuBar.add(menuTagihan);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separator, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tambahButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kurangButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonOrder))
                            .addComponent(pesananScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(panelNoMeja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panelJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelNoMeja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pesananScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonOrder)
                    .addComponent(tambahButton)
                    .addComponent(kurangButton))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOrderActionPerformed
        if(pesananTabelModel.getRowCount()==0){
            JOptionPane.showMessageDialog(this, "Pesananmu mana Mas !");
        }
        else{
        int response = JOptionPane.showConfirmDialog(null, "Apakah anda yakin akan memesan?", "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        int harga = 0;
        int idPesanan = 0;
        if (response == JOptionPane.YES_OPTION) {
            PesananSementara menu;
            List<PesananSementara> pesanan = new ArrayList<>();
            int id = 0;
            int status = 0;
            int row = pesananTabelModel.getRowCount();
            // pengulangan untuk mengambil semua data pesanan dalam tabel untuk dimasukkan
            for ( int i = 0; i < row; i++ ) {
                menu = new PesananSementara();
                String nama = (String) pesananTabelModel.getValueAt(i, 0);
                int jumlah = (int) pesananTabelModel.getValueAt(i, 1);
                String kode = null;
                
                try {
                    id = dbPesan.getIdPesanan();
                    status = dbPesan.getStatusPesanan(id);
                    kode = dbMenu.getIdMenu(nama);
                    harga = dbMenu.getHargaMenu(nama);
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(PelangganDaftarPesanan.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if ( status == 0 ) {
                    idPesanan = id;
                }
                else {
                    idPesanan = id + 1;
                }
                menu.setIdPesanan(idPesanan);
                idPesanan = menu.getIdPesanan();
                menu.setJumlah(jumlah);
                menu.setKodeMenu(kode);
                menu.setNoMeja(1);
                menu.setStatus(0);
                menu.setTotal(harga * menu.getJumlah());
                pesanan.add(menu);
                
            }
            try {
                dbPesan.tambahDaftarPesanan(pesanan);
                JOptionPane.showMessageDialog(this, "Pemesanan berhasil. Silahkan menunggu..");
                tagihan = dbPesan.tampilTagihan(idPesanan);
                // melakukan pehitungan total tagihan bedasarkan menu yang dipesan
                int tot = dbPesan.hitungTotalTagihan(idPesanan);
                DaftarPesananData pesan = new DaftarPesananData();
                pesan.setIdPesanan(idPesanan);
                pesan.setNoMeja(1);
                pesan.setTotalTagihan(tot);
                
                if ( dbTransaksi.getStatusTransaksi(idPesanan) == true && status == 0 ) {
                    dbTransaksi.updateDaftarTransaksi(id, tot);
                }
                else {
                    dbTransaksi.tambahDaftarTransaksi(pesan);
                }
                buttonOrder.setVisible(false);
                tambahButton.setVisible(false);
                kurangButton.setVisible(false);
            
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(PelangganDaftarPesanan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
    }//GEN-LAST:event_buttonOrderActionPerformed

    private void menuHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuHomeMouseClicked
        this.dispose();
        if ( this.daftar == null) {
            new PelangganTampilanUtama().setVisible(true);
        }
        else {
            new PelangganTampilanUtama(daftar,tagihan).setVisible(true);
        }
    }//GEN-LAST:event_menuHomeMouseClicked

    private void menuTagihanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTagihanMouseClicked
        PelangganTagihan daftarTagihan;
        
        try {
            int id = dbPesan.getIdPesanan();
                int status = dbPesan.getStatusPesanan(id);
                if ( status == 1 ) {
                    tagihan = new ArrayList<>();
                    daftarTagihan = new PelangganTagihan(this, true,tagihan, 1);
                    this.dispose();
                    daftarTagihan.setVisible(true);
                }
                else {
                    tagihan = dbPesan.tampilTagihan(id);
                    daftarTagihan = new PelangganTagihan(this, true,tagihan, id);
                    this.dispose();
                    daftarTagihan.setVisible(true);
                }    
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PelangganDaftarPesanan.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_menuTagihanMouseClicked

    private void tambahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahButtonActionPerformed
        if ( tabelPesanan.getSelectedRow() >= 0 ) {    
            int row = tabelPesanan.getSelectedRow();
            DaftarPesananData pesan = pesananTabelModel.getPesananList().get(row);
            int jumlah = pesan.getJumlahPesanan();
            if( jumlah == 0 ){
                total=1;
            }
            else if(jumlah != 0){
                total = jumlah + 1;
            }
                
                pesan.setJumlahPesanan(total);
                tabelPesanan.setValueAt(pesan.getJumlahPesanan(), row, 1);
                tabelPesanan.updateUI();
        }
        else {
            JOptionPane.showMessageDialog(this, "Anda harus memilih menu terlebih dahulu");
        }
    }//GEN-LAST:event_tambahButtonActionPerformed

    private void kurangButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurangButtonActionPerformed
        if ( tabelPesanan.getSelectedRow() >= 0 ) {    
            int row = tabelPesanan.getSelectedRow();
            DaftarPesananData pesan = pesananTabelModel.getPesananList().get(row);
            int jumlah = pesan.getJumlahPesanan();
            if( jumlah > 0 ){
                total = jumlah - 1;
            }
            else if(jumlah == 0){
                tabelPesanan.remove(row);
                tabelPesanan.updateUI();
            }
                
            pesan.setJumlahPesanan(total);
            tabelPesanan.setValueAt(pesan.getJumlahPesanan(), row, 1);
            tabelPesanan.updateUI();
        }
        else {
            JOptionPane.showMessageDialog(this, "Anda harus memilih menu terlebih dahulu");
        }
    }//GEN-LAST:event_kurangButtonActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try 
//        {
//            BeautyEyeLNFHelper.frameBorderStyle=BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
//            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
//        } 
//        catch (Exception e) 
//        {
//          e.printStackTrace();
//        }
//        //</editor-fold>


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonOrder;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JButton kurangButton;
    private javax.swing.JLabel labelNoMeja;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuHome;
    private javax.swing.JMenu menuTagihan;
    private javax.swing.JPanel panelJudul;
    private javax.swing.JPanel panelNoMeja;
    private javax.swing.JScrollPane pesananScrollPane;
    private javax.swing.JSeparator separator;
    private javax.swing.JTable tabelPesanan;
    private javax.swing.JButton tambahButton;
    // End of variables declaration//GEN-END:variables
}
