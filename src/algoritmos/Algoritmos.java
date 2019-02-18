/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import datos.Number;
import datos.Vector;

/**
 *
 * @author Nimrod
 */
public class Algoritmos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Number n = new Number();
        n.setNum(20);
        
        Vector v = new Vector();
        v.aleatorio(10);
        
        System.out.println("Hello World!");
        System.out.println("A simple number: "+n.sumNumber());
        System.out.println("");
        
        v.mostrar();
        
    }
    
}
