/**
 * Programación1
 * Evaluacion1
 * @author AndreyMenaEspinoza Carné: C04740
 * @version 1.1
 * Esta clase controla todo el programa.
 */
public class Controlador
{
    private final String TITULO = "MaDi";
    private final String MENSAJE1 = "Escoja un opcion";
    private final String MENSAJE2 = "Escoja el tamaño de filas y columnas que tendrá su tablero\n"
                                    +"Nota: Tiene que ser mayor o igual de 2 y menor de dos digitos";
    private final String[] MENU_OPCIONES = {"Jugar", "Ayuda", "Ver creditos", "Salir"};
    private final String MENSAJE_OPCION2 = "";
    private final String MENSAJE_AYUDA = "";
    private final String CREDITOS = "Creador:\n Andrey Mena Espinoza.";
    private final String MENSAJE_GANADOR = "Has ganado";
    private final String[] PANTALLA_GANADOR = {"Salir"}; 
    private Arbitro arbitro;
    private Interfaz interfaz;  
    private Tablero tablero; 

    public Controlador()
    {        
        arbitro = new Arbitro(TITULO);
        interfaz = new Interfaz(TITULO);
    }

    /*
     * Inicia el juego con sus opciones y dirige al usuario dependiendo de su eleccion.
     */
    public void iniciar()
    {
        int opcion;
        int opcion2;
        do {
            opcion = interfaz.pedirOpcion(MENU_OPCIONES, MENSAJE1);
            switch (opcion) {
                case 0: 
                do {                    
                    opcion2 = interfaz.pedirNumero(MENSAJE2);
                    if (opcion2 == 0) {
                        interfaz.decirMensaje("El numero tiene que ser mayor o igual de 2 y menor de dos digitos");
                    }
                }while (opcion2 < 2);
                tablero = new Tablero(opcion2);
                break;                
                case 1: 
                interfaz.mostrarAyuda(MENSAJE_AYUDA);
                break;
                case 2:
                interfaz.mostrarCreditos(CREDITOS);
                break;
            }
        }while(opcion == 0 || opcion == 1 || opcion == 2);
    }  

    /*
     * Metodo principal para iniciar TODO el juego en su respectivo orden.
     * @param parametros
     */
    public static void main(String[] parametros)
    {
        Controlador controlador;
        controlador = new Controlador();
        controlador.iniciar();
    }
}