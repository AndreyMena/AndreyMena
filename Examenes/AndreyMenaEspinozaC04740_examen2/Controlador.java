
/**
 * Examen 2 - CI0112 - Programación 1
 * @author Andrey Mena Espinoza C04740 y Profesora Maureen Murillo.
 * @version 1.1
 */
public class Controlador
{
    private Interfaz interfaz;
    private ListaRecursiva listaRecursiva;
    private ListaDoble listaDoble;
    
    public Controlador() {
        interfaz = new Interfaz();
        listaRecursiva = new ListaRecursiva();
        listaDoble = new ListaDoble();
    }

    public void iniciar() {
        String menu = "Escoja una opción:\n--- Lista simple recursiva ---\n";
        menu += "1. Insertar entero\n2. Vaciar lista\n3. Mostrar lista\n4. Cuántas veces está un entero\n5. ¿Lista con solo positivos?\n";
        menu += "--- Lista doblemente enlazada ---\n";
        menu += "6. Insertar entero de penúltimo\n7. Vaciar lista\n8. Mostrar al derecho y al revés\n";
        menu += "9. Salir";
        int respuesta = 0;
        do {
            respuesta = interfaz.pedirEntero(menu);
            switch (respuesta) {
                case 1:
                    this.insertarEnRecursiva();
                    break;
                case 2:
                    listaRecursiva = new ListaRecursiva();
                    break;
                case 3:
                    interfaz.decirMensaje(listaRecursiva.toString());
                    break;
                case 4:
                    this.contarEntero();
                    break;
                case 5:
                    this.analizarSoloPositivos();
                    break;
                case 6:
                    this.insertarPenultimoEnDoble();
                    break;
                case 7:
                    listaDoble = new ListaDoble();
                    break;
                case 8:
                    interfaz.decirMensaje(listaDoble.toStringDerechoReves());
            }
        }while(respuesta != 9);
    }
    
    public void insertarEnRecursiva() {
        int dato = interfaz.pedirEntero("Escriba un entero:");
        listaRecursiva.insertarFinal(dato);
    }
    
    public void contarEntero() {
        int dato = interfaz.pedirEntero("Escriba el entero que va a buscar:");
        int total = listaRecursiva.buscarCuantos(dato);
        interfaz.decirMensaje("El número "+dato+" está "+total+" veces");
    }
    
    public void analizarSoloPositivos() {
        boolean soloPositivos = listaRecursiva.tenerSoloPositivos();
        if (soloPositivos==true) {
            interfaz.decirMensaje("La lista SI tiene solo números positivos");
        }else{
            interfaz.decirMensaje("La lista NO tiene solo números positivos");
        }
    }
    
    public void insertarPenultimoEnDoble() {
        int dato = interfaz.pedirEntero("Escriba un entero:");
        listaDoble.insertarPenultimo(dato);
    }
    
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        controlador.iniciar();
    }
}
