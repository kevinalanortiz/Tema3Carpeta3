package TDA;

import javax.swing.JOptionPane;

import EntradaSalidas.Tools;

public class ConversorMetro {

	private double metro;
	final double CM=100;
	final double MM=1000;
	final double PULG=39.37;
	final double PIES=3.28;
	final double YARD=1.09361;
	
	public ConversorMetro() {}
	
	public ConversorMetro(double metro) {
		this.metro = metro;
	}

	
	public double getMetro() {
		return metro;
	}

	public void setMetro(double metro) {
		this.metro = metro;
	}

	public double getCM() {
		return CM;
	}

	public double getMM() {
		return MM;
	}

	public double getPULG() {
		return PULG;
	}

	public double getPIES() {
		return PIES;
	}

	public double getYARD() {
		return YARD;
	}

	private double convCM() {
		return metro*CM;
	}
	
	private double convMM () {
		return metro*MM;
	}	
	private double convPULG () {
		return metro*PULG;
	}
	private double convPIES () {
		return metro*PIES;
	}	
	private double convYARD () {
		return metro*YARD;
	}
	

String menu="CM,MM,Pulg,Pies,Yard,Salir";
	public static String boton (String menu) {
	String valor[]= menu.split(",");
	int n;
	n = JOptionPane. showOptionDialog (null ,"Selecciona una Unidad", "Unidades",JOptionPane.NO_OPTION , //sin botones
	JOptionPane.QUESTION_MESSAGE,null , // utiliza icono predeterminado
	valor,valor [0]); // botón determinado
	return ( valor[n]);
	}
	public static void menu(String menu) {
	String sel=",";
	do {
	sel=boton (menu);
	switch(sel) {
	case "CM":Tools.Salida(convCM()+" CM");
	break;
	case "MM":Tools.Salida("M-MM= "+CM1.convMM());
	break;
	case "Pulg":Tools.Salida("M-PULG= "+CM1.convPULG());
	break;
	case "Pies":Tools.Salida("M-Pies= "+CM1.convPIES());
	break;
	case "Yard":Tools.Salida("M-Yarda= "+CM1.convYARD());
	break;
	case "Salir": break;
	}//switch
	}
	while (!sel.equalsIgnoreCase ("Salir"));
	}

	
	
	

}
