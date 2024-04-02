
package posproject;

import java.util.ArrayList;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import jdk.jfr.Timestamp;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import static posproject.DBConnector.connection;



/**
 *
 * @author ADVAN
 */
public class POSFrame extends javax.swing.JFrame {

    ArrayList<Barang> daftarBarang;
    
    TableModel daftarModel;
    
    int jumlahBelanja = 0;
    /**
     * Creates new form POSFrame
     */
    public POSFrame() {
        
        DBConnector.initDBConnection();
        
        Barang.loadBarangFromDB();
        System.out.println(Barang.daftarBarang.size());
        
        daftarBarang = Barang.daftarBarang;
        
        System.out.println(daftarBarang.size());
        
        initComponents();
        
        daftarModel = daftarTable.getModel();
        daftarModel.addTableModelListener(new TableModelListener()
        {
            @Override
            public void tableChanged(TableModelEvent tme) {
                
                if(tme.getColumn() == 4)
                {
                   int baris = tme.getFirstRow();
                   
                   float harga = (float)daftarModel.getValueAt(baris, 3);
                   int jumlah = (int)daftarModel.getValueAt(baris, 4);
                   
                   float total = harga * jumlah;
                   daftarModel.setValueAt(total, baris, 5);
                   
                   float totalBelanja = 0.0f;
                   total = 0.0f;
                   
                   //WARNING : jumlahBelanja belum update ketika listenernya dipanggil
                   for (int i = 0; i < jumlahBelanja; i++)
                   {
                       System.out.println("TOTAL " + i);
                       total = (float)daftarModel.getValueAt(i, 5);
                       totalBelanja = totalBelanja + total;
                   }
                   
                   int totalBelanjaInt = (int)totalBelanja;
                   totalBelanjaTextField.setText(Float.toString(totalBelanja));
                   
                   
                }
            }
                    
        }
        
                
        );
        
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        namaTextField = new javax.swing.JTextField();
        hargaTextField = new javax.swing.JTextField();
        kodeTextField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        totalBelanjaTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dibayarTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        kembalianTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        daftarTable = new javax.swing.JTable();
        simpanButton = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        userTextField = new javax.swing.JTextField();
        logoutButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(840, 740));

        jPanel1.setBackground(new java.awt.Color(34, 40, 49));

        jLabel1.setForeground(new java.awt.Color(238, 238, 238));
        jLabel1.setText("Kode");

        jLabel2.setForeground(new java.awt.Color(238, 238, 238));
        jLabel2.setText("Nama");

        jLabel3.setForeground(new java.awt.Color(238, 238, 238));
        jLabel3.setText("Harga");

        namaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaTextFieldActionPerformed(evt);
            }
        });

        hargaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaTextFieldActionPerformed(evt);
            }
        });

        kodeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeTextFieldActionPerformed(evt);
            }
        });

        totalBelanjaTextField.setEditable(false);
        totalBelanjaTextField.setBackground(new java.awt.Color(49, 54, 63));
        totalBelanjaTextField.setForeground(new java.awt.Color(255, 255, 255));
        totalBelanjaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalBelanjaTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(238, 238, 238));
        jLabel4.setText("Total Belanjaan");

        dibayarTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dibayarTextFieldActionPerformed(evt);
            }
        });
        dibayarTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dibayarTextFieldKeyTyped(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(238, 238, 238));
        jLabel5.setForeground(new java.awt.Color(238, 238, 238));
        jLabel5.setText("Jumlah yang dibayar");

        kembalianTextField.setEditable(false);
        kembalianTextField.setBackground(new java.awt.Color(49, 54, 63));
        kembalianTextField.setForeground(new java.awt.Color(255, 255, 255));
        kembalianTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembalianTextFieldActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(238, 238, 238));
        jLabel6.setText("Kembalian");

        daftarTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 54, 63)));
        daftarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No", "Kode", "Nama", "Harga Satuan", "Jumlah", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        daftarTable.setPreferredSize(new java.awt.Dimension(330, 1000));
        jScrollPane1.setViewportView(daftarTable);
        if (daftarTable.getColumnModel().getColumnCount() > 0) {
            daftarTable.getColumnModel().getColumn(0).setResizable(false);
            daftarTable.getColumnModel().getColumn(0).setPreferredWidth(5);
            daftarTable.getColumnModel().getColumn(1).setResizable(false);
            daftarTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            daftarTable.getColumnModel().getColumn(2).setResizable(false);
            daftarTable.getColumnModel().getColumn(2).setPreferredWidth(300);
            daftarTable.getColumnModel().getColumn(3).setResizable(false);
            daftarTable.getColumnModel().getColumn(3).setPreferredWidth(50);
            daftarTable.getColumnModel().getColumn(4).setResizable(false);
            daftarTable.getColumnModel().getColumn(4).setPreferredWidth(20);
            daftarTable.getColumnModel().getColumn(5).setResizable(false);
            daftarTable.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        simpanButton.setBackground(new java.awt.Color(118, 171, 174));
        simpanButton.setForeground(new java.awt.Color(238, 238, 238));
        simpanButton.setText("Simpan");
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(238, 238, 238));
        jLabel7.setText("Tanggal");

        userTextField.setEditable(false);
        userTextField.setBackground(new java.awt.Color(49, 54, 63));
        userTextField.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        userTextField.setForeground(new java.awt.Color(255, 255, 255));
        userTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userTextField.setText(username);
        userTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextFieldActionPerformed(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(255, 0, 0));
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("User");

        jButton1.setBackground(new java.awt.Color(118, 171, 174));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Reload");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(hargaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(184, 184, 184)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(simpanButton))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(totalBelanjaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dibayarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kembalianTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hargaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalBelanjaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dibayarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kembalianTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(logoutButton))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpanButton)
                    .addComponent(jButton1))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kodeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeTextFieldActionPerformed
        // TODO add your handling code here:
        
        
        String kodeInput = kodeTextField.getText();
        
        Barang tempBarang;
        for (int i = 0; i < daftarBarang.size(); i++)
        {
            tempBarang = daftarBarang.get(i);
            
            
            int tempIndex = 0;
            
            if(tempBarang.kode.equals(kodeInput))
            {
                
                tempIndex = jumlahBelanja;
                jumlahBelanja++;
                
                System.out.println("Barang Ditemukan");
                i = daftarBarang.size();
                namaTextField.setText(tempBarang.nama);
                hargaTextField.setText(Float.toString(tempBarang.harga));
                
                daftarModel.setValueAt(jumlahBelanja, tempIndex, 0);
                daftarModel.setValueAt(kodeInput, tempIndex, 1);
                daftarModel.setValueAt(tempBarang.nama, tempIndex, 2);
                daftarModel.setValueAt(tempBarang.harga, tempIndex, 3);
                daftarModel.setValueAt(1, tempIndex, 4);

            }
            
        }
           
    }//GEN-LAST:event_kodeTextFieldActionPerformed

    private void namaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaTextFieldActionPerformed

    private void hargaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargaTextFieldActionPerformed

    private void totalBelanjaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalBelanjaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalBelanjaTextFieldActionPerformed

    private void kembalianTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembalianTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kembalianTextFieldActionPerformed

    private void dibayarTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dibayarTextFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_dibayarTextFieldKeyTyped

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        addTransaction();

        new POSFrame().setVisible(true);
        // Menutup frame POSFrame saat ini
        dispose();
    }//GEN-LAST:event_simpanButtonActionPerformed

    private void dibayarTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dibayarTextFieldActionPerformed
        float totalBelanja = Float.valueOf(totalBelanjaTextField.getText());
        
        float dibayar = Float.valueOf(dibayarTextField.getText());
        
        float kembalian = dibayar - totalBelanja;
        
        kembalianTextField.setText(Float.toString(kembalian));
    }//GEN-LAST:event_dibayarTextFieldActionPerformed

    String username = POSLogin.getLoggedInUsername();
    
    
    private void userTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTextFieldActionPerformed
     
    }//GEN-LAST:event_userTextFieldActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // Mendapatkan nama pengguna yang sedang login
        String loggedInUsername = userTextField.getText();

        // Panggil method untuk mendapatkan ID pengguna berdasarkan nama pengguna
        int userId = getUserIdFromUsername(loggedInUsername);

        // Panggil method untuk menyimpan aktivitas logout
        saveLogoutActivity(userId);

        // Tutup frame logout
        this.dispose();

        // Tampilkan kembali frame login (POSLogin)
        POSLogin posLogin = new POSLogin();
        posLogin.setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new POSFrame().setVisible(true);
        // Menutup frame POSFrame saat ini
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Method untuk mendapatkan ID pengguna berdasarkan nama pengguna
    private int getUserIdFromUsername(String username) {
        int userId = -1; // Inisialisasi nilai default jika pengguna tidak ditemukan
        String query = "SELECT id FROM user WHERE username = ?";

        try (Connection connection = DBConnector.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            // Set nilai parameter query
            statement.setString(1, username);

            // Eksekusi query
            ResultSet resultSet = statement.executeQuery();

            // Ambil ID pengguna jika ada hasil dari query
            if (resultSet.next()) {
                userId = resultSet.getInt("id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return userId;
    }

    
    private void saveLogoutActivity(int userId) {
        String activity = "Logout"; // Aktivitas adalah Logout
        String user = POSLogin.getLoggedInUsername();
        LocalDateTime dateTime = LocalDateTime.now(); // Ambil waktu saat ini

        // Bangun deskripsi aktivitas logout
        String description = "User " + user + " logged out at " + dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        // Panggil metode untuk menyimpan aktivitas logout ke dalam tabel activity
        insertActivityLogout(activity, user, dateTime, description);
    }

    private void insertActivityLogout(String activity, String userId, LocalDateTime dateTime, String description) {
        // SQL query untuk memasukkan data ke dalam tabel activity
        String query = "INSERT INTO activity (activity, user, datetime, description) VALUES (?, ?, ?, ?)";

        try (Connection connection = DBConnector.getConnection();
                PreparedStatement statement = connection.prepareStatement(query)) {
            // Set nilai parameter query
            statement.setString(1, activity);
            statement.setString(2, userId);
            statement.setObject(3, dateTime);
            statement.setString(4, description);

            // Eksekusi query
            statement.executeUpdate();

            // Tampilkan pesan sukses jika data berhasil dimasukkan
            System.out.println("Data aktivitas logout berhasil dimasukkan ke dalam tabel activity.");
        } catch (SQLException e) {
            // Tangani jika terjadi error saat memasukkan data
            e.printStackTrace();
        }
    }
    
    

    private void addTransaction() {
        // Ambil data dari UI
        String user = userTextField.getText();
        LocalDateTime dateTime = LocalDateTime.now();
        Float seluruhBelanja = Float.parseFloat(totalBelanjaTextField.getText());

         // Bangun deskripsi
        StringBuilder descriptionBuilder = new StringBuilder();
        descriptionBuilder.append("Transaksi pada tanggal ").append(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        String description = descriptionBuilder.toString();

        // Masukkan data ke dalam tabel transaksi
        int idTransaksi = insertTransaction(user, dateTime, description, seluruhBelanja);

        // Masukkan data barang ke dalam tabel item_transaksi
        insertItemTransactions(idTransaksi);
        
        addActivity(user, dateTime, description);
    }

    private int insertTransaction(String user, LocalDateTime dateTime, String description, float totalBelanja) {
    // SQL query untuk memasukkan data ke dalam tabel transaksi
    String query = "INSERT INTO transaksi (user, tanggal, waktu, deskripsi, totalBelanja) VALUES (?, ?, ?, ?, ?)";

    try (Connection connection = DBConnector.getConnection();
            PreparedStatement statement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {
           // Set nilai parameter query
           statement.setString(1, user);
           statement.setObject(2, dateTime.toLocalDate()); // Set tanggal
           statement.setObject(3, dateTime.toLocalTime()); // Set waktu
           statement.setString(4, description);
           statement.setFloat(5, totalBelanja);

           // Eksekusi query
           statement.executeUpdate();

           // Ambil ID transaksi yang baru saja dimasukkan
           ResultSet generatedKeys = statement.getGeneratedKeys();
           if (generatedKeys.next()) {
               return generatedKeys.getInt(1);
           } else {
               throw new SQLException("Failed to get generated ID for transaction.");
           }
       } 
    catch (SQLException e) {
           // Tangani jika terjadi error saat memasukkan data
           e.printStackTrace();
           return -1; // Return -1 jika terjadi kesalahan
       }
    }

    private void insertItemTransactions(int idTransaksi) {
        // SQL query untuk memasukkan data barang ke dalam tabel item_transaksi
        String query = "INSERT INTO itemTransaksi (idTransaksi, kode, nama, harga, jumlah, total) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection connection = DBConnector.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            // Dapatkan model dari tabel
            DefaultTableModel model = (DefaultTableModel) daftarTable.getModel();

            // Iterasi melalui setiap baris tabel
            for (int i = 0; i < model.getRowCount(); i++) {
                // Ambil nilai dari kolom yang menunjukkan jumlah
                Object jumlahObj = model.getValueAt(i, 4);

                // Lakukan null check sebelum mengambil nilai int
                if (jumlahObj != null) {
                    int jumlah = (int) jumlahObj;

                    // Hanya sisipkan barang jika jumlahnya lebih dari 0
                    if (jumlah > 0) {
                        // Ambil nilai dari setiap kolom
                        String kode = (String) model.getValueAt(i, 1);
                        String nama = (String) model.getValueAt(i, 2);
                        float harga = (float) model.getValueAt(i, 3);
                        float total = (float) model.getValueAt(i, 5);

                        // Set nilai parameter query
                        statement.setInt(1, idTransaksi);
                        statement.setString(2, kode);
                        statement.setString(3, nama);
                        statement.setFloat(4, harga);
                        statement.setInt(5, jumlah);
                        statement.setFloat(6, total);

                        // Eksekusi query
                        statement.executeUpdate();
                    }
                }
            }

            // Tampilkan pesan sukses jika data berhasil dimasukkan
            
            System.out.println("Data barang berhasil dimasukkan ke dalam tabel item_transaksi.");
            
            


        }
        
        catch (SQLException e) {
            // Tangani jika terjadi error saat memasukkan data
            e.printStackTrace();
        }
    }
    
    
    private void addActivity(String user, LocalDateTime dateTime, String description) {
        // Format tanggal dan waktu saat ini
        String query = "INSERT INTO activity (activity, user, dateTime, description) VALUES (?, ?, ?, ?)";

        try (Connection connection = DBConnector.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            // Set nilai parameter query
            statement.setString(1, "Transaksi"); // Aktivitas
            statement.setString(2, user); // User
            statement.setObject(3, dateTime); // Waktu
            statement.setString(4, description); // Deskripsi

            // Eksekusi query
            statement.executeUpdate();

            // Tutup statement
            statement.close();

            // Berhasil menambahkan aktivitas ke dalam tabel activity
            System.out.println("Aktivitas telah ditambahkan ke dalam tabel activity.");

        } catch (SQLException ex) {
            // Tangani jika terjadi kesalahan SQL
            System.out.println("Kesalahan saat menambahkan aktivitas ke dalam tabel activity: " + ex.getMessage());
        }
    }
    
    

    
    

   
   
   
    
    
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
            java.util.logging.Logger.getLogger(POSFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POSFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POSFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POSFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POSFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable daftarTable;
    private javax.swing.JTextField dibayarTextField;
    private javax.swing.JTextField hargaTextField;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField kembalianTextField;
    private javax.swing.JTextField kodeTextField;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTextField namaTextField;
    private javax.swing.JButton simpanButton;
    private javax.swing.JTextField totalBelanjaTextField;
    private javax.swing.JTextField userTextField;
    // End of variables declaration//GEN-END:variables

    private int getIdTransaksiFromDatabase() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
