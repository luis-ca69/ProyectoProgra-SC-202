/*
Proyecto programación. 
Curso - SC-202
INTRODUCCIÓN A LA PROGRAMACIÓN
Kevin Tan
Manuel Gyles
Luis Carabali 
 */
package proyectoprogra;

import javax.swing.JOptionPane;


public class ProyectoProgra 
{

    
    public static void main(String[] args) 
    {
        String op=""; 
 
        do{
            op=JOptionPane.showInputDialog("Bienvenido, ¿Qué opción desea hacer? a. Lista completa de productos. b. Ingresar productos a la lista. c.Preparar o solicitar una lista de productos faltantes. d. Solicitar una lista completa de vendidos y ganacias y e. Salir. ");
            
 
            if(op.equals("a"))
            {
                 lista_productos LISTA=new lista_productos();
            }
            else if(op.equals("b"))
             {
                ingresar_productos INGRE=new ingresar_productos ();
             }
            else if(op.equals("c"))
              {
                productos_faltantes FALTA=new productos_faltantes();
              }
            else if(op.equals("d"))
              {
                vendidos_ganancias GANA=new vendidos_ganancias();
              }
            else if(op.equals("e"))
               {
                salida SAL=new salida();
               }
            else
                {
                JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
                }
           }while(!op.equals("e")); 
        
    }
    

    
}
