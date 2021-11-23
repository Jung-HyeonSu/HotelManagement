/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.checkin;

import deu.cse.team.source.BookingInfo;
import deu.cse.team.source.FileMgmt;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class CheckIn extends javax.swing.JFrame {

    /**
     * Creates new form CheckIn
     */
    public CheckIn() {
        initComponents();
        setLocationRelativeTo(this);
        loadBookingData();
        CheckInNameRB.setSelected(true);
        CheckInIndexField.setEnabled(false);
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
        CheckInNameRB = new javax.swing.JRadioButton();
        CheckInIndexRB = new javax.swing.JRadioButton();
        CheckInNameField = new javax.swing.JTextField();
        CheckInIndexField = new javax.swing.JTextField();
        CheckInSearchBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CheckInBookingTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(CheckInNameRB);
        CheckInNameRB.setText("이름");
        CheckInNameRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckInNameRBActionPerformed(evt);
            }
        });

        buttonGroup1.add(CheckInIndexRB);
        CheckInIndexRB.setText("고유번호");
        CheckInIndexRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckInIndexRBActionPerformed(evt);
            }
        });

        CheckInSearchBtn.setText("검색");
        CheckInSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckInSearchBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("예약자 명단");

        CheckInBookingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "고유번호", "이름", "호수", "인원", "연락처", "입실", "퇴실", "상태", "주소", "금액"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CheckInBookingTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CheckInBookingTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(CheckInBookingTable);
        if (CheckInBookingTable.getColumnModel().getColumnCount() > 0) {
            CheckInBookingTable.getColumnModel().getColumn(0).setMinWidth(60);
            CheckInBookingTable.getColumnModel().getColumn(0).setMaxWidth(60);
            CheckInBookingTable.getColumnModel().getColumn(1).setMinWidth(60);
            CheckInBookingTable.getColumnModel().getColumn(1).setMaxWidth(60);
            CheckInBookingTable.getColumnModel().getColumn(2).setMinWidth(50);
            CheckInBookingTable.getColumnModel().getColumn(2).setMaxWidth(50);
            CheckInBookingTable.getColumnModel().getColumn(3).setMinWidth(50);
            CheckInBookingTable.getColumnModel().getColumn(3).setMaxWidth(50);
            CheckInBookingTable.getColumnModel().getColumn(7).setMinWidth(50);
            CheckInBookingTable.getColumnModel().getColumn(7).setMaxWidth(50);
            CheckInBookingTable.getColumnModel().getColumn(8).setMinWidth(0);
            CheckInBookingTable.getColumnModel().getColumn(8).setMaxWidth(0);
            CheckInBookingTable.getColumnModel().getColumn(9).setMinWidth(0);
            CheckInBookingTable.getColumnModel().getColumn(9).setMaxWidth(0);
        }

        jButton2.setText("체크인");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("이전");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CheckInNameRB)
                    .addComponent(CheckInIndexRB))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CheckInNameField)
                    .addComponent(CheckInIndexField, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(CheckInSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckInNameRB)
                    .addComponent(CheckInNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckInIndexRB)
                    .addComponent(CheckInIndexField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckInSearchBtn))
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckInSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckInSearchBtnActionPerformed
        // TODO add your handling code here:
        try {
            String str = CheckInNameField.getText() + CheckInIndexField.getText();
            for (int i = 0; i < CheckInBookingTable.getColumnCount(); i++) {
                if (str.equals(CheckInBookingTable.getValueAt(i, 0)) || str.equals(CheckInBookingTable.getValueAt(i, 1))) {
                    CheckInBookingTable.requestFocus();
                    CheckInBookingTable.changeSelection(i, 0, false, false);
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_CheckInSearchBtnActionPerformed

    private void CheckInNameRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckInNameRBActionPerformed
        // TODO add your handling code here:
        CheckInNameField.setEnabled(true);
        CheckInIndexField.setEnabled(false);
        CheckInIndexField.setText("");
    }//GEN-LAST:event_CheckInNameRBActionPerformed

    private void CheckInIndexRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckInIndexRBActionPerformed
        // TODO add your handling code here:
        CheckInNameField.setEnabled(false);
        CheckInIndexField.setEnabled(true);
        CheckInNameField.setText("");
    }//GEN-LAST:event_CheckInIndexRBActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        FileMgmt fileMgmt = new FileMgmt();
        int row = CheckInBookingTable.getSelectedRow();
        String str = String.valueOf(CheckInBookingTable.getValueAt(row, 0));
        try (FileReader r = new FileReader("C:\\DB\\BookingList.txt")) {
            BufferedReader reader = new BufferedReader(r);
            String array;
            String[] Arr;
            String state = "N";
            while ((array = reader.readLine()) != null) {
                Arr = array.split("\t");
                if (str.equals(Arr[0]) && state.equals(Arr[9])) { // 고유번호가 str과 같으면 info에 정보 저장
                    String info = Arr[0] + "\t" + Arr[1] + "\t" + Arr[2] + "\t"
                            + Arr[3] + "\t" + Arr[4] + "\t" + Arr[5] + "\t"
                            + Arr[6] + "\t" + Arr[7] + "\t" + Arr[8];
                    try {
                        fileMgmt.writeCheckInFileData("C:\\DB\\CheckInList.txt", info);
                    } catch (IOException ex) {
                    }

                    // 체크인 시 상태 Y로 변경
                    ArrayList<String> tempArray = new ArrayList<>();
                    try (FileReader fr = new FileReader("C:\\DB\\BookingList.txt")) {
                        Scanner scanner = new Scanner(fr);
                        String line = null;
                        String[] Array;

                        while ((line = scanner.nextLine()) != null) {
                            Array = line.split("\t");
                            if (Array[0].equals(str)) {
                                tempArray.add(
                                        Array[0] + "\t" + Array[1] + "\t" + Array[2] + "\t"
                                        + Array[3] + "\t" + Array[4] + "\t" + Array[5] + "\t"
                                        + Array[6] + "\t" + Array[7] + "\t" + Array[8] + "\t" + "Y");
                            } else {
                                tempArray.add(line);
                            }
                        }
                        fr.close();
                    } catch (Exception e) {
                    }

                    try (PrintWriter pr = new PrintWriter("C:\\DB\\BookingList.txt")) {
                        for (String temp : tempArray) {
                            pr.println(temp);
                        }
                        pr.close();
                    } catch (Exception e) {
                    }

                    JOptionPane.showMessageDialog(null, "" + Arr[4] + "호실을 체크인 하였습니다.");
                    DefaultTableModel model = (DefaultTableModel) CheckInBookingTable.getModel();
                    model.setNumRows(0);
                    loadBookingData();
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void loadBookingData() {
        ArrayList<BookingInfo> bookingInfo = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) CheckInBookingTable.getModel();
        try {
            FileMgmt fileMgmt = new FileMgmt();
            fileMgmt.readBookingFileData("C:\\DB\\BookingList.txt");
            fileMgmt.splitBookingFileData();
            bookingInfo = fileMgmt.returnBookingInfo();
            
            for (int i = 0; i < bookingInfo.size(); i++) {
                model.addRow(new Object[]{
                    bookingInfo.get(i).getIndex(),
                    bookingInfo.get(i).getName(),
                    bookingInfo.get(i).getRoom(),
                    bookingInfo.get(i).getPersonnel(),
                    bookingInfo.get(i).getPhonenumber(),
                    bookingInfo.get(i).getEntrance(),
                    bookingInfo.get(i).getExit(),
                    bookingInfo.get(i).getStatus(),
                    bookingInfo.get(i).getAddress(),
                    bookingInfo.get(i).getMoney()
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
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckIn().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CheckInBookingTable;
    private javax.swing.JTextField CheckInIndexField;
    private javax.swing.JRadioButton CheckInIndexRB;
    private javax.swing.JTextField CheckInNameField;
    private javax.swing.JRadioButton CheckInNameRB;
    private javax.swing.JButton CheckInSearchBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
