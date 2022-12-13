/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashmap;

import java.util.HashMap;

/**
 *
 * @author Sergio
 */
public class HM_main {
    public static void main(String[] args) {
        
        //Método constructor, creamos nuestro objeto HashMap llamado ciudades, key y value serán String
        HashMap<String, String> ciudades = new HashMap<>();
        
        //El primer método es put, sirve para agregar elementos al HashMap
        System.out.println("------------Método put()------------");
        ciudades.put("Inglaterra", "Londres");
        ciudades.put("Egipto", "El Cairo");
        ciudades.put("Kenia", "Mombasa");
        ciudades.put("Francia", "Paris");
        ciudades.put("Mexico", "Guadalajara");
        System.out.println(ciudades);
        
        //El Método size regresa el tamaño del HashMap
        System.out.println("------------Método size()------------");
        System.out.println(ciudades.size());
        
        //El Método get retorna el valor respecto a la llave dada
        System.out.println("------------Método get()------------");
        System.out.println(ciudades.get("Mexico"));
        
        //El Método remove elimina el objeto del HashMap respecto a la llave
        System.out.println("------------Método remove()------------");
        ciudades.remove("Kenia");
        System.out.println(ciudades);
        
        //El Método isEmpty nos retorna true si el HashMap está vacío
        System.out.println("------------Método isEmpty()------------");
        System.out.println(ciudades.isEmpty());
        
        //El Método keySet devuelve las llaves del HashMap
        System.out.println("------------Método keySet()------------");
        System.out.println(ciudades.keySet());
        
        //El Método values regresa la coleccion de valores en el HashMap
        System.out.println("------------Método values()------------");
        System.out.println(ciudades.values());
        
        //Por último el Método clear elimina todas las entradas del HashMap
        System.out.println("------------Método clear()------------");
        ciudades.clear();
        System.out.println(ciudades);
                
        
        
    }
}
