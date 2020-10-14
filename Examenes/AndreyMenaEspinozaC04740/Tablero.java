
/**
 * Clase que simula un tablero.
 * 
 * @author (Andrey Mena Espinoza C04740) 
 * @version (1.1)
 */
public class Tablero
{
    private Instruccion[][] tablero;
    private String[][] mensaje;
    private int filas;
    private int columnas;

    /**
     * Constructor for objects of class Tablero
     */
    public Tablero(int opcion)
    {
        filas = opcion;
        columnas = opcion;
        tablero = new Instruccion[filas][columnas];
    }

}
