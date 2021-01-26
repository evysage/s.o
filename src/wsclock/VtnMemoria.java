/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsclock;

import java.util.Hashtable;
import javax.swing.JLabel;
import javax.swing.JSlider;

/**
 *
 * @author por_s
 */
public class VtnMemoria extends javax.swing.JFrame {

    /**
     * Creates new form VtnPrincipal
     */
    int ram = 0;
    int virtual = 0;

    public VtnMemoria() {
        initComponents();
        this.setLocationRelativeTo(null);

        Hashtable< Integer, JLabel> table = new Hashtable< Integer, JLabel>();
        for (int i = 0; i <= 8; i++) {
            table.put(i, new JLabel(String.valueOf(((int) Math.pow(2, i)))));
        }
        jSlider2.setMaximum(8);
        jSlider2.setLabelTable(table);
        jSlider2.setToolTipText("");

        Hashtable< Integer, JLabel> table2 = new Hashtable< Integer, JLabel>();
        for (int i = 0; i <= 2000; i++) {
            table2.put(i, new JLabel(String.valueOf(i)));
        }
        jSlider3.setMaximum(2000);
        jSlider3.setLabelTable(table2);
        jSlider3.setToolTipText("");

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
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        boton1 = new Boton.Boton();
        boton2 = new Boton.Boton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSlider2 = new javax.swing.JSlider();
        txtMemoryRAM = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSlider3 = new javax.swing.JSlider();
        txtMemoryVirt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("WSClock");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Algoritmo de reemplazo de paginas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 11, -1, -1));

        boton1.setText("Regresar");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        jPanel1.add(boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, -1, -1));

        boton2.setText("Siguiente");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        jPanel1.add(boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Tamaño de memoria");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 159, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Seleccione la cantidad de memoria(RAM) en megabytes a ser reservada para la memoria virtual.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 560, 34));

        jSlider2.setMajorTickSpacing(1);
        jSlider2.setMaximum(50);
        jSlider2.setMinorTickSpacing(1);
        jSlider2.setPaintLabels(true);
        jSlider2.setPaintTicks(true);
        jSlider2.setSnapToTicks(true);
        jSlider2.setToolTipText("");
        jSlider2.setValue(1);
        jSlider2.setOpaque(false);
        jSlider2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider2StateChanged(evt);
            }
        });
        jPanel1.add(jSlider2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 450, 39));

        txtMemoryRAM.setEditable(false);
        txtMemoryRAM.setBackground(new java.awt.Color(255, 255, 255));
        txtMemoryRAM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMemoryRAM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtMemoryRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 99, 31));

        jLabel6.setText("2MB");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        jLabel7.setText("32MB");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Seleccione la cantidad de memoria virtual en megabytes.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 560, 34));

        jSlider3.setMajorTickSpacing(1);
        jSlider3.setMaximum(50);
        jSlider3.setMinorTickSpacing(1);
        jSlider3.setPaintTicks(true);
        jSlider3.setSnapToTicks(true);
        jSlider3.setToolTipText("");
        jSlider3.setValue(4);
        jSlider3.setOpaque(false);
        jSlider3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider3StateChanged(evt);
            }
        });
        jPanel1.add(jSlider3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 450, 39));

        txtMemoryVirt.setEditable(false);
        txtMemoryVirt.setBackground(new java.awt.Color(255, 255, 255));
        txtMemoryVirt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMemoryVirt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtMemoryVirt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 99, 31));

        jLabel8.setText("4MB");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        jLabel9.setText("2TB");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        Main.tamanioMemoriaVirtual = virtual;
        Main.tamanioMemoriaRAM = ram;
        new VtnProcesos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        new VtnPrincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boton1ActionPerformed

    private void jSlider2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider2StateChanged
        ram = (int) Math.pow(2, jSlider2.getValue());
        txtMemoryRAM.setText(ram + " MB");
    }//GEN-LAST:event_jSlider2StateChanged

    private void jSlider3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider3StateChanged
        virtual = jSlider3.getValue();
        txtMemoryVirt.setText(virtual + " MB");
    }//GEN-LAST:event_jSlider3StateChanged

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Boton.Boton boton1;
    private Boton.Boton boton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSlider jSlider3;
    private javax.swing.JTextField txtMemoryRAM;
    private javax.swing.JTextField txtMemoryVirt;
    // End of variables declaration//GEN-END:variables
}
