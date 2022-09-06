/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura_manipulacion;

import arreglo_ADT.ADT_Array;
import trabajador_adt.Trabajador;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Sergio
 */
public class LecturaManipulacion {
    private BufferedReader leer, leer2; 
    private String linea;
    private String alm[];
    int head = 0;
    int filas = 0;
    int mayor = 0;
    int menor = 0;

    public LecturaManipulacion() {
        this.alm = null;
    }
    
    public void leerArchivo(String nombreArchivo){
        try {
            leer = new BufferedReader(new FileReader(nombreArchivo));
            leer2 = new BufferedReader(new FileReader(nombreArchivo));
            
            while((linea = leer.readLine()) != null){
                filas++;
            }
            
            ADT_Array ls = new ADT_Array(filas-2);
            
            while((linea = leer2.readLine()) != null){
                if(head > 0 & head < 14){
                    alm = linea.split(",");
                    String sc[] = linea.split(",");
                    
                    String a = sc[0];
                    int w = Integer.parseInt(a);
                    
                    String b = sc[4];
                    int x = Integer.parseInt(b);
                    
                    String c = sc[5];
                    double y = Double.parseDouble(c);
                    
                    String d = sc[6];
                    int z = Integer.parseInt(d);
        
                    Trabajador t = new Trabajador(w, sc[1], sc[2], sc[3], x, y, z);

                    ls.setElemento(head-1, t);
                    System.out.println(ls.getElemento(head-1));
                    
                }
                head++;
            }
           
            /*leer.close();
            linea = null;
            almacenador 
            = null;*/
            
            for(int i = 0; i< ls.getLongitud(); i++){
                Object ab = ls.getElemento(i);
                Object ds = ls.getElemento(i + 1);
                
                if(i == 0){
                    mayor = menor = ((Trabajador) ab).getAnioIngreso();
                }
                
                if(mayor < ((Trabajador) ds).getAnioIngreso()){
                    mayor = ((Trabajador) ds).getAnioIngreso();
                }
                
                if(menor > ((Trabajador) ds).getAnioIngreso()){
                    menor = ((Trabajador) ds).getAnioIngreso();
                }
                 
            }
            
            System.out.println("-----------------------------------");
            System.out.println("Empleado con la mayor antiguedad: " + mayor);
            System.out.println("Empleado con la menor antiguedad: " + menor);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return;
        }
    }
                
}

