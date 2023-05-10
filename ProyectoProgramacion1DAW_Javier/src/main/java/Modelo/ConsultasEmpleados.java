/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Usuario
 */
public class ConsultasEmpleados extends Conexion { //Ya que vamos a utilizar la clase Conexion creada

    PreparedStatement ps; // Crea y Ejecuta consultas SQL
    ResultSet rs; //Accede a los resultados de la consulta
    //Mñetodo que retorne verdadero si sale correctamente

    public boolean InsertarEmpleados(Empleados empleado) {
        Connection conexion = getConnection();

        try {//Establecemos la llamada a la base de datos
            ps = conexion.prepareStatement("INSERT INTO Empleados(IDEmpleado,NumeroDeVentas,Nombre,Apellidos,Telefono,DNI,Nacionalidad,HorasTrabajadas,SueldoMensual,SueldoAnual,FechaNacimiento) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            //Insertamos los datos
            ps.setInt(1, empleado.getIDEmpleado()); //En el primer ?, introduces...
            ps.setInt(2, empleado.getNumeroDeVentas());
            ps.setString(3, empleado.getNombre());
            ps.setString(4, empleado.getApellidos());
            ps.setString(5, empleado.getTelefono());
            ps.setString(6, empleado.getDNI());
            ps.setString(7, empleado.getNacionalidad());
            ps.setInt(8, empleado.getHorasTrabajadas());
            ps.setInt(9, empleado.getSueldoMensual());
            ps.setInt(10, empleado.getSueldoAnual());
            ps.setDate(11, (Date) empleado.getFechaNacimiento());
            //Como queremos realizar una inserción, queremos actualizar la bd
            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception ex) {
            System.err.println("");
            return false;
        } finally { //El finally siempre se ejecutará, por lo que finalizaríamos siempre la conexión
            try {
                conexion.close();
            } catch (Exception e) {
                System.err.println("Error, " + e);
            }
        }
    }

}
