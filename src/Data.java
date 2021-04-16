
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
            case 1:
                retorno = ingles;
                break;
            case 2:
                retorno = espanol;
                break;
            case 3:
                retorno = frances;
                break;
        }
        return retorno;
    }

}
