class ListaDoble  {
    private NodoDoble primero;
    private NodoDoble ultimo;

    public ListaDoble() {
        primero = null;
        ultimo = null;
    }

    public NodoDoble getPrimero() {
        return primero;
    }

    public NodoDoble getUltimo() {
        return ultimo;
    }

    public boolean estarVacia() {
        boolean resultado = false;
        if (primero == null) {
            resultado = true;
        }
        return resultado;
    }

    public String toStringDerechoReves() {
        String resultado = "Al derecho:\n";
        NodoDoble nodoActual = primero;
        while (nodoActual != null) {
            resultado += nodoActual.getEntero() +"\n";
            nodoActual = nodoActual.getSiguiente();
        }

        resultado += "Al revés:\n";
        nodoActual = ultimo;
        while (nodoActual != null) {
            resultado += nodoActual.getEntero() +"\n";
            nodoActual = nodoActual.getAnterior();
        }

        return resultado;
    }

    // PREGUNTA 3 DEL EXAMEN
    public void insertarPenultimo(int elEntero) {

    }

}