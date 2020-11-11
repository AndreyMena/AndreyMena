
/**
 * Esta clase representa una lista enlazada que contiene nodos con palabras reservadas.
 * @author (AndreyMenaEspinoza) 
 * @version (1.1)
 */
public class Lista
{
    private NodoLista primero;
    public Lista()
    {
        primero = null;
    }
    
    public void agregarPalabraReservada(PalabraReservada nueva)
    {
        NodoLista nodoNuevo = new NodoLista(nueva);
        NodoLista aux = primero;
        if(primero == null) {
            primero = nodoNuevo;
        }else{
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nodoNuevo);
        }
    }
}