
package PracticasVariable;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Fede
 */
public class Practicadef2 extends javax.swing.JFrame {

    /**
     * Creates new form Practicadef2
     */
    public Practicadef2() {
        initComponents();
        agregarRtas();
        agregarBotones();
        generarRtas();
        setLocationRelativeTo(null);
    }
    
    String error="Prueba de nuevo";
    ArrayList<JButton>botones=new ArrayList<JButton>();
    ArrayList<String>textos=new ArrayList<String>();
    
    
    public void agregarRtas(){
        textos.add("Instanciacion");
        textos.add("Definicion");
        textos.add("Instanciacion o Ambas");
    }
    
    public void agregarBotones(){
        botones.add(btn1);
        botones.add(btn2);
        botones.add(btn3);
    }
    
    public void generarRtas(){
        for(int i=0;i<3;i++){
            int aux= (int) (Math.random()*(textos.size()));
            botones.get(i).setText(textos.get(aux));
            textos.remove(aux);
        }
    }
    
    public void checkRta(int n){
        String aux=botones.get(n-1).getText();
        if(aux.equals("Instanciacion o Ambas")){
            JOptionPane.showMessageDialog(null, "Correcto!");
            PracticaCrear Crear = new PracticaCrear();
            Crear.setVisible(true);
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

        jLabel1 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear Variables");
        setMinimumSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Se puede crear usando:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(72, 23, 271, 41);

        btn1.setBackground(new java.awt.Color(0, 51, 51));
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("rta 1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(72, 112, 244, 32);

        btn3.setBackground(new java.awt.Color(0, 51, 51));
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("rta3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3);
        btn3.setBounds(72, 188, 244, 32);

        btn2.setBackground(new java.awt.Color(0, 51, 51));
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("rta 2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(72, 150, 244, 32);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 300);

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
            java.util.logging.Logger.getLogger(Practicadef2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practicadef2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practicadef2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practicadef2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practicadef2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
