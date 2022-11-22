/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coladpa_class;

import java.util.ArrayList;
import listasl.ListaCircular;
import listasl.ListaLigadaADT;

/**
 *
 * @author Sergio
 */
public class ColasDPA<T> {
    int tamanio;
    ListaCircular<T> coladp_a = new ListaCircular<>();
    int tope = 0;
    int prioridad = 0;    //Indica cuantos niveles de prioridad habrá en la Cola
    int prioriElemento = 1;
    int base;
    
    public ColasDPA(int prioridad) {
        this.prioridad = prioridad;
    }

    public boolean isEmpty(){
        return this.tamanio==0;
    }
    
    public int length(){
        return this.tamanio;
    }
    
    public void enqueue(int priori, T elemento){
        if(isEmpty()){
            coladp_a.agregar(priori,elemento);
        } else{
            coladp_a.agregar(priori,elemento);
            
        }
        
        //coladp_a.ordenamiento();
        this.tope++;
        this.tamanio++;
    }
    
    public int dequeue(){
        int eliminar = 0;
        if(isEmpty()){
            System.out.println("No se puede usar este método, la cola está vacía.");
        }else{
            eliminar = coladp_a.eliminar(0);
            
            this.tope--;
            this.tamanio--;
        }
        System.out.println("El elemento a eliminar es: " + eliminar);
        return eliminar; 
    }

    @Override
    public String toString() {
        //coladp_a.ordenamiento();
        return coladp_a.transversal();
    }
     
}
