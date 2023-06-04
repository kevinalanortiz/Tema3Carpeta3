package TDA;

public class Pelicula {

	private String NombPeli;
	private String NombDirec;
	private String GenePeli;
	private short Duracion;
	private int Año;
	private byte Calif;
	
	public Pelicula (String NombPeli,String NombDirec,String GenePeli,short Duracion,int Año,byte Calif) { 

	/*
	public Pelicula (String NombPeli,String NombDirec,String GenePeli,int Duracion,int Año,int Calif) {
*/
		this.NombPeli=NombPeli;
		this.NombDirec=NombDirec;
		this.GenePeli=GenePeli;
		this.Duracion=Duracion;
		this.Año=Año;
		this.Calif=Calif;		
		
	}

	public String getNombPeli() {
		return NombPeli;
	}

	private void setNombPeli(String nombPeli) {
		NombPeli = nombPeli;
	}

	public String getNombDirec() {
		return NombDirec;
	}

	private void setNombDirec(String nombDirec) {
		NombDirec = nombDirec;
	}

	public String getGenePeli() {
		return GenePeli;
	}

	private void setGenePeli(String genePeli) {
		GenePeli = genePeli;
	}

	public short getDuracion() {
		return Duracion;
	}

	private void setDuracion(short duracion) {
		Duracion = duracion;
	}

	public int getAño() {
		return Año;
	}

	private void setAño(int año) {
		Año = año;
	}

	public byte getCalif() {
		return Calif;
	}

	public void setCalif(byte calif) {
		Calif = calif;
	}
	
public String toString() {
	return "Pelicula: "+NombPeli+"\nDirector: "+NombDirec+"\nGenero: "+GenePeli+"\nDuracion: "+Duracion+" Min\nAño de Lanzamiento: "+Año+"\nCalificacion: "+
Calif+"/10"+"\nLa pelicula es epica: "+esPeliculaEpica()+"\nValoracion: "+CalcularValoracion()+"\n"+"\n"+imprimeCartel()+"\n";
}

private boolean esPeliculaEpica() {
	return (Duracion>=180);
}
	
private String CalcularValoracion() {
	String Val=" ";
	
	switch ((Calif<=2)?1:(Calif>2 && Calif<=5)?2:(Calif>5 && Calif<=7)?3:(Calif>7 && Calif<=8)?4:(Calif>8 && Calif<=10)?5:6) {
	case 1: Val="Muy mala";
		break;
	case 2:Val="Mala";
		break;
	case 3:Val="Regular";
		break;
	case 4:Val="Buena";
	break;
	case 5:Val="Exelente";
	break;
	default:
		}
	return Val;
	}	

public boolean esSimilar(Pelicula Peli1,Pelicula Peli2) {
	if (Peli1.getGenePeli()==Peli2.GenePeli) {
	return true;
	}else return false;
	
}


private String imprimeCartel() {
	
	return "---------"+NombPeli+"---------"+"\n"+"\n"+imprimeFrecuencia(Calif)+"\n"+GenePeli+","+Año+"\n"+"\n"+NombDirec;
}


private static String imprimeFrecuencia (int j) {
	
	String cad="";
	for (int i=1;i<=j; i++ ) {
		
		cad+="*";
	}
	return cad;
}
/*
public String TrueFalseEpic () {
	return (esPeliculaEpica())?"La Pelicula Epica":"No es Epica la Pelicula";
	
}
*/

}

	
	

