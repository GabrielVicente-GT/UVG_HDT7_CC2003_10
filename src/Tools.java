public class Tools {
    Tools(){

    }
    public int StringToNum(String palabra){
        int numero=0;
        String[] caracteres = palabra.split("");
        String etiqueta = "";

        for (int i=0;i<caracteres.length;i++){
            if(caracteres[i].equals("a")){
                etiqueta = etiqueta+"1";
            }else if(caracteres[i].equals("b")){
                etiqueta = etiqueta+"2";
            }else if(caracteres[i].equals("c")){
                etiqueta = etiqueta+"3";
            }else if(caracteres[i].equals("d")){
                etiqueta = etiqueta+"4";
            }else if(caracteres[i].equals("e")){
                etiqueta = etiqueta+"5";
            }else if(caracteres[i].equals("f")){
                etiqueta = etiqueta+"6";
            }else if(caracteres[i].equals("g")){
                etiqueta = etiqueta+"7";
            }else if(caracteres[i].equals("h")){
                etiqueta = etiqueta+"8";
            }else if(caracteres[i].equals("i")){
                etiqueta = etiqueta+"9";
            }else if(caracteres[i].equals("j")){
                etiqueta = etiqueta+"10";
            }else if(caracteres[i].equals("k")){
                etiqueta = etiqueta+"11";
            }else if(caracteres[i].equals("l")){
                etiqueta = etiqueta+"12";
            }else if(caracteres[i].equals("m")){
                etiqueta = etiqueta+"13";
            }else if(caracteres[i].equals("n")){
                etiqueta = etiqueta+"14";
            }else if(caracteres[i].equals("o")){
                etiqueta = etiqueta+"15";
            }else if(caracteres[i].equals("p")){
                etiqueta = etiqueta+"16";
            }else if(caracteres[i].equals("q")){
                etiqueta = etiqueta+"17";
            }else if(caracteres[i].equals("r")){
                etiqueta = etiqueta+"18";
            }else if(caracteres[i].equals("s")){
                etiqueta = etiqueta+"19";
            }else if(caracteres[i].equals("t")){
                etiqueta = etiqueta+"20";
            }else if(caracteres[i].equals("u")){
                etiqueta = etiqueta+"21";
            }else if(caracteres[i].equals("v")){
                etiqueta = etiqueta+"22";
            }else if(caracteres[i].equals("w")){
                etiqueta = etiqueta+"23";
            }else if(caracteres[i].equals("y")){
                etiqueta = etiqueta+"24";
            }else if(caracteres[i].equals("z")){
                etiqueta = etiqueta+"25";
            }else if(caracteres[i].equals("x")){
                etiqueta = etiqueta+"26";
            }
        }
        numero = (int) Long.parseLong(etiqueta);
        return numero;
    }
}
