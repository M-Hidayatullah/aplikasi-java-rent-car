
package rent;

import javax.swing.JOptionPane;
import static java.lang.System.exit;


public class car extends javax.swing.JFrame {

  
    Control pb = new Control();
  
    
    private boolean TAG =true;
    
    public  car() {
    initComponents();
        
       clear();
        
    }
    
private void clear() {
        TAG = true;
        tfNOMORPLAT.setEnabled(true);
        tfNOMORPLAT.setText("");   
        tfMEREKMOBIL.setText("");
        tfNAMAPENYEWA.setText("");
        tfALAMATPENYEWA.setText("");
        tfNOMORTELEFON.setText("");
        tfJUMLAHPEMBAYARAN.setText(""); 
        
        

        read();
    }

//    menampilkan data pada tabel
    private void read() {
        pb.read(tblCAR);

    }

    private boolean validasi() {
        if (tfNOMORPLAT.getText().isEmpty()
                || tfMEREKMOBIL.getText().isEmpty()
                || tfNAMAPENYEWA.getText().isEmpty()
                || tfNOMORTELEFON.getText().isEmpty()
                || tfNOMORTELEFON.getText().isEmpty()
                || tfJUMLAHPEMBAYARAN.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    private void save() {
        if (validasi()) {
            if (TAG) {
                create(); // true
            } else {
                update(); // false 
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Inputan belum diisi bos!");
        }
        
    }
    

    private void create() {
        Model b = new Model();
        b.setNomor_Plat(Integer.valueOf(tfNOMORPLAT.getText()));
        b.setMerek_Mobil(tfMEREKMOBIL.getText().trim());
        b.setNama_Penyewa(tfNAMAPENYEWA.getText());
        b.setAlamat_Penyewa(tfALAMATPENYEWA.getText());
        b.setNomor_Telefon(tfNOMORTELEFON.getText());
        b.setLama_Menyewa(cbLAMAPENYEWAAN.getSelectedItem().toString());
         b.setJumlah_Pembayaran(Integer.valueOf(tfJUMLAHPEMBAYARAN.getText()));
        
        pb.create(b);

        clear();
    }

    private void update() {
        Model b = new Model();
        b.setNomor_Plat(Integer.valueOf(tfNOMORPLAT.getText()));
        b.setMerek_Mobil(tfMEREKMOBIL.getText().trim());
        b.setNama_Penyewa(tfNAMAPENYEWA.getText());
        b.setAlamat_Penyewa(tfALAMATPENYEWA.getText());
        b.setNomor_Telefon(tfNOMORTELEFON.getText());
        b.setLama_Menyewa(cbLAMAPENYEWAAN.getSelectedItem().toString());
         b.setJumlah_Pembayaran(Integer.valueOf(tfJUMLAHPEMBAYARAN.getText()));      
        pb.update(b);

        clear();
    }

    private void loadData() {
        int select = tblCAR.getSelectedRowCount();

        if (select == 0) {
            JOptionPane.showMessageDialog(rootPane, "Data Belum Dipilih bos!");
        } else {

            int pilih = JOptionPane.NO_OPTION;
            pilih = JOptionPane.showConfirmDialog(rootPane, "Yakin ingin Ubah bos!",
                    "Informasi", JOptionPane.YES_NO_OPTION, 2);

            if (pilih == JOptionPane.YES_OPTION) {
                int baris = tblCAR.getSelectedRow();
                tfNOMORPLAT.setText(tblCAR.getValueAt(baris, 0).toString());
                tfMEREKMOBIL.setText(tblCAR.getValueAt(baris, 1).toString());
                tfNAMAPENYEWA.setText(tblCAR.getValueAt(baris, 2).toString());
                tfALAMATPENYEWA.setText(tblCAR.getValueAt(baris, 3).toString());
                tfNOMORTELEFON.setText(tblCAR.getValueAt(baris, 4).toString());
                tfJUMLAHPEMBAYARAN.setText(tblCAR.getValueAt(baris, 6).toString());
                

                tfNOMORPLAT.setEnabled(false);
            }
        }
    }

    private void DONE() {
        TAG = false;
        save();

    }
    
    private void delete() {
        int select = tblCAR.getSelectedRowCount();

        if (select == 0) {
            JOptionPane.showMessageDialog(rootPane, "Data Belum Dipilih bos!");
        } else {

            int pilih = JOptionPane.NO_OPTION;
            pilih = JOptionPane.showConfirmDialog(rootPane, "Yakin ingin Hapus bos!",
                    "Informasi", JOptionPane.YES_NO_OPTION, 2);

            if (pilih == JOptionPane.YES_OPTION) {
                int baris = tblCAR.getSelectedRow();

                String Merek_Mobil = tblCAR.getValueAt(baris, 1).toString();
                System.out.println(Merek_Mobil);
                pb.delete(Merek_Mobil);

                clear();
            }
        }
    }

    private void search() {
        if (CARIDATA.getText().isEmpty()) {
            clear();
        } else {
            if (!pb.search(tblCAR, CARIDATA.getText())) {
                JOptionPane.showMessageDialog(rootPane, " Data yang kamu cari tidak ada bos!");
            };
        }
    
    }
    
    private void EXIT(){
        int x =  JOptionPane.showConfirmDialog(this, "Apakah Anda Yakin ingin keluar bos","KELUAR",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        //yes = 0
      ///no =1
      if (x==0){
          System.exit(0);
//          KELUAR DARI PROGRAM 
    }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfNOMORPLAT = new javax.swing.JTextField();
        tfMEREKMOBIL = new javax.swing.JTextField();
        tfNAMAPENYEWA = new javax.swing.JTextField();
        tfNOMORTELEFON = new javax.swing.JTextField();
        tfJUMLAHPEMBAYARAN = new javax.swing.JTextField();
        tfALAMATPENYEWA = new javax.swing.JTextField();
        btSimpan = new javax.swing.JButton();
        btUbah = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        CARIDATA = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCAR = new javax.swing.JTable();
        cbLAMAPENYEWAAN = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        btnDONE = new javax.swing.JToggleButton();
        btnKeluar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jPanel2.setBackground(new java.awt.Color(0, 255, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("RENT CAR SINTE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Nomor Plat");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Merek Mobil");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Nama Penyewa");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Alamat Penyewa");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Lama Penyewaan");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Jumlah Pembayaran");

        tfNOMORPLAT.setText(" ");

        tfMEREKMOBIL.setText(" ");
        tfMEREKMOBIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMEREKMOBILActionPerformed(evt);
            }
        });

        tfNAMAPENYEWA.setText(" ");

        tfNOMORTELEFON.setText(" ");

        tfJUMLAHPEMBAYARAN.setText(" ");

        tfALAMATPENYEWA.setText(" ");
        tfALAMATPENYEWA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfALAMATPENYEWAActionPerformed(evt);
            }
        });

        btSimpan.setText("Simpan");
        btSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimpanActionPerformed(evt);
            }
        });

        btUbah.setText("Ubah");
        btUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUbahActionPerformed(evt);
            }
        });

        btHapus.setText("Hapus");
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Pencarian");

        CARIDATA.setText(" ");
        CARIDATA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CARIDATAActionPerformed(evt);
            }
        });

        tblCAR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblCAR);

        cbLAMAPENYEWAAN.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-PILIH-", "1 hari", "2 hari", "3 hari", "4 hari", "5 hari", "6 hari", "1 minggu", "2 minggu", "Tiga minggu", "4 minggu", "5 minggu", "1 bulan", "1 TAHUN", "-LAINNYA" }));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText(" Nomor Telefon");

        btnDONE.setText("Done");
        btnDONE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDONEActionPerformed(evt);
            }
        });

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNOMORPLAT, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfMEREKMOBIL, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNAMAPENYEWA, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfJUMLAHPEMBAYARAN, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfALAMATPENYEWA, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbLAMAPENYEWAAN, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNOMORTELEFON, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnKeluar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSimpan)
                        .addGap(18, 18, 18)
                        .addComponent(btUbah)
                        .addGap(18, 18, 18)
                        .addComponent(btnDONE)
                        .addGap(18, 18, 18)
                        .addComponent(btHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CARIDATA, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNOMORPLAT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfMEREKMOBIL, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfNAMAPENYEWA, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfALAMATPENYEWA, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(tfNOMORTELEFON, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(cbLAMAPENYEWAAN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfJUMLAHPEMBAYARAN, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDONE, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(CARIDATA, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfMEREKMOBILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMEREKMOBILActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMEREKMOBILActionPerformed

    private void tfALAMATPENYEWAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfALAMATPENYEWAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfALAMATPENYEWAActionPerformed

    private void btUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUbahActionPerformed
        loadData();
    }//GEN-LAST:event_btUbahActionPerformed

    private void btSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimpanActionPerformed
        save();
    }//GEN-LAST:event_btSimpanActionPerformed

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        delete();
    }//GEN-LAST:event_btHapusActionPerformed

    private void btnDONEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDONEActionPerformed
        DONE();
    }//GEN-LAST:event_btnDONEActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        EXIT();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void CARIDATAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CARIDATAActionPerformed
        search();
    }//GEN-LAST:event_CARIDATAActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new car().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CARIDATA;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btSimpan;
    private javax.swing.JButton btUbah;
    private javax.swing.JToggleButton btnDONE;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JComboBox cbLAMAPENYEWAAN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblCAR;
    private javax.swing.JTextField tfALAMATPENYEWA;
    private javax.swing.JTextField tfJUMLAHPEMBAYARAN;
    private javax.swing.JTextField tfMEREKMOBIL;
    private javax.swing.JTextField tfNAMAPENYEWA;
    private javax.swing.JTextField tfNOMORPLAT;
    private javax.swing.JTextField tfNOMORTELEFON;
    // End of variables declaration//GEN-END:variables

   
}
