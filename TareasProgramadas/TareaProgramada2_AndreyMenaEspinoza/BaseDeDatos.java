
/**
 * Programación1
 * TareaProgramada2
 * @author (AndreyMenaEspinoza Carné: C04740)
 * @version (1.1) 
 * Esta clase contiene las palabras reservadas mas comunes que seran colocadas en los nodos de la lista enlazada.
 */
public class BaseDeDatos
{
    private Palabra[] baseDeDatos;
    /**
     * Inicializa la Base de Datos con sus palabras reservadas.
     */
    public BaseDeDatos()
    {
        baseDeDatos = new Palabra[54];
        this.llenarBaseDeDatos();
    }
    
    /*
     * Este metodo llena la Base De Datos.
     */
    public void llenarBaseDeDatos() 
    {
        //DATOS PRIMITIVOS
        baseDeDatos[0] = new Palabra("byte");
        baseDeDatos[1] = new Palabra("short");
        baseDeDatos[2] = new Palabra("int");
        baseDeDatos[3] = new Palabra("long");
        baseDeDatos[4] = new Palabra("float");
        baseDeDatos[5] = new Palabra("double");
        baseDeDatos[6] = new Palabra("boolean");
        baseDeDatos[7] = new Palabra("char");
        //CLASES COMUNES
        baseDeDatos[8] = new Palabra("String");
        baseDeDatos[9] = new Palabra("ArrayList");
        baseDeDatos[10] = new Palabra("Random");
        baseDeDatos[11] = new Palabra("new");
        //OPERADORES
        baseDeDatos[12] = new Palabra("+");
        baseDeDatos[13] = new Palabra("-");
        baseDeDatos[14] = new Palabra("*");
        baseDeDatos[15] = new Palabra("/");
        baseDeDatos[16] = new Palabra("%");
        baseDeDatos[17] = new Palabra("++");
        baseDeDatos[18] = new Palabra("!");
        baseDeDatos[19] = new Palabra("==");
        baseDeDatos[20] = new Palabra("!=");
        baseDeDatos[21] = new Palabra("=");
        baseDeDatos[22] = new Palabra("+=");
        baseDeDatos[23] = new Palabra(">");
        baseDeDatos[24] = new Palabra("<");
        baseDeDatos[25] = new Palabra(">=");
        baseDeDatos[26] = new Palabra("<=");
        baseDeDatos[27] = new Palabra("&&");
        baseDeDatos[28] = new Palabra("||");
        //OTROS
        baseDeDatos[29] = new Palabra("return");
        baseDeDatos[30] = new Palabra("import");
        baseDeDatos[31] = new Palabra("final");
        baseDeDatos[32] = new Palabra("null");
        baseDeDatos[33] = new Palabra("void");
        baseDeDatos[34] = new Palabra("public");
        baseDeDatos[35] = new Palabra("private");
        baseDeDatos[36] = new Palabra("class");
        baseDeDatos[37] = new Palabra("extends");
        baseDeDatos[38] = new Palabra("{");
        baseDeDatos[39] = new Palabra("}");
        baseDeDatos[40] = new Palabra("(");
        baseDeDatos[41] = new Palabra(")");
        baseDeDatos[42] = new Palabra("[");
        baseDeDatos[43] = new Palabra("]");
        baseDeDatos[44] = new Palabra(";");
        //SENTENCIAS DE CONTROL
        baseDeDatos[45] = new Palabra("if");
        baseDeDatos[46] = new Palabra("else");
        baseDeDatos[47] = new Palabra("while");
        baseDeDatos[48] = new Palabra("do");
        baseDeDatos[49] = new Palabra("for");
        baseDeDatos[50] = new Palabra("try");
        baseDeDatos[51] = new Palabra("catch");
        baseDeDatos[52] = new Palabra("break");
        baseDeDatos[53] = new Palabra("switch");
    }
    
    /*
     * Devuelva la palabra en la posicion especificada.
     * @param i la posicion que especifica la palabra reservada.
     * @return baseDeDatos[i] un objeto de tipo palabra.
     */
    public Palabra getPalabraReservada(int i){
        return baseDeDatos[i];
    }
}
