/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.service;

import deu.cse.team.source.FileMgmt;
import deu.cse.team.source.ServiceOrderListInfo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KYG
 */
public class ServiceConfirm extends javax.swing.JFrame {

    /**
     * Creates new form Ser2
     */
    public ServiceConfirm() {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("Service Confirm");
        loadServiceConfirmData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OrderTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        ServiceConfirmCancelBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        RequestTable = new javax.swing.JTable();
        RoomNumRB = new javax.swing.JRadioButton();
        IndexRB = new javax.swing.JRadioButton();
        RoomNumField = new javax.swing.JTextField();
        IndexField = new javax.swing.JTextField();
        CheckServiceBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("굴림", 0, 24)); // NOI18N
        jLabel1.setText("레스토랑/룸서비스 예약 확인");

        OrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "고유번호", "호수", "카테고리", "주문시간"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(OrderTable);
        if (OrderTable.getColumnModel().getColumnCount() > 0) {
            OrderTable.getColumnModel().getColumn(0).setMinWidth(60);
            OrderTable.getColumnModel().getColumn(0).setMaxWidth(60);
            OrderTable.getColumnModel().getColumn(1).setMinWidth(50);
            OrderTable.getColumnModel().getColumn(1).setMaxWidth(50);
            OrderTable.getColumnModel().getColumn(2).setMinWidth(120);
            OrderTable.getColumnModel().getColumn(2).setMaxWidth(120);
        }

        jButton1.setText("검색");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ServiceConfirmCancelBtn.setText("이전");
        ServiceConfirmCancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServiceConfirmCancelBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("요구사항");

        RequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "음식", "상품가격"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(RequestTable);

        buttonGroup1.add(RoomNumRB);
        RoomNumRB.setSelected(true);
        RoomNumRB.setText("호수");
        RoomNumRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomNumRBActionPerformed(evt);
            }
        });

        buttonGroup1.add(IndexRB);
        IndexRB.setText("고유번호");
        IndexRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IndexRBActionPerformed(evt);
            }
        });

        IndexField.setEnabled(false);

        CheckServiceBtn.setText("조회");
        CheckServiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckServiceBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IndexRB)
                            .addComponent(RoomNumRB))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RoomNumField)
                            .addComponent(IndexField, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CheckServiceBtn)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ServiceConfirmCancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(114, 114, 114)
                        .addComponent(CheckServiceBtn)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RoomNumRB)
                            .addComponent(RoomNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(IndexRB)
                            .addComponent(IndexField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(ServiceConfirmCancelBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ServiceConfirmCancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServiceConfirmCancelBtnActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_ServiceConfirmCancelBtnActionPerformed

    private void RoomNumRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomNumRBActionPerformed
        // TODO add your handling code here:
        RoomNumField.setEnabled(true);
        IndexField.setEnabled(false);
        IndexField.setText("");
    }//GEN-LAST:event_RoomNumRBActionPerformed

    private void IndexRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IndexRBActionPerformed
        // TODO add your handling code here:
        RoomNumField.setEnabled(false);
        IndexField.setEnabled(true);
        RoomNumField.setText("");
    }//GEN-LAST:event_IndexRBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean checkIndex = false;
        boolean checkRoom = false;
        OrderTable.clearSelection();
        for (int i = 0; i < OrderTable.getRowCount(); i++) {    
            if(IndexRB.isSelected()==true){
                if(IndexField.getText().equals(OrderTable.getValueAt(i, 0))){
                    OrderTable.requestFocus();
                    OrderTable.changeSelection(i, 0, true, false);
                    checkIndex = true;
                }
            }
            else if(RoomNumRB.isSelected()==true){
                if(RoomNumField.getText().equals(OrderTable.getValueAt(i, 1))){
                    OrderTable.requestFocus();
                    OrderTable.changeSelection(i, 0, true, false);
                    checkRoom = true;
                }
            }
        }
        if(IndexRB.isSelected()==true&&checkIndex==false){
            JOptionPane.showMessageDialog(null, "정보를 찾을 수 없습니다.");
        }
        if(RoomNumRB.isSelected()==true&&checkRoom==false){
            JOptionPane.showMessageDialog(null, "정보를 찾을 수 없습니다.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CheckServiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckServiceBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) RequestTable.getModel();
        model.setNumRows(0);
        int row[] = OrderTable.getSelectedRows();
        BufferedReader reader;
        String array;
        String[] Arr;
        String[] productname;
        String[] money;
        String str;
        for(int i=0;i<row.length;i++){
            str = String.valueOf(OrderTable.getValueAt(row[i], 3));
            try (FileReader r = new FileReader("C:\\DB\\ServiceOrderList.txt")) {
                reader = new BufferedReader(r);
                while ((array = reader.readLine()) != null) {
                    Arr = array.split("\t");
                    if (str.equals(Arr[3])) {
                        productname = Arr[4].split("/");
                        money = Arr[5].split("/");
                        for (int j = 0; j < productname.length; j++) {
                            model.addRow(new Object[]{
                                productname[j],
                                money[j]
                            });
                        }
                    }
                }
            } catch (IOException e) {
            }
        }
  
    }//GEN-LAST:event_CheckServiceBtnActionPerformed

    private void loadServiceConfirmData() {
        ArrayList<ServiceOrderListInfo> serviceOrderListInfo = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) OrderTable.getModel();
        try {
            FileMgmt fileMgmt = new FileMgmt();
            fileMgmt.readServiceOrderListFileData("C:\\DB\\ServiceOrderList.txt");
            fileMgmt.splitServiceOrderListFileData();
            serviceOrderListInfo = fileMgmt.returnServiceOrderListInfo();

            for (int i = 0; i < serviceOrderListInfo.size(); i++) {
                model.addRow(new Object[]{
                    serviceOrderListInfo.get(i).getIndex(),
                    serviceOrderListInfo.get(i).getRoom(),
                    serviceOrderListInfo.get(i).getService(),
                    serviceOrderListInfo.get(i).getTime()
                });
            }
        } catch (IOException e) {
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
            java.util.logging.Logger.getLogger(ServiceConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServiceConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServiceConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServiceConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServiceConfirm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CheckServiceBtn;
    private javax.swing.JTextField IndexField;
    private javax.swing.JRadioButton IndexRB;
    private javax.swing.JTable OrderTable;
    private javax.swing.JTable RequestTable;
    private javax.swing.JTextField RoomNumField;
    private javax.swing.JRadioButton RoomNumRB;
    private javax.swing.JButton ServiceConfirmCancelBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
