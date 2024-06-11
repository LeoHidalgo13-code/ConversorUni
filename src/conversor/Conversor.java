/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package conversor;

/**
 *
 * @author Leo
 */
public class Conversor extends javax.swing.JFrame {
   double r1,m;
    public Conversor() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public void milimetros()
    {
     m = Double.parseDouble(txtmetros.getText());
        r1 = m * 1000;
        lblmili.setText(Double.toString(r1));
    }
     public void centi()
    {
     m = Double.parseDouble(txtmetros.getText());
        r1 = m * 100;
        lblcenti.setText(Double.toString(r1));
    }
      public void pulga()
    {
     m = Double.parseDouble(txtmetros.getText());
        r1 = m * 39.37;
        lblpulga.setText(Double.toString(r1));
    }
       public void pie()
    {
     m = Double.parseDouble(txtmetros.getText());
        r1 = m * 3.281;
        lblpies.setText(Double.toString(r1));
    }
        public void yarda()
    {
     m = Double.parseDouble(txtmetros.getText());
        r1 = m * 1.094;
        lblyarda.setText(Double.toString(r1));
    }
    private void limpia()
    {
        lblmili.setText(null);
        txtmetros.setText(null);
        lblcenti.setText(null);
        lblpulga.setText(null);
        lblpies.setText(null);
        lblyarda.setText(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnmilimetros = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnpulga = new javax.swing.JButton();
        btnpies = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtmetros = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblmili = new javax.swing.JLabel();
        lblcenti = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblpulga = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblpies = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblyarda = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnyardas = new javax.swing.JButton();
        btnborrar = new javax.swing.JButton();
        btnsalir1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnmilimetros.setText("Milimetros");
        btnmilimetros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmilimetrosActionPerformed(evt);
            }
        });

        jButton1.setText("Centimetros");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnpulga.setText("Pulgadas");
        btnpulga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpulgaActionPerformed(evt);
            }
        });

        btnpies.setText("Pies");
        btnpies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpiesActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingresa los metros a convertir:");

        jLabel2.setText("Millimetros:");

        jLabel3.setText("Centrimetros");

        jLabel4.setText("Pulgadas");

        jLabel5.setText("Pies");

        jLabel6.setText("Yardas");

        btnyardas.setText("Yardas");
        btnyardas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnyardasActionPerformed(evt);
            }
        });

        btnborrar.setText("Borrar");
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });

        btnsalir1.setText("Salir");
        btnsalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addGap(71, 71, 71)
                        .addComponent(txtmetros, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnborrar)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnmilimetros)
                                        .addGap(37, 37, 37)
                                        .addComponent(jButton1)
                                        .addGap(39, 39, 39)
                                        .addComponent(btnpulga))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblpulga, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(88, 88, 88)
                                                .addComponent(lblcenti, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(88, 88, 88)
                                                .addComponent(lblmili, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblpies, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblyarda, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(27, 27, 27)
                                .addComponent(btnpies)
                                .addGap(18, 18, 18)
                                .addComponent(btnyardas)))))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(494, Short.MAX_VALUE)
                    .addComponent(btnsalir1)
                    .addGap(7, 7, 7)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtmetros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblmili, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblcenti, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblpulga, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblpies, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblyarda, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnmilimetros)
                            .addComponent(jButton1)
                            .addComponent(btnpulga)
                            .addComponent(btnpies)
                            .addComponent(btnyardas))
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnborrar)
                        .addGap(14, 14, 14))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(442, Short.MAX_VALUE)
                    .addComponent(btnsalir1)
                    .addGap(4, 4, 4)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmilimetrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmilimetrosActionPerformed
       milimetros();
    }//GEN-LAST:event_btnmilimetrosActionPerformed

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed
        limpia();
    }//GEN-LAST:event_btnborrarActionPerformed

    private void btnsalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalir1ActionPerformed
        dispose();
    }//GEN-LAST:event_btnsalir1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       centi();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnpulgaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpulgaActionPerformed
        pulga();
    }//GEN-LAST:event_btnpulgaActionPerformed

    private void btnpiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpiesActionPerformed
        pie();
    }//GEN-LAST:event_btnpiesActionPerformed

    private void btnyardasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnyardasActionPerformed
        yarda();
    }//GEN-LAST:event_btnyardasActionPerformed

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
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btnmilimetros;
    private javax.swing.JButton btnpies;
    private javax.swing.JButton btnpulga;
    private javax.swing.JButton btnsalir1;
    private javax.swing.JButton btnyardas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblcenti;
    private javax.swing.JLabel lblmili;
    private javax.swing.JLabel lblpies;
    private javax.swing.JLabel lblpulga;
    private javax.swing.JLabel lblyarda;
    private javax.swing.JTextField txtmetros;
    // End of variables declaration//GEN-END:variables
}
