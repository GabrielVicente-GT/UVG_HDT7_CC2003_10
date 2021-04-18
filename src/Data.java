/***
 * @author Gabriel Alejandro Vicente Lorenzo 20498
 */
public class Data {
    /***
     * Propiedades que corresponden a las traducciones
     */
    public String ingles = "";
    public String espanol = "";
    public String frances = "";

    /***
     * modifican los valores de las propiedades
     * @param t1
     * @param t2
     * @param t3
     */
    public void MegaSetter(String t1, String t2, String t3){
        ingles = t1;
        espanol = t2;

        frances = t3;
    }

    /***
     * dependiendo de la int ingresada devuelve el valor de las propiedades
     * @param opcion depende del return que se necesite;
     * @return String de las propiedades
     */
    public String MegaGetter(int opcion){
        String retorno = "";
        switch (opcion) {
            case 0:
                retorno = ingles;
                break;
            case 1:
                retorno = espanol;
                break;
            case 2:
                retorno = frances;
                break;
        }
        return retorno;
    }

    /***
     * la forma en que escribe la informacion almacenada *no se usa de manera fija en el main*
     * @return
     */
    @Override
    public String toString() {
        return "Data{" +
                "ingles='" + ingles + '\'' +
                ", espanol='" + espanol + '\'' +
                ", frances='" + frances + '\'' +
                '}';
    }
}
