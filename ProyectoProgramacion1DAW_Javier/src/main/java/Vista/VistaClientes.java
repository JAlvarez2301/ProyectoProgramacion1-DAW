/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.Clientes;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */ 
public class VistaClientes extends javax.swing.JFrame{
    protected Connection conexion;
    String URL = "jdbc:mysql://localhost:3306/proyectofinaljavieralvarez";
    String usuario = "root";
    String contraseña = "1234";
    PreparedStatement ps;
    ResultSet rs;
    ArrayList <Clientes> ArrayList;
    private ArrayList<Clientes> Clientes;
    
    public Connection getConnection(){
        try{
            conexion = DriverManager.getConnection(URL, usuario, contraseña);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error"+e);
        }
        return conexion;
    }
    
    /**
     * Creates new form VistaClientes
     */
    public VistaClientes() {
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
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Caja_IDCliente = new javax.swing.JTextField();
        Caja_Nombre = new javax.swing.JTextField();
        Caja_Apellidos = new javax.swing.JTextField();
        Caja_Telefono = new javax.swing.JTextField();
        Caja_DNI = new javax.swing.JTextField();
        Caja_ProductoFavorito = new javax.swing.JTextField();
        Caja_Empleado_Favorito = new javax.swing.JTextField();
        Caja_NumeroDePedidos = new javax.swing.JTextField();
        Caja_FechaDeNacimiento = new javax.swing.JTextField();
        Caja_Nacionalidad = new javax.swing.JTextField();
        Caja_DineroGastado = new javax.swing.JTextField();
        Caja_IDEmpleado = new javax.swing.JTextField();
        Caja_Buscar = new javax.swing.JTextField();
        Boton_Buscar = new javax.swing.JButton();
        Boton_Insertar = new javax.swing.JButton();
        Boton_Modificar = new javax.swing.JButton();
        Boton_Eliminar = new javax.swing.JButton();
        Boton_Limpiar = new javax.swing.JButton();
        Boton_Salir = new javax.swing.JButton();
        Boton_MenuPrincipal = new javax.swing.JButton();
        Fondo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ID Cliente:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel2.setText("Nombre: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jLabel3.setText("Apellidos: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel4.setText("Teléfono: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel5.setText("DNI: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        jLabel6.setText("Producto favorito: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel7.setText("Empleado favorito: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jLabel8.setText("Número de pedidos: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jLabel9.setText("Fecha de nacimiento: ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jLabel10.setText("Nacionalidad: ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

        jLabel11.setText("Dinero gastado:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        jLabel12.setText("ID Empleado: ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, -1));
        jPanel1.add(Caja_IDCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 190, 30));
        jPanel1.add(Caja_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 62, 190, 30));
        jPanel1.add(Caja_Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 190, 40));

        Caja_Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Caja_TelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(Caja_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 190, 40));
        jPanel1.add(Caja_DNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 190, 40));
        jPanel1.add(Caja_ProductoFavorito, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 190, 40));
        jPanel1.add(Caja_Empleado_Favorito, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 190, 40));
        jPanel1.add(Caja_NumeroDePedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 190, 40));
        jPanel1.add(Caja_FechaDeNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 190, 40));
        jPanel1.add(Caja_Nacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 190, 40));
        jPanel1.add(Caja_DineroGastado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 190, 40));
        jPanel1.add(Caja_IDEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 190, 40));

        Caja_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Caja_BuscarActionPerformed(evt);
            }
        });
        jPanel1.add(Caja_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 130, 40));

        Boton_Buscar.setText("Buscar");
        Boton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_BuscarActionPerformed(evt);
            }
        });
        jPanel1.add(Boton_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 13, 130, 40));

        Boton_Insertar.setText("INSERTAR");
        Boton_Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_InsertarActionPerformed(evt);
            }
        });
        jPanel1.add(Boton_Insertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 240, 30));

        Boton_Modificar.setText("MODIFICAR");
        Boton_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ModificarActionPerformed(evt);
            }
        });
        jPanel1.add(Boton_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 120, -1));

        Boton_Eliminar.setText("ELIMINAR");
        Boton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EliminarActionPerformed(evt);
            }
        });
        jPanel1.add(Boton_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, 120, -1));

        Boton_Limpiar.setText("LIMPIAR");
        Boton_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_LimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(Boton_Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 120, -1));

        Boton_Salir.setText("SALIR");
        Boton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Boton_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, -1, -1));

        Boton_MenuPrincipal.setText("MENU PRINCIPAL");
        Boton_MenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_MenuPrincipalActionPerformed(evt);
            }
        });
        jPanel1.add(Boton_MenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 130, 40));

        Fondo.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, -100, 930, 650));

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

    private void Caja_TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Caja_TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Caja_TelefonoActionPerformed

    private void Boton_MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_MenuPrincipalActionPerformed
       int opcion = JOptionPane.showConfirmDialog(null, "¿ Estás seguro de que deseas abandonar la ventana ?", "Ventana de cambio", JOptionPane.YES_NO_OPTION);
        if(opcion == JOptionPane.YES_OPTION){
            Menu menu = new Menu();
            menu.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_Boton_MenuPrincipalActionPerformed

    private void Boton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_SalirActionPerformed
                int opcion = JOptionPane.showConfirmDialog(VistaClientes.this, "¿Estas seguro que quieres cerrar la aplicación?",
                "Ventana salida.", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_Boton_SalirActionPerformed

    //Vamos a crear el método limpiarCajas
    public void limpiarCajas(){
        Caja_Apellidos.setText("");
        Caja_Buscar.setText("");
        Caja_DNI.setText("");
        Caja_DineroGastado.setText("");
        Caja_Empleado_Favorito.setText("");
        Caja_FechaDeNacimiento.setText("");
        Caja_IDCliente.setText("");
        Caja_IDEmpleado.setText("");
        Caja_Nacionalidad.setText("");
        Caja_Nombre.setText("");
        Caja_NumeroDePedidos.setText("");
        Caja_ProductoFavorito.setText("");
        Caja_Telefono.setText("");
    }
    private void Boton_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_LimpiarActionPerformed
        limpiarCajas();
    }//GEN-LAST:event_Boton_LimpiarActionPerformed

    private void Boton_InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_InsertarActionPerformed
        conexion = getConnection();
        
        try{
          
           ps = conexion.prepareStatement("INSERT INTO Clientes (IDCliente, Nombre, Apellidos, Telefono, DNI, ProductoFavorito, EmpleadoFavorito, NumeroDePedidos, FechaDeNacimiento, Nacionalidad, DineroGastado, IDEmpleado)VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
        
           ps.setInt(1, Integer.parseInt(Caja_IDCliente.getText()));
           ps.setString(2, Caja_Nombre.getText());
           ps.setString(3, Caja_Apellidos.getText());
           ps.setString(4, Caja_Telefono.getText());
           ps.setString(5, Caja_DNI.getText());
           ps.setString(6, Caja_ProductoFavorito.getText());
           ps.setString(7, Caja_Empleado_Favorito.getText());
           ps.setInt(8, Integer.parseInt(Caja_NumeroDePedidos.getText()));
           ps.setDate(9, Date.valueOf(Caja_FechaDeNacimiento.getText()));
           ps.setString(10, Caja_Nacionalidad.getText());
           ps.setInt(11, Integer.parseInt(Caja_DineroGastado.getText()));
           ps.setInt(12, Integer.parseInt(Caja_IDEmpleado.getText()));
           
           
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
       
        
        
        conexion = getConnection();
        
        try{
          
           ps = conexion.prepareStatement("UPDATE Clientes SET Nombre=?, Apellidos=?, Telefono=?, DNI=?, ProductoFavorito=?, EmpleadoFavorito=?, NumeroDePedidos=?, FechaDeNacimiento=?, Nacionalidad=?, DineroGastado=?, IDEmpleado=? WHERE IDCliente=?");
        
           ps.setInt(12, Integer.parseInt(Caja_IDCliente.getText()));
           ps.setString(1, Caja_Nombre.getText());
           ps.setString(2, Caja_Apellidos.getText());
           ps.setString(3, Caja_Telefono.getText());
           ps.setString(4, Caja_DNI.getText());
           ps.setString(5, Caja_ProductoFavorito.getText());
           ps.setString(6, Caja_Empleado_Favorito.getText());
           ps.setInt(7, Integer.parseInt(Caja_NumeroDePedidos.getText()));
           ps.setDate(8, Date.valueOf(Caja_FechaDeNacimiento.getText()));
           ps.setString(9, Caja_Nacionalidad.getText());
           ps.setInt(10, Integer.parseInt(Caja_DineroGastado.getText()));
           ps.setInt(11, Integer.parseInt(Caja_IDEmpleado.getText()));
           
           
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
            }
        }
        
        
        
    }//GEN-LAST:event_Boton_ModificarActionPerformed

    private void Boton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EliminarActionPerformed
         
        conexion = getConnection();
        
        try{
          
           ps = conexion.prepareStatement("DELETE FROM Clientes WHERE IDCliente = ?");
        
           ps.setInt(1, Integer.parseInt(Caja_IDCliente.getText()));
           
           
           
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
            }
        }
    }//GEN-LAST:event_Boton_EliminarActionPerformed

    private void Caja_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Caja_BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Caja_BuscarActionPerformed

    private void Boton_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_BuscarActionPerformed
       Connection conexion = getConnection();
       ArrayList<Clientes> HistorialClientesBuscados = new ArrayList<Clientes>(); //Vamos a crear un historial de clientes consultados
       try{
           ps = conexion.prepareStatement("SELECT * FROM Clientes WHERE IDCliente =?");
           ps.setInt(1 , Integer.parseInt(Caja_Buscar.getText()));
           rs = ps.executeQuery();
           if(rs.next()){
           while (rs.next()) {
               JOptionPane.showMessageDialog(null, "ID: " + Integer.parseInt(rs.getString("IDCliente"))
                       + "\nNombre: " + rs.getString("Nombre")
                               + "\nApellidos: " + rs.getString("Apellidos")
                               + "\nTelefono: " + rs.getString("Telefono")
                               + "\nDNI: " + rs.getString("DNI")
                               + "\nProductoFavorito: " + rs.getString("ProductoFavorito")
                               + "\nEmpleadoFavorito: " + rs.getString("EmpleadoFavorito")
                               + "\nNumeroDePedidos: " + Integer.parseInt(rs.getString("NumeroDePedidos"))
                               + "\nFecha de nacimiento: " + String.valueOf(rs.getDate("FechaDeNacimiento"))
                               + "\nNacionalidad: " + rs.getString("Nacionalidad")+
                               "\nDineroGastado: "+Integer.parseInt(rs.getString("DineroGastado")));
 
               Clientes cli = new Clientes(
                       rs.getInt("IDCliente"),
                       rs.getInt("NumeroDePedidos"),
                       rs.getInt("DineroGastado"),
                       rs.getInt("IDEmpleado"),
                       rs.getString("Nombre"),
                       rs.getString("Apellidos"),
                       rs.getString("Telefono"),
                       rs.getString("DNI"),
                       rs.getString("ProductoFavorito"),
                       rs.getString("EmpleadoFavorito"),
                       rs.getString("Nacionalidad"),
                       rs.getDate("FechaDeNacimiento")
);
               HistorialClientesBuscados.add(cli); //Añadimos el objeto Clientes a nuestro arraylist clientes

           }}else{
               JOptionPane.showMessageDialog(null, "No existe información acerca ese ID");
           }
           
       } catch (SQLException ex) {
            Logger.getLogger(VistaClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
       

           
        
       
       
    }//GEN-LAST:event_Boton_BuscarActionPerformed

    //Vamos a crear un método para limpiar cajas
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
            java.util.logging.Logger.getLogger(VistaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaClientes().setVisible(true);
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
    public javax.swing.JTextField Caja_Apellidos;
    public javax.swing.JTextField Caja_Buscar;
    public javax.swing.JTextField Caja_DNI;
    public javax.swing.JTextField Caja_DineroGastado;
    public javax.swing.JTextField Caja_Empleado_Favorito;
    public javax.swing.JTextField Caja_FechaDeNacimiento;
    public javax.swing.JTextField Caja_IDCliente;
    public javax.swing.JTextField Caja_IDEmpleado;
    public javax.swing.JTextField Caja_Nacionalidad;
    public javax.swing.JTextField Caja_Nombre;
    public javax.swing.JTextField Caja_NumeroDePedidos;
    public javax.swing.JTextField Caja_ProductoFavorito;
    public javax.swing.JTextField Caja_Telefono;
    private javax.swing.JTextField Fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
