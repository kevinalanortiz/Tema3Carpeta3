package Test;

import EntradaSalidas.Tools;
import TDA.Pelicula;

public class TestPelicula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DatosPeliculas();
		
	}

	public static void DatosPeliculas() {
		
		Pelicula Peli1=new Pelicula("Gandhi","Richard Attenborough","Drama",(short)191,1982,(byte)8);
		Pelicula Peli2=new Pelicula("Thor","Kenneth Branagh","Accion",(short)115,2011,(byte)7);
		
		Tools.Salida(Peli1.toString()+"\n"+Peli2.toString()+"\n"+"Son Similares: "+Peli2.esSimilar(Peli1, Peli2));
	}
}
