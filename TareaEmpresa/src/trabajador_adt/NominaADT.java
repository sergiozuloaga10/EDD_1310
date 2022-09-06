/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajador_adt;

import arreglo_ADT.ADT_Array;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Sergio
 */
public class NominaADT {
    String nombreEmpresa;
    ADT_Array<Trabajador> nomina;
    String rutaArchivo;
    private BufferedReader leer, leer2; 
    private String linea;
    private String alm[];
    int head = 0;
    int filas = 0;
    int mayor = 0;
    int menor = 0;

    public NominaADT() {
    }

    public NominaADT(String ruta) {
        this.rutaArchivo=ruta;
        
    }
    
    public void leerArchivo(String nombreArchivo){
        try {
            rutaArchivo = nombreArchivo;
            leer = new BufferedReader(new FileReader(rutaArchivo));
            leer2 = new BufferedReader(new FileReader(rutaArchivo));
            
            while((linea = leer.readLine()) != null){
                filas++;
            }
            
            //ADT_Array ls = new ADT_Array(filas-2);
            nomina = new ADT_Array(filas-2);
            
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

                    nomina.setElemento(head-1, t);
                    System.out.println(nomina.getElemento(head-1));
                    
                }
                head++;
            }
           
            /*leer.close();
            linea = null;
            almacenador 
            = null;*/
            
            for(int i = 0; i< nomina.getLongitud(); i++){
                Object ab = nomina.getElemento(i);
                Object ds = nomina.getElemento(i + 1);
                
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
            //JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
        }
    }
}
