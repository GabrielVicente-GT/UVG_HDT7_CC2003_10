/***************************************************************
* vista.java
* Autor: Gabriel Alejandro Vicente Lorenzo
* Carné: 20498
* Universidad del Valle de Guatemala
***************************************************************/

import java.util.Scanner;

class vista{
	Scanner scan;
	
	public vista(){
		scan = new Scanner(System.in);
	}

    /***
     * presionar para continuar
     */
    public void press_enter(){
        System.out.println("Presione para continuar...");
        scan.nextLine();
    }
	/***
	 * menu para elegir idioma
	 * @param idioma descripcion del idioma
	 * @return numero seleccionado segun el Idioma
	 */
	public int menu_opcion(String idioma){
		boolean verificador=false;
		int opcion=-1;
		do{
			System.out.println(" ---> Ingrese el idioma "+idioma);
			System.out.println("	1.  English");
			System.out.println("	2.  Espanol");
			System.out.println("	3.  Français");
			

			try{
			
				opcion = Integer.parseInt(scan.nextLine());

				
			}catch(Exception e){
				System.out.println("ese no es un numero entero");
			}
			
			if(opcion<1||opcion>3){
				System.out.println("esa no es una opcion\n");
			}else{
				verificador=true;
			}
		}while(verificador==false);
		
			return opcion;
	}

	
}