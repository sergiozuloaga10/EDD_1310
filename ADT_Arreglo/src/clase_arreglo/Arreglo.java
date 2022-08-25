/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_arreglo;

import java.util.ArrayList;

/**
 *
 * @author Sergio
 * @param <L>
 */
public class Arreglo<L> {
    private L tamanio;
   //private L valor;
    ArrayList<L> Arreglo = new ArrayList<>();
    

    public Arreglo() {
    }
    
    public int longitud(){
        return (int) this.tamanio;
    }
    
    public void setElemento(int indice,String valor){
        Arreglo.add((int) indice, (L) valor);
    }
    
    public int getElemento(int indice){
        return (int) indice;
    }
    
    public void limpiar(int valor){
        Arreglo.clear();
    }

    @Override
    public String toString() {
        return "Arreglo{" + "Arreglo=" + Arreglo + '}';
    }
   
}
