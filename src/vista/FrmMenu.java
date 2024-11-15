/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import vista.InterCita;

/**
 *
 * @author ASUS
 */
public class FrmMenu extends javax.swing.JFrame {

    public static JDesktopPane jDesktopPane_menu;
            
    public FrmMenu() {
        initComponents();
        this.setSize(new Dimension(1200,700));
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de Ventas");
        
        this.setLayout(null);
        jDesktopPane_menu = new JDesktopPane();
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.jDesktopPane_menu.setBounds(0 ,0, ancho, (alto - 110));
        this.add(jDesktopPane_menu);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();

        jMenuItem11.setText("jMenuItem11");

        jMenuItem14.setText("jMenuItem14");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        jMenu1.setText("Usuario");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-cliente.png"))); // NOI18N
        jMenuItem12.setText("Agregar Usuario");
        jMenuItem12.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem12);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        jMenuItem5.setText("Gestionar Usuarios");
        jMenuItem5.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jMenu3.setText("Paciente");
        jMenu3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-cliente.png"))); // NOI18N
        jMenuItem1.setText("Nuevo Paciente");
        jMenuItem1.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        jMenuItem2.setText("Gestionar Pacientes");
        jMenuItem2.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_Client.png"))); // NOI18N
        jMenu5.setText("Citas");
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir.png"))); // NOI18N
        jMenuItem3.setText("Nueva Cita");
        jMenuItem3.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        jMenuItem4.setText("Gestionar Cita");
        jMenuItem4.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu5.add(jMenuItem4);

        jMenuBar1.add(jMenu5);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        jMenu7.setText("Inventario");
        jMenu7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu7.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-producto.png"))); // NOI18N
        jMenuItem7.setText("Agregar Producto");
        jMenuItem7.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial1.png"))); // NOI18N
        jMenuItem8.setText("Listar Productos");
        jMenuItem8.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem8);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categorias.png"))); // NOI18N
        jMenuItem9.setText("Buscar Producto");
        jMenuItem9.setToolTipText("");
        jMenuItem9.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu7.add(jMenuItem9);

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Asignar Icono_1.png"))); // NOI18N
        jMenuItem10.setText("Asignar Producto");
        jMenuItem10.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem10);

        jMenuBar1.add(jMenu7);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cuenta.png"))); // NOI18N
        jMenu4.setText("Facturar");
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        jMenuItem15.setText("Generar Factura");
        jMenuItem15.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem15);

        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Adminisitar.png"))); // NOI18N
        jMenuItem16.setText("Gestionar Facturas");
        jMenuItem16.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu4.add(jMenuItem16);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Mpago.png"))); // NOI18N
        jMenu8.setText("Metodo de pago");
        jMenu8.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu4.add(jMenu8);

        jMenuBar1.add(jMenu4);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jMenu9.setText("Cerrar Sesión");
        jMenu9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu9.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem13.setText("Cerrar Sesión");
        jMenuItem13.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem13);

        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        InterCita interCita = new InterCita();
        jDesktopPane_menu.add(interCita);
        interCita.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
