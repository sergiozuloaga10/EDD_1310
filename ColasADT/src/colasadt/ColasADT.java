/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colasadt;

import cola_class.Colas;

/**
 *
 * @author Sergio
 */
public class ColasADT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Colas q = new Colas();
        
        //Mostramos si la cola esta vacia y su tamaño
        System.out.println("¿La Cola está vacía?:" + q.isEmpty());
        System.out.println("El tamaño de la Cola es:" + q.length());
        
        //Agregamos elementos a la cola
        q.enqueue(1);
        q.enqueue(117);
        q.enqueue("Hola");
        q.enqueue(66);
        q.enqueue("Chivas");
        q.enqueue(34);
        q.enqueue(2);
        q.enqueue(0);
        System.out.println(q);
        
        //Mostramos si la cola esta vacia y su tamaño
        System.out.println("¿La Cola está vacía?:" + q.isEmpty());
        System.out.println("El tamaño de la Cola es:" + q.length());
        
        //Empezamos a eliminar elementos de la Cola y mostramos como queda la cola despues de apicar el metodo
        q.dequeue();
        System.out.println(q);
        
        q.dequeue();
        System.out.println(q);
        
        q.dequeue();
        System.out.println(q);
        
        q.dequeue();
        System.out.println(q); //Con un toString() mostramos la Cola
  
    }
    
}
