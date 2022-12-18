/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conjuntos;

/**
 *
 * @author Arturo
 */
public class conjuntosADT {
    

    public conjuntosADT() {
        
    }
    
    //metodos
    public static Boolean existe(int[]conjunto, int elemento){
        Boolean existe = false;
        
        for(int i = 0; i<conjunto.length; i++){
            if(conjunto[i] == elemento){
                existe = true;
            }
        }
       return existe; 
    }
    
    
    
    
    
    
    
}
