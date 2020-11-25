
/**
 * Examen 2 - CI0112 - Programación 1
 * @author Andrey Mena Espinoza C04740 y Profesora Maureen Murillo
 * @version 1.1
 */
class NodoDoble {
    private int entero;
    private NodoDoble siguiente;
    private NodoDoble anterior;

    public NodoDoble(int elEntero) {
        entero = elEntero;
        siguiente = null;
        anterior = null;
    }

    public int getEntero() {
        return entero;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setEntero(int elEntero) {
        entero = elEntero;
    }

    public void setSiguiente(NodoDoble elSiguiente) {
        siguiente = elSiguiente;
    }

    public void setAnterior(NodoDoble elAnterior) {
        anterior = elAnterior;
    }
}