package org.example.modelos;

public class Apartamento {

    private String nombreUrbanizacion;

    private Integer NumeroApto;

    private String tieneParqueadero;

    private String direccion;

    private Integer precioCanon;

    private String id;

    private String ciudad;

    public Apartamento() {
    }

    public Apartamento(String nombreUrbanizacion, Integer numeroApto, String tieneParqueadero, String direccion, Integer precioCanon, String id, String ciudad) {
        this.nombreUrbanizacion = nombreUrbanizacion;
        NumeroApto = numeroApto;
        this.tieneParqueadero = tieneParqueadero;
        this.direccion = direccion;
        this.precioCanon = precioCanon;
        this.id = id;
        this.ciudad = ciudad;
    }

    public String getNombreUrbanizacion() {
        return nombreUrbanizacion;
    }

    public void setNombreUrbanizacion(String nombreUrbanizacion) {
        this.nombreUrbanizacion = nombreUrbanizacion;
    }

    public Integer getNumeroApto() {
        return NumeroApto;
    }

    public void setNumeroApto(Integer numeroApto) {
        NumeroApto = numeroApto;
    }

    public String getTieneParqueadero() {
        return tieneParqueadero;
    }

    public void setTieneParqueadero(String tieneParqueadero) {
        this.tieneParqueadero = tieneParqueadero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getPrecioCanon() {
        return precioCanon;
    }

    public void setPrecioCanon(Integer precioCanon) {
        this.precioCanon = precioCanon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
