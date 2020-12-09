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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Libro obj2 = new Libro(69, "Shakespeare", "1234567", "Romeo y julieta", "03-06-2020", "biblioteca", 0);
       
        Pelicula obj3 = new Pelicula(5, "2553589", "Piratas del caribe", "30-10-2020", "domicilio", 3);
        
        
        Persona obj1 = new Persona("20404891-6", "Sebas", "Trabajador", obj3);
        obj1.printPersona();
        obj3.imprimirComprobante();
        obj3.pagoPorMulta();
        obj3.imprimirMulta();
        
        Persona obj4 = new Persona("25482664-k", "Ana", "Estudiante", obj2);
        obj4.printPersona();
        obj2.imprimirComprobante();
        
        
        
       
        
        
    }
    
}
