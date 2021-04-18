/***
 * @author Gabriel Alejandro Vicente Lorenzo 20498
 */
import java.util.Map;

public class Association<K,V>{

    protected K theKey; // the key of the key-value pair

    protected V theValue; // the value of the key-value pair

    /***
     * Constructor con llave y valor
     * @param key llave
     * @param value data
     */
    public Association(K key, V value)
    {

        theKey = key;
        theValue = value;
    }

    /***
     * constructor solo con la llave con data nula
     * @param key
     */
    public Association(K key)
    {
        this(key,null);
    }

    /***
     * compara si ambos valores son iguales o no, de no ser asi da true
     * @param other objeto a comparar
     * @return false si no son iguales, true si son iguales.
     */
    public boolean equals(Object other)
    {
        Association otherAssoc = (Association)other;
        return getKey().equals(otherAssoc.getKey());
    }

    /***
     *
     * @return regresa el Hashcode de la llave
     */
    public int hashCode()
    {
        return getKey().hashCode();
    }

    /***
     *
     * @return devuelve el valor
     */
    public V getValue()
    {
        return theValue;
    }

    /***
     *
     * @return devuelve la llave
     */
    public K getKey()
    {
        return theKey;
    }

    /***
     *
     * @param value cambia el valor
     * @return void
     */
    public V setValue(V value)
    {
        V oldValue = theValue;
        theValue = value;
        return oldValue;
    }

    /***
     * forma en que devuelve la llave y data asociado
     * @return
     */
    public String toString()
    {
        StringBuffer s = new StringBuffer();
        s.append("<Association: "+getKey()+"="+getValue()+">");
        return s.toString();
    }

}
