
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
    public BaseDeDatos()
    {
        baseDeDatos = new Palabra[51];
        this.llenarBaseDeDatos();
    }
    
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
        baseDeDatos[21] = new Palabra(">");
        baseDeDatos[22] = new Palabra("<");
        baseDeDatos[23] = new Palabra(">=");
        baseDeDatos[24] = new Palabra("<=");
        baseDeDatos[25] = new Palabra("&&");
        baseDeDatos[26] = new Palabra("||");
        //OTROS
        baseDeDatos[27] = new Palabra("return");
        baseDeDatos[28] = new Palabra("import");
        baseDeDatos[29] = new Palabra("final");
        baseDeDatos[30] = new Palabra("null");
        baseDeDatos[31] = new Palabra("void");
        baseDeDatos[32] = new Palabra("public");
        baseDeDatos[33] = new Palabra("private");
        baseDeDatos[34] = new Palabra("class");
        baseDeDatos[35] = new Palabra("{");
        baseDeDatos[36] = new Palabra("}");
        baseDeDatos[37] = new Palabra("(");
        baseDeDatos[38] = new Palabra(")");
        baseDeDatos[39] = new Palabra("[");
        baseDeDatos[40] = new Palabra("]");
        baseDeDatos[41] = new Palabra(";");
        //SENTENCIAS DE CONTROL
        baseDeDatos[42] = new Palabra("if");
        baseDeDatos[43] = new Palabra("else");
        baseDeDatos[44] = new Palabra("while");
        baseDeDatos[45] = new Palabra("do");
        baseDeDatos[46] = new Palabra("for");
        baseDeDatos[47] = new Palabra("try");
        baseDeDatos[48] = new Palabra("catch");
        baseDeDatos[49] = new Palabra("break");
        baseDeDatos[50] = new Palabra("switch");
    }
    
    public Palabra getPalabraReservada(int i){
        return baseDeDatos[i];
    }
}
