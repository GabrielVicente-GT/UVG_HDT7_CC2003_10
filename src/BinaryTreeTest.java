import static org.junit.jupiter.api.Assertions.*;

/***
 * Pruebas unitarias
 */
class BinaryTreeTest {
    /***+
     * prueba unificada de encontrar nodo y añadir nodo para facilitar el uso.
     */
    @org.junit.jupiter.api.Test
    void agregarNodo() {
        Data prueba = new Data();
        prueba.MegaSetter("Traduccion_1","Traduccion_2","Traduccion_3");
        Tools herramienta = new Tools();
        Tools herramienta_2 = new Tools();
        BinaryTree arbol = new BinaryTree();
        arbol.agregarNodo(herramienta.StringToNum(prueba.MegaGetter(0)),prueba);
        assertEquals("Traduccion_1",arbol.encontrar(herramienta_2.StringToNum("Traduccion_1")).traducciones.MegaGetter(0));

    }


}