package Test;

import EntradaSalidas.Tools;
import TDA.Empleado;

public class TestEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		CapturaEmpleados();
	}
	public static void CapturaEmpleados () {	
			Empleado Carlos=new Empleado ("Carlos Perez",(byte)25,(byte)40 ,180.50 );
			Empleado Sonia=new Empleado ("Sonia Alvarez",(byte)19,(byte)45 ,180.50 );
			Empleado Alma=new Empleado ("Alma Sanchez",(byte)22,(byte)30 ,180.50 );

			
			String cad=Carlos.toString()+"\n"+Sonia.toString()+"\n"+Alma.toString()+"\n"+
			"Empleado con mayor edad:"+Empleado.mayorEdad(Empleado.mayorEdad(Sonia, Alma),Empleado.mayorEdad(Carlos, Sonia))+"\n";
			cad+="Empleado que trabajo mas horas:"+Empleado.mayorHrsTrabajadas(Carlos, Sonia);
			Tools.Salida(cad);
			
	
	}

}
