/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package archivos;

import java.io.*;

/**
 *
 * @author Arturo
 */
public class Archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*Programa donde aprenderemos como escribir y leer archivos en java*/
       
       //para leer un archivo
       String mensajeEscribir = "Este mensaje tiene que escribirse y despues leerse";
       String mensajeLeido = "";
       
       //creando excepcion para la creacion de nuestro archivo
        try {
            FileWriter fw = new FileWriter("Fichero.txt");
            fw.write(mensajeEscribir);
            fw.close();//siempre debemos cerrar el fichero
//este metodo de la clase FileWrite esta encargandose de anotar el mansaje se la variable mensajeEscribir 
// y lo guardara en un archivo txt que nombramos "Fichero.txt"
            
        } catch (Exception e) { 
            e.printStackTrace();
        }
        
        //excepcion para lectura de archivo
        try {
            
            FileReader lector = new FileReader("Fichero.txt");//leera el archivo que nombramos en la excepcion anterior
            BufferedReader br = new BufferedReader(lector);//esta almacenando el archivo que tiene que va a leer el objeto lector el cual, leera el archivo fichero que contiene la variable mensajeEscribir
            mensajeLeido = br.readLine();
        
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        System.out.println(mensajeLeido);
    }
    
}
