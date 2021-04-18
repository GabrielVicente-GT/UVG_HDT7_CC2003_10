/***
 * @author Gabriel Alejandro Vicente Lorenzo 20498
 */
import java.io.*;
import java.util.ArrayList;

/***
 * Clase que tiene el metodo de traduce la oracion
 */
public class Traductor {

    /***
     * Calculo para analizar la oracion a traducir
     * @param expresion traduccion a realizar
     * @param Alfa idioma origen
     * @param Omega idioma destino
     * @return traduccion final
     */
    public String Calculo(String expresion,int Alfa,int Omega){
        /***
         * Instancias necesarias para que la Calculadora_mega funcione. Van desde objetos de otras clases a estructuras.
         */
        ArrayList<String> almacen = new ArrayList<String>();
        ArrayList<Data> almacen_data = new ArrayList<Data>();

        /***
         * Instancias de los arboles que contienen las traducciones
         */
        BinaryTree Arbol =  new BinaryTree();


        /***
         * Separa la expresion a traducir
         */

        String traduccion = "";

        String[] expresion_separada = expresion.replace(".","").toLowerCase().split(" ");

        ArrayList<String> Cadena = new ArrayList<String>();

        for (int n = 0; n <expresion_separada.length; n++) {

            Cadena.add(String.valueOf(expresion_separada[n]));
        }

        for (int i = 0; i < Cadena.size(); i++){
            if(Cadena.get(i).equals(" ")){
                Cadena.remove(i);
            }
        }

        /***
         * Se lee el archivo que contiene las traducciones en formato... ingles,espanol,frances (todo junto y sin espacios)
         */

        try{
            FileReader r = new FileReader("C:\\Users\\Gabriel Vicente\\Desktop\\HDT7\\src\\diccionario.txt");
            BufferedReader buffer = new BufferedReader(r);

            String temp ="";

            while(temp!=null){
                temp = buffer.readLine();
                if(temp == null){
                    break;
                }
                almacen.add(temp);

            }
        }catch(Exception e){
            System.out.println("archivo no encontrado");
        }
        /***
         * De lo encontrado en el diccionario se le hace un split y se agrega al arbol.
         */

        for (int i = 0; i<almacen.size();i++){
            String[] temporal = almacen.get(i).split(",");
            Data dato =  new Data();
            dato.MegaSetter(temporal[0].toLowerCase(),temporal[1].toLowerCase(),temporal[2].toLowerCase());
            almacen_data.add(dato);
        }
        /***
         * Se agrega segun el idioma seleccionado
         */

        for (int i = 0;i<almacen_data.size();i++){
            Tools tuerca =  new Tools();
            int prueba =tuerca.StringToNum(almacen_data.get(i).MegaGetter(Alfa-1));
            Arbol.agregarNodo(prueba,almacen_data.get(i));
        }
        /***
         * se recorre el String que contiene la oracion a traducir y si no se encuentra se le agregan asteriscos
         */
        for (int a =0;a<Cadena.size();a++){
            Tools tuerca =  new Tools();
            int prueba =tuerca.StringToNum(Cadena.get(a));
            try{
                traduccion = traduccion +Arbol.encontrar(prueba).traducciones.MegaGetter(Omega-1)+" ";
            }catch(Exception e){
                traduccion = traduccion +"*"+Cadena.get(a)+"*"+" ";
            }
        }
        System.out.println("\nRecorrido inorder del arbol con ls relaciones\n");
        Arbol.recorridoINO(Arbol.root);
        System.out.println();

        return traduccion;
    }
}
