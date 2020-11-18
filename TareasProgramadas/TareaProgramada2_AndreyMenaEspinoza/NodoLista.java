
/**
 * Programación1
 * TareaProgramada2
 * @author (AndreyMenaEspinoza Carné: C04740)
 * @version (1.1) 
 * Esta clase representa el nodo que tiene la lista.
 */
public class NodoLista
{
    private Palabra palabra;
    private NodoLista siguiente;
    /**
     * Inicializa el nodo de una lista.
     * @param unaPalabra
     */
    public NodoLista(Palabra unaPalabra)
    {
        palabra = unaPalabra;
        siguiente = null;
    }
    
    /*
     * Coloca o cambia una palabra
     * @param unaPalabra
     */
    public void setPalabraReservada(Palabra unaPalabra) 
    {
        palabra = unaPalabra;
    }
    
    /*
     * Devuelve la palabra
     * @return palabra
     */
    public Palabra getPalabraReservada() 
    {
        return palabra;
    }
    
    /*
     * Coloca o cambia un NodoLista
     * @param elSiguiente
     */
    public void setSiguiente(NodoLista elSiguiente)
    {
        siguiente = elSiguiente;
    }
    
    /*
     * Devuleve el siguiente nodo
     * @return siguiente
     */
    public NodoLista getSiguiente() 
    {
        return siguiente;
    }
}