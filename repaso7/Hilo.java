/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso7;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author findag
 */
public class Hilo extends Thread
{
    public Hilo(String nombre)
    {
        super(nombre);
    }
    
    public void run()
    {
        // Preguntamos si el hilo que llega es el hilo 1 si es asi lo dormimos.
        if(getName().equalsIgnoreCase("Hilo 1"))
        {
            try
            {
                sleep(500);
            }
            catch (InterruptedException ex)
            {
                System.out.println("Error " + ex);
            }
        }
        System.out.println("Hola soy el " + getName());
    }
    
}
