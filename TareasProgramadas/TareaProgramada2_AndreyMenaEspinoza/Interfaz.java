import javax.swing.JOptionPane;
import javax.swing.JTextArea;
/**
 * Programación1
 * TareaProgramada2
 * @author (AndreyMenaEspinoza Carné: C04740)
 * @version (1.1) 
 * Esta clase modela una interfaz.
 */

public class Interfaz extends JOptionPane
{
    private final String TITULO;    
    /*
     * @param elTitulo
     */
    public Interfaz(String elTitulo)
    {
        TITULO = elTitulo;
    }

    /*
     * Pide una opcion
     * @param lasOpciones
     * @param elMensaje
     * @return resultado
     */
    public int pedirOpcion(String[] lasOpciones, String elMensaje)
    {
        int resultado;
        resultado = this.showOptionDialog(null, elMensaje, TITULO, DEFAULT_OPTION, PLAIN_MESSAGE, null, lasOpciones, null);
        return resultado;
    }

    /*
     * Muestra los creditos
     * @param CREDITOS
     */
    public void mostrarCreditos(String CREDITOS)
    {
        this.showMessageDialog(null, CREDITOS, TITULO, PLAIN_MESSAGE);
    }

    /*
     * Muestra como funciona el programa.
     * @param elMensaje
     */
    public void mostrarAyuda(String elMensaje)
    {
        this.showMessageDialog(null, elMensaje, TITULO, PLAIN_MESSAGE);
    }
    
    public String pedirNombreDeArchivo(String elMensaje) 
    {
        String nombreDeArchivo = this.showInputDialog(null, elMensaje);
        return nombreDeArchivo;
    }

    /*
     * Dice un mensaje comun
     * @param mensaje
     */
    public void decirMensaje(String mensaje)
    {
        this.showMessageDialog(null, mensaje, TITULO, PLAIN_MESSAGE);
    }

    /*
     * Pide un numero
     * @param mensaje
     * @return resultadoFinal
     */
    public int pedirNumero(String mensaje)
    {
        String resultado;
        boolean verificacion = true;
        int resultadoFinal;
        do {
            resultado = this.showInputDialog(null, mensaje);             
            int tamano;
            if (resultado == null) {
                resultado = "";
            }
            tamano = resultado.length();
            if (tamano == 0) {
                verificacion = false;
            }
            if (tamano > 2) {
                this.showMessageDialog(null, "Por favor digite un numero mayor que 0 y no mayor de dos digitos", TITULO, PLAIN_MESSAGE);
                verificacion = false;
            }else{
                if (tamano == 1) {
                    if (resultado.charAt(0)=='1'||resultado.charAt(0)=='2'||resultado.charAt(0)=='3'||resultado.charAt(0)=='4'||resultado.charAt(0)=='5'||resultado.charAt(0)=='6'||resultado.charAt(0)=='7'||resultado.charAt(0)=='8'||resultado.charAt(0)=='9'){
                        verificacion = true;
                    
                    }else{
                        this.showMessageDialog(null, "Por favor digite un numero mayor que 0 y no mayor de dos digitos", TITULO, PLAIN_MESSAGE);
                        verificacion = false;
                    }  
                }
                if (tamano == 2) {
                    if (resultado.charAt(0)=='1'||resultado.charAt(0)=='2'||resultado.charAt(0)=='3'||resultado.charAt(0)=='4'||resultado.charAt(0)=='5'||resultado.charAt(0)=='6'||resultado.charAt(0)=='7'||resultado.charAt(0)=='8'||resultado.charAt(0)=='9'){
                        if (resultado.charAt(1)=='0'||resultado.charAt(1)=='1'||resultado.charAt(1)=='2'||resultado.charAt(1)=='3'||resultado.charAt(1)=='4'||resultado.charAt(1)=='5'||resultado.charAt(1)=='6'||resultado.charAt(1)=='7'||resultado.charAt(1)=='8'||resultado.charAt(1)=='9') { 
                            verificacion = true;
                        }else{
                            
                        }
                    }else{
                        this.showMessageDialog(null, "Por favor digite un numero mayor que 0 y no mayor de dos digitos", TITULO, PLAIN_MESSAGE);
                        verificacion = false;
                    }  
                }
            }
        } while (verificacion == false || resultado==null);
        resultadoFinal = Integer.parseInt(resultado);
        return resultadoFinal;
    }
}