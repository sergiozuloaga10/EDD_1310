/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_conjuntos;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Sergio
 */
public class ConjuntoADT <T> {
    int tamanio;
    HashSet<T> otroConjunto;
    HashSet<T> Conjunto = new HashSet<>();

    public ConjuntoADT() {
    }
    
    public int getLongitud(){
        tamanio = Conjunto.size();
        
        return (int) this.tamanio;
    }
    
    public void contiene(T dato){
        boolean posicion = Conjunto.contains(dato); // si el elemento esta da un positivo, sino un negativo
        
        if(posicion == true){
            System.out.println("El elemento '" + dato + "' sí está en la lista");
        } else{
            System.out.println("El elemento '" + dato + "' no está en el arreglo");
        }
    }
    
    public void agregarDato(T dato){
        boolean posicion = Conjunto.contains(dato); // si el elemento esta da un positivo, sino un negativo
        
        if(posicion == true){
            System.out.println("El elemento '" + dato + "' ya está en la lista, no hay necesidad de agregarlo");  
        } else{
            Conjunto.add(dato);
        }
    }
    
    public void eliminarDato(T dato){
        Conjunto.remove(dato);
    }
    
    public boolean esIgual(HashSet<T> oc){
        if(Conjunto.equals(oc)){
            System.out.println("Sí son iguales ambos conjuntos");
        }else{
            System.out.println("Estos conjuntos no son iguales");
        }
        return Conjunto.equals(oc);
    }
    
    public boolean esSubConjunto(HashSet<T> oc){
        if(Conjunto.containsAll(oc)){
            System.out.println(oc + " Sí es subconjunto de: " + Conjunto);
        }else{
            System.out.println(oc + " No es subconjunto de: " + Conjunto);
        }
        boolean isSubset = Conjunto.containsAll(oc);
        
        return isSubset;
    }
    
    public void union(HashSet<T> oc){
        HashSet<T> union = new HashSet();
        T dato1;
        T dato2;
        Iterator<T> i = Conjunto.iterator(); //para recorrer elementos del primer conjunto
        Iterator<T> j = oc.iterator();  //para recorrer elementos del segundo conjunto
        
        while(i.hasNext()){
            dato1 = i.next();
            
            if(!union.contains(dato1)){
                    union.add(dato1);
            }
            while(j.hasNext()){
                dato2 = j.next();
                
               if(!union.contains(dato2)){
                    union.add(dato2);
                } 
            }
              
        }
        
        System.out.println("La unión de los conjuntos es: " + union);
    }
    
    public void interseccion(HashSet<T> oc){
        HashSet<T> inter = new HashSet();
        T dato1;
        T dato2;
        Iterator<T> i = Conjunto.iterator(); //para recorrer elementos del primer conjunto
        Iterator<T> j = oc.iterator();  //para recorrer elementos del segundo conjunto
        
        while(i.hasNext()){
            dato1 = i.next();
            
            while(j.hasNext()){
                dato2 = j.next();
                
               if(dato1.equals(dato2)){
                    inter.add(dato1);
                } 
            }
           j = oc.iterator();
        }
        
        System.out.println("La intersección de los conjuntos es: " + inter);
    }
    
    public void diferencia(HashSet<T> oc){
        HashSet<T> dif = new HashSet();
        T dato;
        Iterator<T> i = Conjunto.iterator();
        
        while(i.hasNext()){
            dato = i.next();
                if(!oc.contains(dato)){
                    dif.add(dato);
                }
        }
        
        System.out.println("La diferencia de los conjuntos es: " + dif);
    }
    
    public void iterador(){
        Iterator valor = Conjunto.iterator();
        
        System.out.println("Este es el conjunto iterado: \n");
        while(valor.hasNext()){
            System.out.println(valor.next());
        }
    }

    @Override
    public String toString() {
        return "ConjuntoADT{" + Conjunto + '}';
    }
    
}
