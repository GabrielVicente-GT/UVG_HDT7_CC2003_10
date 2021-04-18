public class Node {
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
