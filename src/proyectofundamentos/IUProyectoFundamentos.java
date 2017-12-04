/**
 * Nombre del programa: Primer Programa
 * Descripción: Muestra una frase al usuario
 * Fecha de creación: Nov 30, 2017
 * Autor: Manuel Alvarado Solano
 * Fecha de modificación: Nov 30, 2017
 * Modificado por: Manuel Alvarado Solano
 */


package proyectofundamentos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;


public class IUProyectoFundamentos {
    
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    
    public static void main(String[] args) {
       LogicaDeNegocios.iniciarJuego();
       out.print(LogicaDeNegocios.mostrarBienvenida());
       
       out.print(LogicaDeNegocios.mostrarMenu());
       
       out.print(LogicaDeNegocios.mostrarJuegoResultante());
    }

}
