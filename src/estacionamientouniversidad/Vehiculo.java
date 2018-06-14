/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamientouniversidad;
/**
 *
 * @author gozie
 */
public class Vehiculo {
    private String dominio;
    private Marca nombre;
    private Modelo descripcion; 

    public Vehiculo(String dominio, Marca nombre, Modelo descripcion) {
        this.dominio = dominio;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public Marca getNombre() {
        return nombre;
    }

    public void setNombre(Marca nombre) {
        this.nombre = nombre;
    }

    public Modelo getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Modelo descripcion) {
        this.descripcion = descripcion;
    }

    

}
