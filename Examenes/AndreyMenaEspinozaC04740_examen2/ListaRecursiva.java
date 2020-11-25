
/**
 * Examen 2 - CI0112 - Programación 1
 * @author Andrey Mena Espinoza C04740 y Profesora Maureen Murillo
 * @version 1.1
 */
class ListaRecursiva  {
    private NodoRecursivo primero;
    
    public ListaRecursiva() {
        primero = null;
    }
    
    public NodoRecursivo getPrimero() {
        return primero;
    }

    public boolean estarVacia() {
        boolean resultado = false;
        if (primero == null) {
            resultado = true;
        }
        return resultado;
    }

    public void insertarFinal(int elEntero) {
        if (primero == null) {
            NodoRecursivo nodoNuevo = new NodoRecursivo(elEntero);
            primero = nodoNuevo;
        }else{
            primero.getSiguiente().insertarFinal(elEntero);
        }
    }

    public String toString() {
        String resultado = "";
        if (!this.estarVacia()) {
            resultado = primero.getEntero() +"\n";
            resultado += primero.getSiguiente().toString();
        }
        return resultado;
    }

    // PREGUNTA 1 DEL EXAMEN
    public int buscarCuantos(int elBuscado) {
        int resultado = 0;
        if (primero!=null) {
            if (primero.getEntero() == elBuscado) {
                resultado += primero.getSiguiente().buscarCuantos(elBuscado)+1;
            }else{
                resultado += primero.getSiguiente().buscarCuantos(elBuscado);
            }
        }
        return resultado;
    }
    
    // PREGUNTA 2 DEL EXAMEN
    public boolean tenerSoloPositivos() {
        boolean resultado = true;
        boolean subResultado = true;
        if (primero!=null) {
            if (primero.getEntero() >= 0) {
                resultado = true;
                subResultado = primero.getSiguiente().tenerSoloPositivos();
                if (subResultado==false) {
                    resultado = false;
                }
            }else{
                resultado = false;
            }
        }
        return resultado;
    }
}