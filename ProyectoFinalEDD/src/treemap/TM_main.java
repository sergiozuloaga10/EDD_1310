/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treemap;

import java.util.TreeMap;

/**
 *
 * @author Sergio
 */
public class TM_main {
    public static void main(String[] args) {
        
        //Método Constructor, creamos nuestro objeto TreeMap llamado
        TreeMap<String, String> perros = new TreeMap<>();
        
        //Agregamos elementos con el metodo put
        System.out.println("------------Método put()------------");
        perros.put("pitbull", "Rocky");
        perros.put("chihuahua", "Charky");
        perros.put("pudle", "Chirris");
        perros.put("husky", "Lobin");
        perros.put("pastor", "Leo");
        System.out.println(perros);
        
        //Este metodo retorna el tamaño del TreeMap
        System.out.println("------------Método size()------------");
        System.out.println(perros.size());
        
        //Este metodo retorna true si el TreeMap está vacio
        System.out.println("------------Método isEmpty()------------");
        System.out.println(perros.isEmpty());
        
        //Devuelve la clave que es menor y mayor que la clave dada, regresa nulo si no hay clave
        System.out.println("------------Método ceilingKey()------------");
        System.out.println(perros.ceilingKey("husky"));
        
        //Devuelve el menor par clave-valor de modo que la clave sea mayor o igual que la clave especificada, nulo si no hay clave
        System.out.println("------------Método ceilingEntry()------------");
        System.out.println(perros.ceilingEntry("pastor"));
        
        //Devuelve la vista NavigableSet de las claves de TreeMap en orden inverso
        System.out.println("------------Método descendingKeySet()------------");
        System.out.println(perros.descendingKeySet());
        
        //Devuelve el menor par llave-valor
        System.out.println("------------Método firstEntry()------------");
        System.out.println(perros.firstEntry());
        
        //Este método actualiza el valor de la llave dada
        System.out.println("------------Método replace()------------");
        perros.replace("pastor", "Lomo");
        System.out.println(perros);
        
        //Este metodo retorna el valor de la llave dada
        System.out.println("------------Método get()------------");
        System.out.println(perros.get("husky"));
        
        
        //Elimina y luego devuelve el par llave- valor de la llave minima
        System.out.println("------------Método pollFirstEntry()------------");
        System.out.println(perros.pollFirstEntry());
        
        //Elimina y devuelve el par llave-valor mas grande
        System.out.println("------------Método pollLastEntry()------------");
        System.out.println(perros.pollLastEntry());
        
        //Con el metodo clear limpiamos el TreeMap
        System.out.println("------------Método clear()------------");
        perros.clear();
        System.out.println(perros);
        
    }
}
