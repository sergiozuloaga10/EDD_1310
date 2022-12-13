/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedhashmap;

import java.util.LinkedHashMap;

/**
 *
 * @author Sergio
 */
public class LHM_main {
    public static void main(String[] args) {
       
        ////Método constructor, creamos nuestro objeto LinkedHashMap llamado colores, key y value serán String
        LinkedHashMap<String, String> colores = new LinkedHashMap<>();
        
        //El primer método es put, sirve para agregar elementos al LinkedHashMap
        System.out.println("------------Método put()------------");
        colores.put("uno", "rojo");
        colores.put("dos", "azul");
        colores.put("tres", "rosa");
        colores.put("cuatro", "verde");
        colores.put("cinco", "naranja");
        System.out.println(colores);
        
        //El Método size regresa el tamaño del LinkedHashMap
        System.out.println("------------Método size()------------");
        System.out.println(colores.size());
        
        //El Método get retorna el valor respecto a la llave dada
        System.out.println("------------Método get()------------");
        System.out.println(colores.get("tres"));
        
        //El Método containsValue retorna true si la llave indicada se encuentra en el LinkedHashMap
        System.out.println("------------Método containsValue()------------");
        System.out.println(colores.containsValue("verde"));
        
        //El Método remove elimina el objeto del LinkedHashMap respecto a la llave
        System.out.println("------------Método remove()------------");
        colores.remove("dos");
        System.out.println(colores);
        
        //El Método isEmpty nos retorna true si el LinkedHashMap está vacío
        System.out.println("------------Método isEmpty()------------");
        System.out.println(colores.isEmpty());
        
        //El Método values regresa la coleccion de valores en el LinkedHashMap
        System.out.println("------------Método values()------------");
        System.out.println(colores.values());
        
        //Por último el Método clear elimina todas las entradas del LinkedHashMap
        System.out.println("------------Método clear()------------");
        colores.clear();
        System.out.println(colores);
                
        
        
    }
}
