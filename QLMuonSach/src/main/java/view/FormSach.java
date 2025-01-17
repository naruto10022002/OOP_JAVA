/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import controller.IOFile;
import controller.SoLuongException;
import controller.TrongException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Sach;

/**
 *
 * @author Nguyen Cong Van
 */
public class FormSach extends javax.swing.JPanel {

    DefaultTableModel tm;
    private boolean them, sua;
    private List<Sach> lsach = new ArrayList<>();
    private String fsach = "src\\main\\java\\controller\\sach.data";
    
    public FormSach() {
        initComponents();
        setSize(950, 800);
        String[] cols = {"Ma sach", "Ten sach", "Ten tac gia", "Chuyen nganh", "So luong"};
        tm = new DefaultTableModel(cols, 0);
        jTable1.setModel(tm);
        them = sua = false;
        loadData();
    }
    
    private void loadData() {
        File f = new File(fsach);
        if(f.exists()) {
            lsach = IOFile.read(fsach);
        }
    }
    
    private void buttonStateThem(boolean a) {
        btThem.setEnabled(a);
        btCN.setEnabled(!a);
        btBQ.setEnabled(!a);
    }
    
    private void buttonStateSua(boolean a) {
        btSua.setEnabled(a);
        btCN.setEnabled(!a);
        btBQ.setEnabled(!a);
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
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btHT = new javax.swing.JButton();
        btLuu = new javax.swing.JButton();
        btCN = new javax.swing.JButton();
        btBQ = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btThem.setText("Them");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btSua.setText("Sua");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        btXoa.setText("Xoa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btHT.setText("Hien thi");
        btHT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHTActionPerformed(evt);
            }
        });

        btLuu.setText("Luu");
        btLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLuuActionPerformed(evt);
            }
        });

        btCN.setText("Cap nhat");
        btCN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCNActionPerformed(evt);
            }
        });

        btBQ.setText("Bo qua");
        btBQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBQActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btThem)
                .addGap(18, 18, 18)
                .addComponent(btSua)
                .addGap(18, 18, 18)
                .addComponent(btXoa)
                .addGap(18, 18, 18)
                .addComponent(btHT)
                .addGap(18, 18, 18)
                .addComponent(btLuu)
                .addGap(18, 18, 18)
                .addComponent(btCN)
                .addGap(18, 18, 18)
                .addComponent(btBQ)
                .addContainerGap(550, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem)
                    .addComponent(btXoa)
                    .addComponent(btHT)
                    .addComponent(btLuu)
                    .addComponent(btCN)
                    .addComponent(btBQ)
                    .addComponent(btSua))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jLabel1.setText("Ma sach:");

        jLabel2.setText("Ten sach:");

        jLabel3.setText("Ten tac gia:");

        jLabel4.setText("Chuyen nganh:");

        jLabel5.setText("So luong sach:");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Khoa học tự nhiên", "Văn học – Nghệ thuật", "Điện tử Viễn thông", "Công nghệ thông tin" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(jTextField2)
                    .addComponent(jComboBox1, 0, 1, Short.MAX_VALUE)
                    .addComponent(jTextField4)
                    .addComponent(jTextField3))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        // TODO add your handling code here:
        them = true;
        buttonStateThem(false);
        if(lsach != null && lsach.size() > 0) {
            Sach.setSma(lsach.get(lsach.size() - 1).getMa() + 1);
        }
        jTextField1.setText(Sach.getSma()+"");
        jTextField2.requestFocus();

    }//GEN-LAST:event_btThemActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        // TODO add your handling code here:
        sua = true;
        buttonStateSua(false);
    }//GEN-LAST:event_btSuaActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        
        if(row < 0 || row > jTable1.getRowCount() - 1) {
            JOptionPane.showMessageDialog(this, "chon row de xoa");
        } else {
            tm.removeRow(row);
            lsach.remove(row);
            
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btHTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHTActionPerformed
        // TODO add your handling code here:
        loadData();
        tm.setNumRows(0);
        for(Sach i: lsach) {
            tm.addRow(i.toObjects());
        }
    }//GEN-LAST:event_btHTActionPerformed

    private void btLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLuuActionPerformed
        // TODO add your handling code here:
        IOFile.write(fsach, lsach);
    }//GEN-LAST:event_btLuuActionPerformed

    private void btCNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCNActionPerformed
        // TODO add your handling code here:
        if(them) {
            
            String ma, ten, tg, cn;
            ma = jTextField1.getText();
            ten = jTextField2.getText();
            tg = jTextField3.getText();
            cn = jComboBox1.getSelectedItem().toString();
            try {
                if(ten.isEmpty() || tg.isEmpty()) throw new TrongException();
                int sl = Integer.parseInt(jTextField4.getText());
                if(sl < 0) throw new SoLuongException();
                Sach s = new Sach(Integer.parseInt(ma), ten, tg, cn, sl);
                tm.addRow(s.toObjects());
                lsach.add(s);
                them = false;
                buttonStateThem(true);
            } catch (TrongException e) {
                JOptionPane.showMessageDialog(this, "khong de trong!!");
                jTextField2.requestFocus();
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Nhap so");
                jTextField4.requestFocus();
            } 
            catch (SoLuongException ex) {
                JOptionPane.showMessageDialog(this, "Nhap so duong");
                jTextField4.requestFocus();
            }
        }
        
        if(sua) {
            int row = jTable1.getSelectedRow();

            if(row < 0 || row > jTable1.getRowCount() - 1) {
                JOptionPane.showMessageDialog(this, "chon lai row");
            } else {
                String ma, ten, tg, cn;
                ma = jTextField1.getText();
                ten = jTextField2.getText();
                tg = jTextField3.getText();
                cn = jComboBox1.getSelectedItem().toString();
                try {
                    if(ten.isEmpty() || tg.isEmpty()) throw new TrongException();
                    int sl = Integer.parseInt(jTextField4.getText());
                    if(sl < 0) throw new SoLuongException();
                    Sach s = new Sach(Integer.parseInt(ma), ten, tg, cn, sl);
                    tm.removeRow(row);
                    tm.insertRow(row, s.toObjects());
                    lsach.set(row, s);
                    sua = false;
                    buttonStateSua(true);
                } catch (TrongException e) {
                    JOptionPane.showMessageDialog(this, "khong de trong!!");
                    jTextField2.requestFocus();
                } catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(this, "Nhap so");
                    jTextField4.requestFocus();
                } 
                catch (SoLuongException ex) {
                    JOptionPane.showMessageDialog(this, "Nhap so duong");
                    jTextField4.requestFocus();
                }
            }
            
        }
    }//GEN-LAST:event_btCNActionPerformed

    private void btBQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBQActionPerformed
        // TODO add your handling code here:
        if(them)
            them = false;
        if(sua)
            sua = false;
        buttonStateThem(true);
        buttonStateSua(true);
    }//GEN-LAST:event_btBQActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        
        if(row >= 0 && row < jTable1.getRowCount()) {
            jTextField1.setText(jTable1.getValueAt(row, 0).toString());
            jTextField2.setText(jTable1.getValueAt(row, 1).toString());
            jTextField3.setText(jTable1.getValueAt(row, 2).toString());
            jTextField4.setText(jTable1.getValueAt(row, 4).toString());
            
            String cn = jTable1.getValueAt(row, 3).toString();
            for(int i = 0; i < jComboBox1.getItemCount(); i++) {
                if(jComboBox1.getItemAt(i).equalsIgnoreCase(cn)) {
                    jComboBox1.setSelectedIndex(i);
                    break;
                }
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBQ;
    private javax.swing.JButton btCN;
    private javax.swing.JButton btHT;
    private javax.swing.JButton btLuu;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXoa;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
