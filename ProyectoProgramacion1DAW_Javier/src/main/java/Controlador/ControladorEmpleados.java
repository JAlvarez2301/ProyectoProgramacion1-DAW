/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ConsultasEmpleados;
import Modelo.Empleados;
import Vista.VistaEmpleados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
//Implementamos la interfaz creada en el MVC
public class ControladorEmpleados implements ActionListener{ //ActionListener se utiliza para
    //manejar los eventos de la interfaz gráfica
    private VistaEmpleados vista; //Al usar MVC, cogemos del paquete Vista el que necesitamos
    private Empleados empleado; //Igual que arriba, cogemos el modelo que necesitamos
    private ConsultasEmpleados modelo;
    
    //Vamos a crear el constructor Empleado
    public ControladorEmpleados(VistaEmpleados vista, Empleados empleado, ConsultasEmpleados modelo) {
        this.vista = vista;
        this.empleado = empleado;
        this.modelo = modelo;
        vista.Boton_Insertar.addActionListener(this); //Botón Insertar
    }
    
    public void iniciar(){
        vista.setTitle("Proyecto Final Javier Álvarez");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == vista.Boton_Insertar ){//Si se ha presionado el botón insertar...
            empleado.setIDEmpleado(Integer.parseInt(vista.Caja_IDEmpleado.getText()));
            empleado.setNumeroDeVentas(Integer.parseInt(vista.Caja_NumeroDeVentas.getText()));
            empleado.setNombre(vista.Caja_Nombre.getText());
            empleado.setApellidos(vista.Caja_Apellidos.getText());
            empleado.setTelefono(vista.Caja_Teléfono.getText());
            empleado.setDNI(vista.Caja_DNI.getText());
            empleado.setNacionalidad(vista.Caja_Nacionalidad.getText());
            empleado.setHorasTrabajadas(Integer.parseInt(vista.Caja_HorasTrabajadas.getText()));
            empleado.setSueldoMensual(Integer.parseInt(vista.Caja_SueldoMensual.getText()));
            empleado.setSueldoAnual(Integer.parseInt(vista.Caja_SueldoAnual.getText()));
            empleado.setFechaNacimiento(java.sql.Date.valueOf(vista.Caja_FechaDeNacimiento.getText()));
            
            if(modelo.InsertarEmpleados(empleado)){
                JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
            }else{
                JOptionPane.showMessageDialog(null, "Error al insertar el registro");
            }
    }
}
}