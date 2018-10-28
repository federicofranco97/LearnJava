/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package All;

import javax.swing.JOptionPane;

/**
 *
 * @author Fede
 */
public class ConversionesTiposDeDato extends javax.swing.JFrame {

    /**
     * Creates new form ConversionesTiposDeDato
     */
    public ConversionesTiposDeDato() {
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversiones");
        setMinimumSize(new java.awt.Dimension(1070, 443));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Estas conversiones solo funcionan bien si el contenido de la variable que queremos convertir es del tipo de dato al cual la queremos convertir");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(115, 66, 801, 16);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("IMPORTANTE:  ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(449, 24, 136, 24);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Es decir, si queremos convertir el String \"hola\" a numero, va a generar un error. Una conversion valida seria el String \"123\" a tipo de dato int.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(115, 88, 796, 16);

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("String a int");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(115, 159, 177, 32);

        jButton2.setBackground(new java.awt.Color(0, 51, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("String a boolean");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(304, 159, 177, 32);

        jButton3.setBackground(new java.awt.Color(0, 51, 51));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("String a double");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(493, 159, 177, 32);

        jButton4.setBackground(new java.awt.Color(0, 51, 51));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Cualquiera a String");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(682, 159, 177, 32);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Estas conversiones se usan en casos cuando por ejemplo necesito mostrar un numero en un print, que solo admite Strings. Para eso convierto la variable");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(115, 241, 872, 28);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Otro caso es que tengo un String y necesito hacer una operacion matematica como sumarle 3. Entonces lo convierto a int o double y puedo realizar la operacion.");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(115, 275, 908, 16);

        jButton5.setBackground(new java.awt.Color(0, 51, 51));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Menu");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(115, 331, 143, 32);

        jButton6.setBackground(new java.awt.Color(0, 51, 51));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Salir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(782, 331, 137, 32);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1080, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String msj="Tomando como ejemplo la variable de tipo String DNI=\"40762400\"; \n"
               + "Para poder convertirla a entero, usamos el siguiente metodo:\n"
               + " Integer.parseInt(*Nombre de la variable a convertir*); \n"
               + "En este caso seria\n"
               + "Integer.parseInt(DNI); \n"
               + "Ahora mediante este proceso solo convertimos el dato, pero si no \n"
               + "lo guardamos en una varaible ese dato se pierde, por lo tanto debemos hacer lo siguiente:\n"
               + "int numeroDNI = Integer.parseInt(DNI); \n"
               + "De esta forma convertimos el valor y lo guardamos en la nueva variable.";
       JOptionPane.showMessageDialog(null, msj);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String msj="Las variables de tipo boolean son true o false. Por lo tanto\n"
                + "si queremos convertir un String a boolean, la cadena tiene que \n"
                + "ser o true o false para que funcione la conversion correctamente.\n"
                + "La forma de hacerlo es la siguiente:\n"
                + "Suponiendo que la variable es String estado=\"true\";\n"
                + " Boolean.parseBoolean(estado);\n"
                + "Ocurre lo mismo que con Strings, asi solo lo convertimos no lo guardamos\n"
                + "Entonces hay que crear una variable booleana para almacenarlo\n"
                + "boolean estadoBooleano= Boolean.parseBoolean(estado); ";
       JOptionPane.showMessageDialog(null, msj);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String msj="Tomando como ejemplo la variable de tipo String saldo=\"123140.453\"; \n"
               + "Para poder convertirla a double, usamos el siguiente metodo:\n"
               + " Double.parseDouble(*Nombre de la variable a convertir*); \n"
               + "En este caso seria\n"
               + "Double.parseDouble(saldo); \n"
               + "Ahora mediante este proceso solo convertimos el dato, pero si no \n"
               + "lo guardamos en una varaible ese dato se pierde, por lo tanto debemos hacer lo siguiente:\n"
               + "int saldoConvertido = Double.parseDouble(saldo); \n"
               + "De esta forma convertimos el valor y lo guardamos en la nueva variable.";
       JOptionPane.showMessageDialog(null, msj);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String msj="Podemos convertir cualquier tipo de dato a String ya que todo puede\n"
                + "se guardado como una cadena de texto.\n"
                + "Suponiendo que la variable int DNI = 40762400; queremos convertirla\n"
                + "Se hace con el siguiente metodo:\n"
                + "String.valueOf(DNI);\n"
                + "Nuevamente tenemos que guardarla en otra variable para almacenar el dato convertido\n"
                + " String documento=String.valueOf(DNI); ";
        JOptionPane.showMessageDialog(null, msj);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Main main = new Main();
        main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(ConversionesTiposDeDato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversionesTiposDeDato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversionesTiposDeDato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversionesTiposDeDato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversionesTiposDeDato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
