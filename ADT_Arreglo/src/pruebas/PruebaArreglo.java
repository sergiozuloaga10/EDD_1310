/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

import clase_arreglo.Arreglo;



/**
 *
 * @author Sergio
 */
public class PruebaArreglo {
    
    
    public static void main(String[] args) {
        Arreglo l = new Arreglo();
        Arreglo<String> lk = new Arreglo<String>();
        
        lk.setElemento(0, "Sergio");
//        lk.longitud();
        lk.getElemento(0);
       // lk.limpiar(0);
        
        
        
        System.out.println(lk);
    }
}
