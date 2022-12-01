/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablashash;

import class_hashtable.HashTableADT;

/**
 *
 * @author Sergio
 */
public class TablasHash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashTableADT<String> t = new HashTableADT<>(5);
        
        t.add(62, "Kira");
        t.add(32, "popeye");
        t.add(65, "marin");
        t.add(7, "rey");
        t.add(41, "messi");
        System.out.println(t);
        
        t.valueOf(41);
        
        t.remove(32);
        
        System.out.println(t);
    }
    
}
