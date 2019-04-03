/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboltest2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Raul
 */
public class ArbolEjercicio4 {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        int valor;
        int nivelSuma =1;
        int n; 
        ArrayList<Integer> arreglo = new ArrayList<>();
        //Se solicita el numero total de nodos que va tener la red al inicio
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de nodos que tiene la red de señal en Colonia el Porvenir: "));
        //Se inserta el número de contratos conseguidos en cada nodo de la red
        for(int i = 1; i <= n; i++ )
        {
            do{
                valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese # contratos en sector " + i));
                    if(valor<=10){
                        arreglo.add(valor);
                        arbol.insertarNodo(valor);
                    }else{
                        System.out.println("Intentelo nuevamente;");
                    }  
            }while(valor>10);
        }
        //Se muestran los nodos del arbol insertados en un arraylist
        System.out.println("Valores insertados: ");
        arreglo.forEach((num) -> System.out.println(num)); 
        //Se imprime el arbol o la red en forma Preorden
        System.out.println("\nRed o Arbol de distribución de señal recorrida en Preorden");
        arbol.recorridoPreorden();
        System.out.println("\nTotal de Leads: "+arbol.sumaNodosNivel2(1));
        //Se suman todos los nodos del nivel 1 para abajo en el arbol
        System.out.println("\nEl total de ingreso Proyectado x contratos sería de: Q."+arbol.sumaGanancias(nivelSuma));
    
    }
}
