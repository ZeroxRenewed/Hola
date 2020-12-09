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
public class Articulo implements Operable {
    
    protected String codigo;
    protected String titulo;
    protected String fecha_Prestamo;
    protected String estado_Prestamo;
    protected int dias_Atraso;

    public Articulo() {
    }

    public Articulo(String codigo, String titulo, String fecha_Prestamo, String estado_Prestamo, int dias_Atraso) {
        setCodigo(codigo);
        this.titulo = titulo;
        this.fecha_Prestamo = fecha_Prestamo;
        setEstado_Prestamo(estado_Prestamo);
        this.dias_Atraso = dias_Atraso;
    }

    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if(codigo.length() == 7){
            this.codigo = codigo;
        }
        else
        {
            
        }
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha_Prestamo() {
        return fecha_Prestamo;
    }

    public void setFecha_Prestamo(String fecha_Prestamo) {
        this.fecha_Prestamo = fecha_Prestamo;
    }

    public String getEstado_Prestamo() {
        return estado_Prestamo;
    }

    public void setEstado_Prestamo(String estado_Prestamo) {
        if (estado_Prestamo.equalsIgnoreCase("biblioteca") ||
               estado_Prestamo.equalsIgnoreCase("domicilio"))
       {
        this.estado_Prestamo = estado_Prestamo;
       }
       else
       {
           System.out.println("Estado debe ser domicilio o biblioteca");
       }
    }
    public int getDias_Atraso() {
        return dias_Atraso;
    }

    public void setDias_Atraso(int dias_Atraso) {
        this.dias_Atraso = dias_Atraso;
    }

    @Override
    public int pagoPorMulta() {

        if (estado_Prestamo.equalsIgnoreCase("domicilio") && dias_Atraso > 0) 
        {
             return VALOR_MULTA_DIA * dias_Atraso;
        } 
        else
        {
             return pagoPorMulta();
        }
        
    }
    @Override
    public void imprimirComprobante() {
        
        System.out.println("--Comprobante del prestamo--");
        System.out.println("Titulo del articulo: "+titulo);
        System.out.println("Fecha de prestamo: "+fecha_Prestamo);
        System.out.println("Codigo del articulo: "+codigo);
    
    }
    
    

    @Override
    public void imprimirMulta() {
        {
            System.out.println("--Multa por atraso--");
            System.out.println("Dias de atraso: "+dias_Atraso);
            System.out.println("Valor de multa por dia: $"+VALOR_MULTA_DIA);
            System.out.println("Total a pagar: $"+pagoPorMulta());
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
