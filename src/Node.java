/***
 * @author Gabriel Alejandro Vicente Lorenzo 20498
 */
public class Node {
    /***
     * instancias necesarias para el nodo (asociacion, llave, data y referencia al nodo izquierdo y derecho)
     */
    Association<Integer,String> asc = new Association<Integer,String>(1);
    int palabra;
    Data traducciones;

    Node izquierda;
    Node derecha;

    /***
     *
     * @param palabra llave constructora de la palabra
     * @param traducciones data de traducciones
     */
    Node(int palabra, Data traducciones){
        this.palabra=palabra;
        this.traducciones=traducciones;
    }
    public String toString(){
        return "esta es la llave "+ palabra+" Estas son las Traducciones "+traducciones;
    }
}
