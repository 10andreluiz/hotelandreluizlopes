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
public class TelaCadastroServicos extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastroFuncionario
     */
    public TelaCadastroServicos() {
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

        jLabel3 = new javax.swing.JLabel();
        jPCadastroServicos = new javax.swing.JPanel();
        jPDadosServicos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCSexoH = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCSexoH1 = new javax.swing.JComboBox<>();
        jBCancelarS = new javax.swing.JButton();
        jBAtualizarS = new javax.swing.JButton();
        jBSalvarS = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setClosable(true);
        setTitle("HOTEL LOPES - CADASTRO SERVIÇOS");

        jPDadosServicos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("DADOS PESSOAIS"), "DADOS DO SERVIÇO"));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/support_call_center_information_help_customer_service_icon_140645.png"))); // NOI18N
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Tipo:");

        jCSexoH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "Serviços de restaurante", "Serviços hospitalares", "Serviços de manutenção", "Serviços administrativos", "Serviços de consultoria" }));
        jCSexoH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCSexoHActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 0));
        jLabel22.setText("(*) Campos obrigatórios.");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setText("Local:");

        jCSexoH1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", " Restaurante", "Enfermaria", "Oficina", "Administrativo", "Consultoria" }));
        jCSexoH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCSexoH1ActionPerformed(evt);
            }
        });

        jBCancelarS.setText("Cancelar");

        jBAtualizarS.setText("Atualizar");

        jBSalvarS.setText("Salvar");

        javax.swing.GroupLayout jPDadosServicosLayout = new javax.swing.GroupLayout(jPDadosServicos);
        jPDadosServicos.setLayout(jPDadosServicosLayout);
        jPDadosServicosLayout.setHorizontalGroup(
            jPDadosServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDadosServicosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPDadosServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDadosServicosLayout.createSequentialGroup()
                        .addComponent(jCSexoH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCSexoH1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPDadosServicosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(131, 131, 131)
                        .addComponent(jLabel8)))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDadosServicosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPDadosServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDadosServicosLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDadosServicosLayout.createSequentialGroup()
                        .addComponent(jBSalvarS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBAtualizarS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBCancelarS)
                        .addContainerGap())))
        );
        jPDadosServicosLayout.setVerticalGroup(
            jPDadosServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDadosServicosLayout.createSequentialGroup()
                .addGroup(jPDadosServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDadosServicosLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(32, 32, 32)
                        .addGroup(jPDadosServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDadosServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCSexoH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCSexoH1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPDadosServicosLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(jPDadosServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCancelarS)
                    .addComponent(jBAtualizarS)
                    .addComponent(jBSalvarS)))
        );

        javax.swing.GroupLayout jPCadastroServicosLayout = new javax.swing.GroupLayout(jPCadastroServicos);
        jPCadastroServicos.setLayout(jPCadastroServicosLayout);
        jPCadastroServicosLayout.setHorizontalGroup(
            jPCadastroServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastroServicosLayout.createSequentialGroup()
                .addComponent(jPDadosServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPCadastroServicosLayout.setVerticalGroup(
            jPCadastroServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastroServicosLayout.createSequentialGroup()
                .addComponent(jPDadosServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPCadastroServicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPCadastroServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCSexoH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCSexoH1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCSexoH1ActionPerformed

    private void jCSexoHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCSexoHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCSexoHActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAtualizarS;
    private javax.swing.JButton jBCancelarS;
    private javax.swing.JButton jBSalvarS;
    private javax.swing.JComboBox<String> jCSexoH;
    private javax.swing.JComboBox<String> jCSexoH1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPCadastroServicos;
    private javax.swing.JPanel jPDadosServicos;
    // End of variables declaration//GEN-END:variables
}