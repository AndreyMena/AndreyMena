
/**
 * Programación1
 * TareaProgramada2
 * @author (AndreyMenaEspinoza Carné: C04740)
 * @version (1.1)
 * Esta clase controla todo el programa.
 */
public class Controlador
{
    private final String TITULO = "Andrey Mena Espinoza";
    private final String MENSAJE = "Escoja una opcion";
    private final String[] MENU_OPCIONES = {"Empezar","Ayuda","Creditos","Salir"};
    private final String MENSAJE_FUNCIONAMIENTO = "Este programa analiza un analiza un archivo fuente\nde codigo en java y permite mostrar estadisticas sobre\nel mismo.";
    private final String CREDITOS = "Creador:\nAndrey Mena Espinoza.";
    private Arbitro arbitro;
    private Interfaz interfaz;
    /**
     * Inicializa el controlador con su arbitro e interfaz.
     */
    public Controlador()
    {
        arbitro = new Arbitro(TITULO);
        interfaz = new Interfaz(TITULO);
    }

    /*
     * Inicia el programa con sus opciones y dirige al usuario dependiendo de su eleccion.
     */
    public void iniciar()
    {
        int opcion;
        do {
            opcion = interfaz.pedirOpcion(MENU_OPCIONES, MENSAJE);
            switch (opcion) {
                case 0:
                arbitro.empezar();
                break;                
                case 1: 
                interfaz.mostrarAyuda(MENSAJE_FUNCIONAMIENTO);
                break;
                case 2:
                interfaz.mostrarCreditos(CREDITOS);
                break;
            }
        }while(opcion == 0 || opcion == 1 || opcion == 2);
    }  

    /*
     * Metodo principal para iniciar TODO el programa en su respectivo orden.
     * @param parametros
     */
    public static void main(String[] parametros)
    {
        Controlador controlador;
        controlador = new Controlador();
        controlador.iniciar();
    }
}