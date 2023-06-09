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
public class VistaPedidos extends javax.swing.JFrame {
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
            JOptionPane.showMessageDialog(null, "Error "+e);
        }
        return conexion;
    }

    /**
     * Creates new form VistaPedidos
     */
    public VistaPedidos() {
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
        Caja_IDPedido = new javax.swing.JTextField();
        Caja_Distribuidor = new javax.swing.JTextField();
        Caja_LugarOrigen = new javax.swing.JTextField();
        Caja_Peso = new javax.swing.JTextField();
        CajaTamaño = new javax.swing.JTextField();
        Caja_MaterialCaja = new javax.swing.JTextField();
        Caja_PrecioPedido = new javax.swing.JTextField();
        Caja_TipoEnvio = new javax.swing.JTextField();
        Caja_Buscar = new javax.swing.JTextField();
        Caja_IDEmpleado = new javax.swing.JTextField();
        Boton_Buscar = new javax.swing.JButton();
        Boton_Insertar = new javax.swing.JButton();
        Boton_Modificar = new javax.swing.JButton();
        Boton_Eliminar = new javax.swing.JButton();
        Boton_Limpiar = new javax.swing.JButton();
        Boton_MenuPrincipal = new javax.swing.JButton();
        Boton_Salir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Fondo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("IDPedido: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Distribuidor: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Lugar de origen:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Peso: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Tamaño: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Material de la caja: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Precio del pedido: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Tipo de envío:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("IDEmpleado");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));
        jPanel1.add(Caja_IDPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 180, 40));
        jPanel1.add(Caja_Distribuidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 180, 40));
        jPanel1.add(Caja_LugarOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 180, 40));
        jPanel1.add(Caja_Peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 180, 40));
        jPanel1.add(CajaTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 180, 40));
        jPanel1.add(Caja_MaterialCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 180, 40));
        jPanel1.add(Caja_PrecioPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 180, 40));
        jPanel1.add(Caja_TipoEnvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 180, 40));
        jPanel1.add(Caja_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 160, 40));
        jPanel1.add(Caja_IDEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 180, 40));

        Boton_Buscar.setText("BUSCAR");
        jPanel1.add(Boton_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 150, 40));

        Boton_Insertar.setText("INSERTAR");
        Boton_Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_InsertarActionPerformed(evt);
            }
        });
        jPanel1.add(Boton_Insertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 150, 40));

        Boton_Modificar.setText("MODIFICAR");
        Boton_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ModificarActionPerformed(evt);
            }
        });
        jPanel1.add(Boton_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 150, 40));

        Boton_Eliminar.setText("ELIMINAR");
        Boton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EliminarActionPerformed(evt);
            }
        });
        jPanel1.add(Boton_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 150, 40));

        Boton_Limpiar.setText("LIMPIAR");
        Boton_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_LimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(Boton_Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 150, 40));

        Boton_MenuPrincipal.setText("MENU PRINCIPAL");
        jPanel1.add(Boton_MenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 150, 40));

        Boton_Salir.setText("SALIR");
        Boton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Boton_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, 150, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel10.setText("Recuerda buscar por ID");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 140, -1));

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

    private void Boton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_SalirActionPerformed
               int opcion = JOptionPane.showConfirmDialog(VistaPedidos.this, "¿Estas seguro que quieres cerrar la aplicación?",
                "Ventana salida.", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_Boton_SalirActionPerformed
public void limpiarCajas(){
    Caja_Buscar.setText("");
    CajaTamaño.setText("");
    Caja_Distribuidor.setText("");
    Caja_IDEmpleado.setText("");
    Caja_IDPedido.setText("");
    Caja_LugarOrigen.setText("");
    Caja_MaterialCaja.setText("");
    Caja_Peso.setText("");
    Caja_PrecioPedido.setText("");
    Caja_TipoEnvio.setText("");
 
}
    private void Boton_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_LimpiarActionPerformed
        limpiarCajas();
    }//GEN-LAST:event_Boton_LimpiarActionPerformed

    private void Boton_InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_InsertarActionPerformed
        Connection conexion = getConnection();
        
        try{
            ps = conexion.prepareStatement("INSERT INTO Pedidos (IDPedido, Distribuidor, LugarOrigen, Peso, Tamaño, MaterialCaja, PrecioPedido, TipoEnvio, IDEmpleado) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setInt(1, Integer.parseInt(Caja_IDPedido.getText()));
            ps.setString(2, Caja_Distribuidor.getText());
            ps.setString(3, Caja_LugarOrigen.getText());
            ps.setDouble(4, Double.parseDouble(Caja_Peso.getText()));
            ps.setString(5, CajaTamaño.getText() );
            ps.setString(6, Caja_MaterialCaja.getText());
            ps.setDouble(7, Double.parseDouble(Caja_PrecioPedido.getText()));
            ps.setString(8, Caja_TipoEnvio.getText());
            ps.setInt(9, Integer.parseInt(Caja_IDEmpleado.getText()));
        int resultado = ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Inserción realizada con éxito en la base de datos");
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

    private void Boton_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ModificarActionPerformed
                Connection conexion = getConnection();
        
        try{
            ps = conexion.prepareStatement("UPDATE Pedidos SET Distribuidor=?, LugarOrigen=?, Peso=?, Tamaño=?, MaterialCaja=?, PrecioPedido=?, TipoEnvio=?, IDEmpleado=? WHERE IDPedido=?");
            ps.setInt(9, Integer.parseInt(Caja_IDPedido.getText()));
            ps.setString(1, Caja_Distribuidor.getText());
            ps.setString(2, Caja_LugarOrigen.getText());
            ps.setDouble(3, Double.parseDouble(Caja_Peso.getText()));
            ps.setString(4, CajaTamaño.getText() );
            ps.setString(5, Caja_MaterialCaja.getText());
            ps.setDouble(6, Double.parseDouble(Caja_PrecioPedido.getText()));
            ps.setString(7, Caja_TipoEnvio.getText());
            ps.setInt(8, Integer.parseInt(Caja_IDEmpleado.getText()));
        int resultado = ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Modificación realizada con éxito en la base de datos");
            } 
        } catch (Exception ex) {
            System.err.println("Error, no se han insertado los datos correctamente."+ex);
           
        } finally { //El finally siempre se ejecutará, por lo que finalizaríamos siempre la conexión
            try {
                conexion.close();
            } catch (Exception e) {
                System.err.println("Error, " + e);
            }}
    }//GEN-LAST:event_Boton_ModificarActionPerformed

    private void Boton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EliminarActionPerformed
          Connection conexion = getConnection();
        
        try{
            ps = conexion.prepareStatement("DELETE FROM Pedidos WHERE IDPedido = ?");
            ps.setInt(1, Integer.parseInt(Caja_IDPedido.getText()));
          
        int resultado = ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Modificación realizada con éxito en la base de datos");
            } 
        } catch (Exception ex) {
            System.err.println("Error, no se han insertado los datos correctamente."+ex);
           
        } finally { //El finally siempre se ejecutará, por lo que finalizaríamos siempre la conexión
            try {
                conexion.close();
            } catch (Exception e) {
                System.err.println("Error, " + e);
            }}
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
            java.util.logging.Logger.getLogger(VistaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPedidos().setVisible(true);
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
    public javax.swing.JTextField CajaTamaño;
    public javax.swing.JTextField Caja_Buscar;
    public javax.swing.JTextField Caja_Distribuidor;
    public javax.swing.JTextField Caja_IDEmpleado;
    public javax.swing.JTextField Caja_IDPedido;
    public javax.swing.JTextField Caja_LugarOrigen;
    public javax.swing.JTextField Caja_MaterialCaja;
    public javax.swing.JTextField Caja_Peso;
    public javax.swing.JTextField Caja_PrecioPedido;
    public javax.swing.JTextField Caja_TipoEnvio;
    private javax.swing.JTextField Fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
