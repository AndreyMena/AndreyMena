import javax.swing.JOptionPane;
import javax.swing.JTextArea;
/**
 * Programación1
 * Evaluacion1
 * Esta clase es una modificacion leve de la creada por Andrey Mena Espinoza y Moises Arias Grillo para la tarea programada1.
 * @author AndreyMenaEspinoza Carné: C04740, MoisesAriasGrillo Carne: C08789
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
     * Muestra como jugar al juego
     * @param elMensaje
     */
    public void mostrarAyuda(String elMensaje)
    {
        this.showMessageDialog(null, elMensaje, TITULO, PLAIN_MESSAGE);
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
     * Pide un numero entero menor de 2 digitos.
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
                this.showMessageDialog(null, "Por favor digite un numero mayor o igual de 2 y menor de dos digitos", TITULO, PLAIN_MESSAGE);
                verificacion = false;
            }else{
                if (tamano == 1) {
                    if (resultado.charAt(0)=='2'||resultado.charAt(0)=='3'||resultado.charAt(0)=='4'||resultado.charAt(0)=='5'||resultado.charAt(0)=='6'||resultado.charAt(0)=='7'||resultado.charAt(0)=='8'||resultado.charAt(0)=='9'){
                        verificacion = true;                    
                    }else{
                        this.showMessageDialog(null, "Por favor digite un numero mayor o igual de 2 y menor de dos digitos", TITULO, PLAIN_MESSAGE);
                        verificacion = false;
                    }  
                }
                if (tamano == 2) {
                    if (resultado.charAt(0)=='0'||resultado.charAt(0)=='1'||resultado.charAt(0)=='2'||resultado.charAt(0)=='3'||resultado.charAt(0)=='4'||resultado.charAt(0)=='5'||resultado.charAt(0)=='6'||resultado.charAt(0)=='7'||resultado.charAt(0)=='8'||resultado.charAt(0)=='9'){
                        if (resultado.charAt(1)=='0'||resultado.charAt(1)=='1'||resultado.charAt(1)=='2'||resultado.charAt(1)=='3'||resultado.charAt(1)=='4'||resultado.charAt(1)=='5'||resultado.charAt(1)=='6'||resultado.charAt(1)=='7'||resultado.charAt(1)=='8'||resultado.charAt(1)=='9') { 
                            verificacion = true;
                        }
                    }else{
                        this.showMessageDialog(null, "Por favor digite un numero mayor o igual de 2 y menor de dos digitos", TITULO, PLAIN_MESSAGE);
                        verificacion = false;
                    }  
                }
            }
        } while (verificacion == false || resultado==null);
        resultadoFinal = Integer.parseInt(resultado);
        return resultadoFinal;
    }
    
    /*
     * Pide un numero entero menor de 2 digitos.
     * @param mensaje
     * @return resultadoFinal
     */
    public int pedirNumeroIntento(String mensaje)
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
                this.showMessageDialog(null, "Por favor digite un numero que no sea mayor de dos digitos", TITULO, PLAIN_MESSAGE);
                verificacion = false;
            }else{
                if (tamano == 1) {
                    if (resultado.charAt(0)=='0'||resultado.charAt(0)=='1'||resultado.charAt(0)=='2'||resultado.charAt(0)=='3'||resultado.charAt(0)=='4'||resultado.charAt(0)=='5'||resultado.charAt(0)=='6'||resultado.charAt(0)=='7'||resultado.charAt(0)=='8'||resultado.charAt(0)=='9'){
                        verificacion = true;                    
                    }else{
                        this.showMessageDialog(null, "Por favor digite un numero que no sea mayor de dos digitos", TITULO, PLAIN_MESSAGE);
                        verificacion = false;
                    }  
                }
                if (tamano == 2) {
                    if (resultado.charAt(0)=='0'||resultado.charAt(0)=='1'||resultado.charAt(0)=='2'||resultado.charAt(0)=='3'||resultado.charAt(0)=='4'||resultado.charAt(0)=='5'||resultado.charAt(0)=='6'||resultado.charAt(0)=='7'||resultado.charAt(0)=='8'||resultado.charAt(0)=='9'){
                        if (resultado.charAt(1)=='0'||resultado.charAt(1)=='1'||resultado.charAt(1)=='2'||resultado.charAt(1)=='3'||resultado.charAt(1)=='4'||resultado.charAt(1)=='5'||resultado.charAt(1)=='6'||resultado.charAt(1)=='7'||resultado.charAt(1)=='8'||resultado.charAt(1)=='9') { 
                            verificacion = true;
                        }
                    }else{
                        this.showMessageDialog(null, "Por favor digite un numero que no sea mayor de dos digitos", TITULO, PLAIN_MESSAGE);
                        verificacion = false;
                    }  
                }
            }
        } while (verificacion == false || resultado==null);
        resultadoFinal = Integer.parseInt(resultado);
        return resultadoFinal;
    }

    /*
     * Muestra el trablero
     * @param tablero
     * @param lasOpciones
     * @return resultado
     */
    public int mostrarJuegoConOpciones(JTextArea juego,String[] lasOpciones)
    {
        int resultado;
        resultado = this.showOptionDialog(null, juego, TITULO, DEFAULT_OPTION, PLAIN_MESSAGE, null, lasOpciones, null);
        return resultado;
    }
  
    /*
     * Muestra el ganador
     * @param elMensaje
     * @param lasOpciones
     * @return resultado
     */
    public int mostrarGanador(String elMensaje,String[] lasOpciones)
    {
        int resultado;
        resultado = this.showOptionDialog(null, elMensaje, TITULO, DEFAULT_OPTION, PLAIN_MESSAGE, null, lasOpciones, null);
        return resultado;
    }
}