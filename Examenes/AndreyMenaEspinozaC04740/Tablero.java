
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
        mensaje = new String[filas][columnas];
        this.llenarMatriz();
    }
    
    public void llenarMatriz(){
        for (int i= 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                Instruccion instruccion = new Instruccion();
                tablero[i][j] = instruccion;
                mensaje[i][j] = instruccion;
                
            }
        }
    }

}
