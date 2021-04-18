import com.sun.nio.sctp.Association;

/***
 * @author Gabriel Alejandro Vicente Lorenzo 20498
 */
public class BinaryTree {

    Node root;

    /***
     *
     * @param palabra llave del arbol
     * @param traducciones data sobre las traducciones que le corresponden
     */
    public void agregarNodo(int palabra, Data traducciones) {

        Node nuevoNodo = new Node(palabra, traducciones);

        if (root == null) {
            root = nuevoNodo;
        } else {

            Node NodoActual = root;
            Node padres;

            while (true) {
                padres = NodoActual;
                if (palabra < NodoActual.palabra) {

                    NodoActual = NodoActual.izquierda;
                    if (NodoActual == null) {
                        padres.izquierda = nuevoNodo;
                        return; // All Done
                    }

                } else {
                    NodoActual = NodoActual.derecha;
                    if (NodoActual == null) {
                        padres.derecha = nuevoNodo;
                        return;
                    }
                }
            }
        }
    }


    public void recorridoINO(Node NodoActual) {
        if (NodoActual != null) {
            recorridoINO(NodoActual.izquierda);
            System.out.println(NodoActual);
            recorridoINO(NodoActual.derecha);
        }
    }

    public Node encontrar(int palabra) {

        Node NodoActual = root;

        while (NodoActual.palabra != palabra) {
            if (palabra < NodoActual.palabra) {
                NodoActual = NodoActual.izquierda;
            } else {
                NodoActual = NodoActual.derecha;
            }
            if (NodoActual == null)
                return null;
        }

        return NodoActual;

    }
}
