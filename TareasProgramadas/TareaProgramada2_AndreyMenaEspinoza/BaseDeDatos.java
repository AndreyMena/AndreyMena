
/**
 * Programación1
 * TareaProgramada2
 * @author (AndreyMenaEspinoza Carné: C04740)
 * @version (1.1) 
 * Esta clase contiene las palabras reservadas mas comunes que seran colocadas en los nodos de la lista enlazada.
 */
public class BaseDeDatos
{
    private PalabraReservada[] baseDeDatos;
    public BaseDeDatos()
    {
        baseDeDatos = new PalabraReservada[51];
        this.llenarBaseDeDatos();
    }
    
    public void llenarBaseDeDatos() 
    {
        //DATOS PRIMITIVOS
        baseDeDatos[0] = new PalabraReservada("byte");
        baseDeDatos[1] = new PalabraReservada("short");
        baseDeDatos[2] = new PalabraReservada("int");
        baseDeDatos[3] = new PalabraReservada("long");
        baseDeDatos[4] = new PalabraReservada("float");
        baseDeDatos[5] = new PalabraReservada("double");
        baseDeDatos[6] = new PalabraReservada("boolean");
        baseDeDatos[7] = new PalabraReservada("char");
        //CLASES COMUNES
        baseDeDatos[8] = new PalabraReservada("String");
        baseDeDatos[9] = new PalabraReservada("ArrayList");
        baseDeDatos[10] = new PalabraReservada("Random");
        baseDeDatos[11] = new PalabraReservada("new");
        //OPERADORES
        baseDeDatos[12] = new PalabraReservada("+");
        baseDeDatos[13] = new PalabraReservada("-");
        baseDeDatos[14] = new PalabraReservada("*");
        baseDeDatos[15] = new PalabraReservada("/");
        baseDeDatos[16] = new PalabraReservada("%");
        baseDeDatos[17] = new PalabraReservada("++");
        baseDeDatos[18] = new PalabraReservada("!");
        baseDeDatos[19] = new PalabraReservada("==");
        baseDeDatos[20] = new PalabraReservada("!=");
        baseDeDatos[21] = new PalabraReservada(">");
        baseDeDatos[22] = new PalabraReservada("<");
        baseDeDatos[23] = new PalabraReservada(">=");
        baseDeDatos[24] = new PalabraReservada("<=");
        baseDeDatos[25] = new PalabraReservada("&&");
        baseDeDatos[26] = new PalabraReservada("||");
        //OTROS
        baseDeDatos[27] = new PalabraReservada("return");
        baseDeDatos[28] = new PalabraReservada("import");
        baseDeDatos[29] = new PalabraReservada("final");
        baseDeDatos[30] = new PalabraReservada("null");
        baseDeDatos[31] = new PalabraReservada("void");
        baseDeDatos[32] = new PalabraReservada("public");
        baseDeDatos[33] = new PalabraReservada("private");
        baseDeDatos[34] = new PalabraReservada("class");
        baseDeDatos[35] = new PalabraReservada("{");
        baseDeDatos[36] = new PalabraReservada("}");
        baseDeDatos[37] = new PalabraReservada("(");
        baseDeDatos[38] = new PalabraReservada(")");
        baseDeDatos[39] = new PalabraReservada("[");
        baseDeDatos[40] = new PalabraReservada("]");
        baseDeDatos[41] = new PalabraReservada(";");
        //SENTENCIAS DE CONTROL
        baseDeDatos[42] = new PalabraReservada("if");
        baseDeDatos[43] = new PalabraReservada("else");
        baseDeDatos[44] = new PalabraReservada("while");
        baseDeDatos[45] = new PalabraReservada("do");
        baseDeDatos[46] = new PalabraReservada("for");
        baseDeDatos[47] = new PalabraReservada("try");
        baseDeDatos[48] = new PalabraReservada("catch");
        baseDeDatos[49] = new PalabraReservada("break");
        baseDeDatos[50] = new PalabraReservada("switch");
    }
    
    public PalabraReservada getPalabraReservada(int i){
        return baseDeDatos[i];
    }
}
