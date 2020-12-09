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
public interface Operable {
    int VALOR_MULTA_DIA = 100;
    public int pagoPorMulta();
    public void imprimirComprobante();
    public void imprimirMulta();
}
