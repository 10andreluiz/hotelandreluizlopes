/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screens;

/**
 *
 * @author André Luiz Lopes
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        
   setExtendedState(MAXIMIZED_BOTH); //ABRIR TELA DE ABA A ABA
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        menuCadastroHospede = new javax.swing.JMenuItem();
        menuConsultaHospede = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu17 = new javax.swing.JMenu();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenu18 = new javax.swing.JMenu();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenu19 = new javax.swing.JMenu();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu16 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Sistema Hotel André Luiz Lopes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(297, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(301, 301, 301))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/47-_iCal_256x256_35384.png"))); // NOI18N
        jMenu1.setText("Cadastros ");

        jMenu8.setText("Hospedes");

        menuCadastroHospede.setText("Cadastramentos");
        menuCadastroHospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroHospedeActionPerformed(evt);
            }
        });
        jMenu8.add(menuCadastroHospede);

        menuConsultaHospede.setText("Consultas");
        jMenu8.add(menuConsultaHospede);

        jMenu1.add(jMenu8);

        jMenu9.setText("Quartos");

        jMenuItem4.setText("Cadastramentos");
        jMenu9.add(jMenuItem4);

        jMenuItem5.setText("Consultas");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem5);

        jMenu1.add(jMenu9);

        jMenu10.setText("Funcionários");

        jMenuItem20.setText("Cadastramentos");
        jMenu10.add(jMenuItem20);

        jMenuItem21.setText("Consultas");
        jMenu10.add(jMenuItem21);

        jMenu1.add(jMenu10);

        jMenu11.setText("Fornecedores");

        jMenuItem22.setText("Cadastramentos");
        jMenu11.add(jMenuItem22);

        jMenuItem23.setText("Consultas");
        jMenu11.add(jMenuItem23);

        jMenu1.add(jMenu11);

        jMenu12.setText("Produtos");

        jMenuItem24.setText("Cadastramentos");
        jMenu12.add(jMenuItem24);

        jMenuItem25.setText("Consultas");
        jMenu12.add(jMenuItem25);

        jMenu1.add(jMenu12);

        jMenu13.setText("Serviços");

        jMenuItem26.setText("Cadastramentos");
        jMenu13.add(jMenuItem26);

        jMenuItem27.setText("Consultas");
        jMenu13.add(jMenuItem27);

        jMenu1.add(jMenu13);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1490820812-14_82398.png"))); // NOI18N
        jMenu2.setText("Reservas");

        jMenuItem1.setText("Cadastrar ");
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Consultar");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Finalizar");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/document_paperclip_list_paper_icon_219544.png"))); // NOI18N
        jMenu3.setText("Relatório   ");

        jMenu17.setText("Financeiro");

        jMenuItem28.setText("Contas a serem pagas");
        jMenu17.add(jMenuItem28);

        jMenuItem29.setText("Contas a serem recebidas");
        jMenu17.add(jMenuItem29);

        jMenuItem30.setText("Balanço");
        jMenu17.add(jMenuItem30);

        jMenu3.add(jMenu17);

        jMenu18.setText("Reservas");

        jMenuItem31.setText("Quartos Disponíveis");
        jMenu18.add(jMenuItem31);

        jMenuItem32.setText("Quartos Ocupados");
        jMenu18.add(jMenuItem32);

        jMenuItem33.setText("Reservas Futuras");
        jMenu18.add(jMenuItem33);

        jMenu3.add(jMenu18);

        jMenu19.setText("Vendas");

        jMenuItem34.setText("Vendas Mensais");
        jMenu19.add(jMenuItem34);

        jMenuItem35.setText("Vendas Anuais");
        jMenu19.add(jMenuItem35);

        jMenu3.add(jMenu19);

        jMenuItem13.setText("Hospedes");
        jMenu3.add(jMenuItem13);

        jMenuItem14.setText("Funcionários");
        jMenu3.add(jMenuItem14);

        jMenuItem15.setText("Fornecedores");
        jMenu3.add(jMenuItem15);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1458264596_authorisation_lock_padlock_safe_password_privacy_security_icon-icons.com_55333.png"))); // NOI18N
        jMenu4.setText("Segurança   ");

        jMenuItem16.setText("Fazer Backup");
        jMenu4.add(jMenuItem16);

        jMenuItem17.setText("Restaurar Backup");
        jMenu4.add(jMenuItem17);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/support_call_center_help_information_customer_service_icon_140644.png"))); // NOI18N
        jMenu5.setText("Serviços");

        jMenuItem18.setText("Cadastrar Serviços");
        jMenu5.add(jMenuItem18);

        jMenuItem19.setText("Consultar Serviços");
        jMenu5.add(jMenuItem19);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3700465-business-calculating-calculator-finance-maths-technological_108748.png"))); // NOI18N
        jMenu6.setText("Financeiro");

        jMenu15.setText("Contas a serem pagas");

        jMenuItem9.setText("Cadastrar");
        jMenu15.add(jMenuItem9);

        jMenuItem10.setText("Consultar");
        jMenu15.add(jMenuItem10);

        jMenu6.add(jMenu15);

        jMenu16.setText("Contas a seres recebidas");

        jMenuItem11.setText("Cadastrar");
        jMenu16.add(jMenuItem11);

        jMenuItem12.setText("Receber");
        jMenu16.add(jMenuItem12);

        jMenu6.add(jMenu16);

        jMenuItem8.setText("Balanço");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem8);

        jMenuBar1.add(jMenu6);

        jMenu14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shoppaymentorderbuy-29_icon-icons.com_73875.png"))); // NOI18N
        jMenu14.setText("Vendas");

        jMenuItem6.setText("Produtos");
        jMenu14.add(jMenuItem6);

        jMenuItem7.setText("Serviços");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem7);

        jMenuBar1.add(jMenu14);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_account_off_door_arrow_leave_ui_exit_logout_icon_210826.png"))); // NOI18N
        jMenu7.setText("Sair");
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 236, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void menuCadastroHospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroHospedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCadastroHospedeActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem menuCadastroHospede;
    private javax.swing.JMenuItem menuConsultaHospede;
    // End of variables declaration//GEN-END:variables
}
