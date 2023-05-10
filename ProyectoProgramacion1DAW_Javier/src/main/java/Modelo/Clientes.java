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
public class Clientes {
    private int IDCliente,NumeroDePedidos,DineroGastado,IDEmpleado;

    private String Nombre,Apellidos,Telefono,DNI,ProductoFavorito,EmpleadoFavorito,Nacionalidad;
    private Date FechaDeNacimiento;

    public Clientes(int IDCliente, int NumeroDePedidos, int DineroGastado, int IDEmpleado, String Nombre, String Apellidos, String Telefono, String DNI, String ProductoFavorito, String EmpleadoFavorito, String Nacionalidad, Date FechaDeNacimiento) {
        this.IDCliente = IDCliente;
        this.NumeroDePedidos = NumeroDePedidos;
        this.DineroGastado = DineroGastado;
        this.IDEmpleado = IDEmpleado;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Telefono = Telefono;
        this.DNI = DNI;
        this.ProductoFavorito = ProductoFavorito;
        this.EmpleadoFavorito = EmpleadoFavorito;
        this.Nacionalidad = Nacionalidad;
        this.FechaDeNacimiento = FechaDeNacimiento;
    }
    public void setIDCliente(int IDCliente) {
        this.IDCliente = IDCliente;
    }

    public void setNumeroDePedidos(int NumeroDePedidos) {
        this.NumeroDePedidos = NumeroDePedidos;
    }

    public void setDineroGastado(int DineroGastado) {
        this.DineroGastado = DineroGastado;
    }

    public void setIDEmpleado(int IDEmpleado) {
        this.IDEmpleado = IDEmpleado;
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

    public void setProductoFavorito(String ProductoFavorito) {
        this.ProductoFavorito = ProductoFavorito;
    }

    public void setEmpleadoFavorito(String EmpleadoFavorito) {
        this.EmpleadoFavorito = EmpleadoFavorito;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public void setFechaDeNacimiento(Date FechaDeNacimiento) {
        this.FechaDeNacimiento = FechaDeNacimiento;
    }
   

    public int getIDCliente() {
        return IDCliente;
    }

    public int getNumeroDePedidos() {
        return NumeroDePedidos;
    }

    public int getDineroGastado() {
        return DineroGastado;
    }

    public int getIDEmpleado() {
        return IDEmpleado;
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

    public String getProductoFavorito() {
        return ProductoFavorito;
    }

    public String getEmpleadoFavorito() {
        return EmpleadoFavorito;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public Date getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }
    
}
