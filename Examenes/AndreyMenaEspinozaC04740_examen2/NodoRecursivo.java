
/**
 * Examen 2 - CI0112 - Programación 1
 * @author Andrey Mena Espinoza C04740 y Profesora Maureen Murillo
 * @version 1.1
 */
class NodoRecursivo {
    private int entero;
    private ListaRecursiva siguiente;
    
    public NodoRecursivo(int elEntero) {
        entero = elEntero;
        siguiente = new ListaRecursiva();
    }

    public int getEntero() {
        return entero;
    }

    public ListaRecursiva getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(ListaRecursiva elSiguiente) {
        siguiente = elSiguiente;
    }
    
    public void setEntero(int elEntero) {
        entero = elEntero;
    }
}