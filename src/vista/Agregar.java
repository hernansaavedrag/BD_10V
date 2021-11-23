/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Registro;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Libro;

/**
 *
 * @author Hernan
 */
public class Agregar extends javax.swing.JFrame {

    /**
     * Creates new form Agregar
     */
    public Agregar() {
        initComponents();
        this.jbtn_Salir.requestFocus();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxt_titulo = new javax.swing.JTextField();
        jtxt_autor = new javax.swing.JTextField();
        jtxt_dia = new javax.swing.JTextField();
        jtxt_mes = new javax.swing.JTextField();
        jtxt_ano = new javax.swing.JTextField();
        jtxt_precio = new javax.swing.JTextField();
        jchk_disponible = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jbtn_enviar = new javax.swing.JButton();
        jbtn_Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Libro");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setText("Título:");

        jLabel2.setText("Autor:");

        jLabel3.setText("Publicación:");

        jLabel4.setText("Precio:");

        jLabel5.setText("Disponible:");

        jtxt_titulo.setText("Ingrese Titulo");
        jtxt_titulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxt_tituloFocusGained(evt);
            }
        });

        jtxt_autor.setText("Ingrese Autor");
        jtxt_autor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxt_autorFocusGained(evt);
            }
        });

        jtxt_dia.setText("dd");
        jtxt_dia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxt_diaFocusGained(evt);
            }
        });

        jtxt_mes.setText("mm");
        jtxt_mes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxt_mesFocusGained(evt);
            }
        });

        jtxt_ano.setText("aaaa");
        jtxt_ano.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxt_anoFocusGained(evt);
            }
        });

        jtxt_precio.setText("Ingrese Precio");
        jtxt_precio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxt_precioFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxt_titulo)
                            .addComponent(jtxt_autor, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                        .addGap(86, 86, 86))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jchk_disponible)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtxt_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtxt_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtxt_ano, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(109, 120, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxt_autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxt_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxt_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxt_ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jchk_disponible))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));

        jbtn_enviar.setText("Enviar");
        jbtn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_enviarActionPerformed(evt);
            }
        });

        jbtn_Salir.setText("Salir");
        jbtn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jbtn_enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jbtn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_Salir)
                    .addComponent(jbtn_enviar))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_tituloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxt_tituloFocusGained
        
        this.jtxt_titulo.setText("");
        
    }//GEN-LAST:event_jtxt_tituloFocusGained

    private void jtxt_autorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxt_autorFocusGained
        
        this.jtxt_autor.setText("");
    }//GEN-LAST:event_jtxt_autorFocusGained

    private void jtxt_diaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxt_diaFocusGained
        
        this.jtxt_dia.setText("");
    }//GEN-LAST:event_jtxt_diaFocusGained

    private void jtxt_mesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxt_mesFocusGained
        this.jtxt_mes.setText("");
    }//GEN-LAST:event_jtxt_mesFocusGained

    private void jtxt_anoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxt_anoFocusGained
        this.jtxt_ano.setText("");
    }//GEN-LAST:event_jtxt_anoFocusGained

    private void jtxt_precioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxt_precioFocusGained
        this.jtxt_precio.setText("");
    }//GEN-LAST:event_jtxt_precioFocusGained

    private void jbtn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_SalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbtn_SalirActionPerformed

    private void jbtn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_enviarActionPerformed
       
        String titulo,autor,dia,mes,ano,fechaStr;
        Date fecha = null;
        int precio;
        boolean disponible;
        
        titulo = this.jtxt_titulo.getText();
        if (titulo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese Título","Validación",2);
            this.jtxt_titulo.requestFocus();
            return;
        }
        
        autor = this.jtxt_autor.getText();
        if (autor.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese Autor","Validación",2);
            this.jtxt_autor.requestFocus();
            return;
        }
        
        dia = this.jtxt_dia.getText();
        mes = this.jtxt_mes.getText();
        ano = this.jtxt_ano.getText();
        
        if (dia.isEmpty() ||mes.isEmpty() || ano.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese fecha","Validación",2);
            this.jtxt_dia.requestFocus();
            return;
        }
        
        fechaStr = dia+"/"+mes+"/"+ano;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            fecha = formato.parse(fechaStr);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ingrese fecha de formato dd/mm/yyyy","Validación",2);
            this.jtxt_dia.requestFocus();
        }
        
        try {
            precio = Integer.parseInt(this.jtxt_precio.getText());
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "El precio debe ser númerico","Validación",2);
            this.jtxt_precio.requestFocus();
            return;
        }
        
        disponible = this.jchk_disponible.isSelected();
        
        Libro libro = new Libro(0,titulo, autor, fecha, precio, disponible);
        
        Registro reg = new Registro();
        
        if (reg.agregar(libro)) {
            JOptionPane.showMessageDialog(this, "Se agrego Libro","Información",1);
        }
        else{
            JOptionPane.showMessageDialog(this, "No Se agrego Libro","Información",0);
        }
        
    }//GEN-LAST:event_jbtn_enviarActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Agregar().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtn_Salir;
    private javax.swing.JButton jbtn_enviar;
    private javax.swing.JCheckBox jchk_disponible;
    private javax.swing.JTextField jtxt_ano;
    private javax.swing.JTextField jtxt_autor;
    private javax.swing.JTextField jtxt_dia;
    private javax.swing.JTextField jtxt_mes;
    private javax.swing.JTextField jtxt_precio;
    private javax.swing.JTextField jtxt_titulo;
    // End of variables declaration//GEN-END:variables
}