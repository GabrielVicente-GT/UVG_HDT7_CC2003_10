public class BinaryTree {
    Node root;
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


    public void inOrderTraverseTree(Node NodoActual) {

        if (NodoActual != null) {
            inOrderTraverseTree(NodoActual.izquierda);

            System.out.println(NodoActual);

            inOrderTraverseTree(NodoActual.derecha);

        }

    }


    public Node findNode(int palabra) {

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
