
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author javie
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        System.out.println("Ingrese el primer sumando: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo sumando: ");
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        System.out.println("El resultado de la suma es: "+ suma);
        
        
        // TODO code application logic here
       
    }
    
}
