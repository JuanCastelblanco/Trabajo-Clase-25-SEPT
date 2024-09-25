package org.example.modelos;

import java.time.LocalDate;

public class Propietario {

    private String nombre;

    private String apellidos;

    private String id;

    private LocalDate fechaNacimiento;

    private String contactoAlterno;

    private Integer cuentaBancaria;

    private Integer numeroCelular;

    public Propietario() {
    }

    public Propietario(String nombre, String apellidos, String id, LocalDate fechaNacimiento, String contactoAlterno, Integer cuentaBancaria, Integer numeroCelular) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.id = id;
        this.fechaNacimiento = fechaNacimiento;
        this.contactoAlterno = contactoAlterno;
        this.cuentaBancaria = cuentaBancaria;
        this.numeroCelular = numeroCelular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getContactoAlterno() {
        return contactoAlterno;
    }

    public void setContactoAlterno(String contactoAlterno) {
        this.contactoAlterno = contactoAlterno;
    }

    public Integer getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(Integer cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public Integer getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(Integer numeroCelular) {
        this.numeroCelular = numeroCelular;
    }
}

