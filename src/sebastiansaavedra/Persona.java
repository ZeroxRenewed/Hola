/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sebastiansaavedra;

/**
 *
 * @author zerox
 */
public class Persona {
    private String rut;
    private String nombre;
    private String cargo;
    private Articulo articulo;

    public Persona() {
    }

    public Persona(String rut, String nombre, String cargo, Articulo articulo) {
        this.rut = rut;
        this.nombre = nombre;
        this.cargo = cargo;
        this.articulo = articulo;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void printPersona() {
        System.out.println("--Informacion de persona--");
        System.out.println("Nombre: "+nombre);
        System.out.println("Rut: "+rut);
        System.out.println("Cargo: "+cargo);
        System.out.println("Articulo: "+getArticulo());
    }
    
    
}
