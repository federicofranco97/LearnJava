/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticasVariable;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Fede
 */
public class PracticaDefinicionVariable extends javax.swing.JFrame {

    /**
     * Creates new form PracticaDefinicionVariable
     */
    public PracticaDefinicionVariable() {
        initComponents();
        agregarBotones();
        agregarRtas();
        generarRtas();
        setLocationRelativeTo(null);
    }
    ArrayList<JButton>botones=new ArrayList<JButton>();
    ArrayList<String>textos=new ArrayList<String>();
    String error=" Respuesta Incorrecta";
    
    public void agregarRtas(){
        textos.add("Un Dato");
        textos.add("Un espacio para almacenar un dato");
        textos.add("Un Tipo de Dato");
        textos.add("Almacenar un tipo de dato");
    }
    
    public void agregarBotones(){
        botones.add(btn1);
        botones.add(btn2);
        botones.add(btn3);
        botones.add(btn4);
    }
    
    public void generarRtas(){
        for(int i=0;i<4;i++){
            int aux= (int) (Math.random()*(textos.size()));
            botones.get(i).setText(textos.get(aux));
            textos.remove(aux);
        }
    }
    
    public void checkRta(int n){
        String aux=botones.get(n-1).getText();
        if(aux.equals("Un espacio para almacenar un dato")){
            JOptionPane.showMessageDialog(null, "Correcto!");
            Practicadef2 s = new Practicadef2();
            s.setVisible(true);
            this.setVisible(false);
        }else{
            rtaError();
        }
    }
    public void rtaError(){
        JOptionPane.showMessageDialog(null, error);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Definir Variables");
        setMinimumSize(new java.awt.Dimension(400, 328));
        getContentPane().setLayout(null);

        btn2.setBackground(new java.awt.Color(0, 51, 51));
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("rta2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(60, 140, 260, 30);

        btn1.setBackground(new java.awt.Color(0, 51, 51));
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("rta1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(60, 100, 260, 30);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Una Variable Es:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(97, 46, 200, 41);

        btn3.setBackground(new java.awt.Color(0, 51, 51));
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("rta3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3);
        btn3.setBounds(60, 180, 260, 30);

        btn4.setBackground(new java.awt.Color(0, 51, 51));
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("rta4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4);
        btn4.setBounds(60, 220, 260, 30);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        checkRta(1);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        checkRta(3);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        checkRta(2);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        checkRta(4);
    }//GEN-LAST:event_btn4ActionPerformed

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
            java.util.logging.Logger.getLogger(PracticaDefinicionVariable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PracticaDefinicionVariable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PracticaDefinicionVariable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PracticaDefinicionVariable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PracticaDefinicionVariable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
