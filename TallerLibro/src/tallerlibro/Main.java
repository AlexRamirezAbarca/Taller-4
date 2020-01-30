/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerlibro;

/**
 *
 * @author PC-01
 */
public class Main {
    public static void main(String[] args){
        TallerLibro libro1 = new TallerLibro();
        libro1.ingresarDatosLibro();
        libro1.calcularPrecio();
        libro1.mostrarDatosLibro();
       
       TallerLibro libro2 = new TallerLibro("rosas",5,false,30, 50 );
       libro2.calcularPrecio();
       libro2.mostrarDatosLibro();
    }
}
