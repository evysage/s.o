/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsclock;

import javax.swing.JLabel;
import javax.swing.JTextField;
import recursos.Validaciones;

/**
 *
 * @author por_s
 */
public class PnlProceso extends javax.swing.JPanel {

    /**
     * Creates new form PnlPalabra
     */
    public PnlProceso() {
        initComponents();
    }

    public JLabel getLabelProceso() {
        return labelProceso;
    }

    public void setLabelProceso(JLabel labelProceso) {
        this.labelProceso = labelProceso;
    }

    public JTextField getTxtCarcacter() {
        return txtCarcacter;
    }

    public void setTxtCarcacter(JTextField txtCarcacter) {
        this.txtCarcacter = txtCarcacter;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCarcacter = new javax.swing.JTextField();
        labelProceso = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 153));

        txtCarcacter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCarcacterKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCarcacterKeyTyped(evt);
            }
        });

        labelProceso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelProceso.setForeground(new java.awt.Color(255, 255, 255));
        labelProceso.setText("Proceso");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(txtCarcacter, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(txtCarcacter)
                    .addComponent(labelProceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCarcacterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCarcacterKeyPressed
        Validaciones.enterEntero(null, evt, txtCarcacter, evt);
    }//GEN-LAST:event_txtCarcacterKeyPressed

    private void txtCarcacterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCarcacterKeyTyped
        Validaciones.validaEntero(evt);
    }//GEN-LAST:event_txtCarcacterKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelProceso;
    private javax.swing.JTextField txtCarcacter;
    // End of variables declaration//GEN-END:variables
}
