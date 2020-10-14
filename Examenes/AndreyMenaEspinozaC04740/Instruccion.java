import java.util.Random;
/**
 * Write a description of class Instruccion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instruccion
{
    private String identificador;
    private String instruccion1;
    private String instruccion2;
    private String instruccion3;
    private String instruccion4;
    private String instruccion5;

    /**
     * Constructor for objects of class Instruccion
     */
    public Instruccion()    
    {
        identificador = this.asignador();
        instruccion1 = "No se mueva";
        instruccion2 = "Avance 4 lugares";
        instruccion3 = "Brinque a la próxima fila";
        instruccion4 = "Retroceda 2 lugares";
        instruccion5 = "¡Explotó! Fin del juego";
    }
    
    public String asignador() 
    {
        Random randomizador = new Random(); 
        
        return identificador;
    }

}
