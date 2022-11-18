/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila_class;

import java.util.ArrayList;

/**
 *
 * @author Sergio
 */
public class Pila<T> {
    int tamanio;
    ArrayList<T> vecPila = new ArrayList<>();
    int tope = 0;

    public Pila() {
    }
    
    public boolean isEmpty(){
        return this.tamanio==0;
    }
    
    public int length(){
        return this.tamanio;
    }
    
    public T pop(){
        T eliminar = null;
        if(isEmpty()){
            System.out.println("No se puede usar este método, la pila está vacía.");
        }else{
            eliminar = vecPila.remove(tope-1);
            
            this.tope--;
            this.tamanio--;
        }
        
        return eliminar;   
    }
    
    public T peek(){
        T consulta = null;
        if(isEmpty()==true){
            System.out.println("No se puede usar este método, la pila está vacía.");
        }else{
            consulta = vecPila.get(tope-1);
        }
        
        return consulta;   
    }
    
    public void push(T dato){
        vecPila.add(tope, dato);
        
        this.tope++;
        this.tamanio++;
    }

    @Override
    public String toString() {
        return "Pila{"+vecPila+"}";
    }
    
}
