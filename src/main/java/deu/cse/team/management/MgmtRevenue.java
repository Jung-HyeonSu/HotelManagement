/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.management;

import deu.cse.team.source.BookingInfo;
import deu.cse.team.source.FileMgmt;
import deu.cse.team.source.LoadBookingData;
import deu.cse.team.source.RevenueInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KYG
 */
public class MgmtRevenue extends javax.swing.JFrame {

    /**
     * Creates new form Manage2
     */
    public MgmtRevenue() {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("Manage Revenue");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        MgmtRevenueDateCB1 = new javax.swing.JComboBox<>();
        MgmtRevenueDateCB2 = new javax.swing.JComboBox<>();
        MgmtRevenueDateCB3 = new javax.swing.JComboBox<>();
        MgmtRevenueDateCB4 = new javax.swing.JComboBox<>();
        MgmtRevenueDateCB5 = new javax.swing.JComboBox<>();
        MgmtRevenueDateCB6 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        MgmtRevenueSearchBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MgmtRevenueTable = new javax.swing.JTable();
        MgmtRevenueOkBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        EstimatedShareLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("굴림", 0, 18)); // NOI18N
        jLabel1.setText("예상 점유율 및 수입 확인");

        MgmtRevenueDateCB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        MgmtRevenueDateCB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MgmtRevenueDateCB1ActionPerformed(evt);
            }
        });

        MgmtRevenueDateCB2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        MgmtRevenueDateCB3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        MgmtRevenueDateCB4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        MgmtRevenueDateCB5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        MgmtRevenueDateCB6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel2.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        jLabel2.setText("~");

        MgmtRevenueSearchBtn.setText("검색");
        MgmtRevenueSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MgmtRevenueSearchBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("예상 수익:");

        jLabel4.setText("0원");

        MgmtRevenueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "고유번호", "객실 수입", "식품 수입", "수입 발생 시간"
            }
        ));
        jScrollPane1.setViewportView(MgmtRevenueTable);

        MgmtRevenueOkBtn.setText("확인");

        jLabel5.setText("예상 점유율 :");

        EstimatedShareLabel.setText("0%");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(MgmtRevenueDateCB1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MgmtRevenueDateCB2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MgmtRevenueDateCB3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MgmtRevenueOkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)
                        .addComponent(MgmtRevenueDateCB4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MgmtRevenueDateCB5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MgmtRevenueDateCB6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MgmtRevenueSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(215, 215, 215))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EstimatedShareLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(341, 341, 341))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {MgmtRevenueDateCB5, MgmtRevenueDateCB6});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {MgmtRevenueDateCB2, MgmtRevenueDateCB3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MgmtRevenueDateCB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MgmtRevenueDateCB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MgmtRevenueDateCB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MgmtRevenueDateCB4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MgmtRevenueDateCB5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MgmtRevenueDateCB6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(MgmtRevenueSearchBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(EstimatedShareLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(MgmtRevenueOkBtn)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MgmtRevenueSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MgmtRevenueSearchBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) MgmtRevenueTable.getModel();
        model.setNumRows(0);
        
        int from = Integer.parseInt(MgmtRevenueDateCB1.getSelectedItem().toString() 
                +MgmtRevenueDateCB2.getSelectedItem().toString()
                +MgmtRevenueDateCB3.getSelectedItem().toString());
        int to = Integer.parseInt(MgmtRevenueDateCB4.getSelectedItem().toString() 
                +MgmtRevenueDateCB5.getSelectedItem().toString()
                +MgmtRevenueDateCB6.getSelectedItem().toString());
        int estimatedIncome = 0; //예상수입
        int roomRevenue = 0; //객실수입
        int serviceIncome = 0; //서비스수입
        ArrayList<RevenueInfo> revenueInfo = new ArrayList<>();
        try {
            FileMgmt fileMgmt = new FileMgmt();
            fileMgmt.readRevenueFileData("C:\\DB\\RevenueList.txt");
            fileMgmt.splitRevenueListFileData();
            revenueInfo = fileMgmt.returnRevenueInfo();
            String[] splitWave;
            String[] splitLine;
            String str;
             for (int i = 0; i < revenueInfo.size(); i++) {
                splitWave = revenueInfo.get(i).getStay().split("~");
                splitLine = splitWave[1].split("-");
                str = splitLine[0]+splitLine[1]+splitLine[2];
                if(Integer.parseInt(str)>=from&&Integer.parseInt(str)<=to){
                    roomRevenue = Integer.parseInt(revenueInfo.get(i).getBasicRate())+Integer.parseInt(revenueInfo.get(i).getAdditionalRate());
                    serviceIncome = Integer.parseInt(revenueInfo.get(i).getServiceRate());
                    estimatedIncome += roomRevenue + serviceIncome;
                    model.addRow(new Object[]{revenueInfo.get(i).getIndex(),
                        roomRevenue,
                        revenueInfo.get(i).getServiceRate(),
                        splitWave[1]});
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(MgmtRevenue.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ArrayList<BookingInfo> bookingInfo = new ArrayList<>();
        try {
            FileMgmt fileMgmt = new FileMgmt();
            fileMgmt.readBookingFileData("C:\\DB\\BookingList.txt");
            fileMgmt.splitBookingFileData();
            bookingInfo = fileMgmt.returnBookingInfo();
            String[] splitLine;
            String str;
            int guest = 0;
            for (int i = 0; i < bookingInfo.size(); i++) {
                splitLine = bookingInfo.get(i).getExit().split("-");
                str = splitLine[0]+splitLine[1]+splitLine[2];
                if((Integer.parseInt(str)>=from&&Integer.parseInt(str)<=to)&&(!bookingInfo.get(i).getStatus().equals("C"))){
                    guest++;
                }
            }
            double estimatedShare = (guest/1000.0)*100.0;
            EstimatedShareLabel.setText(String.format("%.2f%%", estimatedShare));
        } catch (IOException ex) {
            Logger.getLogger(MgmtRevenue.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jLabel4.setText(Integer.toString(estimatedIncome)+"원");
    }//GEN-LAST:event_MgmtRevenueSearchBtnActionPerformed

    private void MgmtRevenueDateCB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MgmtRevenueDateCB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MgmtRevenueDateCB1ActionPerformed

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
            java.util.logging.Logger.getLogger(MgmtRevenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MgmtRevenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MgmtRevenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MgmtRevenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MgmtRevenue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EstimatedShareLabel;
    private javax.swing.JComboBox<String> MgmtRevenueDateCB1;
    private javax.swing.JComboBox<String> MgmtRevenueDateCB2;
    private javax.swing.JComboBox<String> MgmtRevenueDateCB3;
    private javax.swing.JComboBox<String> MgmtRevenueDateCB4;
    private javax.swing.JComboBox<String> MgmtRevenueDateCB5;
    private javax.swing.JComboBox<String> MgmtRevenueDateCB6;
    private javax.swing.JButton MgmtRevenueOkBtn;
    private javax.swing.JButton MgmtRevenueSearchBtn;
    private javax.swing.JTable MgmtRevenueTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
