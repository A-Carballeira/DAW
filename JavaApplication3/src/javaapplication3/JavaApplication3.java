/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author Patricia
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("esta es la rama de daniel, aqui se restan 2 numeros");
        int a = 10;
        int b = 9;
        int resultado = resta(a,b);
        System.out.println(resultado);

    }
    public static int resta(int a, int b){
        return a-b;
    }
}
