/***
 * @author Gabriel Alejandro Vicente Lorenzo 20498
 */
/***
 * Imports necesarios para Main
 */

import java.util.Scanner;
import java.io.*;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static  void main(String[] args){

        Traductor esperanza = new Traductor();
        Scanner scan = new Scanner(System.in);
        Vector <String> varios = new Vector<String>();
        vista view =  new vista();

        String instruccion ="";
        System.out.println("\n______________________-----------------------------------______________________");
        System.out.println("______________________---------- Traductor HDT7 ------" +
                "" +
                "---______________________");
        System.out.println("______________________-----------------------------------______________________");
        System.out.println();

        /***
         * Se lee un archivo txt (diccionario)
         */

        try{
            FileReader r = new FileReader("C:\\Users\\Gabriel Vicente\\Desktop\\HDT7\\src\\texto.txt");
            BufferedReader buffer = new BufferedReader(r);

            String temp ="";

            while(temp!=null){
                temp = buffer.readLine();
                if(temp == null){
                    break;
                }
                varios.add(temp);

            }
        }catch(Exception e){
            System.out.println("archivo no encontrado");
        }

        /***
         * Impresion de lo que hay en el archivo y se pasa la calculadora
         */

        System.out.println("Oraciones en el txt");
        System.out.println();
        for(int a =0;a<varios.size();a++){
            System.out.println(varios.get(a));
        }
        System.out.println("");

        /***
         * El usuario seleccionara el idioma origen y destino para cada oracion
         */

        int numero = 0;
        int a = 0;
        while(a<varios.size()){
            numero++;
            System.out.println(" TRADUCCION "+numero+" : \n");
            System.out.println(varios.get(a)+"\n");
            view.press_enter();
            /***
             * se elige el idioma de origen
             */

            int Alfa = view.menu_opcion("origen");
            int Omega = view.menu_opcion("destino");

            /***
             * Confirmacion de los datos ingresados
             */
            String origen = "";
            String destino = "";
            if (Alfa==1){origen="English";} else if (Alfa==2){origen="Espanol";} else if (Alfa==3){origen="Français";}

            if (Omega==1){destino="English";} else if (Omega==2){destino="Espanol";} else if (Omega==3){destino="Français";}

            System.out.println("\n Idioma origen seleccionado: "+origen);
            System.out.println(" Idioma destino seleccionado: "+destino+"\n");

            /***
             * Por cada traduccion se llama a la operacion de calculo y con los idiomas de destino y origen seleccionado se hace la traduccion
             */

            try{
                System.out.println(" ESTA ES LA TRADUCCION ---> "+esperanza.Calculo(varios.get(a),Alfa,Omega) +" ");
                System.out.println(" ESTA ES LA ORIGINAL   ---> "+varios.get(a) +" ");
                System.out.println();

            }catch(Exception e){
                System.out.println(" Error");
                System.out.println();

            }
            a++;


        }
    }

}
