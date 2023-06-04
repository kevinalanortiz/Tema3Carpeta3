package Test;

import EntradaSalidas.Tools;
import TDA.AsistenteBoda;

public class TestAsistente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DatosAsistentes();
	}
	
	public static void DatosAsistentes() {
		
		int contH=0,contF=0,contSol=0,contCas=0,contViu=0,contSep=0,contDiv=0;
		int res=0;
		byte May=0,Men=0;
		String PerMay="",PerMen="";
		
		AsistenteBoda MayEdad=new AsistenteBoda();
		AsistenteBoda MenEdad=new AsistenteBoda();
		
		do {
		AsistenteBoda asis=new AsistenteBoda();
		
		asis.setNom(Tools.leerString("Ingrese su nombre"));
		asis.setEdad(Tools.LeerByte("Ingrese su edad"));
		asis.setSexo(Tools.leerChar("Ingrese su sexo:\n[F] = Femenino\n[M] = Maculino"));
		asis.setEstdCivil(Tools.leerChar("Ingrese su estado civil:(Presione una tecla)\n[A] = Soltro/a \n[B] = Casado/a \n[C] ="
				+ " Viudo/a \n[D] = Separado/a \n[E] = Divorciado/a"));
		
		
		if (asis.getSexo()=='M' || asis.getSexo()=='m')
		contH++;
		else if (asis.getSexo()=='F' || asis.getSexo()=='f')
		contF++;
			
		if (asis.getEstdCivil()=='A' || asis.getEstdCivil()=='a')
			contSol++;
		else if (asis.getEstdCivil()=='B' || asis.getEstdCivil()=='b')
			contCas++;
		else if (asis.getEstdCivil()=='C' || asis.getEstdCivil()=='c')
			contViu++;
		else if(asis.getEstdCivil()=='D' || asis.getEstdCivil()=='d')
		contSep++;
		else if (asis.getEstdCivil()=='E' || asis.getEstdCivil()=='e')
			contDiv++;
			
		if (asis.getEdad()>May)
			May=asis.getEdad();
		MayEdad=asis;
		PerMay=MayEdad.toString();
		
		if (asis.getEdad()<Men)  
			Men=asis.getEdad();
		MenEdad=asis;
		PerMen=MenEdad.toString();
		
		res= (int) Tools.seguirSino();
		}
		while (res!=1); 
		
		
		Tools.Salida("Total de Hombres: "+contH+"\nTotal de Mujeres: "+contF+"\n"+"\nTotal de Solteros: "+contSol+
				"\nTotal de Casados: "+contCas+"\nTotal de Viudos: "+contViu+"\nTotal de Separados: "+contSep+"\nTotal de Divorsiados: "
				+contDiv+"\nLa persona con mayor edad es: "+PerMay+"\nLa persona con Menor edad es: "+PerMen);
	}
	
}
