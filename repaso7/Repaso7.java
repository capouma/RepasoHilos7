/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso7;

/**
 *
 * @author findag
 */
public class Repaso7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Definimos los 2 hilos.
        Hilo hilo1 = new Hilo("Hilo 1");
        Hilo hilo2 = new Hilo("Hilo 2");
        
        // Lanzamos nuestros hilos.
        hilo1.start();
        hilo2.start();
    }
    
}
