/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;


/**
 *
 * @author Usuario
 */
public class Empleados {

    public Empleados(int IDEmpleado, int NumeroDeVentas, int HorasTrabajadas, int SueldoMensual, int SueldoAnual, String Nombre, String Apellidos, String Telefono, String DNI, String Nacionalidad, Date fechaNacimiento) {
        this.IDEmpleado = IDEmpleado;
        this.NumeroDeVentas = NumeroDeVentas;
        this.HorasTrabajadas = HorasTrabajadas;
        this.SueldoMensual = SueldoMensual;
        this.SueldoAnual = SueldoAnual;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Telefono = Telefono;
        this.DNI = DNI;
        this.Nacionalidad = Nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }
    private int IDEmpleado,NumeroDeVentas,HorasTrabajadas,SueldoMensual, SueldoAnual;
    private String Nombre, Apellidos, Telefono, DNI,Nacionalidad;

    public void setIDEmpleado(int IDEmpleado) {
        this.IDEmpleado = IDEmpleado;
    }

    public void setNumeroDeVentas(int NumeroDeVentas) {
        this.NumeroDeVentas = NumeroDeVentas;
    }

    public void setHorasTrabajadas(int HorasTrabajadas) {
        this.HorasTrabajadas = HorasTrabajadas;
    }

    public void setSueldoMensual(int SueldoMensual) {
        this.SueldoMensual = SueldoMensual;
    }

    public void setSueldoAnual(int SueldoAnual) {
        this.SueldoAnual = SueldoAnual;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getIDEmpleado() {
        return IDEmpleado;
    }

    public int getNumeroDeVentas() {
        return NumeroDeVentas;
    }

    public int getHorasTrabajadas() {
        return HorasTrabajadas;
    }

    public int getSueldoMensual() {
        return SueldoMensual;
    }

    public int getSueldoAnual() {
        return SueldoAnual;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    private Date fechaNacimiento;
}
