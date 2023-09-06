/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadora.visao;
import calculadora.controle.Calculos;

public class Tela extends javax.swing.JFrame {
    Calculos c = new Calculos();
    /* no código, 'c' é uma instância da classe,
       um objeto. */

    public Tela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTvalor1 = new javax.swing.JTextField();
        jTvalor2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLresultado = new javax.swing.JLabel();
        jRsomar = new javax.swing.JRadioButton();
        jRsub = new javax.swing.JRadioButton();
        jRmulti = new javax.swing.JRadioButton();
        jRdiv = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTvalor1.setColumns(3);

        jTvalor2.setColumns(3);

        jLabel1.setText("Digite o valor 1:");

        jLabel2.setText("Digite o valor 2:");

        jLresultado.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLresultado.setForeground(new java.awt.Color(51, 51, 255));
        jLresultado.setText("0.00");

        buttonGroup1.add(jRsomar);
        jRsomar.setText("+");
        jRsomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRsomarActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRsub);
        jRsub.setText("-");
        jRsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRsubActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRmulti);
        jRmulti.setText("*");
        jRmulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRmultiActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRdiv);
        jRdiv.setText("/");
        jRdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdivActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRsomar)
                        .addGap(18, 18, 18)
                        .addComponent(jRsub)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRmulti)
                        .addGap(18, 18, 18)
                        .addComponent(jRdiv))
                    .addComponent(jLresultado)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTvalor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTvalor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTvalor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTvalor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRsomar)
                    .addComponent(jRsub)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRmulti)
                        .addComponent(jRdiv)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLresultado)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRsomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRsomarActionPerformed
        // TODO add your handling code here:
        if(jRsomar.isSelected()){
            c.setValor1(Double.valueOf(jTvalor1.getText()));
            c.setValor2(Double.valueOf(jTvalor2.getText()));
            jLresultado.setText(""+c.somar());
            jTvalor1.setText("");
            jTvalor2.setText("");
            jTvalor1.requestFocus();
        }
    }//GEN-LAST:event_jRsomarActionPerformed

    private void jRsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRsubActionPerformed
        // TODO add your handling code here:
            c.setValor1(Double.valueOf(jTvalor1.getText()));
            c.setValor2(Double.valueOf(jTvalor2.getText()));
            jLresultado.setText(""+c.sub());
            jTvalor1.setText("");
            jTvalor2.setText("");
            jTvalor1.requestFocus();
    }//GEN-LAST:event_jRsubActionPerformed

    private void jRmultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRmultiActionPerformed
        // TODO add your handling code here:
            c.setValor1(Double.valueOf(jTvalor1.getText()));
            c.setValor2(Double.valueOf(jTvalor2.getText()));
            jLresultado.setText(""+c.multi());
            jTvalor1.setText("");
            jTvalor2.setText("");
            jTvalor1.requestFocus();
    }//GEN-LAST:event_jRmultiActionPerformed

    private void jRdivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdivActionPerformed
        // TODO add your handling code here:
            c.setValor1(Double.valueOf(jTvalor1.getText()));
            c.setValor2(Double.valueOf(jTvalor2.getText()));
            jLresultado.setText(""+c.divi());
            jTvalor1.setText("");
            jTvalor2.setText("");
            jTvalor1.requestFocus();
    }//GEN-LAST:event_jRdivActionPerformed

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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLresultado;
    private javax.swing.JRadioButton jRdiv;
    private javax.swing.JRadioButton jRmulti;
    private javax.swing.JRadioButton jRsomar;
    private javax.swing.JRadioButton jRsub;
    private javax.swing.JTextField jTvalor1;
    private javax.swing.JTextField jTvalor2;
    // End of variables declaration//GEN-END:variables
}
