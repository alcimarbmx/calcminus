/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CalcMinus;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author alcimar
 */
public class CalcMinus extends javax.swing.JFrame {

    /**
     * Creates new form CalcMinus
     */
    public CalcMinus() {
        initComponents();
    }
    public boolean IsNumero(String numero){
        try{
            Double.parseDouble(numero);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    public double converteNumero(String numero){
        return Double.parseDouble(numero);
    }
    public void inverteNum() {
        String num1 = txtNum1.getText();
        String num2 = txtNum2.getText();

        txtNum1.setText(num2);
        txtNum2.setText(num1);
    }

    public double Calc(){
        double numero1 = 0, numero2 = 0;
        if(IsNumero(txtNum1.getText()) && IsNumero(txtNum2.getText())){
            numero1 = converteNumero(txtNum1.getText());
            numero2 = converteNumero(txtNum2.getText());
        }
        return numero2 - numero1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNum1 = new javax.swing.JTextField();
        txtNum2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        jlimagem = new javax.swing.JLabel();
        txttransferir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtNum1.setToolTipText("Apenas numeros!");
        txtNum1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtNum1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNum1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNum1KeyTyped(evt);
            }
        });

        txtNum2.setToolTipText("Apenas numeros!");
        txtNum2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtNum2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNum2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNum2KeyTyped(evt);
            }
        });

        jLabel1.setText("Resultado");

        jLabel2.setText("Quilometros percorridos");

        jLabel3.setText("KM inicial");

        jLabel4.setText("KM final");

        txtResultado.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        txtResultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultado.setToolTipText("Copiar");
        txtResultado.setEnabled(false);
        txtResultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtResultadoMouseClicked(evt);
            }
        });

        jlimagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlimagemMouseClicked(evt);
            }
        });

        txttransferir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CalcMinus/transferir (1).png"))); // NOI18N
        txttransferir.setToolTipText("Inverter");
        txttransferir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txttransferirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3)
                        .addGap(105, 105, 105)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlimagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txttransferir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlimagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNum2)
                    .addComponent(txtNum1))
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNum1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 10) {
            txtNum2.requestFocus();
        }
    }//GEN-LAST:event_txtNum1KeyPressed

    private void txtNum2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum2KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 10) {
            txtResultado.setText(Calc() + "");
        }
    }//GEN-LAST:event_txtNum2KeyPressed

    private void txtResultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtResultadoMouseClicked
        // TODO add your handling code here:
        String texto = txtResultado.getText();
        StringSelection strselection = new StringSelection(texto);
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        clip.setContents(strselection, null);
    }//GEN-LAST:event_txtResultadoMouseClicked

    private void txtNum1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum1KeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtNum1KeyTyped

    private void txtNum2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum2KeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtNum2KeyTyped

    private void jlimagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlimagemMouseClicked
        // TODO add your handling code here:
        inverteNum();
    }//GEN-LAST:event_jlimagemMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Timer timer = new Timer(100, new calculoAutomatico());
        timer.start();
    }//GEN-LAST:event_formWindowOpened

    private void txttransferirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttransferirMouseClicked
        // TODO add your handling code here:
        String auxiliar;
        auxiliar = txtNum1.getText();
        txtNum1.setText(txtNum2.getText());
        txtNum2.setText(auxiliar);
    }//GEN-LAST:event_txttransferirMouseClicked

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
            java.util.logging.Logger.getLogger(CalcMinus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcMinus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcMinus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcMinus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
            new CalcMinus().setVisible(true);
        }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jlimagem;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JLabel txttransferir;
    // End of variables declaration//GEN-END:variables
class calculoAutomatico implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            //To change body of generated methods, choose Tools | Templates.
            txtResultado.setText("" + Calc());
        }
    
}
}
