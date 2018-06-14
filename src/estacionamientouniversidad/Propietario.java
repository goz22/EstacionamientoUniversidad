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
public class Propietario {
    private String apellido;
    private String nombre;
    private int dni;
    
    public Propietario (String apellido,String nombre, int dni){
        this.apellido=apellido;
        this.dni=dni;
        this.nombre=nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setDni(int dni){
        this.dni=dni;
    }
    
    public int dni(){
        return dni;
    }
}
