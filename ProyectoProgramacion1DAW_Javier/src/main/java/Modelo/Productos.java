/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Productos {
    private int IDProducto,CodigoBarras,UnidadesVenidas,IDPedido;
    private String TipoProducto,ColorProducto,TamañoProducto,Forma,Distribuidor,NacionalidadOrigen;

    public Productos(int IDProducto, int CodigoBarras, int UnidadesVenidas, int IDPedido, String TipoProducto, String ColorProducto, String TamañoProducto, String Forma, String Distribuidor, String NacionalidadOrigen) {
        this.IDProducto = IDProducto;
        this.CodigoBarras = CodigoBarras;
        this.UnidadesVenidas = UnidadesVenidas;
        this.IDPedido = IDPedido;
        this.TipoProducto = TipoProducto;
        this.ColorProducto = ColorProducto;
        this.TamañoProducto = TamañoProducto;
        this.Forma = Forma;
        this.Distribuidor = Distribuidor;
        this.NacionalidadOrigen = NacionalidadOrigen;
    }

    public void setIDProducto(int IDProducto) {
        this.IDProducto = IDProducto;
    }

    public void setCodigoBarras(int CodigoBarras) {
        this.CodigoBarras = CodigoBarras;
    }

    public void setUnidadesVenidas(int UnidadesVenidas) {
        this.UnidadesVenidas = UnidadesVenidas;
    }

    public void setIDPedido(int IDPedido) {
        this.IDPedido = IDPedido;
    }

    public void setTipoProducto(String TipoProducto) {
        this.TipoProducto = TipoProducto;
    }

    public void setColorProducto(String ColorProducto) {
        this.ColorProducto = ColorProducto;
    }

    public void setTamañoProducto(String TamañoProducto) {
        this.TamañoProducto = TamañoProducto;
    }

    public void setForma(String Forma) {
        this.Forma = Forma;
    }

    public void setDistribuidor(String Distribuidor) {
        this.Distribuidor = Distribuidor;
    }

    public void setNacionalidadOrigen(String NacionalidadOrigen) {
        this.NacionalidadOrigen = NacionalidadOrigen;
    }

    public int getIDProducto() {
        return IDProducto;
    }

    public int getCodigoBarras() {
        return CodigoBarras;
    }

    public int getUnidadesVenidas() {
        return UnidadesVenidas;
    }

    public int getIDPedido() {
        return IDPedido;
    }

    public String getTipoProducto() {
        return TipoProducto;
    }

    public String getColorProducto() {
        return ColorProducto;
    }

    public String getTamañoProducto() {
        return TamañoProducto;
    }

    public String getForma() {
        return Forma;
    }

    public String getDistribuidor() {
        return Distribuidor;
    }

    public String getNacionalidadOrigen() {
        return NacionalidadOrigen;
    }
    
}
