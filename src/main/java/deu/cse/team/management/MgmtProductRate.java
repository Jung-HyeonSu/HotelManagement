/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.management;

import deu.cse.team.source.LoadServiceList;
import deu.cse.team.source.ModifyServiceList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KYG
 */
public class MgmtProductRate extends javax.swing.JFrame {

    /**
     * Creates new form MgmtProductRate
     */
    public MgmtProductRate() {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("Manage Products");
        new LoadServiceList((DefaultTableModel) MgmtProductTable.getModel());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddProductDlg = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        AddProductCategoryCB = new javax.swing.JComboBox<>();
        AddProductNameField = new javax.swing.JTextField();
        AddProductPriceField = new javax.swing.JTextField();
        AddProductOkBtn = new javax.swing.JButton();
        AddProductCancelBtn = new javax.swing.JButton();
        ModifyProductDlg = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        ModifyProductOkBtn = new javax.swing.JButton();
        ModifyProductCancelBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ModifyProductCategoryCB = new javax.swing.JComboBox<>();
        ModifyProductNameField = new javax.swing.JTextField();
        ModifyProductPriceField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        IndexLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MgmtProductTable = new javax.swing.JTable();
        SearchProductNameField = new javax.swing.JTextField();
        SearchProductBtn = new javax.swing.JButton();
        ModifyProductBtn = new javax.swing.JButton();
        MgmtProductCancelBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        CategoryCB = new javax.swing.JComboBox<>();
        AddProductBtn = new javax.swing.JButton();
        RemoveProductBtn = new javax.swing.JButton();

        jLabel4.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        jLabel4.setText("상품 추가");

        jLabel5.setText("서비스 구분 :");

        jLabel6.setText("상품명 :");

        jLabel7.setText("가격 :");

        AddProductCategoryCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "룸서비스", "레스토랑서비스" }));

        AddProductOkBtn.setText("추가");
        AddProductOkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProductOkBtnActionPerformed(evt);
            }
        });

        AddProductCancelBtn.setText("취소");
        AddProductCancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProductCancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddProductDlgLayout = new javax.swing.GroupLayout(AddProductDlg.getContentPane());
        AddProductDlg.getContentPane().setLayout(AddProductDlgLayout);
        AddProductDlgLayout.setHorizontalGroup(
            AddProductDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddProductDlgLayout.createSequentialGroup()
                .addGroup(AddProductDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddProductDlgLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel4))
                    .addGroup(AddProductDlgLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(AddProductDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AddProductDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AddProductCategoryCB, 0, 1, Short.MAX_VALUE)
                            .addComponent(AddProductNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(AddProductPriceField)))
                    .addGroup(AddProductDlgLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(AddProductOkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(AddProductCancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        AddProductDlgLayout.setVerticalGroup(
            AddProductDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddProductDlgLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addGap(46, 46, 46)
                .addGroup(AddProductDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(AddProductCategoryCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(AddProductDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(AddProductNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(AddProductDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(AddProductPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(AddProductDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddProductOkBtn)
                    .addComponent(AddProductCancelBtn))
                .addGap(38, 38, 38))
        );

        jLabel8.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        jLabel8.setText("상품 수정");

        ModifyProductOkBtn.setText("수정");
        ModifyProductOkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyProductOkBtnActionPerformed(evt);
            }
        });

        ModifyProductCancelBtn.setText("취소");
        ModifyProductCancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyProductCancelBtnActionPerformed(evt);
            }
        });

        jLabel9.setText("서비스 구분 :");

        jLabel10.setText("상품명 :");

        jLabel11.setText("가격 :");

        ModifyProductCategoryCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "룸서비스", "레스토랑서비스" }));

        jLabel12.setText("번호: ");

        javax.swing.GroupLayout ModifyProductDlgLayout = new javax.swing.GroupLayout(ModifyProductDlg.getContentPane());
        ModifyProductDlg.getContentPane().setLayout(ModifyProductDlgLayout);
        ModifyProductDlgLayout.setHorizontalGroup(
            ModifyProductDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModifyProductDlgLayout.createSequentialGroup()
                .addGroup(ModifyProductDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ModifyProductDlgLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel8))
                    .addGroup(ModifyProductDlgLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(ModifyProductDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ModifyProductDlgLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(ModifyProductOkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(ModifyProductCancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ModifyProductDlgLayout.createSequentialGroup()
                                .addGroup(ModifyProductDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ModifyProductDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ModifyProductDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ModifyProductCategoryCB, 0, 1, Short.MAX_VALUE)
                                        .addComponent(ModifyProductNameField)
                                        .addComponent(ModifyProductPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(IndexLabel))))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        ModifyProductDlgLayout.setVerticalGroup(
            ModifyProductDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModifyProductDlgLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel8)
                .addGap(20, 20, 20)
                .addGroup(ModifyProductDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(IndexLabel))
                .addGap(26, 26, 26)
                .addGroup(ModifyProductDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ModifyProductCategoryCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(ModifyProductDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ModifyProductNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(ModifyProductDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(ModifyProductPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(ModifyProductDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModifyProductOkBtn)
                    .addComponent(ModifyProductCancelBtn))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        jLabel2.setText("상품 관리");

        jLabel1.setText("상품명 :");

        MgmtProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "서비스 구분", "상품명", "가격"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        MgmtProductTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(MgmtProductTable);

        SearchProductBtn.setText("검색");
        SearchProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchProductBtnActionPerformed(evt);
            }
        });

        ModifyProductBtn.setText("수정");
        ModifyProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyProductBtnActionPerformed(evt);
            }
        });

        MgmtProductCancelBtn.setText("이전");
        MgmtProductCancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MgmtProductCancelBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("서비스 구분 :");

        CategoryCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "전체", "룸서비스", "레스토랑서비스" }));
        CategoryCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryCBActionPerformed(evt);
            }
        });

        AddProductBtn.setText("추가");
        AddProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProductBtnActionPerformed(evt);
            }
        });

        RemoveProductBtn.setText("삭제");
        RemoveProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveProductBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RemoveProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ModifyProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MgmtProductCancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CategoryCB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SearchProductNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(SearchProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CategoryCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(SearchProductNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchProductBtn))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModifyProductBtn)
                    .addComponent(MgmtProductCancelBtn)
                    .addComponent(AddProductBtn)
                    .addComponent(RemoveProductBtn))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchProductBtnActionPerformed
        // TODO add your handling code here:
        String str = SearchProductNameField.getText();
        for (int i = 0; i < MgmtProductTable.getRowCount(); i++) {
            if (str.equals(MgmtProductTable.getValueAt(i, 1))) {
                MgmtProductTable.requestFocus();
                MgmtProductTable.changeSelection(i, 0, false, false);
            }
        }
    }//GEN-LAST:event_SearchProductBtnActionPerformed

    private void AddProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProductBtnActionPerformed
        // TODO add your handling code here:
        AddProductDlg.setVisible(true);
        AddProductDlg.setLocationRelativeTo(this);
        AddProductDlg.setSize(340, 400);
    }//GEN-LAST:event_AddProductBtnActionPerformed

    private void ModifyProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyProductBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) MgmtProductTable.getModel();
        int row = MgmtProductTable.getSelectedRow();
        try {
            ModifyProductCategoryCB.setSelectedItem(model.getValueAt(row, 0));
            ModifyProductNameField.setText(model.getValueAt(row, 1).toString());
            ModifyProductPriceField.setText(model.getValueAt(row, 2).toString());
            IndexLabel.setText(Integer.toString(row));
            ModifyProductDlg.setVisible(true);
            ModifyProductDlg.setLocationRelativeTo(this);
            ModifyProductDlg.setSize(340, 420);
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "선택된 항목이 없습니다.");
        }
    }//GEN-LAST:event_ModifyProductBtnActionPerformed

    private void MgmtProductCancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MgmtProductCancelBtnActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_MgmtProductCancelBtnActionPerformed

    private void CategoryCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryCBActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) MgmtProductTable.getModel();
        model.setRowCount(0);
        switch (CategoryCB.getSelectedIndex()) {
            case 0:
                new LoadServiceList((DefaultTableModel) MgmtProductTable.getModel());
                break;
            case 1:
                new LoadServiceList((DefaultTableModel) MgmtProductTable.getModel(), "룸서비스", MgmtProductTable.getColumnCount());
                break;
            case 2:
                new LoadServiceList((DefaultTableModel) MgmtProductTable.getModel(), "레스토랑서비스", MgmtProductTable.getColumnCount());
                break;
            default:
                break;
        }
    }//GEN-LAST:event_CategoryCBActionPerformed

    private void AddProductOkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProductOkBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) MgmtProductTable.getModel();
        String productCategory = AddProductCategoryCB.getSelectedItem().toString();
        String productName = AddProductNameField.getText();
        String productPrice = AddProductPriceField.getText();
        model.addRow(new Object[] {productCategory, productName, productPrice});
        new ModifyServiceList(model);
        AddProductDlg.dispose();
    }//GEN-LAST:event_AddProductOkBtnActionPerformed

    private void AddProductCancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProductCancelBtnActionPerformed
        // TODO add your handling code here:
        AddProductDlg.dispose();
    }//GEN-LAST:event_AddProductCancelBtnActionPerformed

    private void ModifyProductOkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyProductOkBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) MgmtProductTable.getModel();
        String productCategory = ModifyProductCategoryCB.getSelectedItem().toString();
        String productName = ModifyProductNameField.getText();
        String productPrice = ModifyProductPriceField.getText();
        int row = Integer.parseInt(IndexLabel.getText());
        model.removeRow(row);
        model.insertRow(row, new Object[] {productCategory, productName, productPrice});
        new ModifyServiceList(model);
        ModifyProductDlg.dispose();
    }//GEN-LAST:event_ModifyProductOkBtnActionPerformed

    private void ModifyProductCancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyProductCancelBtnActionPerformed
        // TODO add your handling code here:
        ModifyProductDlg.dispose();
    }//GEN-LAST:event_ModifyProductCancelBtnActionPerformed

    private void RemoveProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveProductBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) MgmtProductTable.getModel();
        int row = MgmtProductTable.getSelectedRow();
        model.removeRow(row);
        new ModifyServiceList(model);
    }//GEN-LAST:event_RemoveProductBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MgmtProductRate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MgmtProductRate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MgmtProductRate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MgmtProductRate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MgmtProductRate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddProductBtn;
    private javax.swing.JButton AddProductCancelBtn;
    private javax.swing.JComboBox<String> AddProductCategoryCB;
    private javax.swing.JDialog AddProductDlg;
    private javax.swing.JTextField AddProductNameField;
    private javax.swing.JButton AddProductOkBtn;
    private javax.swing.JTextField AddProductPriceField;
    private javax.swing.JComboBox<String> CategoryCB;
    private javax.swing.JLabel IndexLabel;
    private javax.swing.JButton MgmtProductCancelBtn;
    private javax.swing.JTable MgmtProductTable;
    private javax.swing.JButton ModifyProductBtn;
    private javax.swing.JButton ModifyProductCancelBtn;
    private javax.swing.JComboBox<String> ModifyProductCategoryCB;
    private javax.swing.JDialog ModifyProductDlg;
    private javax.swing.JTextField ModifyProductNameField;
    private javax.swing.JButton ModifyProductOkBtn;
    private javax.swing.JTextField ModifyProductPriceField;
    private javax.swing.JButton RemoveProductBtn;
    private javax.swing.JButton SearchProductBtn;
    private javax.swing.JTextField SearchProductNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
