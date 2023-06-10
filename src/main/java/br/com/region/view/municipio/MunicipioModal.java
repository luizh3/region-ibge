/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.com.region.view.municipio;

import br.com.region.model.municipio.MunicipioModel;

/**
 *
 * @author Luiz_
 */
public class MunicipioModal extends javax.swing.JDialog {
    
    /**
     * Creates new form MunicipioModal
     * @param parent
     * @param modal
     * @param newMunicipio
     */
    public MunicipioModal(java.awt.Frame parent, boolean modal, final MunicipioModel newMunicipio ) {
        super(parent, modal);
        setTitle( "Detalhes município");
        initComponents();
        centralizeScreen();
        setResizable(false);
        bindInformations(newMunicipio);
    }
    
    private void centralizeScreen() {
        this.setLocationRelativeTo(null);
    }
    
    private void bindInformations( final MunicipioModel municipio ) {
        jLblIdValue.setText( String.valueOf( municipio.getId() ) );
        jLblNomeValue.setText( municipio.getNome() );
        jLblRegiaoValue.setText( municipio.getRegiao() );
        jLblUfValue.setText( municipio.getUf( )); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIdValue = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLblDsId = new javax.swing.JLabel();
        jLblIdValue = new javax.swing.JLabel();
        jLblDsNome = new javax.swing.JLabel();
        jLblNomeValue = new javax.swing.JLabel();
        jLblDsUf = new javax.swing.JLabel();
        jLblUfValue = new javax.swing.JLabel();
        jLblDsRegiao = new javax.swing.JLabel();
        jLblRegiaoValue = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLblDsId.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLblDsId.setForeground(new java.awt.Color(102, 204, 255));
        jLblDsId.setText("ID:");

        jLblIdValue.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLblIdValue.setText("44");

        jLblDsNome.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLblDsNome.setForeground(new java.awt.Color(102, 204, 255));
        jLblDsNome.setText("Nome:");

        jLblNomeValue.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLblNomeValue.setText("Dois vizinhos");

        jLblDsUf.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLblDsUf.setForeground(new java.awt.Color(102, 204, 255));
        jLblDsUf.setText("UF:");

        jLblUfValue.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLblUfValue.setText("PR");

        jLblDsRegiao.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLblDsRegiao.setForeground(new java.awt.Color(102, 204, 255));
        jLblDsRegiao.setText("REGIÃO:");

        jLblRegiaoValue.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLblRegiaoValue.setText("SUL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLblDsUf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLblUfValue)
                        .addGap(12, 12, 12)
                        .addComponent(jLblDsRegiao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLblRegiaoValue))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLblDsId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLblIdValue)
                        .addGap(18, 18, 18)
                        .addComponent(jLblDsNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLblNomeValue)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblDsId)
                    .addComponent(jLblIdValue)
                    .addComponent(jLblDsNome)
                    .addComponent(jLblNomeValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblDsUf)
                    .addComponent(jLblUfValue)
                    .addComponent(jLblDsRegiao)
                    .addComponent(jLblRegiaoValue))
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLblDsId;
    private javax.swing.JLabel jLblDsNome;
    private javax.swing.JLabel jLblDsRegiao;
    private javax.swing.JLabel jLblDsUf;
    private javax.swing.JLabel jLblIdValue;
    private javax.swing.JLabel jLblNomeValue;
    private javax.swing.JLabel jLblRegiaoValue;
    private javax.swing.JLabel jLblUfValue;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblIdValue;
    // End of variables declaration//GEN-END:variables
}
