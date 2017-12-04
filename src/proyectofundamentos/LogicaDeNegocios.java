/**
 * Nombre del programa:
 * Descripción:
 * Fecha de creación: Nov 30, 2017
 * Autor: Manuel Alvarado Solano
 * Fecha de modificación: Nov 30, 2017
 * Modificado por: Manuel Alvarado Solano
 */
package proyectofundamentos;

public class LogicaDeNegocios {

    private static final int FILAS = 6; //cantidad de filas para la matrix de juego
    private static final int COLUMNAS = 7; //cantidad de columnas para la matrix de juego
    private static char[][] matrixDejuego; //matrix donde se llevara los datos de juego    
    private static int[] indicePorColumna; //indices de las columnas para saber que tan llena esta la columna
    private static int movimientosPorFicha = (FILAS * COLUMNAS) / 2; // calcula la cantida de movimientos por ficha
    private static int movimientosRestantesFichasRojas = movimientosPorFicha; //movimientos restantes para las fichas rojas
    private static int movimientosRestantesFichasAmarillas = movimientosPorFicha; //movimientos restantes para las fichas amarillas

    public static String mostrarBienvenida() {
        String resultado = "";
        resultado += "Bienvenido al Juego Conecta 4" + "\n";
        resultado += "Cada jugador tiene: " + movimientosPorFicha + " movimientos disponibles" + "\n";
        resultado += "El ganador es el que logre alinear cuatro fichas ya sean de forma vertical, horizontal o diagonal." + "\n";
        resultado += "Inician el jugador con las fichas Rojas" + "\n\n";
        return resultado;
    }

    public static String mostrarMenu() {
        String resultado = "";
        resultado += "#########################################################################" + "\n";
        resultado += " Digite (1~" + COLUMNAS + ") para seleccionar la columna  donde desea poner su ficha " + "\n";
        resultado += " Presione la tecla 'Escape' para retirarse                            " + "\n";
        resultado += "#########################################################################" + "\n";
        return resultado;
    }

    /*
    *Genera la matrix inicial
     */
    public static void iniciarJuego() {
        matrixDejuego = new char[FILAS][COLUMNAS]; //le da las dimensiones a la matrix
        for (int fila = 0; fila < FILAS; fila++) {
            for (int columna = 0; columna < COLUMNAS; columna++) {
                matrixDejuego[fila][columna] = '-'; // inicializa la matrix con el caracter '-'
            }
        }
        indicePorColumna = new int[COLUMNAS];

        //inicializa los indices de las columnas para saber que tan llena esta la columna
        for (int i = 0; i < indicePorColumna.length; i++) {
            indicePorColumna[i] = 0;
        }
    }

    public static void incrementarIndiceColumna(int columna) {
        indicePorColumna[columna] += 1;
    }

    public static void realizarMovimiento() {
    }

    public static void validarMovimientos() {
    }

    public static String mostrarJuegoResultante() {
        String resultado = "   ";
        for (int columna = 0; columna < COLUMNAS; columna++) {
            resultado += (columna + 1) + "  ";
        }
        resultado += "\n";
        for (int fila = 0; fila < FILAS; fila++) {
            resultado += (fila + 1) + "  ";
            for (int columna = 0; columna < COLUMNAS; columna++) {
                resultado += matrixDejuego[fila][columna] + "  ";
            }
            resultado += "\n";
        }
        resultado += "\n\n";
        resultado += "Fichas rojas restantes: " + movimientosRestantesFichasRojas + "\n";
        resultado += "Fichas amarillas restantes: " + movimientosRestantesFichasAmarillas + "\n";
        resultado += "\n\n";
        return resultado;
    }

    public static void cantidadActualFichasPorJugador() {
    }

    public static void retirarse() {
    }

    public static void juegoterminado() {
    }
}
