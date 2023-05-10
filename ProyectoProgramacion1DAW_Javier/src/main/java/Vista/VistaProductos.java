/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class VistaProductos extends javax.swing.JFrame {
    protected Connection conexion;
    String URL = "jdbc:mysql://localhost:3306/proyectofinaljavieralvarez";
    String usuario = "root";
    String contraseña = "1234";
    PreparedStatement ps; 
    ResultSet rs; 
    
    public Connection getConnection(){
        try{
            conexion = DriverManager.getConnection(URL, usuario, contraseña);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null ,"Error, "+e);
        }
        return conexion;
    }
    
    /**
     * Creates new form VistaProductos
     */
    public VistaProductos() {
        initComponents();
        setSize(830,580); //Escogemos el tamaño inicial
        setLocationRelativeTo(null); // Para que se inicie en medio de mi ventana
        setTitle("Proyecto Programación Javier Álvarez García");
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Caja_IDProducto = new javax.swing.JTextField();
        Caja_CodigoDeBarras = new javax.swing.JTextField();
        Caja_TipoProducto = new javax.swing.JTextField();
        Caja_ColorProducto = new javax.swing.JTextField();
        Caja_TamañoProducto = new javax.swing.JTextField();
        Caja_Forma = new javax.swing.JTextField();
        Caja_Distribuidor = new javax.swing.JTextField();
        Caja_UnidadesVenidas = new javax.swing.JTextField();
        Caja_NacionalidadOrigen = new javax.swing.JTextField();
        Caja_Buscar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Caja_IDPedido = new javax.swing.JTextField();
        Boton_Buscar = new javax.swing.JButton();
        Boton_Insertar = new javax.swing.JButton();
        Boton_Modificar = new javax.swing.JButton();
        Boton_Eliminar = new javax.swing.JButton();
        Boton_Limpiar = new javax.swing.JButton();
        Boton_MenuPrincipal = new javax.swing.JButton();
        Boton_Salir = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Fondo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("IDProducto: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Codigo de Barras: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Tipo de Producto: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Color del producto: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Tamaño del producto: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Forma:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Distribuidor: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Unidades Venidas:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Nacionalidad de origen:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));
        jPanel1.add(Caja_IDProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 190, 30));
        jPanel1.add(Caja_CodigoDeBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 190, 30));
        jPanel1.add(Caja_TipoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 190, 30));
        jPanel1.add(Caja_ColorProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 190, 30));
        jPanel1.add(Caja_TamañoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 190, 30));
        jPanel1.add(Caja_Forma, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 190, 30));
        jPanel1.add(Caja_Distribuidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 190, 30));
        jPanel1.add(Caja_UnidadesVenidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 190, 30));
        jPanel1.add(Caja_NacionalidadOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 190, 30));
        jPanel1.add(Caja_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 20, 150, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("IDPedido");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));
        jPanel1.add(Caja_IDPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 190, 30));

        Boton_Buscar.setText("BUSCAR");
        jPanel1.add(Boton_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 140, 40));

        Boton_Insertar.setBackground(new java.awt.Color(204, 255, 204));
        Boton_Insertar.setText("INSERTAR");
        Boton_Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_InsertarActionPerformed(evt);
            }
        });
        jPanel1.add(Boton_Insertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 70, 140, 40));

        Boton_Modificar.setBackground(new java.awt.Color(204, 255, 204));
        Boton_Modificar.setText("MODIFICAR");
        Boton_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ModificarActionPerformed(evt);
            }
        });
        jPanel1.add(Boton_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 120, 140, 40));

        Boton_Eliminar.setBackground(new java.awt.Color(204, 255, 204));
        Boton_Eliminar.setText("ELIMINAR");
        Boton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EliminarActionPerformed(evt);
            }
        });
        jPanel1.add(Boton_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 170, 140, 40));

        Boton_Limpiar.setBackground(new java.awt.Color(204, 255, 204));
        Boton_Limpiar.setText("LIMPIAR");
        Boton_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_LimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(Boton_Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 220, 140, 40));

        Boton_MenuPrincipal.setText("MENÚ PRINCIPAL");
        jPanel1.add(Boton_MenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 140, 40));

        Boton_Salir.setText("SALIR");
        Boton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Boton_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, 150, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel11.setText("Recuerda buscar por ID");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        Fondo.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_InsertarActionPerformed
        Connection conexion = getConnection();
        try {
            ps = conexion.prepareStatement("INSERT INTO Productos(IDProducto, CodigoBarras, TipoProducto, ColorProducto, TamañoProducto, Forma, Distribuidor, UnidadesVenidas, NacionalidadOrigen, IDPedido)VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setInt(1, Integer.parseInt(Caja_IDProducto.getText()));
            ps.setInt(2, Integer.parseInt(Caja_CodigoDeBarras.getText()));
            ps.setString(3, Caja_TipoProducto.getText());
            ps.setString(4, Caja_ColorProducto.getText());
            ps.setString(5, Caja_TamañoProducto.getText());
            ps.setString(6, Caja_Forma.getText());
            ps.setString(7, Caja_Distribuidor.getText());
            ps.setInt(8, Integer.parseInt(Caja_UnidadesVenidas.getText()));
            ps.setString(9, Caja_NacionalidadOrigen.getText());
            ps.setInt(10, Integer.parseInt(Caja_IDPedido.getText()));
            
            int resultado = ps.executeUpdate();
            if(resultado > 0){
                JOptionPane.showMessageDialog(null, "Inserción realizada con éxito");
            }
       } catch (Exception ex) {
            System.err.println("Error, no se han insertado los datos correctamente."+ex);
           
        } finally { //El finally siempre se ejecutará, por lo que finalizaríamos siempre la conexión
            try {
                conexion.close();
            } catch (Exception e) {
                System.err.println("Error, " + e);
            }
        }
    }//GEN-LAST:event_Boton_InsertarActionPerformed

    private void Boton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_SalirActionPerformed
                int opcion = JOptionPane.showConfirmDialog(VistaProductos.this, "¿Estas seguro que quieres cerrar la aplicación?",
                "Ventana salida.", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_Boton_SalirActionPerformed
    public void limpiarCajas(){
        Caja_Buscar.setText("");
        Caja_CodigoDeBarras.setText("");
        Caja_ColorProducto.setText("");
        Caja_Distribuidor.setText("");
        Caja_Forma.setText("");
        Caja_IDPedido.setText("");
        Caja_IDProducto.setText("");
        Caja_NacionalidadOrigen.setText("");
        Caja_TamañoProducto.setText("");
        Caja_TipoProducto.setText("");
        Caja_UnidadesVenidas.setText("");
    }
    private void Boton_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_LimpiarActionPerformed
        limpiarCajas();
    }//GEN-LAST:event_Boton_LimpiarActionPerformed

    private void Boton_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ModificarActionPerformed
         Connection conexion = getConnection();
        try {
            ps = conexion.prepareStatement("UPDATE Productos SET CodigoBarras = ?, TipoProducto = ?, ColorProducto = ?, TamañoProducto = ?, Forma = ?, Distribuidor = ?, UnidadesVenidas = ?, NacionalidadOrigen = ?, IDPedido = ? WHERE IDProducto = ?");
            ps.setInt(10, Integer.parseInt(Caja_IDProducto.getText()));
            ps.setInt(1, Integer.parseInt(Caja_CodigoDeBarras.getText()));
            ps.setString(2, Caja_TipoProducto.getText());
            ps.setString(3, Caja_ColorProducto.getText());
            ps.setString(4, Caja_TamañoProducto.getText());
            ps.setString(5, Caja_Forma.getText());
            ps.setString(6, Caja_Distribuidor.getText());
            ps.setInt(7, Integer.parseInt(Caja_UnidadesVenidas.getText()));
            ps.setString(8, Caja_NacionalidadOrigen.getText());
            ps.setInt(9, Integer.parseInt(Caja_IDPedido.getText()));
            
            int resultado = ps.executeUpdate();
            if(resultado > 0){
                JOptionPane.showMessageDialog(null, "Modificación realizada con éxito");
            }
       } catch (Exception ex) {
            System.err.println("Error, no se han insertado los datos correctamente."+ex);
           
        } finally { //El finally siempre se ejecutará, por lo que finalizaríamos siempre la conexión
            try {
                conexion.close();
            } catch (Exception e) {
                System.err.println("Error, " + e);
            }
        }
    }//GEN-LAST:event_Boton_ModificarActionPerformed

    private void Boton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EliminarActionPerformed
         Connection conexion = getConnection();
        try {
            ps = conexion.prepareStatement("DELETE FROM Productos WHERE IDProducto = ?");
            ps.setInt(1, Integer.parseInt(Caja_IDProducto.getText()));
   
            
            int resultado = ps.executeUpdate();
            if(resultado > 0){
                JOptionPane.showMessageDialog(null, "Modificación realizada con éxito");
            }
       } catch (Exception ex) {
            System.err.println("Error, no se han insertado los datos correctamente."+ex);
           
        } finally { //El finally siempre se ejecutará, por lo que finalizaríamos siempre la conexión
            try {
                conexion.close();
            } catch (Exception e) {
                System.err.println("Error, " + e);
            }
        }
    }//GEN-LAST:event_Boton_EliminarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Boton_Buscar;
    public javax.swing.JButton Boton_Eliminar;
    public javax.swing.JButton Boton_Insertar;
    public javax.swing.JButton Boton_Limpiar;
    private javax.swing.JButton Boton_MenuPrincipal;
    public javax.swing.JButton Boton_Modificar;
    private javax.swing.JButton Boton_Salir;
    public javax.swing.JTextField Caja_Buscar;
    public javax.swing.JTextField Caja_CodigoDeBarras;
    public javax.swing.JTextField Caja_ColorProducto;
    public javax.swing.JTextField Caja_Distribuidor;
    public javax.swing.JTextField Caja_Forma;
    public javax.swing.JTextField Caja_IDPedido;
    public javax.swing.JTextField Caja_IDProducto;
    public javax.swing.JTextField Caja_NacionalidadOrigen;
    public javax.swing.JTextField Caja_TamañoProducto;
    public javax.swing.JTextField Caja_TipoProducto;
    public javax.swing.JTextField Caja_UnidadesVenidas;
    private javax.swing.JTextField Fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}