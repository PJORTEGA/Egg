
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author javie
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un número entero: ");
        numero = sc.nextInt();
        System.out.println("Número introducido: " + numero);
        System.out.println("Doble de " + numero + " -> "+ 2*numero);
        System.out.println("Triple de " + numero + " -> "+ 3*numero); 
        double raiz;
        raiz = Math.sqrt(numero);
        System.out.println("Su raiz cuadrada es: "+raiz);
        
        
        
    }
    
}
