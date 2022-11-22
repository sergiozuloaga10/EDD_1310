/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colasdpa_adt;

/**
 *
 * @author Sergio
 */
public class ColasDPA_ADT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        coladpa_class.ColasDPA q = new coladpa_class.ColasDPA(7);
        
        //Agregamos elementos a la cola
        q.enqueue(1,"Niñas");
        q.enqueue(2, "Niños");
        q.enqueue(2, "Tercera Edad");
        q.enqueue(3, "Mujeres" );
        q.enqueue(3, "Hombres");
        q.enqueue(4, "Maestro");
        q.enqueue(4, "Mecánico");
        q.enqueue(4, "Vigia");
        q.enqueue(4, "Timonel");
        q.enqueue(5, "Capitan");
        System.out.println(q);
        
        //Mostramos si la cola esta vacia y su tamaño
        System.out.println("¿La Cola está vacía?:" + q.isEmpty());
        System.out.println("El tamaño de la Cola es:" + q.length());
        
        //Sacamos a cada tripulante por su prioridad hasta que se quede el de menor prioridad
        q.dequeue();
        System.out.println(q);
        
        q.dequeue();
        System.out.println(q);
        
        q.dequeue();
        System.out.println(q);
        
        q.dequeue();
        System.out.println(q); 
        
        q.dequeue();
        System.out.println(q);
        
        q.dequeue();
        System.out.println(q);
        
        q.dequeue();
        System.out.println(q);
        
        q.dequeue();
        System.out.println(q);
        
        q.dequeue();
        System.out.println(q);
  
    }
    
}
