/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class_hashtable;

import arreglo_y_listaligada.ListaLigadaADT;
import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author Sergio
 */
public class HashTableADT <T>{
    ArrayList<T> tb;
    //int key;
    //T valor;
    int tamanio;
    int indice;
    int t = 0;
    Object ls[];

    public HashTableADT(int table_size) {
        this.tamanio = table_size;
        tb = new ArrayList<>(table_size);
        ls = new Object[table_size];
    }
    
    public void add(int key, T valor){
        if(t == tamanio){
            System.out.println("La Tabla está llena");
        }else{
            //ListaLigadaADT<T> l = new ListaLigadaADT<>();
            //l.agregarAlFinal(valor);
            this.indice = (key & 0x7fffffff)%tamanio;
            //tb.add(indice, (T) l);
            
            ls[indice] = valor;
            
            t++;
        }
    }
    
    public void valueOf(int key){
        //tb.get(key);
        this.indice = (key & 0x7fffffff)%tamanio;
        
        System.out.println("El elemento con la llave '" + key + "' es: " + /*tb.get(indice)*/ls[indice]);
    }
    
    public void remove(int key){
        this.indice = (key & 0x7fffffff)%tamanio;
        //tb.remove(indice);
        ls[indice] = null;
        t--;
    }

    public String r(){
        for (Object i :ls) {
            System.out.print(i + ", ");
        }
        
        return "";
    }
    
    @Override
    public String toString() {
        return "HashTableADT{" + "ls=" + r() + '}';
    }
    
    
    
}
