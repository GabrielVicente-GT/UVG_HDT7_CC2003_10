/***
 * @author Gabriel Alejandro Vicente Lorenzo 20498
 */
public class Data {
    /***
     * Constructor
     */
    public String ingles = "";
    public String espanol = "";
    public String frances = "";


    public void MegaSetter(String t1, String t2, String t3){
        ingles = t1;
        espanol = t2;

        frances = t3;
    }
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

    @Override
    public String toString() {
        return "Data{" +
                "ingles='" + ingles + '\'' +
                ", espanol='" + espanol + '\'' +
                ", frances='" + frances + '\'' +
                '}';
    }
}
