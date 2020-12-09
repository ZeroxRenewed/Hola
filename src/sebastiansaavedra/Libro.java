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
public class Libro extends Articulo {
    private int numeroPaginas;
    private String autor;
    
    public Libro() {
        super();
    }

    public Libro(int numeroPaginas, String autor, String codigo, String titulo, String fecha_Prestamo, String estado_Prestamo, int dias_Atraso) {
        super(codigo, titulo, fecha_Prestamo, estado_Prestamo, dias_Atraso);
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    
    @Override
   public String toString()
   {
       return "Libro \n"+
              "Titulo: "+super.titulo+"\n"+
              "Autor: "+autor+"\n"+
              "Numero de páginas: "+numeroPaginas+"\n"+
              "Codigo: "+super.codigo+"\n"+
              "Estado de Préstamo: "+super.estado_Prestamo+"\n"+
              "Fecha de Préstamo: "+super.fecha_Prestamo+"\n"+
              "Dias de atraso: "+super.dias_Atraso;
   }
    
    
    
    
    
    
}
