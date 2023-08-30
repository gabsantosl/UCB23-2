/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.visao;

import br.com.controle.Calculos;

public class Tela extends javax.swing.JFrame {
    Calculos c = new Calculos();

    public Tela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTvalor1 = new javax.swing.JTextField();
        jTvalor2 = new javax.swing.JTextField();
        jBsomar = new javax.swing.JButton();
        jBsubtrair = new javax.swing.JButton();
        jBmultiplicar = new javax.swing.JButton();
        jBdividir = new javax.swing.JButton();
        jBporcentagem = new javax.swing.JButton();
        jLresultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Digite o valor 1:");

        jLabel2.setText("Digite o valor 2:");

        jTvalor1.setText("    ");
        jTvalor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTvalor1ActionPerformed(evt);
            }
        });

        jTvalor2.setText("    ");

        jBsomar.setText("+");
        jBsomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsomarActionPerformed(evt);
            }
        });

        jBsubtrair.setText("-");
        jBsubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsubtrairActionPerformed(evt);
            }
        });

        jBmultiplicar.setText("*");
        jBmultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmultiplicarActionPerformed(evt);
            }
        });

        jBdividir.setText("/");
        jBdividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdividirActionPerformed(evt);
            }
        });

        jBporcentagem.setText("%");
        jBporcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBporcentagemActionPerformed(evt);
            }
        });

        jLresultado.setText("0.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBsomar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBsubtrair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBmultiplicar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBdividir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBporcentagem)
                        .addGap(18, 18, 18)
                        .addComponent(jLresultado))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTvalor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTvalor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTvalor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTvalor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBsomar)
                    .addComponent(jBsubtrair)
                    .addComponent(jBmultiplicar)
                    .addComponent(jBdividir)
                    .addComponent(jBporcentagem)
                    .addComponent(jLresultado))
                .addContainerGap(182, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTvalor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTvalor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTvalor1ActionPerformed

    private void jBsomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsomarActionPerformed
        // TODO add your handling code here:
        c.setValor1(Double.valueOf(jTvalor1.getText()));
        c.setValor2(Double.valueOf(jTvalor2.getText()));
        jLresultado.setText(""+c.soma());
        
    }//GEN-LAST:event_jBsomarActionPerformed

    private void jBsubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsubtrairActionPerformed
        // TODO add your handling code here:
        c.setValor1(Double.valueOf(jTvalor1.getText()));
        c.setValor2(Double.valueOf(jTvalor2.getText()));
        jLresultado.setText(""+c.sub());
    }//GEN-LAST:event_jBsubtrairActionPerformed

    private void jBmultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmultiplicarActionPerformed
        // TODO add your handling code here:
        c.setValor1(Double.valueOf(jTvalor1.getText()));
        c.setValor2(Double.valueOf(jTvalor2.getText()));
        jLresultado.setText(""+c.multi());
    }//GEN-LAST:event_jBmultiplicarActionPerformed

    private void jBdividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdividirActionPerformed
        // TODO add your handling code here:
        c.setValor1(Double.valueOf(jTvalor1.getText()));
        c.setValor2(Double.valueOf(jTvalor2.getText()));
        jLresultado.setText(""+c.divi());
    }//GEN-LAST:event_jBdividirActionPerformed

    private void jBporcentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBporcentagemActionPerformed
        // TODO add your handling code here:
        c.setValor1(Double.valueOf(jTvalor1.getText()));
        c.setValor2(Double.valueOf(jTvalor2.getText()));
        jLresultado.setText(""+c.porce());
    }//GEN-LAST:event_jBporcentagemActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBdividir;
    private javax.swing.JButton jBmultiplicar;
    private javax.swing.JButton jBporcentagem;
    private javax.swing.JButton jBsomar;
    private javax.swing.JButton jBsubtrair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLresultado;
    private javax.swing.JTextField jTvalor1;
    private javax.swing.JTextField jTvalor2;
    // End of variables declaration//GEN-END:variables
}
