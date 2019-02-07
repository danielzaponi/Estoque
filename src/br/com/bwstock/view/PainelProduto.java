package br.com.bwstock.view;

import br.com.bwstock.Ecall;

public class PainelProduto extends javax.swing.JFrame {

    public PainelProduto() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        painelFundo = new javax.swing.JPanel();
        painelFundoInferior = new javax.swing.JPanel();
        formBrancoInferior = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuario = new javax.swing.JTable();
        formMenu = new javax.swing.JPanel();
        textoPesquisar = new javax.swing.JLabel();
        campoPesquisar = new javax.swing.JTextField();
        buttonPesquisar = new javax.swing.JButton();
        textoPesquisar1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        textoPesquisar3 = new javax.swing.JLabel();
        campoPesquisar1 = new javax.swing.JTextField();
        painelLogo = new javax.swing.JPanel();
        textoLogoEmpresa = new javax.swing.JLabel();
        textoDescricaoEmpresa = new javax.swing.JLabel();
        textoTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        painelFundo.setBackground(new java.awt.Color(45, 118, 232));

        painelFundoInferior.setBackground(new java.awt.Color(255, 255, 255));

        formBrancoInferior.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N
        formBrancoInferior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formBrancoInferiorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formBrancoInferiorMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formBrancoInferiorMousePressed(evt);
            }
        });

        tabelaUsuario.setBackground(new java.awt.Color(204, 204, 204));
        tabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Categoria", "Estoque", "Data de Cadastro"
            }
        ));
        jScrollPane1.setViewportView(tabelaUsuario);

        javax.swing.GroupLayout formBrancoInferiorLayout = new javax.swing.GroupLayout(formBrancoInferior);
        formBrancoInferior.setLayout(formBrancoInferiorLayout);
        formBrancoInferiorLayout.setHorizontalGroup(
            formBrancoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formBrancoInferiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        formBrancoInferiorLayout.setVerticalGroup(
            formBrancoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formBrancoInferiorLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
        );

        formMenu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar Produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N
        formMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMenuMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMenuMousePressed(evt);
            }
        });
        formMenu.setLayout(new java.awt.GridBagLayout());

        textoPesquisar.setText("Nome");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        formMenu.add(textoPesquisar, gridBagConstraints);

        campoPesquisar.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        formMenu.add(campoPesquisar, gridBagConstraints);

        buttonPesquisar.setBackground(javax.swing.UIManager.getDefaults().getColor("controlHighlight"));
        buttonPesquisar.setText("Pesquisar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        formMenu.add(buttonPesquisar, gridBagConstraints);

        textoPesquisar1.setText("Categoria");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(11, 11, 11, 11);
        formMenu.add(textoPesquisar1, gridBagConstraints);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categoria1" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        formMenu.add(jComboBox1, gridBagConstraints);

        textoPesquisar3.setText("EAN13");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        formMenu.add(textoPesquisar3, gridBagConstraints);

        campoPesquisar1.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        formMenu.add(campoPesquisar1, gridBagConstraints);

        javax.swing.GroupLayout painelFundoInferiorLayout = new javax.swing.GroupLayout(painelFundoInferior);
        painelFundoInferior.setLayout(painelFundoInferiorLayout);
        painelFundoInferiorLayout.setHorizontalGroup(
            painelFundoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoInferiorLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(painelFundoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoInferiorLayout.createSequentialGroup()
                        .addComponent(formMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoInferiorLayout.createSequentialGroup()
                        .addComponent(formBrancoInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        painelFundoInferiorLayout.setVerticalGroup(
            painelFundoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoInferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formBrancoInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        painelLogo.setBackground(new java.awt.Color(45, 118, 232));

        textoLogoEmpresa.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        textoLogoEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        textoLogoEmpresa.setText("Bw-Stock");

        textoDescricaoEmpresa.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        textoDescricaoEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        textoDescricaoEmpresa.setText("Gerenciador de Estoque");

        textoTitulo.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        textoTitulo.setForeground(new java.awt.Color(255, 255, 255));
        textoTitulo.setText("Cadastro de Produtos");

        javax.swing.GroupLayout painelLogoLayout = new javax.swing.GroupLayout(painelLogo);
        painelLogo.setLayout(painelLogoLayout);
        painelLogoLayout.setHorizontalGroup(
            painelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLogoLayout.createSequentialGroup()
                        .addComponent(textoDescricaoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(textoTitulo))
                    .addComponent(textoLogoEmpresa))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        painelLogoLayout.setVerticalGroup(
            painelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoLogoEmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoTitulo)
                    .addComponent(textoDescricaoEmpresa))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout painelFundoLayout = new javax.swing.GroupLayout(painelFundo);
        painelFundo.setLayout(painelFundoLayout);
        painelFundoLayout.setHorizontalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundoInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addComponent(painelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                .addComponent(painelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelFundoInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formBrancoInferiorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formBrancoInferiorMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_formBrancoInferiorMouseEntered

    private void formBrancoInferiorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formBrancoInferiorMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_formBrancoInferiorMouseExited

    private void formBrancoInferiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formBrancoInferiorMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formBrancoInferiorMousePressed

    private void formMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMenuMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_formMenuMouseEntered

    private void formMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMenuMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_formMenuMouseExited

    private void formMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMenuMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formMenuMousePressed

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
            java.util.logging.Logger.getLogger(PainelProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PainelProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PainelProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PainelProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PainelProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonPesquisar;
    private javax.swing.JTextField campoPesquisar;
    private javax.swing.JTextField campoPesquisar1;
    private javax.swing.JPanel formBrancoInferior;
    private javax.swing.JPanel formMenu;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JPanel painelFundoInferior;
    private javax.swing.JPanel painelLogo;
    private javax.swing.JTable tabelaUsuario;
    private javax.swing.JLabel textoDescricaoEmpresa;
    private javax.swing.JLabel textoLogoEmpresa;
    private javax.swing.JLabel textoPesquisar;
    private javax.swing.JLabel textoPesquisar1;
    private javax.swing.JLabel textoPesquisar3;
    private javax.swing.JLabel textoTitulo;
    // End of variables declaration//GEN-END:variables
}