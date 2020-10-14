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
        Random randomizador = new Random(); 
        int asignador;
        asignador = randomizador.nextInt(5);
        asignador = asignador+1;
        identificador = asignador;
    }
    
    public String
    
    /*
    public int asignador() 
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
        
        if (asignador == 1) {
            identificador = instruccion1;
        }
        if (asignador == 2) {
            identificador = instruccion2;
        }
        if (asignador == 3) {
            identificador = instruccion3;
        }
        if (asignador == 4) {
            identificador = instruccion4;
        }
        if (asignador == 5) {
            identificador = instruccion5;
        } 
        return identificador;
        
       
       return asignador;
       
    }
       */
    

}
