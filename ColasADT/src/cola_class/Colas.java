/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cola_class;

import java.util.ArrayList;

/**
 *
 * @author Sergio
 */
public class Colas<T> {
    int tamanio;
    ArrayList<T> vectCola = new ArrayList<>();
    int tope = 0;
    
    public Colas() {
    }
    
    public boolean isEmpty(){
        return this.tamanio==0;
    }
    
    public int length(){
        return this.tamanio;
    }
    
    public void enqueue(T elemento){
        vectCola.add(tope, elemento);
        
        this.tope++;
        this.tamanio++;
    }
    
    public T dequeue(){
        T eliminar = null;
        if(isEmpty()){
            System.out.println("No se puede usar este método, la cola está vacía.");
        }else{
            eliminar = vectCola.remove(0);
            
            this.tope--;
            this.tamanio--;
        }
        System.out.println("El elemento a eliminar es: " + eliminar);
        return eliminar; 
    }

    @Override
    public String toString() {
        return "Cola={" + vectCola + "}";
    }
     
}
