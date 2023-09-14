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
public class TelaCadastroFornecedores extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastroFuncionario
     */
    public TelaCadastroFornecedores() {
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

        jPFornecedor = new javax.swing.JPanel();
        jPDadosFornecedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTnomeFOR = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTDescricaoFOR = new javax.swing.JTextField();
        jPEndereco = new javax.swing.JPanel();
        jFCEPFOR = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTRuaFOR = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTBairroFOR = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTNumeroFOR = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTCidadeFOR = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jCUFOR = new javax.swing.JComboBox<>();
        jPContatosFOR = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jTEmailFOR = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jFTelefoneFOR = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setTitle("HOTEL LOPES - CADASTRO FORNECEDORES");

        jPDadosFornecedor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("DADOS PESSOAIS"), "DADOS DO FORNECEDOR"));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transport_truck_delivery_icon_148906.png"))); // NOI18N
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("Descrição:");

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 0));
        jLabel22.setText("(*) Campos obrigatórios.");

        jTDescricaoFOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDescricaoFORActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPDadosFornecedorLayout = new javax.swing.GroupLayout(jPDadosFornecedor);
        jPDadosFornecedor.setLayout(jPDadosFornecedorLayout);
        jPDadosFornecedorLayout.setHorizontalGroup(
            jPDadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDadosFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(jPDadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTnomeFOR, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPDadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTDescricaoFOR, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPDadosFornecedorLayout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(jLabel22)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPDadosFornecedorLayout.setVerticalGroup(
            jPDadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDadosFornecedorLayout.createSequentialGroup()
                .addComponent(jLabel22)
                .addGroup(jPDadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDadosFornecedorLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPDadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDadosFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTnomeFOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTDescricaoFOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPDadosFornecedorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("ENDEREÇO"));

        try {
            jFCEPFOR.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel11.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel11.setText("CEP:");

        jLabel12.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel12.setText("Rua:");

        jLabel13.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel13.setText("Bairro:");

        jLabel14.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel14.setText("Número");

        jTNumeroFOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNumeroFORActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel15.setText("Cidade:");

        jTCidadeFOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCidadeFORActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel16.setText("UF:");

        jCUFOR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", " ", " ", " ", " ", " " }));

        javax.swing.GroupLayout jPEnderecoLayout = new javax.swing.GroupLayout(jPEndereco);
        jPEndereco.setLayout(jPEnderecoLayout);
        jPEnderecoLayout.setHorizontalGroup(
            jPEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEnderecoLayout.createSequentialGroup()
                .addGroup(jPEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jFCEPFOR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jTRuaFOR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jTBairroFOR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jTNumeroFOR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jTCidadeFOR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCUFOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPEnderecoLayout.setVerticalGroup(
            jPEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEnderecoLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFCEPFOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTRuaFOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTBairroFOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTNumeroFOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCidadeFOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCUFOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPContatosFOR.setBorder(javax.swing.BorderFactory.createTitledBorder("CONTATOS"));

        jLabel17.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel17.setText("e-mail:");

        jLabel18.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel18.setText("Telefone:");

        try {
            jFTelefoneFOR.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPContatosFORLayout = new javax.swing.GroupLayout(jPContatosFOR);
        jPContatosFOR.setLayout(jPContatosFORLayout);
        jPContatosFORLayout.setHorizontalGroup(
            jPContatosFORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPContatosFORLayout.createSequentialGroup()
                .addGroup(jPContatosFORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jTEmailFOR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPContatosFORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jFTelefoneFOR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPContatosFORLayout.setVerticalGroup(
            jPContatosFORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPContatosFORLayout.createSequentialGroup()
                .addGroup(jPContatosFORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPContatosFORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTEmailFOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTelefoneFOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButton1.setText("Cancelar");

        jButton2.setText("Atualizar");

        jButton3.setText("Salvar");

        javax.swing.GroupLayout jPFornecedorLayout = new javax.swing.GroupLayout(jPFornecedor);
        jPFornecedor.setLayout(jPFornecedorLayout);
        jPFornecedorLayout.setHorizontalGroup(
            jPFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPDadosFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPContatosFOR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPFornecedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(7, 7, 7)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPFornecedorLayout.setVerticalGroup(
            jPFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFornecedorLayout.createSequentialGroup()
                .addComponent(jPDadosFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPContatosFOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTCidadeFORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCidadeFORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCidadeFORActionPerformed

    private void jTNumeroFORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNumeroFORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNumeroFORActionPerformed

    private void jTDescricaoFORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDescricaoFORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDescricaoFORActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jCUFOR;
    private javax.swing.JFormattedTextField jFCEPFOR;
    private javax.swing.JFormattedTextField jFTelefoneFOR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPContatosFOR;
    private javax.swing.JPanel jPDadosFornecedor;
    private javax.swing.JPanel jPEndereco;
    private javax.swing.JPanel jPFornecedor;
    private javax.swing.JTextField jTBairroFOR;
    private javax.swing.JTextField jTCidadeFOR;
    private javax.swing.JTextField jTDescricaoFOR;
    private javax.swing.JTextField jTEmailFOR;
    private javax.swing.JTextField jTNumeroFOR;
    private javax.swing.JTextField jTRuaFOR;
    private javax.swing.JTextField jTnomeFOR;
    // End of variables declaration//GEN-END:variables
}
