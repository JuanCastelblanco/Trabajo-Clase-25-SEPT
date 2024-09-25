package org.example.modelos;

import java.time.LocalDate;

public class Arrendatario {

    private String nombre;

    private String apellidos;

    private String enQueTrabaja;

    private String id;

    private String ContactoAlterno;

    private LocalDate fechaNacimiento;

    private Integer codeudor;

    public Arrendatario() {
    }

    public Arrendatario(String nombre, String apellidos, String enQueTrabaja, String id, String contactoAlterno, LocalDate fechaNacimiento, Integer codeudor) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.enQueTrabaja = enQueTrabaja;
        this.id = id;
        ContactoAlterno = contactoAlterno;
        this.fechaNacimiento = fechaNacimiento;
        this.codeudor = codeudor;
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

    public String getEnQueTrabaja() {
        return enQueTrabaja;
    }

    public void setEnQueTrabaja(String enQueTrabaja) {
        this.enQueTrabaja = enQueTrabaja;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContactoAlterno() {
        return ContactoAlterno;
    }

    public void setContactoAlterno(String contactoAlterno) {
        ContactoAlterno = contactoAlterno;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getCodeudor() {
        return codeudor;
    }

    public void setCodeudor(Integer codeudor) {
        this.codeudor = codeudor;
    }
}
