/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarealistassl;

import clase_listas_sl.ListaLigadaADT;

/**
 *
 * @author Sergio
 */
public class TareaListasSL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaLigadaADT<Integer> h = new ListaLigadaADT<>();
        
        System.out.println("------------------Método estaVacia()------------------"); 
        //Retorna si la lista esta vacia o no
        h.estaVacia();
        
        System.out.println("------------------Método getTamanio()------------------"); 
        //Retorna el tamaño de la lista
        h.getTamanio();
        
        System.out.println("------------------Método agregarAlFinal()------------------");
        //Agrega un elemento al final de la lista
        h.agregarAlFinal(4);
        h.transversal();
        
        System.out.println("------------------Método agregarAlInicio()------------------");
        //Agrega un elemento al principio de la lista
        h.agregarAlInicio(3);
        h.transversal();
        
        System.out.println("------------------Método agregarDespuesDe()------------------");
        //Agrega un elemento despues de un elemento de referencia
        h.agregarDespuesDe(4, 7);
        h.transversal();
        
        //Agregamos más elementos
        h.agregarAlInicio(117);
        h.agregarAlFinal(6);
        h.agregarAlFinal(9);
        h.agregarAlFinal(10);
        h.agregarAlFinal(11);
        h.agregarDespuesDe(10, 23);
        System.out.println("------------------Agregamos más elementos a la lista------------------");
        h.transversal();
        
        System.out.println("------------------Método eliminar()------------------");
        //Elimina el elemento en la posición dada
        h.eliminar(3);
        h.transversal();
        
        System.out.println("------------------Método eliminarElFinal()-------------------");
        //Elimina el ultimo elemento de la lista
        h.eliminarElFinal();
        h.transversal();
        
        System.out.println("------------------Método eliminarElPrimero()-------------------");
        //Elimina el primer elemento de la lista
        h.eliminarElPrimero();
        h.transversal();
        
        System.out.println("------------------Método buscar()--------------------");
        //Busca si el elemento del parametro se encuentra dentro de la lista
        h.buscar(6);
        
        System.out.println("------------------Método actualizar()------------------");
        //Busca el elemento del parametro y o actualiza/reemplaza por el dato del segundo parametro
        h.actualizar(4, 0);
        h.transversal();
        
        System.out.println("------------------Método getTamanio()------------------");
        //Observamos el tamaño de la lista al final
        h.getTamanio();
        
        System.out.println("------------------Método transversal()------------------");
        //Nos imprime de manera transversal nuestra lista
        h.transversal();
        
        System.out.println("------------------Método estaVacia()------------------"); 
        //Retorna si la lista esta vacia o no
        h.estaVacia();
        
    }
    
}
