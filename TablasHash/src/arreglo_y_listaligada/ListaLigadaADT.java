/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglo_y_listaligada;

import clase_nodoadt.Nodo;

/**
 *
 * @author Sergio
 */
public class ListaLigadaADT<T> {
    Nodo<T> head;
    int tamanio;

    public ListaLigadaADT() {
    }
    
    public boolean estaVacia(){
        System.out.println(this.head==null);
        return this.head == null;
    }
    
    public int getTamanio(){
        System.out.println("El tamaño de la lista es: " + this.tamanio);
        return this.tamanio;
    }
    
    public void agregarAlFinal(T valor){
        if(this.head == null){
            head = new Nodo<>(valor);
        }else{
            Nodo<T> nuevo = new Nodo(valor);
            Nodo<T> aux = this.head;
            
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            
            tamanio++;
        }
    }
    
    public void agregarAlInicio(T valor){
        if(this.head == null){
            head = new Nodo<>(valor);
        }else{
            Nodo<T> nuevo = new Nodo(valor);
            
            nuevo.setSiguiente(head);
            
            head = nuevo;
            
            tamanio++;
        }
    }
    
    public void agregarDespuesDe(T referencia, T valor){ 
        if(this.head == null){
            System.out.println("La lista está vacía, se agregará el valor como único elemento.");
            head = new Nodo<>(valor);
        }else{
        Nodo<T> nuevo = new Nodo(valor);
        
        Nodo<T> aux = this.head;
        Nodo<T> aux2 = this.head.getSiguiente();
        
        while(aux.getDato() != referencia){
            aux = aux.getSiguiente();
            aux2 = aux2.getSiguiente();
        }
        
        aux.setSiguiente(nuevo);
        aux.getSiguiente().setSiguiente(aux2);
        
        tamanio++;
        }
    }
    
    public void eliminar(int posicion){
        int posi = 0;
        
        if(head == null){
            System.out.println("La lista está vacía, ingrese elementos a la lista para probar este método");
        }else{
            Nodo<T> aux_anterior = this.head;
            Nodo<T> aux = this.head.getSiguiente();

            while(posi != posicion){
                posi++;
                aux = aux.getSiguiente();
                aux_anterior = aux_anterior.getSiguiente();
            }
            aux_anterior.setDato(aux.getDato());
            aux_anterior.setSiguiente(aux.getSiguiente());

            tamanio--;
        }     
    }
    
    public void eliminarElPrimero(){
        Nodo<T> aux = this.head;
            
        aux.setDato(head.getSiguiente().getDato());
            
        aux.setSiguiente(head.getSiguiente().getSiguiente());
        
        tamanio--;
    }
    
    public void eliminarElFinal(){
        Nodo<T> nuevo = this.head.getSiguiente();
        Nodo<T> aux = this.head;
            
        while(nuevo.getSiguiente() != null){
            aux = aux.getSiguiente();
            nuevo = nuevo.getSiguiente();
        }
        aux.setSiguiente(null);
            
        tamanio--;
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
    
    public void actualizar(T a_buscar, T valor){
        Nodo<T> aux = this.head;
        
        try {
            while(aux.getDato() != a_buscar){
            aux = aux.getSiguiente();
        }
        aux.setDato(valor);
        } catch (Exception e) {
            System.out.println("El dato '" + a_buscar + "' no se encuentra en la lista, por lo tanto es imposile actalizarlo.");
        }
    }
    
    public void transversal(){
        Nodo<T> aux = this.head;
        
        while(aux != null){
            System.out.print(aux);
            aux = aux.getSiguiente();
        }
        System.out.print("\n");
    }

}
