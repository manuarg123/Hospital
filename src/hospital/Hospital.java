/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author Administrator
 */
public class Hospital {

    /**
     * @param args the command line arguments
     */
    /*
         * En los proyectos con interfaz grafica, el metodo main lo que hara sera
         * mostrar la primer pantalla de mi programa y de ahi en adelante ira saltando
         * de pantalla en pantalla.
         * Para esto crearemos un objeto correspondiente a la clase de la primer pantalla
         * que quiero mostrar
         */

    public static void main(String[] args) {
        // TODO code application logic here
        PacienteH ventana;
        ventana= new PacienteH();
        ventana.setVisible(true);
    }
    
}
