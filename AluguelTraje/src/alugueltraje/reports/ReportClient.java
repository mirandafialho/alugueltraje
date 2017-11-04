/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alugueltraje.reports;

import alugueltraje.MySQL;
import alugueltraje.Client;
import alugueltraje.ComboItem;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 * Formulário com relatório de clientes.
 * 
 * @author Yuri
 */
public class ReportClient extends javax.swing.JFrame {
    
    public Connection c;
    public MySQL query = new MySQL(); 
    DefaultTableModel model;
    public int linha = 0;

    /**
     * Creates new form ReportClient
     */
    public ReportClient() {
        initComponents();
        listClients();
        model = (DefaultTableModel)tableClientRents.getModel();
        
        
        
        lblClientNameResult.setVisible(false);
        lblClientEmailResult.setVisible(false);
        lblClientPhoneResult.setVisible(false);
    }
    
    public void listClients() {
        String search = "SELECT id FROM clientes";
        try {
            ResultSet rs = query.search(search);
            if (rs != null) {
                while (rs.next()) {
                    selectClientNames.addItem(rs.getString("id"));
                }
            } else {
                JOptionPane.showMessageDialog(this, "Cliente não encontrado.");
            }
        } catch (Exception e) {}
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblClientIds = new javax.swing.JLabel();
        btnClientSearch = new javax.swing.JButton();
        panelReportClientData = new javax.swing.JPanel();
        lblReportClientName = new javax.swing.JLabel();
        lblReportClientEmail = new javax.swing.JLabel();
        lblReportClientPhone = new javax.swing.JLabel();
        lblClientNameResult = new javax.swing.JLabel();
        lblClientEmailResult = new javax.swing.JLabel();
        lblClientPhoneResult = new javax.swing.JLabel();
        panelReportClientRents = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableClientRents = new javax.swing.JTable();
        lblClientRents = new javax.swing.JLabel();
        checkClientGiveBack = new javax.swing.JCheckBox();
        selectClientNames = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        lblClientIds.setText("Código do Cliente");
        lblClientIds.setName("lblClientIds"); // NOI18N

        btnClientSearch.setText("Buscar");
        btnClientSearch.setName("btnClientSearch"); // NOI18N
        btnClientSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientSearchActionPerformed(evt);
            }
        });

        panelReportClientData.setToolTipText("Dados do Cliente");
        panelReportClientData.setName("panelReportClientData"); // NOI18N

        lblReportClientName.setText("Nome");
        lblReportClientName.setName("lblReportClientName"); // NOI18N

        lblReportClientEmail.setText("E-mail");
        lblReportClientEmail.setName("lblReportClientEmail"); // NOI18N

        lblReportClientPhone.setText("Telefone");
        lblReportClientPhone.setName("lblReportClientPhone"); // NOI18N

        lblClientNameResult.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblClientNameResult.setText("lblClientNameResult");
        lblClientNameResult.setName("lblClientNameResult"); // NOI18N

        lblClientEmailResult.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblClientEmailResult.setText("lblClientEmailResult");
        lblClientEmailResult.setName("lblClientEmailResult"); // NOI18N

        lblClientPhoneResult.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblClientPhoneResult.setText("lblClientPhoneResult");
        lblClientPhoneResult.setToolTipText("");
        lblClientPhoneResult.setName("lblClientPhoneResult"); // NOI18N

        javax.swing.GroupLayout panelReportClientDataLayout = new javax.swing.GroupLayout(panelReportClientData);
        panelReportClientData.setLayout(panelReportClientDataLayout);
        panelReportClientDataLayout.setHorizontalGroup(
            panelReportClientDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportClientDataLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelReportClientDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblReportClientName)
                    .addComponent(lblClientNameResult))
                .addGap(109, 109, 109)
                .addGroup(panelReportClientDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblReportClientEmail)
                    .addComponent(lblClientEmailResult))
                .addGap(131, 131, 131)
                .addGroup(panelReportClientDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblClientPhoneResult)
                    .addComponent(lblReportClientPhone))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelReportClientDataLayout.setVerticalGroup(
            panelReportClientDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportClientDataLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelReportClientDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReportClientName)
                    .addComponent(lblReportClientEmail)
                    .addComponent(lblReportClientPhone))
                .addGap(18, 18, 18)
                .addGroup(panelReportClientDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClientNameResult)
                    .addComponent(lblClientEmailResult)
                    .addComponent(lblClientPhoneResult))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        panelReportClientRents.setToolTipText("Aluguéis do Cliente");
        panelReportClientRents.setName("panelReportClientRents"); // NOI18N

        tableClientRents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data Inicial", "Data Final", "Data de Devolução", "Total"
            }
        ));
        tableClientRents.setName("tableClientRents"); // NOI18N
        jScrollPane1.setViewportView(tableClientRents);

        lblClientRents.setText("Locações do Cliente");
        lblClientRents.setName("lblClientRents"); // NOI18N

        checkClientGiveBack.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        checkClientGiveBack.setText("Devolvidos");
        checkClientGiveBack.setName("checkClientGiveBack"); // NOI18N
        checkClientGiveBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkClientGiveBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelReportClientRentsLayout = new javax.swing.GroupLayout(panelReportClientRents);
        panelReportClientRents.setLayout(panelReportClientRentsLayout);
        panelReportClientRentsLayout.setHorizontalGroup(
            panelReportClientRentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportClientRentsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelReportClientRentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelReportClientRentsLayout.createSequentialGroup()
                        .addComponent(lblClientRents)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkClientGiveBack))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panelReportClientRentsLayout.setVerticalGroup(
            panelReportClientRentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportClientRentsLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelReportClientRentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClientRents)
                    .addComponent(checkClientGiveBack))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        selectClientNames.setName("selectClientNames"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelReportClientData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelReportClientRents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblClientIds)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(selectClientNames, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnClientSearch)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblClientIds)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClientSearch)
                    .addComponent(selectClientNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panelReportClientData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelReportClientRents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(76, 76, 76))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientSearchActionPerformed
        // TODO add your handling code here:
        if (model.getRowCount() != 0) {
            model.setNumRows(0);
        }
        
        if (checkClientGiveBack.isSelected()) {
            this.checkClientGiveBackActionPerformed(evt);
        }
        
        Object id = selectClientNames.getSelectedItem();
        String search = "select \n" +
                "clientes.*, locacoes.*\n" +
                "from clientes\n" +
                "left join locacoes\n" +
                "on\n" +
                "clientes.id = locacoes.clientes_id\n" +
                "where clientes.id = " + id + ";";
        
        try {
            ResultSet rs = query.search(search);
            if (rs != null) {
                while (rs.next()) {
                    model.addRow(new String[]{String.valueOf(rs.getDate("locacoes.data_inicial")), String.valueOf(rs.getDate("locacoes.data_final")), String.valueOf(rs.getDate("locacoes.data_devolucao")), String.valueOf(rs.getString("locacoes.total"))});
                    lblClientNameResult.setText(rs.getString("clientes.nome"));
                    lblClientEmailResult.setText(rs.getString("clientes.email"));
                    lblClientPhoneResult.setText(rs.getString("clientes.telefone"));
                }
                lblClientNameResult.setVisible(true);
                lblClientEmailResult.setVisible(true);
                lblClientPhoneResult.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Cliente sem locações no momento.");
            }
        } catch (Exception e) {}
    }//GEN-LAST:event_btnClientSearchActionPerformed

    private void checkClientGiveBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkClientGiveBackActionPerformed
        // TODO add your handling code here:
        if (checkClientGiveBack.isSelected()) {
            if (model.getRowCount() != 0) {
                model.setNumRows(0);
            }
            
            Object id = selectClientNames.getSelectedItem();
            String search = "select \n" +
                    "clientes.*, locacoes.*\n" +
                    "from clientes\n" +
                    "left join locacoes\n" +
                    "on\n" +
                    "clientes.id = locacoes.clientes_id\n" +
                    "where clientes.id = " + id + "\n" +
                    "and locacoes.data_devolucao is not null;";

            try {
                ResultSet rs = query.search(search);
                if (rs != null) {
                    while (rs.next()) {
                        model.addRow(new String[]{String.valueOf(rs.getDate("locacoes.data_inicial")), String.valueOf(rs.getDate("locacoes.data_final")), String.valueOf(rs.getDate("locacoes.data_devolucao")), String.valueOf(rs.getString("locacoes.total"))});
                        lblClientNameResult.setText(rs.getString("clientes.nome"));
                        lblClientEmailResult.setText(rs.getString("clientes.email"));
                        lblClientPhoneResult.setText(rs.getString("clientes.telefone"));
                    }
                    lblClientNameResult.setVisible(true);
                    lblClientEmailResult.setVisible(true);
                    lblClientPhoneResult.setVisible(true);
                } else {
                    model.setNumRows(0);
                }
            } catch (Exception e) {}
        } else {
            this.btnClientSearchActionPerformed(evt);
        }
    }//GEN-LAST:event_checkClientGiveBackActionPerformed

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
            java.util.logging.Logger.getLogger(ReportClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientSearch;
    private javax.swing.JCheckBox checkClientGiveBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClientEmailResult;
    private javax.swing.JLabel lblClientIds;
    private javax.swing.JLabel lblClientNameResult;
    private javax.swing.JLabel lblClientPhoneResult;
    private javax.swing.JLabel lblClientRents;
    private javax.swing.JLabel lblReportClientEmail;
    private javax.swing.JLabel lblReportClientName;
    private javax.swing.JLabel lblReportClientPhone;
    private javax.swing.JPanel panelReportClientData;
    private javax.swing.JPanel panelReportClientRents;
    private javax.swing.JComboBox<String> selectClientNames;
    private javax.swing.JTable tableClientRents;
    // End of variables declaration//GEN-END:variables
}
