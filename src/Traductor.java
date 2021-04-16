/***
 * @author Gabriel Alejandro Vicente Lorenzo 20498
 */
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
import java.util.Set;
public class Traductor {
    /***
     * Instancias necesarias para que la Calculadora_mega funcione. Van desde objetos de otras clases a estructuras.
     */
    ArrayList<Data> almacen = new ArrayList<Data>();
    /***
     * Calculo para analizar la oracion a traducir
     * @param expresion traduccion a realizar
     * @param Alfa idioma origen
     * @param Omega idioma destino
     * @return traduccion final
     */
    public String Calculo(String expresion,int Alfa,int Omega){



        /***
         * Separa la expresion a traducir
         */

        String traduccion = "hola";

        String[] expresion_separada = expresion.toLowerCase().split(" ");

        ArrayList<String> Cadena = new ArrayList<String>();

        for (int n = 0; n <expresion_separada.length; n++) {

            Cadena.add(String.valueOf(expresion_separada[n]));
        }

        for (int i = 0; i < Cadena.size(); i++){
            if(Cadena.get(i).equals(" ")){
                Cadena.remove(i);
            }
        }

        for (int i =0;i<Cadena.size();i++){
            System.out.println(Cadena.get(i));
        }
        System.out.println();

        /***
         * Se lee el archivo de diccionario y se hace el analisis de su data
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


            }
        }catch(Exception e){
            System.out.println("archivo no encontrado");
        }

        return traduccion;
    }
}
