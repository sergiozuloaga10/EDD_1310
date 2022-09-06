/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglo_ADT;

import java.util.ArrayList;

/**
 *
 * @author Sergio
 */
public class ADT_Array<L> {
    int tamanio;
    ArrayList<L> datos;

    public ADT_Array(int tam) {
        this.tamanio = tam;
        datos = new ArrayList<>();
        for(int i = 0; i < this.tamanio; i++){
            datos.add(null);
        }
    }

    public ADT_Array() {
       
    }
       
    public int getLongitud(){
        return tamanio;
    }
    
    public void setElemento(int indice, L dato) throws IndexOutOfBoundsException{
        datos.add(indice, dato);
    }
    
    public int getElemento(int indice)throws IndexOutOfBoundsException{
        return (int) datos.get(indice);
    }
    
    public void limpiar(L dato){
        for (int i = 0; i < datos.size(); i++) {
            datos.set(i, dato);
        }
    }

    @Override
    public String toString() {
        String estado = "";
        for (L dato : datos) {
            if(dato != null)
            estado += dato.toString() +"\n";
        }
        return estado;
    }
}
