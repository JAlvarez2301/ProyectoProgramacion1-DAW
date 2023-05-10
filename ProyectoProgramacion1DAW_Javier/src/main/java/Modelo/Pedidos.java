/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Pedidos {
    private int IDPedido,IDEmpleado;
    private double PrecioPedido, Peso;

    public Pedidos(int IDPedido, int IDEmpleado, double PrecioPedido, double Peso, String Distribuidor, String LugarOrigen, String Tamaño, String MaterialCaja, String TipoEnvio) {
        this.IDPedido = IDPedido;
        this.IDEmpleado = IDEmpleado;
        this.PrecioPedido = PrecioPedido;
        this.Peso = Peso;
        this.Distribuidor = Distribuidor;
        this.LugarOrigen = LugarOrigen;
        this.Tamaño = Tamaño;
        this.MaterialCaja = MaterialCaja;
        this.TipoEnvio = TipoEnvio;
    }
    private String Distribuidor,LugarOrigen,Tamaño,MaterialCaja,TipoEnvio;

    public void setIDPedido(int IDPedido) {
        this.IDPedido = IDPedido;
    }

    public void setIDEmpleado(int IDEmpleado) {
        this.IDEmpleado = IDEmpleado;
    }

    public void setPrecioPedido(double PrecioPedido) {
        this.PrecioPedido = PrecioPedido;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public void setDistribuidor(String Distribuidor) {
        this.Distribuidor = Distribuidor;
    }

    public void setLugarOrigen(String LugarOrigen) {
        this.LugarOrigen = LugarOrigen;
    }

    public void setTamaño(String Tamaño) {
        this.Tamaño = Tamaño;
    }

    public void setMaterialCaja(String MaterialCaja) {
        this.MaterialCaja = MaterialCaja;
    }

    public void setTipoEnvio(String TipoEnvio) {
        this.TipoEnvio = TipoEnvio;
    }

    public int getIDPedido() {
        return IDPedido;
    }

    public int getIDEmpleado() {
        return IDEmpleado;
    }

    public double getPrecioPedido() {
        return PrecioPedido;
    }

    public double getPeso() {
        return Peso;
    }

    public String getDistribuidor() {
        return Distribuidor;
    }

    public String getLugarOrigen() {
        return LugarOrigen;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public String getMaterialCaja() {
        return MaterialCaja;
    }

    public String getTipoEnvio() {
        return TipoEnvio;
    }
}
