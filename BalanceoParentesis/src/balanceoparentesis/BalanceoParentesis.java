/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package balanceoparentesis;

import lectura.Lectura;
import pila_class.Pila;

/**
 *
 * @author Sergio
 */
public class BalanceoParentesis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Balanceo del primer archivo txt
        Lectura l = new Lectura();

        System.out.println("----------------Texto1----------------");
        String txt = l.leer("C:\\Users\\walmart\\Documents\\edd1310\\BalanceoParentesis\\src\\recursostxt\\texto1.txt");

        Pila<Character> p = new <Character>Pila();

        String entrada = txt;

        int i = 0;
        int tamanio = entrada.length();

        while (i < tamanio) {
            if (entrada.charAt(i) == '(') {
                p.push(')');
            } else {
                if (p.isEmpty()) {
                    break;
                } else {
                    p.pop();
                }
            }
            i++;
        }

        if (p.isEmpty() && i == tamanio) {
            System.out.println("El Balanceo es Correcto");
        } else {
            System.out.println("El Balanceo es Incorrecto");
        }

        //Balanceo del segundo txt
        Lectura l2 = new Lectura();

        System.out.println("----------------Texto2----------------");
        String txt2 = l2.leer("C:\\Users\\walmart\\Documents\\edd1310\\BalanceoParentesis\\src\\recursostxt\\texto2.txt");

        Pila<Character> p2 = new <Character>Pila();

        String entrada2 = txt2;

        int i2 = 0;
        int tamanio2 = entrada2.length();

        while (i2 < tamanio2) {
            if (entrada2.charAt(i) == '(') {
                p.push('(');
            } else {
                if (p2.isEmpty()) {
                    break;
                } else {
                    p2.pop();
                }
            }
            i2++;
        }

        if (p2.isEmpty() && i2 == tamanio2) {
            System.out.println("El Balanceo es Correcto");
        } else {
            System.out.println("El Balanceo es Incorrecto");
        }

    }

}
