/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkg05rsaficm;
import java.math.BigInteger;
import java.util.Arrays;
 import pkg05rsaficm.Main;
/**
 *
 * @author Frida Carrizales
 */
public class interfazRSA extends javax.swing.JFrame {
    Main mainObj= new Main(SOMEBITS);
    String mensaje,clavePublica,clavePrivada,texto,cifradoString;
    String[] cifradoArray;

    /**
     * Creates new form interfazRSA
     */
    public interfazRSA() {
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

        jPanel1 = new javax.swing.JPanel();
        jTextValor1 = new javax.swing.JTextField();
        encriptarBtn = new javax.swing.JButton();
        desencryptarBtn = new javax.swing.JButton();
        copiarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        clavesBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextValor1.setBackground(new java.awt.Color(204, 204, 255));
        jTextValor1.setText("Introduce el texto a cifrar/descifrar");
        jTextValor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextValor1ActionPerformed(evt);
            }
        });

        encriptarBtn.setBackground(new java.awt.Color(255, 218, 255));
        encriptarBtn.setText("cifrar");
        encriptarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encriptarBtnActionPerformed(evt);
            }
        });

        desencryptarBtn.setBackground(new java.awt.Color(255, 218, 255));
        desencryptarBtn.setText("descifrar");
        desencryptarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desencryptarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(encriptarBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(desencryptarBtn)
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jTextValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTextValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(encriptarBtn)
                    .addComponent(desencryptarBtn))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        copiarBtn.setBackground(new java.awt.Color(255, 218, 255));
        copiarBtn.setText("copiar texto");
        copiarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiarBtnActionPerformed(evt);
            }
        });

        jTextArea1.setBackground(new java.awt.Color(204, 204, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        clavesBtn.setBackground(new java.awt.Color(255, 218, 255));
        clavesBtn.setText("generar claves");
        clavesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clavesBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(copiarBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(clavesBtn)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(copiarBtn)))
                .addGap(18, 18, 18)
                .addComponent(clavesBtn)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void encriptarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encriptarBtnActionPerformed
       // Validar si las claves han sido generadas antes de cifrar
    if (mainObj.n == null || mainObj.e == null) {
        jTextValor1.setText("Genera las claves antes de cifrar.");
        return; // Salir del método si las claves no están generadas
    }
    // Cifrar y mostrar información en la interfaz
    mensaje = jTextValor1.getText();
    if(mensaje.equals("")){
        jTextValor1.setText("Debe de existir texto.");
        return;
    }
    BigInteger[] cifrado = mainObj.cifrar(mensaje);
    jTextArea1.setText(Arrays.toString(cifrado));
    }//GEN-LAST:event_encriptarBtnActionPerformed

    private void jTextValor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextValor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextValor1ActionPerformed

    private void clavesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clavesBtnActionPerformed
      mainObj.generarPrimos();
        mainObj.generarClaves();
         clavePublica = "e: " + mainObj.e.toString() + ", n: " + mainObj.n.toString();
         clavePrivada = "d: " + mainObj.d.toString() + ", n: " + mainObj.n.toString();
         jTextValor1.setText("");
        jTextValor1.setText("Se generaron las claves");
    }//GEN-LAST:event_clavesBtnActionPerformed

    private void copiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiarBtnActionPerformed
        texto = jTextArea1.getText();
    if (texto.length() == 0) {
        jTextValor1.setText("No existe texto");
        return; // Salir del método si no hay texto para copiar
    }
    jTextValor1.setText("");

    java.awt.datatransfer.StringSelection stringSelection = new java.awt.datatransfer.StringSelection(texto);
    java.awt.datatransfer.Clipboard clipboard = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
    clipboard.setContents(stringSelection, null);
    }//GEN-LAST:event_copiarBtnActionPerformed

    private void desencryptarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desencryptarBtnActionPerformed
         // Validar si las claves han sido generadas antes de descifrar
    if (mainObj.n == null || mainObj.d == null) {
        jTextValor1.setText("Genera las claves antes de descifrar.");
        return; // Salir del método si las claves no están generadas
    }

    cifradoString = jTextValor1.getText();
    cifradoArray = cifradoString.replaceAll("\\[|\\]", "").split(", ");
    BigInteger[] cifrado = new BigInteger[cifradoArray.length];

    try {
        for (int i = 0; i < cifradoArray.length; i++) {
            cifrado[i] = new BigInteger(cifradoArray[i]);
        }

        String mensajeDescifrado = mainObj.descifrar(cifrado);
        jTextArea1.setText(mensajeDescifrado);
    } catch (NumberFormatException e) {
        // Manejar la excepción de formato numérico (por ejemplo, mostrar un mensaje de error)
        jTextValor1.setText("Error: El texto cifrado contiene valores no válidos.");
    }
    }//GEN-LAST:event_desencryptarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(interfazRSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazRSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazRSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazRSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazRSA().setVisible(true);
            }
        });
    }                        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clavesBtn;
    private javax.swing.JButton copiarBtn;
    private javax.swing.JButton desencryptarBtn;
    private javax.swing.JButton encriptarBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextValor1;
    // End of variables declaration//GEN-END:variables
}
