package EntradaSalidas;

import javax.swing.JOptionPane;

public class Tools {

	//Metodos de Entrdaa
	public static byte LeerByte (String msje) {
		
		return (Byte.parseByte(JOptionPane.showInputDialog(null,msje,"Ingrese los datos",JOptionPane.INFORMATION_MESSAGE)));
	  }

	public static int LeerInt(String msje) {
		
		return (Integer.parseInt(JOptionPane.showInputDialog(null,msje,"Ingrese los datos",JOptionPane.INFORMATION_MESSAGE)));
	}

	public static short leershort(String msje) {
		
		return (Short.parseShort(JOptionPane.showInputDialog(null,msje,"Lectura de Short",JOptionPane.INFORMATION_MESSAGE)));
	}

	public static double leerdouble(String msje){
	  
		return (Double.parseDouble(JOptionPane.showInputDialog(null,msje,"Lectura de Double",JOptionPane.INFORMATION_MESSAGE)));
	}

	public static long leerLong(String msje){
	    return (Long.parseLong(JOptionPane.showInputDialog(null,msje,"Lectura de Long",JOptionPane.INFORMATION_MESSAGE)));
	}

	public static float leerFloat(String msje){
	    return (Float.parseFloat(JOptionPane.showInputDialog(null,msje,"Lectura de Float",JOptionPane.INFORMATION_MESSAGE)));
	}
	 
	public static char leerChar(String msje){
	    return (JOptionPane.showInputDialog(null,msje,"Lectura de Char",JOptionPane.INFORMATION_MESSAGE).charAt(0));
	}
	  
	public static String leerString(String msje){
	    return (JOptionPane.showInputDialog(null,msje,"Lectura de String",JOptionPane.INFORMATION_MESSAGE));
	}
	   
	public static int seguirSino(){
        return JOptionPane.showConfirmDialog(null,"¿Estas Seguro?","Continuar",JOptionPane.YES_NO_OPTION);
    }

	public static boolean LeerBoolean (String msje) {
		return Boolean.parseBoolean(JOptionPane.showInputDialog(null,msje,"Ingrese los datos",JOptionPane.INFORMATION_MESSAGE));
	}

	public static String PrimerPlato() {
		return JOptionPane.showInputDialog(null,"Crema de espinacas\nEnsalada de verduras\nCrema de brócoli\n"
				+"Caldo tlalpeño\nSopa mixteca"," Seleccione su platilo",JOptionPane.DEFAULT_OPTION);
}
	public static String Bebida() {
		return JOptionPane.showInputDialog(null,"Coca cola\nPepsi\nNaranjada\nLimonada\nAgua de sabor”","Seleccione su bebida",JOptionPane.DEFAULT_OPTION);
}
	public static String SegundoPlato() {
		return JOptionPane.showInputDialog(null,"Filete de Pescado\nMilanesa de Pollo\nBistec a la mexicana\n"+
				"Pollo en escabeche\nCarne asada\nLomo relleno\nPollo a la plancha","Seleccione su segundo Platillos",JOptionPane.DEFAULT_OPTION);
}
	public static String Postre() {
		return JOptionPane.showInputDialog(null,"Pastel helado\nHelado\nFresas con crema\nPlátanos fritos\nFlan casero\nGelatina","Seleccione su Postre",JOptionPane.DEFAULT_OPTION);
	}
	public static int AgregarPlato2(){
        return JOptionPane.showConfirmDialog(null,"¿Quiere Añadir un segundo plato?","Otro Platillo",JOptionPane.YES_NO_OPTION);
    }
	public static int AgregarPostre(){
        return JOptionPane.showConfirmDialog(null,"¿Quiere ordenar un postre?","Postre",JOptionPane.YES_NO_OPTION);
    }

	
	//Metodos de Salida
	public static void Salida(String msje) {
	        JOptionPane.showMessageDialog(null,msje,"Mensaje",JOptionPane.QUESTION_MESSAGE);
	    }
		
	public static void SalidaError(String msje) {
	        JOptionPane.showMessageDialog(null,msje,"Error!!!",JOptionPane.ERROR_MESSAGE);
	    }




}
