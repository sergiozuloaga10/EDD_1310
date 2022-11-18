/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura;

import java.io.BufferedReader;
import java.io.FileReader;


/**
 *
 * @author Sergio
 */
public class Lectura {
    String entrada;
    private BufferedReader leerF;
    private String alm;

    public Lectura() {
    }
    
    
    public String leer(String nombreArchivo){
        try {
            leerF = new BufferedReader(new FileReader(nombreArchivo));
            String tsp = "";
            while((entrada = leerF.readLine()) != null){
                tsp = tsp + entrada;
                
            }
            
            alm = tsp;
            
            System.out.println(alm);
            
            leerF.close();
            
            
        } catch (Exception e) {
            System.out.println("No se pudo leer el archivo :c");
        }
        return alm;
    }
}