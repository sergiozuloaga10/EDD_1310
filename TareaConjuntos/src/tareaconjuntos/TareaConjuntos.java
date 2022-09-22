/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareaconjuntos;

import clase_conjuntos.ConjuntoADT;
import java.util.HashSet;

/**
 *
 * @author Sergio
 */
public class TareaConjuntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        HashSet<ConjuntoADT> union, interseccion, diferencia;
        
        ConjuntoADT<Integer> lk = new ConjuntoADT<>();
        HashSet<Integer> ls = new HashSet<>();
        
        lk.agregarDato(5);
        lk.agregarDato(4);
        lk.agregarDato(88);
        lk.agregarDato(6);
        lk.agregarDato(117);
        
        System.out.println(lk);
        
        lk.getLongitud();
        
        System.out.println("--------Verificamos si el parametro etá dentro del conjunto--------");
        lk.contiene(4);
        
        lk.eliminarDato(6);
        System.out.println("-------------Conjunto con el número 6 eliminado---------------");
        System.out.println(lk);
        
        //ls = lk;
        ls.add(5);
        ls.add(9);
        ls.add(99);
        ls.add(69);
        
        System.out.println("-------------Método esIgual-------------");
        lk.esIgual(ls);
        
        System.out.println("------------Método esSubConjunto------------");
        lk.esSubConjunto(ls);
        
        System.out.println("-------------Método unión-------------");
        lk.union(ls);
        
        System.out.println("-------------Método intersección-------------");
        lk.interseccion(ls);
        
        System.out.println("-------------Método diferencia-------------");
        lk.diferencia(ls);
        
        System.out.println("-------------Método iterador-------------");
        lk.iterador();
        
        System.out.println("-------------FIN :D-------------");
        
    }
    
}
