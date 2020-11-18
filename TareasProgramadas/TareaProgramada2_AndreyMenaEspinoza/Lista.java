
/**
 * Programación1
 * TareaProgramada2
 * @author (AndreyMenaEspinoza Carné: C04740)
 * @version (1.1) 
 * Esta clase representa una lista enlazada que contiene nodos con palabras reservadas.
 */
public class Lista
{
    private NodoLista primero;
    /**
     * Inicializa la lista y su atributo
     */
    public Lista()
    {
        primero = null;
    }
    
    /*
     * Este metodo agrega una palabra reservada nueva a la lista.
     * @param nueva
     */
    public void agregarPalabraReservada(Palabra nueva)
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
    
    /*
     * Este metodo busca un palabra en la lista.
     * @param palabra
     * @return laPalabra
     */
    public Palabra buscar(String palabra)
    {
        NodoLista aux = primero;
        while(!aux.getPalabraReservada().getPalabra().equals(palabra)&&aux.getSiguiente()!=null) {
            aux = aux.getSiguiente();
        }
        Palabra laPalabra = new Palabra("");
        if (aux.getSiguiente()==null&&!aux.getPalabraReservada().getPalabra().equals(palabra)) {
        }else{
            laPalabra = aux.getPalabraReservada();
        }
        return laPalabra;
    }
}