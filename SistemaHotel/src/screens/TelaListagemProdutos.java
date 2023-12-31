/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screens;

/**
 *
 * @author 0069837
 */
public class TelaListagemProdutos extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaListagemFornecedores
     */
    public TelaListagemProdutos() {
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

        jPListagemProdutos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProdutos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTBuscarNomeProdutos = new javax.swing.JTextField();
        btnBuscarProdutos = new javax.swing.JButton();
        btnEliminarProdutos = new javax.swing.JButton();
        btnSairProdutos = new javax.swing.JButton();

        jPListagemProdutos.setBorder(javax.swing.BorderFactory.createTitledBorder("LISTAGEM - PRODUTOS"));

        jTProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTProdutos);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel1.setText("Buscar");

        btnBuscarProdutos.setText("Buscar");

        btnEliminarProdutos.setText("Eliminar");

        btnSairProdutos.setText("Sair");

        javax.swing.GroupLayout jPListagemProdutosLayout = new javax.swing.GroupLayout(jPListagemProdutos);
        jPListagemProdutos.setLayout(jPListagemProdutosLayout);
        jPListagemProdutosLayout.setHorizontalGroup(
            jPListagemProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPListagemProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTBuscarNomeProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(btnBuscarProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSairProdutos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPListagemProdutosLayout.setVerticalGroup(
            jPListagemProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPListagemProdutosLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPListagemProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTBuscarNomeProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProdutos)
                    .addComponent(btnEliminarProdutos)
                    .addComponent(btnSairProdutos))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPListagemProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPListagemProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarProdutos;
    private javax.swing.JButton btnEliminarProdutos;
    private javax.swing.JButton btnSairProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPListagemProdutos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTBuscarNomeProdutos;
    private javax.swing.JTable jTProdutos;
    // End of variables declaration//GEN-END:variables
}
