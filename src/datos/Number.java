/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Nimrod
 */
public class Number {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public int sumNumber(){
        int sum = 0;
        
        for(int i=0; i<= this.num; i++){
            sum += i;
        }
        
        return sum;
    }
    
    
}
