/***
 * @author Gabriel Alejandro Vicente Lorenzo 20498
 */
public class Node {
    Association<Integer,String> asc = new Association<Integer,String>(1);
    int palabra;
    Data traducciones;

    Node izquierda;
    Node derecha;

    Node(int palabra, Data traducciones){
        this.palabra=palabra;
        this.traducciones=traducciones;
    }
    public String toString(){
        return "esta es la llave "+ palabra+" Estas son las Traducciones "+traducciones;
    }
}
