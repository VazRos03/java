/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conjuntodadt;

import java.util.HashSet;

/**
 *
 * @author Arturo
 */
public class ConjuntodADT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet dias = new HashSet();
        
        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Jueves");
        dias.add("Viernes");
        dias.add("Miercoles");
        
        for (Object dia : dias) {
            System.out.println(dia);
        }
        
        dias.remove("Lunes");
        System.out.println(dias);
        
        dias.clear();
        System.out.println(dias);
    }
    
}
