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
public class Pelicula extends Articulo {
    private int numeroDiscos;

    public Pelicula() {
        super();
    }

    public Pelicula(int numeroDiscos, String codigo, String titulo, String fecha_Prestamo, String estado_Prestamo, int dias_Atraso) {
        super(codigo, titulo, fecha_Prestamo, estado_Prestamo, dias_Atraso);
        this.numeroDiscos = numeroDiscos;
    }

    public int getNumeroDiscos() {
        return numeroDiscos;
    }

    public void setNumeroDiscos(int numeroDiscos) {
        this.numeroDiscos = numeroDiscos;
    }
    
    @Override
    public String toString()
            {
            return "Pelicula \n"+
              "Titulo: "+super.titulo+"\n"+
              "Numero de Discos: "+numeroDiscos+"\n"+
              "Codigo: "+super.codigo+"\n"+
              "Estado de Préstamo: "+super.estado_Prestamo+"\n"+
              "Fecha de Préstamo: "+super.fecha_Prestamo+"\n"+
              "Dias de atraso: "+super.dias_Atraso;      
            }
    
    
    
    
    
}
