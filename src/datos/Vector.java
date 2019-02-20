/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.Random;

/**
 *
 * @author Anita
 */
public class Vector {
    
    private int[] vector = new int[0];
    private int tam = 0;

    public Vector(){}
    
    public Vector(int tam){
        this.tam = tam;
        vector = new int[0];
    }
    
    public int tamanio(){
        return tam;
    }
    
    public void aleatorio(int cant){
        vector = new int[cant];
        tam = cant;
        int e;
        
        Random r = new Random();
        
       for(int i=0; i<cant;i++){
           e = r.nextInt(50);
           vector[i] = e;
        }
    }
    
    public void mostrar(){
        String s = "";
        for(int i=0; i<tam;i++){
            s += vector[i] + ",";
        }
        System.out.println("Vector = ["+s+"]");
    }
    
}
