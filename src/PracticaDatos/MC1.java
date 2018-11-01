/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaDatos;

import PracticasVariable.Practicadef2;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Fede
 */
public class MC1 extends javax.swing.JFrame {

    /**
     * Creates new form MultipleChoice
     */
    public MC1() {
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
        textos.add("boolean edad=Boolean.parseBoolean(edad);");
        textos.add("String edad=String.valueOf(edad);");
        textos.add("int edad=Integer.parseInt(edad);");
        textos.add("double edad=Double.parseDouble(edad);");
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
        if(aux.equals("int edad=Integer.parseInt(edad);")){
            JOptionPane.showMessageDialog(null, "Correcto!");
            MC2 s = new MC2();
            s.setVisible(true);
            this.setVisible(false);
            
        }else{
            if(aux.equals("double edad=Double.parseDouble(edad);")){
                JOptionPane.showMessageDialog(null, "No es incorrecta la respuesta, pero la edad es un numero chico\n"
                        + "Por lo tanto poniendolo como double se utiliza demasiada memoria para un valor tan chico.\n"
                        + "Intenta de nuevo");
            }else{
                rtaError();
            }
        }
    }
    public void rtaError(){
        JOptionPane.showMessageDialog(null, error);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MChoice Tipo de dato");
        setMinimumSize(new java.awt.Dimension(585, 368));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consigna:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(229, 32, 97, 36);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Si tengo una variable de tipo String que contiene lo siguiente:   String edad=\"35\";");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(63, 80, 461, 16);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("¿Que funcion usaria para convertir el dato a un numero entero?");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 102, 381, 16);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        btn1.setBackground(new java.awt.Color(0, 51, 51));
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("boolean edad=Boolean.parseBoolean(edad);");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(0, 51, 51));
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("String edad=String.valueOf(edad);");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(0, 51, 51));
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("int edad=Integer.parseInt(edad);");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(0, 51, 51));
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("double edad=Double.parseDouble(edad);");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(btn1)
                .addGap(6, 6, 6)
                .addComponent(btn2)
                .addGap(6, 6, 6)
                .addComponent(btn3)
                .addGap(6, 6, 6)
                .addComponent(btn4)
                .addGap(94, 94, 94))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 590, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        checkRta(1);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        checkRta(2);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        checkRta(3);
    }//GEN-LAST:event_btn3ActionPerformed

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
            java.util.logging.Logger.getLogger(MC1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MC1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MC1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MC1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MC1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
