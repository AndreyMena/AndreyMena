
/**
 * Programación1
 * TareaProgramada2
 * @author (AndreyMenaEspinoza Carné: C04740)
 * @version (1.1) 
 * Esta clase contiene una palabra, puede ser reservada del lenguaje Java, o no.
 */
public class Palabra
{
    private String palabra;
    /**
     * Inicializa un objeto de tipo Palabra.
     * @param laPalabra
     */
    public Palabra(String laPalabra)
    {
        palabra = laPalabra;
    }
    
    /*
     * Coloca o cambia la palabra
     * @param laPalabra
     */
    public void setPalabra(String laPalabra) {
        palabra = laPalabra;
    }
    
    /*
     * Devuelve la palabra
     * @return palabra
     */
    public String getPalabra() {
        return palabra;
    }
}
