/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author sala18a
 */
public class ListaDeExercicios extends javax.swing.JFrame {

    /**
     * Creates new form ListaExercicios
     */
    public ListaDeExercicios() {
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

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextQuestao_Exercicios1 = new javax.swing.JTextField();
        bVoltarExerciciosAluno1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel4.setBackground(new java.awt.Color(0, 153, 0));
        jPanel4.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EXERCÍCIOS");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(150, 20, 334, 75);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 640, 120);

        jTextQuestao_Exercicios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextQuestao_Exercicios1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextQuestao_Exercicios1);
        jTextQuestao_Exercicios1.setBounds(22, 169, 485, 181);

        bVoltarExerciciosAluno1.setBackground(new java.awt.Color(0, 102, 51));
        bVoltarExerciciosAluno1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bVoltarExerciciosAluno1.setForeground(new java.awt.Color(255, 255, 255));
        bVoltarExerciciosAluno1.setText("Voltar");
        bVoltarExerciciosAluno1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 51), new java.awt.Color(0, 102, 51)));
        bVoltarExerciciosAluno1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bVoltarExerciciosAluno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarExerciciosAluno1ActionPerformed(evt);
            }
        });
        getContentPane().add(bVoltarExerciciosAluno1);
        bVoltarExerciciosAluno1.setBounds(22, 528, 100, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextQuestao_Exercicios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextQuestao_Exercicios1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextQuestao_Exercicios1ActionPerformed

    private void bVoltarExerciciosAluno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarExerciciosAluno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bVoltarExerciciosAluno1ActionPerformed

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
            java.util.logging.Logger.getLogger(ListaDeExercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaDeExercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaDeExercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaDeExercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaDeExercicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bVoltarExerciciosAluno1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextQuestao_Exercicios1;
    // End of variables declaration//GEN-END:variables
}
