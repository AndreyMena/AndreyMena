
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
     * Constructor for objects of class Nodo
     */
    public NodoLista(Palabra unaPalabra)
    {
        palabra = unaPalabra;
        siguiente = null;
    }

    public void setPalabraReservada(Palabra unaPalabra) 
    {
        palabra = unaPalabra;
    }
    
    public Palabra getPalabraReservada() 
    {
        return palabra;
    }
    
    public void setSiguiente(NodoLista elSiguiente)
    {
        siguiente = elSiguiente;
    }
    
    public NodoLista getSiguiente() 
    {
        return siguiente;
    }
}