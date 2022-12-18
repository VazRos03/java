/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcular;

/**
 *
 * @author Arturo
 */
public class cal {
    //atributos
    private int suma;
    private int resta;
    private int dividir;
    private int multiplicacion;

    public cal() {
    }

    public cal(int suma, int resta, int dividir, int muktiplicacion) {
        this.suma = suma;
        this.resta = resta;
        this.dividir = dividir;
        this.multiplicacion = muktiplicacion;
    }

    public int getMuktiplicacion() {
        return multiplicacion;
    }

    public void setMuktiplicacion(int muktiplicacion) {
        this.multiplicacion = muktiplicacion;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int getResta() {
        return resta;
    }

    public void setResta(int resta) {
        this.resta = resta;
    }

    public int getDividir() {
        return dividir;
    }

    public void setDividir(int dividir) {
        this.dividir = dividir;
    }

    @Override
    public String toString() {
        return "cal{" + "suma=" + suma + ", resta=" + resta + ", dividir=" + dividir + ", muktiplicacion=" + multiplicacion + '}';
    }
    
    //metodos de la calculadora
    public int sum(int a, int b){
        
        int c = 0;
        c = a + b;
        System.out.println(c);
        
        return c;
    }
    
    public int res(int d, int e){
        int f=0;
        f = d - e;
        
        System.out.println(f);
        
        return f;
    }
    
    public int div(int d, int e){
        int f =0;
        f = d / e;
        
        System.out.println(f);
        
        return f;
    }
    
    public int mul(int d, int e){
        int f =0;
        f = d * e;
        
        System.out.println(f);
        
        return f;
    }
}
