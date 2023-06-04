package TDA;

import javax.swing.JOptionPane;

import Test.TestArtCientifico;
import Test.TestAsistente;
import Test.TestConvertor;
import Test.TestEmpleado;
import Test.TestPedidio;
import Test.TestPelicula;
import Test.TestSalon;
import EntradaSalidas.Tools;

public class Menus {

	//Menu 1 Listado

			String menu1=("1)Salon 2)Pelicula 3)Salir");
		public static void menu1(String menu) {

		  int sel;
			do {
				sel=Tools.LeerInt(menu);
				//sel=Tools.leerint(menu+ ”Selección Opcion”);
				switch(sel){
				case 1:TestSalon.DatosSalon();break;
				case 2:TestPelicula.DatosPeliculas();break;
				case 3: break;
				case 4:Tools.Salida("Fin del programa");break;
				default:Tools.SalidaError("Opcion no definida, intenta de nuevo");
				}//switch
				}while(sel!=3);
		 }


		//Menu 2 Barra Despegable
		String menu2="Amstrong,Numeros Divisores,Salir";
		public static String desplegable(String menu) {
		String valor[]=menu.split(",");
		String res=
		(String)JOptionPane.showInputDialog(null,"MENU"," Selecciona opcion:",JOptionPane.QUESTION_MESSAGE,null,valor,valor[0]);
		return(res);
		}
		public static void menu2(String menu2)
		{
		String sel;
		do {
		sel=desplegable(menu2);
		switch(sel){
		case "Amstrong":;break;
		case "Numeros Divisores":;break;
		case "Suma de Digitos":; break;
		case "Salir": break;
		}//switch
		}while(!sel.equalsIgnoreCase("Salir"));
		}

		//Menu 3 Botones
		String menu3="Amstrong,Numeros Divisores,Salir";
		public static String boton (String menu) {
		String valor[]= menu.split(",");
		int n;
		n = JOptionPane. showOptionDialog (null ,"Selecciona un Metodo", "MENU",JOptionPane.NO_OPTION , //sin botones
		JOptionPane.QUESTION_MESSAGE,null , // utiliza icono predeterminado
		valor,valor [0]); // botón determinado
		return ( valor[n]);
		}
		public static void menu3( String menu) {
		String sel=",";
		do {
		sel=boton (menu);
		switch(sel) {
		case "Amstrong":break;
		case "Numeros Diviores":;break;
		case "Salir": break;
		}//switch
		}
		while (!sel.equalsIgnoreCase ("Salir"));
		}
	}

