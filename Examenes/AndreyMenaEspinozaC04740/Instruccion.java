import java.util.Random;
/**
 * Esta clase crea las instrucciones que estaran en tablero.
 * @author (Andrey Mena Espinoza) 
 * @version (1.1)
 */
public class Instruccion
{
    private int identificador;


    /**
     * Constructor for objects of class Instruccion
     */
    public Instruccion()    
    { 
        String instruccion1 = "1-No se mueva";
        String instruccion2 = "2-Avance 4 lugares";
        String instruccion3 = "3-Brinque a la próxima fila";
        String instruccion4 = "4-Retroceda 2 lugares";
        String instruccion5 = "5-¡Explotó! Fin del juego";
        Random randomizador = new Random(); 
        int asignador;
        asignador = randomizador.nextInt(5);
        asignador = asignador+1;
        
    }
    
    
    
    

}
