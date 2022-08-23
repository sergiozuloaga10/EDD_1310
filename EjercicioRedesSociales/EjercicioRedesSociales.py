'''Autor: Sergio Zuloaga Santa Maria
   Estructura de Datos
   Grupo: 1310'''

import numpy as np  #Importamos nuestros modulos
import pandas as pd

#Primer punto de la tarea, leer el archivo csv
df = pd.read_csv('C:\\Users\\walmart\\Desktop\\Programas VS Code\\Python\\EjercicioRedesSociales\\presenciaredes.csv')

#Imprimimos el archivo para ver que haya sido leido correctamente
print(df)

l = np.asarray(df) #Tomamos el archivo y lo convertimos en un array bidimensional

#Segundo punto de la tarea: Diferencia de seguidores de twitter enero y junio
def diferenciaSeguidores():
    enero = int(l[7][3])
    junio = int(l[7][8])
    resul = enero-junio
    diferencia = np.abs(resul)
    print(f"\nLa diferencia entre enero y junio de seguidores es: {diferencia} seguidores")

diferenciaSeguidores()

#Tercer punto de la tarea: Diferencia de visualizaciones en Youtube
#El usuario deberá elegir 2 meses para conocer  la diferencia entre ambos
def diferenciaVisualizacionesYoutube():
    a = int(l[15][3])
    b = int(l[15][4])
    c = int(l[15][5])
    d = int(l[15][6])
    e = int(l[15][7])
    f = int(l[15][8])
    
    opcion1 = input("\nDigite el primer mes por letra como se indica: a-Enero, b-Febrero, c-Marzo, d-Abril, e-Mayo, f-Junio: ")
    opcion2 = input("Digite el segundo mes por numero como se indica: a-Enero, b-Febrero, c-Marzo, d-Abril, e-Mayo, f-Junio: ")
    import math
    
    if opcion1 == "a":
        opcion1 = a
        mes1 = "Enero"
    elif opcion1 == "b":
        opcion1 = b
        mes1 = "Febrero"
    elif opcion1 == "c":
        opcion1 = c
        mes1 = "Marzo"
    elif opcion1 == "d":
        opcion1 = d
        mes1 = "Abril"
    elif opcion1 == "e":
        opcion1 = e
        mes1 = "Mayo"
    elif opcion1 == "f":
        opcion1 = f
        mes1 = "Junio"
        
    if opcion2 == "a":
        opcion2 = a
        mes2 = "Enero"
    elif opcion2 == "b":
        opcion2 = b
        mes2 = "Febrero"
    elif opcion2 == "c":
        opcion2 = c
        mes2 = "Marzo"
    elif opcion2 == "d":
        opcion2 = d
        mes2 = "Abril"
    elif opcion2 == "e":
        opcion2 = e
        mes2 = "Mayo"
    elif opcion2 == "f":
        opcion2 = f 
        mes2 = "Junio" 
 
    resultado = opcion1-opcion2
    difVisualizaciones = np.abs(resultado)
    print(f"\nLa diferencia de visualizaciones entre {mes1} y {mes2} es de: {difVisualizaciones}")
    
diferenciaVisualizacionesYoutube()
    
#Punto final de la tarea: Promedio de crecimiento de facebook y twitter 
def promCrecimientoFyT():
    mesesTw = int(l[8][3])+int(l[8][4])+int(l[8][5])+int(l[8][6])+int(l[8][7])+int(l[8][8])
    promedioTw = mesesTw/6
    print(f"\nEl promedio de crecimiento de Twitter es de: {promedioTw}")
    
    mesesFb = int(l[1][3])+int(l[1][4])+int(l[1][5])+int(l[1][6])+int(l[1][7])+int(l[1][8])
    promedioFb = mesesFb/6
    print(f"El promedio de crecimiento de Facebook es de: {promedioFb}")
    
promCrecimientoFyT()    
        

