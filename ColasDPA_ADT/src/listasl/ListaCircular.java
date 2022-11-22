/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasl;

import clase_nodoadt.Nodo;

/**
 *
 * @author Sergio
 */
public class ListaCircular<T> {
    Nodo<T> head;
    Nodo<T> tail;
    int tamanio;
    int conta = 0;

    public ListaCircular() {
    }
    
    public boolean estaVacia(){
        System.out.println(this.head==null);
        return this.head == null;
    }
    
    public int getTamanio(){
        System.out.println("El tamaño de la lista es: " + this.tamanio);
        return this.tamanio;
    }
    
    public void agregar(int preferencia, T valor){
        if(this.head == null){
            head = new Nodo<>(valor);
            head.setPrioridad(preferencia);
            head.setSiguiente(head);

            tamanio++;
        }else{
            Nodo<T> nuevo = new Nodo(valor, head);
            Nodo<T> aux = this.head;
            
            while(aux.getSiguiente() != head){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setPrioridad(preferencia);
            
            tamanio++;
        }
        //ordenamiento();
    }
    
    public int ordenamiento(){
        Nodo<T> aux = this.head;
        int priori = aux.getPrioridad();
        
        if(aux.getSiguiente() == head){
            return priori;
        }else{
            while(aux.getSiguiente() != head){
                if(aux.getPrioridad() < priori){
                    priori = aux.getPrioridad();
                    aux = aux.getSiguiente();
                }else{
                    aux = aux.getSiguiente();
                }
            }
            if(aux.getSiguiente() == head){
                if(aux.getPrioridad() < priori){
                    priori = aux.getPrioridad();
                }
            }
            return priori;
        }
    }
    
    public int getPrioriNodo(){
        int posi = 0;
        Nodo<T> aux = this.head;
        
        if(conta == 0){
            conta++;
            //return aux.getPrioridad();
        }else{
            while(aux.getPrioridad() != conta){
                aux = aux.getSiguiente();
            }
            conta++;
        }    
        return aux.getPrioridad();
    }
    
    public int eliminar(int prioridad){
        int posi = 0;
        
        if(head == null){
            System.out.println("La lista está vacía, ingrese elementos a la lista para probar este método");
        }else{
            Nodo<T> aux_anterior = this.head;
            Nodo<T> aux = this.head.getSiguiente();

            while(posi != prioridad){
                posi++;
                aux = aux.getSiguiente();
                aux_anterior = aux_anterior.getSiguiente();
            }
            aux_anterior.setDato(aux.getDato());
            aux_anterior.setPrioridad(aux.getPrioridad());
            aux_anterior.setSiguiente(aux.getSiguiente());

            tamanio--;
        }  
        return prioridad;
    }
    
    public void buscar(T valor){
        Nodo<T> aux = this.head;
        int indice = 0;
        
        try {
            while(aux.getDato() != valor && aux.getDato() != null){
            aux = aux.getSiguiente();
            indice++;
        }
        System.out.println("El dato '" + aux.getDato() + "' se encuentra en la posición: " + indice);
        } catch (Exception e) {
            System.out.println("El dato '" + valor + "' no se encuentra en la lista, intente con otro dato.");
        }
    }
    
    public String transversal(){
        //ordenamiento();
        Nodo<T> aux = this.head;
        String g = "";
        
        while(aux.getSiguiente() != head){
            System.out.print(aux);
            aux = aux.getSiguiente();
        }
        tail = aux;
        System.out.println(tail);
        
        return g;
    }
    
}
