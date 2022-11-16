/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pila_adt;

import pila_class.Pila;

/**
 *
 * @author Sergio
 */
public class StackADT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pila pila = new Pila();
        
        //Primero agregamos elementos a nuestra pila
        pila.push("Hola");
        pila.push(7);
        pila.push(117);
        pila.push(40);
        pila.push(2);
        pila.push(0);
        pila.push(66);
        
        //Mostramos la pila en pantalla
        System.out.println(pila);
        
        //Mostramos en pantalla el método para obtener el número de elementos que componen nuestra pila
        System.out.println("\nEl tamaño de la Pila es: " + pila.length());
        
        //Mostramos en pantalla si la pila está vacía o no
        System.out.println("\n¿La pila está vacía?: " + pila.isEmpty());
        
        //Mostramos en pantalla el método que elimina el elemento tope de nuestra pila
        System.out.println("\nEl elemento eliminado es: " + pila.pop());
        
        //Mostramos en pantalla el elemento tope de nuestra pila
        System.out.println("\nEl elemento consultado es: " + pila.peek());
        
        //Mostramos e método toString en pantalla
        System.out.println("\nPila Final después de pruebas: " + pila.toString());
        
    }
    
}
